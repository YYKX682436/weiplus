package com.tencent.wcdb.orm;

/* loaded from: classes12.dex */
public class Binding extends com.tencent.wcdb.base.CppObject {
    private long baseBinding = 0;

    public Binding() {
        this.cppObj = createCppObj();
    }

    private static native void addColumnDef(long j17, long j18);

    private static native void addIndex(long j17, java.lang.String str, boolean z17, long j18);

    private static native void addTableConstraint(long j17, long j18);

    private static native void configVirtualModule(long j17, java.lang.String str);

    private static native void configVirtualModuleArgument(long j17, java.lang.String str);

    private static native void configWithoutRowId(long j17);

    private static native long createCppObj();

    private static native boolean createTable(long j17, java.lang.String str, long j18);

    private static native boolean createVirtualTable(long j17, java.lang.String str, long j18);

    private static native void enableAutoIncrementForExistingTable(long j17);

    private static native long getBaseBinding(long j17);

    public void addColumnDef(com.tencent.wcdb.winq.ColumnDef columnDef) {
        addColumnDef(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) columnDef));
    }

    public void addIndex(java.lang.String str, boolean z17, com.tencent.wcdb.winq.StatementCreateIndex statementCreateIndex) {
        addIndex(this.cppObj, str, z17, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) statementCreateIndex));
    }

    public void addTableConstraint(com.tencent.wcdb.winq.TableConstraint tableConstraint) {
        addTableConstraint(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) tableConstraint));
    }

    public com.tencent.wcdb.orm.Binding configVirtualModule(java.lang.String str) {
        configVirtualModule(this.cppObj, str);
        return this;
    }

    public void configVirtualModuleArgument(java.lang.String str) {
        configVirtualModuleArgument(this.cppObj, str);
    }

    public void configWithoutRowId() {
        configWithoutRowId(this.cppObj);
    }

    public boolean createTable(java.lang.String str, com.tencent.wcdb.core.Handle handle) {
        return createTable(this.cppObj, str, handle.getCppHandle());
    }

    public boolean createVirtualTable(java.lang.String str, com.tencent.wcdb.core.Handle handle) {
        return createVirtualTable(this.cppObj, str, handle.getCppHandle());
    }

    public void enableAutoIncrementForExistingTable() {
        enableAutoIncrementForExistingTable(this.cppObj);
    }

    public long getBaseBinding() {
        if (this.baseBinding == 0) {
            this.baseBinding = getBaseBinding(this.cppObj);
        }
        return this.baseBinding;
    }
}
