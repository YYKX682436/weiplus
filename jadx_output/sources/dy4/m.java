package dy4;

/* loaded from: classes7.dex */
public class m implements dg.d {

    /* renamed from: a, reason: collision with root package name */
    public dg.c f244686a;

    public void a(int i17, int i18) {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoErrorHandler", "onVideoError(%d, %d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        dg.c cVar = this.f244686a;
        if (cVar != null) {
            if (i17 == -1024) {
                str = "VIDEO_ERROR";
            } else {
                java.lang.String str2 = "MEDIA_ERR_SRC_NOT_SUPPORTED";
                if (i17 != -1010 && i17 != -1007) {
                    str2 = "MEDIA_ERR_NETWORK";
                    if (i17 != -1004 ? com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a) : com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                        str = "MEDIA_ERR_DECODE";
                    }
                }
                str = str2;
            }
            cVar.a(str, i17, i18);
        }
    }

    public void b(dg.c cVar) {
        this.f244686a = cVar;
    }
}
