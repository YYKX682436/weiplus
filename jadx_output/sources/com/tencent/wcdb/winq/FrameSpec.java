package com.tencent.wcdb.winq;

/* loaded from: classes12.dex */
public class FrameSpec extends com.tencent.wcdb.winq.Identifier {
    public FrameSpec() {
        this.cppObj = createCppObj();
    }

    private static native void configAndCurrentRow(long j17);

    private static native void configAndFollowing(long j17, int i17, long j18);

    private static native void configAndPreceding(long j17, int i17, long j18);

    private static native void configAndUnboundedFollowing(long j17);

    private static native void configBetweenCurrentRow(long j17);

    private static native void configBetweenFollowing(long j17, int i17, long j18);

    private static native void configBetweenPreceding(long j17, int i17, long j18);

    private static native void configBetweenUnboundedPreceding(long j17);

    private static native void configCurrentRow(long j17);

    private static native void configPreceding(long j17, int i17, long j18);

    private static native void configRange(long j17);

    private static native void configRows(long j17);

    private static native void configUnboundedPreceding(long j17);

    private static native long createCppObj();

    public com.tencent.wcdb.winq.FrameSpec andCurrentRow() {
        configAndCurrentRow(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.FrameSpec andFollowing(long j17) {
        configAndFollowing(this.cppObj, 3, j17);
        return this;
    }

    public com.tencent.wcdb.winq.FrameSpec andPreceding(long j17) {
        configAndPreceding(this.cppObj, 3, j17);
        return this;
    }

    public com.tencent.wcdb.winq.FrameSpec andUnboundedFollowing() {
        configAndUnboundedFollowing(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.FrameSpec betweenCurrentRow() {
        configBetweenCurrentRow(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.FrameSpec betweenFollowing(long j17) {
        configBetweenFollowing(this.cppObj, 3, j17);
        return this;
    }

    public com.tencent.wcdb.winq.FrameSpec betweenPreceding(long j17) {
        configBetweenPreceding(this.cppObj, 3, j17);
        return this;
    }

    public com.tencent.wcdb.winq.FrameSpec betweenUnboundedPreceding() {
        configBetweenUnboundedPreceding(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.FrameSpec currentRow() {
        configCurrentRow(this.cppObj);
        return this;
    }

    @Override // com.tencent.wcdb.winq.Identifier
    public int getType() {
        return 30;
    }

    public com.tencent.wcdb.winq.FrameSpec preceding(long j17) {
        configPreceding(this.cppObj, 3, j17);
        return this;
    }

    public com.tencent.wcdb.winq.FrameSpec range() {
        configRange(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.FrameSpec rows() {
        configRows(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.FrameSpec unboundedPreceding() {
        configUnboundedPreceding(this.cppObj);
        return this;
    }

    public com.tencent.wcdb.winq.FrameSpec andFollowing(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        configAndFollowing(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible));
        return this;
    }

    public com.tencent.wcdb.winq.FrameSpec andPreceding(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        configAndPreceding(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible));
        return this;
    }

    public com.tencent.wcdb.winq.FrameSpec betweenFollowing(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        configBetweenFollowing(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible));
        return this;
    }

    public com.tencent.wcdb.winq.FrameSpec betweenPreceding(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        configBetweenPreceding(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible));
        return this;
    }

    public com.tencent.wcdb.winq.FrameSpec preceding(com.tencent.wcdb.winq.ExpressionConvertible expressionConvertible) {
        configPreceding(this.cppObj, com.tencent.wcdb.winq.Identifier.getCppType(expressionConvertible), com.tencent.wcdb.base.CppObject.get(expressionConvertible));
        return this;
    }
}
