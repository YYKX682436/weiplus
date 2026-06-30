package com.tencent.wcdb.core;

/* loaded from: classes12.dex */
public abstract class HandleORMOperation extends com.tencent.wcdb.core.HandleOperation {
    public <T> void createTable(java.lang.String str, com.tencent.wcdb.orm.TableBinding<T> tableBinding) {
        com.tencent.wcdb.core.Handle handle = getHandle(true);
        try {
            if (!tableBinding.baseBinding().createTable(str, handle)) {
                throw handle.createException();
            }
        } finally {
            if (autoInvalidateHandle() && handle != null) {
                handle.invalidate();
            }
        }
    }

    public <T> void createVirtualTable(java.lang.String str, com.tencent.wcdb.orm.TableBinding<T> tableBinding) {
        com.tencent.wcdb.core.Handle handle = getHandle(true);
        try {
            if (!tableBinding.baseBinding().createVirtualTable(str, handle)) {
                throw handle.createException();
            }
        } finally {
            if (autoInvalidateHandle() && handle != null) {
                handle.invalidate();
            }
        }
    }

    public void deleteObjects(java.lang.String str) {
        prepareDelete().fromTable(str).execute();
    }

    public void dropIndex(java.lang.String str) {
        execute(new com.tencent.wcdb.winq.StatementDropIndex().dropIndex(str).ifExist());
    }

    public void dropTable(java.lang.String str) {
        execute(new com.tencent.wcdb.winq.StatementDropTable().dropTable(str).ifExist());
    }

