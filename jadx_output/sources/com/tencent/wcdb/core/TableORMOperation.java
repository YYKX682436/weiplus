package com.tencent.wcdb.core;

/* loaded from: classes12.dex */
public class TableORMOperation<T> extends com.tencent.wcdb.core.TableOperation {
    com.tencent.wcdb.orm.TableBinding<T> binding = null;

    public void deleteObjects() {
        prepareDelete().execute();
    }

    public java.util.List<T> getAllObjects() {
        return prepareSelect().select(this.binding.allBindingFields()).allObjects();
    }

    public com.tencent.wcdb.orm.TableBinding<T> getBinding() {
        return this.binding;
    }

    public T getFirstObject() {
        return prepareSelect().select(this.binding.allBindingFields()).firstObject();
    }

    public void insertObject(T t17) {
        prepareInsert().value(t17).onFields(this.binding.allBindingFields()).execute();
    }

    public void insertObjects(java.util.Collection<T> collection) {
        prepareInsert().values(collection).onFields(this.binding.allBindingFields()).execute();
    }

    public void insertOrIgnoreObject(T t17) {
        prepareInsert().orIgnore().value(t17).onFields(this.binding.allBindingFields()).execute();
    }

    public void insertOrIgnoreObjects(java.util.Collection<T> collection) {
        prepareInsert().orIgnore().values(collection).onFields(this.binding.allBindingFields()).execute();
    }

    public void insertOrReplaceObject(T t17) {
        prepareInsert().orReplace().value(t17).onFields(this.binding.allBindingFields()).execute();
    }

    public void insertOrReplaceObjects(java.util.Collection<T> collection) {
        prepareInsert().orReplace().values(collection).onFields(this.binding.allBindingFields()).execute();
    }

    public com.tencent.wcdb.chaincall.Delete prepareDelete() {
        com.tencent.wcdb.chaincall.Delete delete = new com.tencent.wcdb.chaincall.Delete(this.database.getHandle(true), false, true);
        delete.fromTable(this.tableName);
        return delete;
    }

    public com.tencent.wcdb.chaincall.Insert<T> prepareInsert() {
        com.tencent.wcdb.chaincall.Insert<T> insert = new com.tencent.wcdb.chaincall.Insert<>(this.database.getHandle(true), false, true);
        insert.intoTable(this.tableName);
        return insert;
    }

    public com.tencent.wcdb.chaincall.Select<T> prepareSelect() {
        com.tencent.wcdb.chaincall.Select<T> select = new com.tencent.wcdb.chaincall.Select<>(this.database.getHandle(false), false, true);
        select.from(this.tableName);
        return select;
    }

    public com.tencent.wcdb.chaincall.Update<T> prepareUpdate() {
        com.tencent.wcdb.chaincall.Update<T> update = new com.tencent.wcdb.chaincall.Update<>(this.database.getHandle(true), false, true);
        update.table(this.tableName);
        return update;
    }

    public void updateObject(T t17) {
        prepareUpdate().set(this.binding.allBindingFields()).toObject(t17).execute();
    }

    public void deleteObjects(com.tencent.wcdb.winq.Expression expression) {
        prepareDelete().where(expression).execute();
    }

    public <R extends T> java.util.List<R> getAllObjects(java.lang.Class<R> cls) {
        return prepareSelect().select(this.binding.allBindingFields()).allObjects(cls);
    }

    public <R extends T> R getFirstObject(java.lang.Class<R> cls) {
        return (R) prepareSelect().select(this.binding.allBindingFields()).firstObject(cls);
    }

    public void insertObject(T t17, com.tencent.wcdb.orm.Field<T>[] fieldArr) {
        prepareInsert().value(t17).onFields(fieldArr).execute();
    }

    public void insertObjects(java.util.Collection<T> collection, com.tencent.wcdb.orm.Field<T>[] fieldArr) {
        prepareInsert().values(collection).onFields(fieldArr).execute();
    }

    public void insertOrIgnoreObject(T t17, com.tencent.wcdb.orm.Field<T>[] fieldArr) {
        prepareInsert().orIgnore().value(t17).onFields(fieldArr).execute();
    }

    public void insertOrIgnoreObjects(java.util.Collection<T> collection, com.tencent.wcdb.orm.Field<T>[] fieldArr) {
        prepareInsert().orIgnore().values(collection).onFields(fieldArr).execute();
    }

