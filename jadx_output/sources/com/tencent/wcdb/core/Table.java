package com.tencent.wcdb.core;

/* loaded from: classes12.dex */
public class Table<T> extends com.tencent.wcdb.core.TableORMOperation<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public Table(java.lang.String str, com.tencent.wcdb.orm.TableBinding<T> tableBinding, com.tencent.wcdb.core.Database database) {
        this.tableName = str;
        this.binding = tableBinding;
        this.database = database;
    }
}
