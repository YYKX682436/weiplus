package com.tencent.mm.protocal.protobuf;

/* loaded from: classes10.dex */
public class FinderMediaReportInfo extends com.tencent.mm.protobuf.e {
    public FinderMediaReportInfo() {
        super(com.tencent.mm.protobuf.i.i(1, "videoDuration"), com.tencent.mm.protobuf.i.i(2, "videoBitrate"), com.tencent.mm.protobuf.i.i(3, "width"), com.tencent.mm.protobuf.i.i(4, "height"), com.tencent.mm.protobuf.i.i(5, "fileSize"), com.tencent.mm.protobuf.i.i(6, "audioBitrate"), com.tencent.mm.protobuf.i.i(7, com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS));
        this.__printBytes = true;
    }

    public static com.tencent.mm.protocal.protobuf.FinderMediaReportInfo create() {
        return new com.tencent.mm.protocal.protobuf.FinderMediaReportInfo();
    }

    public final int getAudioBitrate() {
        return getInteger(5);
    }

    public final int getFileSize() {
        return getInteger(4);
    }

    public final int getFps() {
        return getInteger(6);
    }

    public final int getHeight() {
        return getInteger(3);
    }

    public final int getVideoBitrate() {
        return getInteger(1);
    }

    public final int getVideoDuration() {
        return getInteger(0);
    }

    public final int getWidth() {
        return getInteger(2);
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportInfo setAudioBitrate(int i17) {
        set(5, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportInfo setFileSize(int i17) {
        set(4, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportInfo setFps(int i17) {
        set(6, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportInfo setHeight(int i17) {
        set(3, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportInfo setVideoBitrate(int i17) {
        set(1, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportInfo setVideoDuration(int i17) {
        set(0, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaReportInfo setWidth(int i17) {
        set(2, java.lang.Integer.valueOf(i17));
        return this;
    }
}