    public void insertOrReplaceObject(T t17, com.tencent.wcdb.orm.Field<T>[] fieldArr) {
        prepareInsert().orReplace().value(t17).onFields(fieldArr).execute();
    }

    public void insertOrReplaceObjects(java.util.Collection<T> collection, com.tencent.wcdb.orm.Field<T>[] fieldArr) {
        prepareInsert().orReplace().values(collection).onFields(fieldArr).execute();
    }

    public void updateObject(T t17, com.tencent.wcdb.winq.Expression expression) {
        prepareUpdate().set(this.binding.allBindingFields()).toObject(t17).where(expression).execute();
    }

    public void deleteObjects(com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        prepareDelete().where(expression).orderBy(orderingTerm).limit(j17).execute();
    }

    public java.util.List<T> getAllObjects(com.tencent.wcdb.winq.Expression expression) {
        return prepareSelect().select(this.binding.allBindingFields()).where(expression).allObjects();
    }

    public T getFirstObject(com.tencent.wcdb.winq.Expression expression) {
        return prepareSelect().select(this.binding.allBindingFields()).where(expression).firstObject();
    }

    public void updateObject(T t17, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        prepareUpdate().set(this.binding.allBindingFields()).toObject(t17).where(expression).orderBy(orderingTerm).limit(j17).execute();
    }

    public void deleteObjects(com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18) {
        prepareDelete().where(expression).orderBy(orderingTerm).limit(j17).offset(j18).execute();
    }

