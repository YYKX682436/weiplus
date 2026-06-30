package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public class g6 implements com.tencent.mm.plugin.lite.jsapi.comms.n6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.h6 f143587a;

    public g6(com.tencent.mm.plugin.lite.jsapi.comms.h6 h6Var) {
        this.f143587a = h6Var;
    }

    @Override // com.tencent.mm.plugin.lite.jsapi.comms.n6
    public void a(java.lang.String str) {
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        com.tencent.mm.plugin.lite.jsapi.comms.h6 h6Var = this.f143587a;
        if (isEmpty) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiSaveToPhotosAlbum", "handleLivePhoto fail, cover path invalid");
            h6Var.f143602n.f143443f.a("saveToPhotosAlbum:fail_cover_invalid");
            return;
        }
        com.tencent.mm.plugin.lite.jsapi.comms.o6 o6Var = h6Var.f143602n;
        java.lang.String str2 = h6Var.f143595d;
        java.lang.String str3 = h6Var.f143599h;
        java.lang.String str4 = h6Var.f143600i;
        com.tencent.mm.plugin.lite.jsapi.comms.f6 f6Var = new com.tencent.mm.plugin.lite.jsapi.comms.f6(this, str);
        o6Var.getClass();
        if (!android.text.TextUtils.isEmpty(str3)) {
            java.lang.String zj6 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str2, o6Var.f143442e.f299024a, str3);
            if (!android.text.TextUtils.isEmpty(zj6) && com.tencent.mm.vfs.w6.j(zj6)) {
                f6Var.a(zj6);
                return;
            } else {
                com.tencent.mars.xlog.Log.e("LiteAppJsApiSaveToPhotosAlbum", "live video localId resolve fail. localId:%s resolved:%s", str3, zj6);
                f6Var.a(null);
                return;
            }
        }
        if (android.text.TextUtils.isEmpty(str4)) {
            f6Var.a(null);
            return;
        }
        if (!((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Kj(str4)) {
            if (com.tencent.mm.vfs.w6.j(str4)) {
                f6Var.a(str4);
                return;
            } else if (str4.startsWith("http")) {
                com.tencent.mm.plugin.lite.jsapi.comms.d.a(str2, str4, new com.tencent.mm.plugin.lite.jsapi.comms.k6(o6Var, f6Var, str4));
                return;
            } else {
                com.tencent.mars.xlog.Log.e("LiteAppJsApiSaveToPhotosAlbum", "live video file not found: %s", str4);
                f6Var.a(null);
                return;
            }
        }
        java.lang.String zj7 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str2, o6Var.f143442e.f299024a, str4);
        if (!android.text.TextUtils.isEmpty(zj7) && com.tencent.mm.vfs.w6.j(zj7)) {
            f6Var.a(zj7);
        } else {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiSaveToPhotosAlbum", "live video filePath-as-localId resolve fail. id:%s resolved:%s", str4, zj7);
            f6Var.a(null);
        }
    }
}
