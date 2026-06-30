package xn4;

/* loaded from: classes11.dex */
public final class y implements xn4.q {
    @Override // xn4.q
    public void a(java.lang.String mediaId, double d17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_XUPDATE_DOWNLOAD_PROGRESS").putInt(mediaId, (int) d17);
    }

    @Override // xn4.q
    public void b(java.lang.String mediaId, r45.mm6 info) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_XUPDATE_DOWNLOAD_PROGRESS").putInt(mediaId, 0);
    }

    @Override // xn4.q
    public void c(java.lang.String mediaId, java.lang.String path) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_XUPDATE_DOWNLOAD_PROGRESS").putInt(mediaId, 0);
    }

    @Override // xn4.q
    public void d(java.lang.String mediaId, java.lang.String msg) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_XUPDATE_DOWNLOAD_PROGRESS").putInt(mediaId, 0);
    }
}
