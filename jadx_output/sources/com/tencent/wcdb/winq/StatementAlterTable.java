package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class StatementAlterTable extends com.tencent.wcdb.winq.Statement {
    public StatementAlterTable() {
        this.cppObj = createCppObj();
    }

    private static native void configAddColumn(long j17, long j18);

    private static native void configRenameColumn(long j17, int i17, long j18, java.lang.String str);

    private static native void configRenameToColumn(long j17, int i17, long j18, java.lang.String str);

    private static native void configRenameToTable(long j17, java.lang.String str);

    private static native void configSchema(long j17, int i17, long j18, java.lang.String str);

    private static native void configTable(long j17, java.lang.String str);

    private static native long createCppObj();

    public com.tencent.wcdb.winq.StatementAlterTable addColumn(com.tencent.wcdb.winq.ColumnDef columnDef) {
        configAddColumn(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) columnDef));
        return this;
    }

    public com.tencent.wcdb.winq.StatementAlterTable alterTable(java.lang.String str) {
        configTable(this.cppObj, str);
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 31;
    }

    public com.tencent.wcdb.winq.StatementAlterTable of(java.lang.String str) {
        configSchema(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementAlterTable renameColumn(java.lang.String str) {
        configRenameColumn(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementAlterTable renameTo(java.lang.String str) {
        configRenameToTable(this.cppObj, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementAlterTable toColumn(java.lang.String str) {
        configRenameToColumn(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementAlterTable of(com.tencent.wcdb.winq.Schema schema) {
        configSchema(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) schema), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) schema), null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementAlterTable renameColumn(com.tencent.wcdb.winq.Column column) {
        configRenameColumn(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) column), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) column), null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementAlterTable toColumn(com.tencent.wcdb.winq.Column column) {
        configRenameToColumn(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) column), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) column), null);
        return this;
    }
}
