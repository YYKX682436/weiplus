package com.tencent.tmassistantsdk.openSDK.param.jce;

/* loaded from: classes13.dex */
public final class GetDownloadProgressResponse extends com.qq.taf.jce.JceStruct {
    static com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam cache_requestParam;
    public long allTaskTotalLength;
    public long allTaskTotalProgress;
    public long receivedLen;
    public com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam requestParam;
    public long totalLen;

    public GetDownloadProgressResponse() {
        this.requestParam = null;
        this.receivedLen = 0L;
        this.totalLen = 0L;
        this.allTaskTotalProgress = 0L;
        this.allTaskTotalLength = 0L;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        if (cache_requestParam == null) {
            cache_requestParam = new com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam();
        }
        this.requestParam = (com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam) jceInputStream.read((com.qq.taf.jce.JceStruct) cache_requestParam, 0, true);
        this.receivedLen = jceInputStream.read(this.receivedLen, 1, false);
        this.totalLen = jceInputStream.read(this.totalLen, 2, false);
        this.allTaskTotalProgress = jceInputStream.read(this.allTaskTotalProgress, 3, false);
        this.allTaskTotalLength = jceInputStream.read(this.allTaskTotalLength, 4, false);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write((com.qq.taf.jce.JceStruct) this.requestParam, 0);
        jceOutputStream.write(this.receivedLen, 1);
        jceOutputStream.write(this.totalLen, 2);
        jceOutputStream.write(this.allTaskTotalProgress, 3);
        jceOutputStream.write(this.allTaskTotalLength, 4);
    }

    public GetDownloadProgressResponse(com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam iPCBaseParam, long j17, long j18, long j19, long j27) {
        this.requestParam = iPCBaseParam;
        this.receivedLen = j17;
        this.totalLen = j18;
        this.allTaskTotalProgress = j19;
        this.allTaskTotalLength = j27;
    }
}
