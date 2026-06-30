package com.tencent.wcdb.orm;

/* loaded from: classes12.dex */
public interface TableBinding<T> {
    com.tencent.wcdb.orm.Field<T>[] allBindingFields();

    com.tencent.wcdb.orm.Binding baseBinding();

    void bindField(T t17, com.tencent.wcdb.orm.Field<T> field, int i17, com.tencent.wcdb.core.PreparedStatement preparedStatement);

    java.lang.Class<T> bindingType();

    <R extends T> R extractObject(com.tencent.wcdb.orm.Field<T>[] fieldArr, com.tencent.wcdb.core.PreparedStatement preparedStatement, java.lang.Class<R> cls);

    boolean isAutoIncrement(T t17);

    void setLastInsertRowId(T t17, long j17);
}
