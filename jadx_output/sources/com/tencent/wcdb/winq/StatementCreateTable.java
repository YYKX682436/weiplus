package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class StatementCreateTable extends com.tencent.wcdb.winq.Statement {
    public StatementCreateTable() {
        this.cppObj = createCppObj();
    }

    private static native void configAs(long j17, long j18);

    private static native void configColumn(long j17, long j18);

    private static native void configColumns(long j17, long[] jArr);

    private static native void configConstraints(long j17, long[] jArr);

    private static native void configIfNotExist(long j17);

    private static native void configSchema(long j17, int i17, long j18, java.lang.String str);

    private static native void configTableName(long j17, java.lang.String str);

    private static native void configTemp(long j17);

    private static native void configWithoutRowid(long j17);

    private static native long createCppObj();

    public com.tencent.wcdb.winq.StatementCreateTable as(com.tencent.wcdb.winq.StatementSelect statementSelect) {
        configAs(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) statementSelect));
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTable constraint(com.tencent.wcdb.winq.TableConstraint... tableConstraintArr) {
        if (tableConstraintArr != null && tableConstraintArr.length != 0) {
            long[] jArr = new long[tableConstraintArr.length];
            for (int i17 = 0; i17 < tableConstraintArr.length; i17++) {
                jArr[i17] = com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) tableConstraintArr[i17]);
            }
            configConstraints(this.cppObj, jArr);
        }
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTable createTable(java.lang.String str) {
        configTableName(this.cppObj, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTable createTempTable(java.lang.String str) {
        configTableName(this.cppObj, str);
        configTemp(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTable define(com.tencent.wcdb.winq.ColumnDef columnDef) {
        configColumn(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) columnDef));
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 40;
    }

    public com.tencent.wcdb.winq.StatementCreateTable ifNotExist() {
        configIfNotExist(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTable of(java.lang.String str) {
        configSchema(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTable withoutRowid() {
        configWithoutRowid(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTable define(com.tencent.wcdb.winq.ColumnDef... columnDefArr) {
        if (columnDefArr.length == 0) {
            return this;
        }
        long[] jArr = new long[columnDefArr.length];
        for (int i17 = 0; i17 < columnDefArr.length; i17++) {
            jArr[i17] = com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) columnDefArr[i17]);
        }
        configColumns(this.cppObj, jArr);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTable of(com.tencent.wcdb.winq.Schema schema) {
        configSchema(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) schema), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) schema), null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTable constraint(com.tencent.wcdb.winq.TableConstraint tableConstraint) {
        configConstraints(this.cppObj, new long[]{com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) tableConstraint)});
        return this;
    }
}
