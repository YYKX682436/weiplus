package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class LiteralValue extends com.tencent.wcdb.winq.Identifier implements com.tencent.wcdb.winq.ExpressionConvertible {
    public LiteralValue(byte b17) {
        this.cppObj = createCppObj(3, b17, 0.0d, null);
    }

    private static native long createCppObj(int i17, long j17, double d17, java.lang.String str);

    private static native long createCurrentDate();

    private static native long createCurrentTime();

    private static native long createCurrentTimeStamp();

    public static com.tencent.wcdb.winq.LiteralValue currentDate() {
        com.tencent.wcdb.winq.LiteralValue literalValue = new com.tencent.wcdb.winq.LiteralValue();
        literalValue.cppObj = createCurrentDate();
        return literalValue;
    }

    public static com.tencent.wcdb.winq.LiteralValue currentTime() {
        com.tencent.wcdb.winq.LiteralValue literalValue = new com.tencent.wcdb.winq.LiteralValue();
        literalValue.cppObj = createCurrentTime();
        return literalValue;
    }

    public static com.tencent.wcdb.winq.LiteralValue currentTimeStamp() {
        com.tencent.wcdb.winq.LiteralValue literalValue = new com.tencent.wcdb.winq.LiteralValue();
        literalValue.cppObj = createCurrentTimeStamp();
        return literalValue;
    }

    @Override // com.tencent.wcdb.winq.Identifier, com.tencent.wcdb.winq.IdentifierConvertible
    public com.tencent.wcdb.winq.Identifier asIdentifier() {
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 12;
    }

    public LiteralValue(short s17) {
        this.cppObj = createCppObj(3, s17, 0.0d, null);
    }

    public LiteralValue(int i17) {
        this.cppObj = createCppObj(3, i17, 0.0d, null);
    }

    public LiteralValue(long j17) {
        this.cppObj = createCppObj(3, j17, 0.0d, null);
    }

    public LiteralValue(float f17) {
        this.cppObj = createCppObj(5, 0L, f17, null);
    }

    public LiteralValue(double d17) {
        this.cppObj = createCppObj(5, 0L, d17, null);
    }

    public LiteralValue(boolean z17) {
        this.cppObj = createCppObj(2, z17 ? 1L : 0L, 0.0d, null);
    }

    public LiteralValue(java.lang.String str) {
        if (str == null) {
            this.cppObj = createCppObj(1, 0L, 0.0d, null);
        } else {
            this.cppObj = createCppObj(6, 0L, 0.0d, str);
        }
    }

    private LiteralValue() {
    }
}
