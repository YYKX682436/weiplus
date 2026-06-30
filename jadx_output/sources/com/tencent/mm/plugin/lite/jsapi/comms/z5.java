package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public class z5 implements com.tencent.mm.plugin.lite.jsapi.comms.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.a6 f143843a;

    public z5(com.tencent.mm.plugin.lite.jsapi.comms.a6 a6Var) {
        this.f143843a = a6Var;
    }

    @Override // com.tencent.mm.plugin.lite.jsapi.comms.b
    public void a(java.lang.String str, int i17, int i18) {
        java.lang.String str2;
        if (str == null || !str.endsWith(".temp")) {
            str2 = str;
        } else {
            java.lang.String replace = str.replace(".temp", "");
            com.tencent.mm.vfs.w6.w(str, replace);
            com.tencent.mars.xlog.Log.i("LiteAppJsApiSaveToPhotosAlbum", "download videoPath:%s", replace);
            str2 = replace;
        }
        com.tencent.mm.plugin.lite.jsapi.comms.a6 a6Var = this.f143843a;
        if (i17 == 0) {
            a6Var.f143505e.F(str2, a6Var.f143505e.E(str2), null, a6Var.f143503c, null);
        } else {
            if (i17 != 2) {
                return;
            }
            a6Var.f143505e.f143443f.a("saveToPhotosAlbum fail, download video failed");
        }
    }
}
