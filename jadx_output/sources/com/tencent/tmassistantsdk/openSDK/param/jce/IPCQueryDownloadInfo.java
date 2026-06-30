package com.tencent.tmassistantsdk.openSDK.param.jce;

/* loaded from: classes13.dex */
public final class IPCQueryDownloadInfo extends com.qq.taf.jce.JceStruct {
    public long allTaskTotalLength;
    public long allTaskTotalProgress;
    public long receivedLen;
    public java.lang.String savePath;
    public int state;
    public long totalLen;
    public java.lang.String url;

    public IPCQueryDownloadInfo() {
        this.url = "";
        this.savePath = "";
        this.state = 0;
        this.receivedLen = 0L;
        this.totalLen = 0L;
        this.allTaskTotalProgress = 0L;
        this.allTaskTotalLength = 0L;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        this.url = jceInputStream.readString(0, true);
        this.savePath = jceInputStream.readString(1, false);
        this.state = jceInputStream.read(this.state, 2, false);
        this.receivedLen = jceInputStream.read(this.receivedLen, 3, false);
        this.totalLen = jceInputStream.read(this.totalLen, 4, false);
        this.allTaskTotalProgress = jceInputStream.read(this.allTaskTotalProgress, 5, false);
        this.allTaskTotalLength = jceInputStream.read(this.allTaskTotalLength, 6, false);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.url, 0);
        java.lang.String str = this.savePath;
        if (str != null) {
            jceOutputStream.write(str, 1);
        }
        jceOutputStream.write(this.state, 2);
        jceOutputStream.write(this.receivedLen, 3);
        jceOutputStream.write(this.totalLen, 4);
        jceOutputStream.write(this.allTaskTotalProgress, 5);
        jceOutputStream.write(this.allTaskTotalLength, 6);
    }

    public IPCQueryDownloadInfo(java.lang.String str, java.lang.String str2, int i17, long j17, long j18, long j19, long j27) {
        this.url = str;
        this.savePath = str2;
        this.state = i17;
        this.receivedLen = j17;
        this.totalLen = j18;
        this.allTaskTotalProgress = j19;
        this.allTaskTotalLength = j27;
    }
}
