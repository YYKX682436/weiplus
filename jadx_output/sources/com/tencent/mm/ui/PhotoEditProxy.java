package com.tencent.mm.ui;

/* loaded from: classes10.dex */
public class PhotoEditProxy extends k55.b {
    public PhotoEditProxy(k55.k kVar) {
        super(kVar);
    }

    public int doFav(java.lang.String str) {
        return ((java.lang.Integer) REMOTE_CALL("doFavInMM", str)).intValue();
    }

    @k55.m
    public int doFavInMM(java.lang.String str) {
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        ((com.tencent.mm.pluginsdk.model.b2) ((o72.c5) i95.n0.c(o72.c5.class))).getClass();
        com.tencent.mm.pluginsdk.model.a2.g(doFavoriteEvent, 2, str);
        doFavoriteEvent.f54090g.f6327m = 44;
        doFavoriteEvent.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.PhotoEditProxy", "[doFavInMM] path:%s", str);
        return doFavoriteEvent.f54091h.f6433a;
    }

    public java.lang.String getFullPath(java.lang.String str) {
        return (java.lang.String) REMOTE_CALL("getFullPathInMM", str);
    }

    @k55.m
    public java.lang.String getFullPathInMM(java.lang.String str) {
        return ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).Zi(null, bm5.f0.f22561f, str);
    }

    public java.lang.String getSelfUsername() {
        return (java.lang.String) REMOTE_CALL("getSelfUsernameInMM", new java.lang.Object[0]);
    }

    @k55.m
    public java.lang.String getSelfUsernameInMM() {
        return c01.z1.r();
    }

    public boolean isAutoSave() {
        return ((java.lang.Boolean) REMOTE_CALL("isAutoSavePhotoInMM", new java.lang.Object[0])).booleanValue();
    }

    @k55.m
    public boolean isAutoSavePhotoInMM() {
        return gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, true);
    }

    public void recordImage(java.lang.String str, java.lang.String str2, long j17, java.lang.String str3, java.lang.String str4) {
        REMOTE_CALL("recordImageInMM", str, str2, java.lang.Long.valueOf(j17), str3, str4);
    }

    @k55.m
    public void recordImageInMM(java.lang.String str, java.lang.String str2, long j17, java.lang.String str3, java.lang.String str4) {
    }

    public void recordVideo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        REMOTE_CALL("recordVideoInMM", str, str2, str3, str4);
    }

    @k55.m
    public void recordVideoInMM(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
    }

    public void sendImage(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        REMOTE_CALL("sendImageInMM", str, str2, str3, str4);
    }

    @k55.m
    public void sendImageInMM(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        k70.i0 i0Var = new k70.i0();
        i0Var.f304642a = 4;
        java.lang.String r17 = c01.z1.r();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        r70.g gVar = new r70.g(str2, 0, r17 == null ? "" : r17, str4 == null ? "" : str4, i0Var);
        gVar.f393108j = "photo_edit_send_img";
        ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
        ((dk5.s5) tg3.t1.a()).Ui(str, str4);
    }
}
