package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class BindParameter extends com.tencent.wcdb.winq.Identifier implements com.tencent.wcdb.winq.ExpressionConvertible {
    public static final com.tencent.wcdb.winq.BindParameter def = new com.tencent.wcdb.winq.BindParameter(0);
    public static final com.tencent.wcdb.winq.BindParameter _1 = new com.tencent.wcdb.winq.BindParameter(1);
    public static final com.tencent.wcdb.winq.BindParameter _2 = new com.tencent.wcdb.winq.BindParameter(2);
    public static final com.tencent.wcdb.winq.BindParameter _3 = new com.tencent.wcdb.winq.BindParameter(3);
    public static final com.tencent.wcdb.winq.BindParameter _4 = new com.tencent.wcdb.winq.BindParameter(4);
    public static final com.tencent.wcdb.winq.BindParameter _5 = new com.tencent.wcdb.winq.BindParameter(5);
    public static final com.tencent.wcdb.winq.BindParameter _6 = new com.tencent.wcdb.winq.BindParameter(6);
    public static final com.tencent.wcdb.winq.BindParameter _7 = new com.tencent.wcdb.winq.BindParameter(7);
    public static final com.tencent.wcdb.winq.BindParameter _8 = new com.tencent.wcdb.winq.BindParameter(8);
    public static final com.tencent.wcdb.winq.BindParameter _9 = new com.tencent.wcdb.winq.BindParameter(9);
    public static final com.tencent.wcdb.winq.BindParameter _10 = new com.tencent.wcdb.winq.BindParameter(10);

    public BindParameter(int i17) {
        this.cppObj = createCppObj(i17);
    }

    public static com.tencent.wcdb.winq.BindParameter at(java.lang.String str) {
        com.tencent.wcdb.winq.BindParameter bindParameter = new com.tencent.wcdb.winq.BindParameter();
        bindParameter.cppObj = atBindParameter(str);
        return bindParameter;
    }

    private static native long atBindParameter(java.lang.String str);

    public static com.tencent.wcdb.winq.BindParameter[] bindParameters(int i17) {
        if (i17 == 0) {
            return new com.tencent.wcdb.winq.BindParameter[0];
        }
        com.tencent.wcdb.winq.BindParameter[] bindParameterArr = new com.tencent.wcdb.winq.BindParameter[i17];
        long[] createCppObjs = createCppObjs(i17);
        for (int i18 = 0; i18 < i17; i18++) {
            com.tencent.wcdb.winq.BindParameter bindParameter = new com.tencent.wcdb.winq.BindParameter();
            bindParameterArr[i18] = bindParameter;
            bindParameter.cppObj = createCppObjs[i18];
        }
        return bindParameterArr;
    }

    public static com.tencent.wcdb.winq.BindParameter colon(java.lang.String str) {
        return new com.tencent.wcdb.winq.BindParameter(str);
    }

    private static native long createCppObj(int i17);

    private static native long createCppObj(java.lang.String str);

    private static native long[] createCppObjs(int i17);

    public static com.tencent.wcdb.winq.BindParameter dollar(java.lang.String str) {
        com.tencent.wcdb.winq.BindParameter bindParameter = new com.tencent.wcdb.winq.BindParameter();
        bindParameter.cppObj = dollarBindParameter(str);
        return bindParameter;
    }

    private static native long dollarBindParameter(java.lang.String str);

    @Override // com.tencent.wcdb.winq.Identifier, com.tencent.wcdb.winq.IdentifierConvertible
    public com.tencent.wcdb.winq.Identifier asIdentifier() {
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 14;
    }

    private BindParameter() {
    }

    public BindParameter(java.lang.String str) {
        this.cppObj = createCppObj(str);
    }
}
