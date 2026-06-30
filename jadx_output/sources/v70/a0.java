package v70;

/* loaded from: classes12.dex */
public final class a0 {
    public a0(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(oi3.f msgInfo) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        int i17 = msgInfo.f345617d;
        if (msgInfo.getLong(i17 + 0) == 0) {
            str = "thumb_" + com.tencent.mm.sdk.platformtools.w2.a(msgInfo.k()) + '_' + msgInfo.n() + '_' + msgInfo.l();
        } else {
            str = "msginfo_thumb_" + msgInfo.getLong(i17 + 0) + '_' + msgInfo.getString(i17 + 3) + '_' + msgInfo.n() + '_' + msgInfo.l();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImgDownload.MsgImgLoaderFeatureService", "[genImageKey]:[path:" + msgInfo.k() + "][key:" + str + ']');
        return str;
    }

    public final java.util.HashMap b() {
        return (java.util.HashMap) ((jz5.n) v70.b0.f433601n).getValue();
    }
}
