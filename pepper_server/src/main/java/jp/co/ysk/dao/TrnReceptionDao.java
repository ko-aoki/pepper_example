package jp.co.ysk.dao;

import jp.co.ysk.entity.TrnReception;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao
public interface TrnReceptionDao {

    /**
     * @param trnReceptionId
     * @return the TrnReception entity
     */
    @Select
    TrnReception selectById(Integer trnReceptionId);

    /**
     * @param trnReceptionId
     * @param versionNo
     * @return the TrnReception entity
     */
    @Select(ensureResult = true)
    TrnReception selectByIdAndVersion(Integer trnReceptionId, Integer versionNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TrnReception entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TrnReception entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TrnReception entity);
}