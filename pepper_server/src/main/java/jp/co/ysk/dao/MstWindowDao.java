package jp.co.ysk.dao;

import jp.co.ysk.entity.MstWindow;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao
public interface MstWindowDao {

    /**
     * @param windowId
     * @return the MstWindow entity
     */
    @Select
    MstWindow selectById(String windowId);

    /**
     * @param windowId
     * @param versionNo
     * @return the MstWindow entity
     */
    @Select(ensureResult = true)
    MstWindow selectByIdAndVersion(String windowId, Integer versionNo);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MstWindow entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MstWindow entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MstWindow entity);
}