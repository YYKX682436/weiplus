package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class StatementCreateTrigger extends com.tencent.wcdb.winq.Statement {
    public StatementCreateTrigger() {
        this.cppObj = createCppObj();
    }

    private static native void configAfter(long j17);

    private static native void configBefore(long j17);

    private static native void configColumns(long j17, int i17, long[] jArr, java.lang.String[] strArr);

    private static native void configDelete(long j17);

    private static native void configForEachRow(long j17);

    private static native void configIfNotExist(long j17);

    private static native void configInsert(long j17);

    private static native void configInsteadOf(long j17);

    private static native void configSchema(long j17, int i17, long j18, java.lang.String str);

    private static native void configTable(long j17, java.lang.String str);

    private static native void configTemp(long j17);

    private static native void configTrigger(long j17, java.lang.String str);

    private static native void configUpdate(long j17);

    private static native void configWhen(long j17, long j18);

    private static native long createCppObj();

    private static native void executeDelete(long j17, long j18);

    private static native void executeInsert(long j17, long j18);

    private static native void executeSelect(long j17, long j18);

    private static native void executeUpdate(long j17, long j18);

    public com.tencent.wcdb.winq.StatementCreateTrigger after() {
        configAfter(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTrigger before() {
        configBefore(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTrigger createTempTrigger(java.lang.String str) {
        configTrigger(this.cppObj, str);
        configTemp(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTrigger createTrigger(java.lang.String str) {
        configTrigger(this.cppObj, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTrigger delete() {
        configDelete(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTrigger execute(com.tencent.wcdb.winq.StatementInsert statementInsert) {
        executeInsert(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) statementInsert));
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTrigger forEachRow() {
        configForEachRow(this.cppObj);
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 41;
    }

    public com.tencent.wcdb.winq.StatementCreateTrigger ifNotExist() {
        configIfNotExist(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTrigger insert() {
        configInsert(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTrigger insteadOf() {
        configInsteadOf(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTrigger ofColumns(com.tencent.wcdb.winq.Column... columnArr) {
        if (columnArr.length == 0) {
            return this;
        }
        long[] jArr = new long[columnArr.length];
        for (int i17 = 0; i17 < columnArr.length; i17++) {
            jArr[i17] = com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) columnArr[i17]);
        }
        configColumns(this.cppObj, 7, jArr, null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTrigger ofSchema(java.lang.String str) {
        configSchema(this.cppObj, 6, 0L, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTrigger onTable(java.lang.String str) {
        configTable(this.cppObj, str);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTrigger update() {
        configUpdate(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTrigger when(com.tencent.wcdb.winq.Expression expression) {
        configWhen(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) expression));
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTrigger execute(com.tencent.wcdb.winq.StatementUpdate statementUpdate) {
        executeUpdate(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) statementUpdate));
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTrigger ofSchema(com.tencent.wcdb.winq.Schema schema) {
        configSchema(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType((com.tencent.wcdb.winq.Identifier) schema), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) schema), null);
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTrigger execute(com.tencent.wcdb.winq.StatementDelete statementDelete) {
        executeDelete(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) statementDelete));
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTrigger execute(com.tencent.wcdb.winq.StatementSelect statementSelect) {
        executeSelect(this.cppObj, com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) statementSelect));
        return this;
    }

    public com.tencent.wcdb.winq.StatementCreateTrigger ofColumns(java.lang.String... strArr) {
        if (strArr.length == 0) {
            return this;
        }
        configColumns(this.cppObj, 6, null, strArr);
        return this;
    }
}