    public <R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.winq.Expression expression, java.lang.Class<R> cls) {
        return prepareSelect().select(this.binding.allBindingFields()).where(expression).allObjects(cls);
    }

    public <R extends T> R getFirstObject(com.tencent.wcdb.winq.Expression expression, java.lang.Class<R> cls) {
        return (R) prepareSelect().select(this.binding.allBindingFields()).where(expression).firstObject(cls);
    }

    public void updateObject(T t17, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18) {
        prepareUpdate().set(this.binding.allBindingFields()).toObject(t17).where(expression).orderBy(orderingTerm).limit(j17).offset(j18).execute();
    }

    public void deleteObjects(com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        prepareDelete().orderBy(orderingTerm).limit(j17).execute();
    }

    public java.util.List<T> getAllObjects(com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return prepareSelect().select(this.binding.allBindingFields()).where(expression).orderBy(orderingTerm).allObjects();
    }

    public T getFirstObject(com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return prepareSelect().select(this.binding.allBindingFields()).where(expression).orderBy(orderingTerm).firstObject();
    }

    public void updateObject(T t17, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        prepareUpdate().set(this.binding.allBindingFields()).toObject(t17).orderBy(orderingTerm).limit(j17).execute();
    }

    public void deleteObjects(com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18) {
        prepareDelete().orderBy(orderingTerm).limit(j17).offset(j18).execute();
    }

    public <R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, java.lang.Class<R> cls) {
        return prepareSelect().select(this.binding.allBindingFields()).where(expression).orderBy(orderingTerm).allObjects(cls);
    }

    public <R extends T> R getFirstObject(com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, java.lang.Class<R> cls) {
        return (R) prepareSelect().select(this.binding.allBindingFields()).where(expression).orderBy(orderingTerm).firstObject(cls);
    }

    public void updateObject(T t17, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18) {
        prepareUpdate().set(this.binding.allBindingFields()).toObject(t17).orderBy(orderingTerm).limit(j17).offset(j18).execute();
    }

    public java.util.List<T> getAllObjects(com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        return prepareSelect().select(this.binding.allBindingFields()).where(expression).orderBy(orderingTerm).limit(j17).allObjects();
    }

    public T getFirstObject(com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        return prepareSelect().select(this.binding.allBindingFields()).where(expression).orderBy(orderingTerm).limit(1L).offset(j17).firstObject();
    }

    public void updateObject(T t17, com.tencent.wcdb.orm.Field<T> field) {
        prepareUpdate().set(field).toObject(t17).execute();
    }

    public <R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, java.lang.Class<R> cls) {
        return prepareSelect().select(this.binding.allBindingFields()).where(expression).orderBy(orderingTerm).limit(j17).allObjects(cls);
    }

    public <R extends T> R getFirstObject(com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, java.lang.Class<R> cls) {
        return (R) prepareSelect().select(this.binding.allBindingFields()).where(expression).orderBy(orderingTerm).limit(1L).offset(j17).firstObject(cls);
    }

    public void updateObject(T t17, com.tencent.wcdb.orm.Field<T> field, com.tencent.wcdb.winq.Expression expression) {
        prepareUpdate().set(field).toObject(t17).where(expression).execute();
    }

    public java.util.List<T> getAllObjects(com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18) {
        return prepareSelect().select(this.binding.allBindingFields()).where(expression).orderBy(orderingTerm).limit(j17).offset(j18).allObjects();
    }

    public T getFirstObject(com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return prepareSelect().select(this.binding.allBindingFields()).orderBy(orderingTerm).firstObject();
    }

    public void updateObject(T t17, com.tencent.wcdb.orm.Field<T> field, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        prepareUpdate().set(field).toObject(t17).where(expression).orderBy(orderingTerm).limit(j17).execute();
    }

    public <R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18, java.lang.Class<R> cls) {
        return prepareSelect().select(this.binding.allBindingFields()).where(expression).orderBy(orderingTerm).limit(j17).offset(j18).allObjects(cls);
    }

    public <R extends T> R getFirstObject(com.tencent.wcdb.winq.OrderingTerm orderingTerm, java.lang.Class<R> cls) {
        return (R) prepareSelect().select(this.binding.allBindingFields()).orderBy(orderingTerm).firstObject(cls);
    }

    public void updateObject(T t17, com.tencent.wcdb.orm.Field<T> field, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18) {
        prepareUpdate().set(field).toObject(t17).where(expression).orderBy(orderingTerm).limit(j17).offset(j18).execute();
    }

    public java.util.List<T> getAllObjects(com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return prepareSelect().select(this.binding.allBindingFields()).orderBy(orderingTerm).allObjects();
    }

    public T getFirstObject(com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        return prepareSelect().select(this.binding.allBindingFields()).orderBy(orderingTerm).limit(1L).offset(j17).firstObject();
    }

    public void updateObject(T t17, com.tencent.wcdb.orm.Field<T> field, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        prepareUpdate().set(field).toObject(t17).orderBy(orderingTerm).limit(j17).execute();
    }

    public <R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.winq.OrderingTerm orderingTerm, java.lang.Class<R> cls) {
        return prepareSelect().select(this.binding.allBindingFields()).orderBy(orderingTerm).allObjects(cls);
    }

    public <R extends T> R getFirstObject(com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, java.lang.Class<R> cls) {
        return (R) prepareSelect().select(this.binding.allBindingFields()).orderBy(orderingTerm).limit(1L).offset(j17).firstObject(cls);
    }

    public void updateObject(T t17, com.tencent.wcdb.orm.Field<T> field, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18) {
        prepareUpdate().set(field).toObject(t17).orderBy(orderingTerm).limit(j17).offset(j18).execute();
    }

    public java.util.List<T> getAllObjects(com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        return prepareSelect().select(this.binding.allBindingFields()).orderBy(orderingTerm).limit(j17).allObjects();
    }

    public T getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr) {
        return prepareSelect().select(fieldArr).firstObject();
    }

    public void updateObject(T t17, com.tencent.wcdb.orm.Field<T>[] fieldArr) {
        prepareUpdate().set(fieldArr).toObject(t17).execute();
    }

    public <R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, java.lang.Class<R> cls) {
        return prepareSelect().select(this.binding.allBindingFields()).orderBy(orderingTerm).limit(j17).allObjects(cls);
    }

    public <R extends T> R getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.Class<R> cls) {
        return (R) prepareSelect().select(fieldArr).firstObject(cls);
    }

    public void updateObject(T t17, com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.Expression expression) {
        prepareUpdate().set(fieldArr).toObject(t17).where(expression).execute();
    }

    public java.util.List<T> getAllObjects(com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18) {
        return prepareSelect().select(this.binding.allBindingFields()).orderBy(orderingTerm).limit(j17).offset(j18).allObjects();
    }

    public T getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.Expression expression) {
        return prepareSelect().select(fieldArr).where(expression).firstObject();
    }

    public void updateObject(T t17, com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        prepareUpdate().set(fieldArr).toObject(t17).where(expression).orderBy(orderingTerm).limit(j17).execute();
    }

    public <R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18, java.lang.Class<R> cls) {
        return prepareSelect().select(this.binding.allBindingFields()).orderBy(orderingTerm).limit(j17).offset(j18).allObjects(cls);
    }

    public <R extends T> R getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.Expression expression, java.lang.Class<R> cls) {
        return (R) prepareSelect().select(fieldArr).where(expression).firstObject(cls);
    }

    public void updateObject(T t17, com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18) {
        prepareUpdate().set(fieldArr).toObject(t17).where(expression).orderBy(orderingTerm).limit(j17).offset(j18).execute();
    }

    public java.util.List<T> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr) {
        return prepareSelect().select(fieldArr).allObjects();
    }

    public T getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return prepareSelect().select(fieldArr).where(expression).orderBy(orderingTerm).firstObject();
    }

    public void updateObject(T t17, com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        prepareUpdate().set(fieldArr).toObject(t17).orderBy(orderingTerm).limit(j17).execute();
    }

    public <R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, java.lang.Class<R> cls) {
        return prepareSelect().select(fieldArr).allObjects(cls);
    }

    public <R extends T> R getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, java.lang.Class<R> cls) {
        return (R) prepareSelect().select(fieldArr).where(expression).orderBy(orderingTerm).firstObject(cls);
    }

    public void updateObject(T t17, com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18) {
        prepareUpdate().set(fieldArr).toObject(t17).orderBy(orderingTerm).limit(j17).offset(j18).execute();
    }

    public java.util.List<T> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.Expression expression) {
        return prepareSelect().select(fieldArr).where(expression).allObjects();
    }

    public T getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        return prepareSelect().select(fieldArr).where(expression).orderBy(orderingTerm).limit(1L).offset(j17).firstObject();
    }

    public <R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.Expression expression, java.lang.Class<R> cls) {
        return prepareSelect().select(fieldArr).where(expression).allObjects(cls);
    }

    public <R extends T> R getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, java.lang.Class<R> cls) {
        return (R) prepareSelect().select(fieldArr).where(expression).orderBy(orderingTerm).limit(1L).offset(j17).firstObject(cls);
    }

    public java.util.List<T> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return prepareSelect().select(fieldArr).where(expression).orderBy(orderingTerm).allObjects();
    }

    public T getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return prepareSelect().select(fieldArr).orderBy(orderingTerm).firstObject();
    }

    public <R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, java.lang.Class<R> cls) {
        return prepareSelect().select(fieldArr).where(expression).orderBy(orderingTerm).allObjects(cls);
    }

    public <R extends T> R getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.OrderingTerm orderingTerm, java.lang.Class<R> cls) {
        return (R) prepareSelect().select(fieldArr).orderBy(orderingTerm).firstObject(cls);
    }

    public java.util.List<T> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        return prepareSelect().select(fieldArr).where(expression).orderBy(orderingTerm).limit(j17).allObjects();
    }

    public T getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        return prepareSelect().select(fieldArr).orderBy(orderingTerm).limit(1L).offset(j17).firstObject();
    }

    public <R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, java.lang.Class<R> cls) {
        return prepareSelect().select(fieldArr).where(expression).orderBy(orderingTerm).limit(j17).allObjects(cls);
    }

    public <R extends T> R getFirstObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, java.lang.Class<R> cls) {
        return (R) prepareSelect().select(fieldArr).orderBy(orderingTerm).limit(1L).offset(j17).firstObject(cls);
    }

    public java.util.List<T> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18) {
        return prepareSelect().select(fieldArr).where(expression).orderBy(orderingTerm).limit(j17).offset(j18).allObjects();
    }

    public <R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18, java.lang.Class<R> cls) {
        return prepareSelect().select(fieldArr).where(expression).orderBy(orderingTerm).limit(j17).offset(j18).allObjects(cls);
    }

    public java.util.List<T> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return prepareSelect().select(fieldArr).orderBy(orderingTerm).allObjects();
    }

    public <R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.OrderingTerm orderingTerm, java.lang.Class<R> cls) {
        return prepareSelect().select(fieldArr).orderBy(orderingTerm).allObjects(cls);
    }

    public java.util.List<T> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17) {
        return prepareSelect().select(fieldArr).orderBy(orderingTerm).limit(j17).allObjects();
    }

    public <R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, java.lang.Class<R> cls) {
        return prepareSelect().select(fieldArr).orderBy(orderingTerm).limit(j17).allObjects(cls);
    }

    public java.util.List<T> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18) {
        return prepareSelect().select(fieldArr).orderBy(orderingTerm).limit(j17).offset(j18).allObjects();
    }

    public <R extends T> java.util.List<R> getAllObjects(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.winq.OrderingTerm orderingTerm, long j17, long j18, java.lang.Class<R> cls) {
        return prepareSelect().select(fieldArr).orderBy(orderingTerm).limit(j17).offset(j18).allObjects(cls);
    }
}