    public <T> java.util.List<T> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str) {
        return prepareSelect().select(fieldArr).from(str).allObjects();
    }

    public abstract com.tencent.wcdb.core.Database getDatabase();

    public <T> T getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str) {
        return prepareSelect().select(fieldArr).from(str).firstObject();
    }

    public <T> com.tencent.wcdb.core.Table<T> getTable(java.lang.String str, com.tencent.wcdb.orm.TableBinding<T> tableBinding) {
        return new com.tencent.wcdb.core.Table<>(str, tableBinding, getDatabase());
    }

    public <T> void insertObject(T t17, com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str) {
        prepareInsert().intoTable(str).value(t17).onFields(fieldArr).execute();
    }

    public <T> void insertObjects(java.util.Collection<T> collection, com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str) {
        prepareInsert().intoTable(str).values(collection).onFields(fieldArr).execute();
    }

    public <T> void insertOrIgnoreObject(T t17, com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str) {
        prepareInsert().orIgnore().intoTable(str).value(t17).onFields(fieldArr).execute();
    }

    public <T> void insertOrIgnoreObjects(java.util.Collection<T> collection, com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str) {
        prepareInsert().orIgnore().intoTable(str).values(collection).onFields(fieldArr).execute();
    }

    public <T> void insertOrReplaceObject(T t17, com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str) {
        prepareInsert().orReplace().intoTable(str).value(t17).onFields(fieldArr).execute();
    }

    public <T> void insertOrReplaceObjects(java.util.Collection<T> collection, com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str) {
        prepareInsert().orReplace().intoTable(str).values(collection).onFields(fieldArr).execute();
    }

    public com.tencent.wcdb.chaincall.Delete prepareDelete() {
        return new com.tencent.wcdb.chaincall.Delete(getHandle(true), false, autoInvalidateHandle());
    }

    public <T> com.tencent.wcdb.chaincall.Insert<T> prepareInsert() {
        return new com.tencent.wcdb.chaincall.Insert<>(getHandle(true), false, autoInvalidateHandle());
    }

    public <T> com.tencent.wcdb.chaincall.Select<T> prepareSelect() {
        return new com.tencent.wcdb.chaincall.Select<>(getHandle(false), false, autoInvalidateHandle());
    }

    public <T> com.tencent.wcdb.chaincall.Update<T> prepareUpdate() {
        return new com.tencent.wcdb.chaincall.Update<>(getHandle(true), false, autoInvalidateHandle());
    }

    public boolean tableExist(java.lang.String str) {
        com.tencent.wcdb.core.Handle handle = getHandle(false);
        int tableExist = com.tencent.wcdb.core.Handle.tableExist(handle.getCppHandle(), str);
        com.tencent.wcdb.base.WCDBException createException = tableExist > 1 ? handle.createException() : null;
        if (autoInvalidateHandle()) {
            handle.invalidate();
        }
        if (createException == null) {
            return tableExist == 1;
        }
        throw createException;
    }

    public <T> void updateObject(T t17, com.tencent.wcdb.orm.Field<T> field, java.lang.String str) {
        prepareUpdate().table(str).set(field).toObject(t17).execute();
    }

    public void deleteObjects(java.lang.String str, com.tencent.wcdb.winq.Expression expression) {
        prepareDelete().fromTable(str).where(expression).execute();
    }

    public <T, R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, java.lang.Class<R> cls) {
        return prepareSelect().select(fieldArr).from(str).allObjects(cls);
    }

    public <T, R extends T> R getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, java.lang.Class<R> cls) {
        return (R) prepareSelect().select(fieldArr).from(str).firstObject(cls);
    }

    public <T> void updateObject(T t17, com.tencent.wcdb.orm.Field<T> field, java.lang.String str, com.tencent.wcdb.winq.Expression expression) {
        prepareUpdate().table(str).set(field).toObject(t17).where(expression).execute();
    }

    public void deleteObjects(java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        prepareDelete().fromTable(str).where(expression).orderBy(orderingTerm).limit(j17).execute();
    }

    public <T> java.util.List<T> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression) {
        return prepareSelect().select(fieldArr).from(str).where(expression).allObjects();
    }

    public <T> T getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression) {
        return prepareSelect().select(fieldArr).from(str).where(expression).firstObject();
    }

    public <T> void updateObject(T t17, com.tencent.wcdb.orm.Field<T> field, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        prepareUpdate().table(str).set(field).toObject(t17).where(expression).orderBy(orderingTerm).limit(j17).execute();
    }

    public void deleteObjects(java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18) {
        prepareDelete().fromTable(str).where(expression).orderBy(orderingTerm).limit(j17).offset(j18).execute();
    }

    public <T, R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression, java.lang.Class<R> cls) {
        return prepareSelect().select(fieldArr).from(str).where(expression).allObjects(cls);
    }

    public <T, R extends T> R getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression, java.lang.Class<R> cls) {
        return (R) prepareSelect().select(fieldArr).from(str).where(expression).firstObject(cls);
    }

    public <T> void updateObject(T t17, com.tencent.wcdb.orm.Field<T> field, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18) {
        prepareUpdate().table(str).set(field).toObject(t17).where(expression).orderBy(orderingTerm).limit(j17).offset(j18).execute();
    }

    public void deleteObjects(java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        prepareDelete().fromTable(str).orderBy(orderingTerm).limit(j17).execute();
    }

    public <T> java.util.List<T> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return prepareSelect().select(fieldArr).from(str).where(expression).orderBy(orderingTerm).allObjects();
    }

    public <T> T getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return prepareSelect().select(fieldArr).from(str).where(expression).orderBy(orderingTerm).firstObject();
    }

    public <T> void updateObject(T t17, com.tencent.wcdb.orm.Field<T> field, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        prepareUpdate().table(str).set(field).toObject(t17).orderBy(orderingTerm).limit(j17).execute();
    }

    public void deleteObjects(java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18) {
        prepareDelete().fromTable(str).orderBy(orderingTerm).limit(j17).offset(j18).execute();
    }

    public <T, R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, java.lang.Class<R> cls) {
        return prepareSelect().select(fieldArr).from(str).where(expression).orderBy(orderingTerm).allObjects(cls);
    }

    public <T, R extends T> R getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, java.lang.Class<R> cls) {
        return (R) prepareSelect().select(fieldArr).from(str).where(expression).orderBy(orderingTerm).firstObject(cls);
    }

    public <T> void updateObject(T t17, com.tencent.wcdb.orm.Field<T> field, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18) {
        prepareUpdate().table(str).set(field).toObject(t17).orderBy(orderingTerm).limit(j17).offset(j18).execute();
    }

    public <T> java.util.List<T> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        return prepareSelect().select(fieldArr).from(str).where(expression).orderBy(orderingTerm).limit(j17).allObjects();
    }

    public <T> T getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        return prepareSelect().select(fieldArr).from(str).where(expression).orderBy(orderingTerm).limit(1L).offset(j17).firstObject();
    }

    public <T> void updateObject(T t17, com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str) {
        prepareUpdate().table(str).set(fieldArr).toObject(t17).execute();
    }

    public <T, R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, java.lang.Class<R> cls) {
        return prepareSelect().select(fieldArr).from(str).where(expression).orderBy(orderingTerm).limit(j17).allObjects(cls);
    }

    public <T, R extends T> R getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, java.lang.Class<R> cls) {
        return (R) prepareSelect().select(fieldArr).from(str).where(expression).orderBy(orderingTerm).limit(1L).offset(j17).firstObject(cls);
    }

    public <T> void updateObject(T t17, com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression) {
        prepareUpdate().table(str).set(fieldArr).toObject(t17).where(expression).execute();
    }

    public <T> java.util.List<T> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18) {
        return prepareSelect().select(fieldArr).from(str).where(expression).orderBy(orderingTerm).limit(j17).offset(j18).allObjects();
    }

    public <T> T getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return prepareSelect().select(fieldArr).from(str).orderBy(orderingTerm).firstObject();
    }

    public <T> void updateObject(T t17, com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        prepareUpdate().table(str).set(fieldArr).toObject(t17).where(expression).orderBy(orderingTerm).limit(j17).execute();
    }

    public <T, R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18, java.lang.Class<R> cls) {
        return prepareSelect().select(fieldArr).from(str).where(expression).orderBy(orderingTerm).limit(j17).offset(j18).allObjects(cls);
    }

    public <T, R extends T> R getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, java.lang.Class<R> cls) {
        return (R) prepareSelect().select(fieldArr).from(str).orderBy(orderingTerm).firstObject(cls);
    }

    public <T> void updateObject(T t17, com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18) {
        prepareUpdate().table(str).set(fieldArr).toObject(t17).where(expression).orderBy(orderingTerm).limit(j17).offset(j18).execute();
    }

    public <T> java.util.List<T> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return prepareSelect().select(fieldArr).from(str).orderBy(orderingTerm).allObjects();
    }

    public <T> T getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        return prepareSelect().select(fieldArr).from(str).orderBy(orderingTerm).limit(1L).offset(j17).firstObject();
    }

    public <T> void updateObject(T t17, com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        prepareUpdate().table(str).set(fieldArr).toObject(t17).orderBy(orderingTerm).limit(j17).execute();
    }

    public <T, R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, java.lang.Class<R> cls) {
        return prepareSelect().select(fieldArr).from(str).orderBy(orderingTerm).allObjects(cls);
    }

    public <T, R extends T> R getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, java.lang.Class<R> cls) {
        return (R) prepareSelect().select(fieldArr).from(str).orderBy(orderingTerm).limit(1L).offset(j17).firstObject(cls);
    }

    public <T> void updateObject(T t17, com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18) {
        prepareUpdate().table(str).set(fieldArr).toObject(t17).orderBy(orderingTerm).limit(j17).offset(j18).execute();
    }

    public <T> java.util.List<T> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        return prepareSelect().select(fieldArr).from(str).orderBy(orderingTerm).limit(j17).allObjects();
    }

    public <T, R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, java.lang.Class<R> cls) {
        return prepareSelect().select(fieldArr).from(str).orderBy(orderingTerm).limit(j17).allObjects(cls);
    }

    public <T> java.util.List<T> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18) {
        return prepareSelect().select(fieldArr).from(str).orderBy(orderingTerm).limit(j17).offset(j18).allObjects();
    }

    public <T, R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18, java.lang.Class<R> cls) {
        return prepareSelect().select(fieldArr).from(str).orderBy(orderingTerm).limit(j17).offset(j18).allObjects(cls);
    }
}
