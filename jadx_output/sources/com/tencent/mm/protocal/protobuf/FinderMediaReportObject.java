package com.tencent.mm.protocal.protobuf;

/* loaded from: classes10.dex */
public class FinderMediaReportObject extends com.tencent.mm.protobuf.e {
    public FinderMediaReportObject() {
        super(com.tencent.mm.protobuf.i.i(1, "remuxTime"), com.tencent.mm.protobuf.i.i(2, "remuxRetCode"), com.tencent.mm.protobuf.i.i(3, "cdnUploadTime"), com.tencent.mm.protobuf.i.i(4, "cdnUploadRetCode"), com.tencent.mm.protobuf.i.i(5, "zipTime"), com.tencent.mm.protobuf.i.i(6, "zipRetCode"), com.tencent.mm.protobuf.i.i(7, "mediaType"), com.tencent.mm.protobuf.i.u(8, "mediaId"), com.tencent.mm.protobuf.i.r(9, ya.b.ORIGIN, com.tencent.mm.protocal.protobuf.FinderMediaReportInfo.class), com.tencent.mm.protobuf.i.r(10, "target", com.tencent.mm.protocal.protobuf.FinderMediaReportInfo.class), com.tencent.mm.protobuf.i.i(11, "isBigFile"), com.tencent.mm.protobuf.i.i(12, "cdnControl"), com.tencent.mm.protobuf.i.i(13, "videoFinalSize"), com.tencent.mm.protobuf.i.s(14, "multiMediaInfo", com.tencent.mm.protocal.protobuf.FinderMediaReportInfo.class), com.tencent.mm.protobuf.i.r(15, "codecInfo", r45.uf2.class), com.tencent.mm.protobuf.i.i(16, "playDecoderType"));
        this.__printBytes = true;
    }

    public static com.tencent.mm.protocal.protobuf.FinderMediaReportObject create() {
        return new com.tencent.mm.protocal.protobuf.FinderMediaReportObject();
    }

    public com.tencent.mm.protocal.protobuf.FinderMediaReportObject addElementMultiMediaInfo(com.tencent.mm.protocal.protobuf.FinderMediaReportInfo finderMediaReportInfo) {
        addElement(13, finderMediaReportInfo);
        return this;
    }

    public final int getCdnControl() {
        return getInteger(11);
    }

    public final int getCdnUploadRetCode() {
        return getInteger(3);
    }

    public final int getCdnUploadTime() {
        return getInteger(2);
    }

    public final r45.uf2 getCodecInfo() {
        return (r45.uf2) getCustom(14);
    }

    public final int getIsBigFile() {
        return getInteger(10);
    }

    public final java.lang.String getMediaId() {
        return getString(7);
    }

    public final int getMediaType() {
        return getInteger(6);
    }

    public final java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMediaReportInfo> getMultiMediaInfo() {
        return getList(13);
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportInfo getOrigin() {
        return (com.tencent.mm.protocal.protobuf.FinderMediaReportInfo) getCustom(8);
    }

    public final int getPlayDecoderType() {
        return getInteger(15);
    }

    public final int getRemuxRetCode() {
        return getInteger(1);
    }

    public final int getRemuxTime() {
        return getInteger(0);
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportInfo getTarget() {
        return (com.tencent.mm.protocal.protobuf.FinderMediaReportInfo) getCustom(9);
    }

    public final int getVideoFinalSize() {
        return getInteger(12);
    }

    public final int getZipRetCode() {
        return getInteger(5);
    }

    public final int getZipTime() {
        return getInteger(4);
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportObject setCdnControl(int i17) {
        set(11, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportObject setCdnUploadRetCode(int i17) {
        set(3, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportObject setCdnUploadTime(int i17) {
        set(2, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportObject setCodecInfo(r45.uf2 uf2Var) {
        set(14, uf2Var);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportObject setIsBigFile(int i17) {
        set(10, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportObject setMediaId(java.lang.String str) {
        set(7, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportObject setMediaType(int i17) {
        set(6, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportObject setMultiMediaInfo(java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMediaReportInfo> linkedList) {
        set(13, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportObject setOrigin(com.tencent.mm.protocal.protobuf.FinderMediaReportInfo finderMediaReportInfo) {
        set(8, finderMediaReportInfo);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportObject setPlayDecoderType(int i17) {
        set(15, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportObject setRemuxRetCode(int i17) {
        set(1, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportObject setRemuxTime(int i17) {
        set(0, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportObject setTarget(com.tencent.mm.protocal.protobuf.FinderMediaReportInfo finderMediaReportInfo) {
        set(9, finderMediaReportInfo);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportObject setVideoFinalSize(int i17) {
        set(12, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportObject setZipRetCode(int i17) {
        set(5, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportObject setZipTime(int i17) {
        set(4, java.lang.Integer.valueOf(i17));
        return this;
    }
}
