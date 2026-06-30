package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public class l6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f143661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143662e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f143663f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143664g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.m6 f143665h;

    public l6(com.tencent.mm.plugin.lite.jsapi.comms.m6 m6Var, boolean z17, java.lang.String str, int i17, java.lang.String str2) {
        this.f143665h = m6Var;
        this.f143661d = z17;
        this.f143662e = str;
        this.f143663f = i17;
        this.f143664g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f143661d;
        com.tencent.mm.plugin.lite.jsapi.comms.m6 m6Var = this.f143665h;
        if (z17) {
            java.lang.String str = this.f143662e;
            if (!android.text.TextUtils.isEmpty(str) && com.tencent.mm.vfs.w6.j(str)) {
                java.lang.String E = m6Var.f143683b.E(str);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("liveVideoFilePath", str);
                hashMap.put("liveVideoLocalId", E);
                hashMap.put("err_msg", "image saveToPhotosAlbum:ok");
                com.tencent.mars.xlog.Log.i("LiteAppJsApiSaveToPhotosAlbum", "composeLivePhoto success, exportPath=%s, ret=%s", str, hashMap.toString());
                m6Var.f143683b.G(str, true, false);
                m6Var.f143683b.f143443f.b(hashMap);
                com.tencent.mm.plugin.lite.jsapi.comms.o6.A(m6Var.f143683b, E, m6Var.f143682a);
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("LiteAppJsApiSaveToPhotosAlbum", "composeLivePhoto fail, internalCode=%d msg=%s", java.lang.Integer.valueOf(this.f143663f), this.f143664g);
        m6Var.f143683b.f143443f.a("saveToPhotosAlbum:fail_make_live_photo_failed");
    }
}
