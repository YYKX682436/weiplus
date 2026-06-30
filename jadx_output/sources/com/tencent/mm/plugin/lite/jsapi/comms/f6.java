package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public class f6 implements com.tencent.mm.plugin.lite.jsapi.comms.n6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.g6 f143578b;

    public f6(com.tencent.mm.plugin.lite.jsapi.comms.g6 g6Var, java.lang.String str) {
        this.f143578b = g6Var;
        this.f143577a = str;
    }

    @Override // com.tencent.mm.plugin.lite.jsapi.comms.n6
    public void a(java.lang.String videoPath) {
        boolean isEmpty = android.text.TextUtils.isEmpty(videoPath);
        com.tencent.mm.plugin.lite.jsapi.comms.g6 g6Var = this.f143578b;
        if (isEmpty) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiSaveToPhotosAlbum", "handleLivePhoto fail, video path invalid");
            g6Var.f143587a.f143602n.f143443f.a("saveToPhotosAlbum:fail_live_video_invalid");
            return;
        }
        com.tencent.mm.plugin.lite.jsapi.comms.h6 h6Var = g6Var.f143587a;
        com.tencent.mm.plugin.lite.jsapi.comms.o6 o6Var = h6Var.f143602n;
        org.json.JSONObject jSONObject = h6Var.f143601m;
        o6Var.getClass();
        com.tencent.mm.plugin.lite.jsapi.comms.m6 m6Var = new com.tencent.mm.plugin.lite.jsapi.comms.m6(o6Var, jSONObject);
        java.lang.String coverPath = this.f143577a;
        kotlin.jvm.internal.o.g(coverPath, "coverPath");
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        com.tencent.mars.xlog.Log.i("LiteAppLivePhotoBridge", "makeLivePhoto coverPath=%s, videoPath=%s", coverPath, videoPath);
        if (com.tencent.mm.plugin.lite.jsapi.comms.d8.a()) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null))), null, null, new com.tencent.mm.plugin.lite.jsapi.comms.c8(m6Var, videoPath, coverPath, null), 3, null);
        } else {
            com.tencent.mars.xlog.Log.e("LiteAppLivePhotoBridge", "makeLivePhoto fail, device not support");
            m6Var.a(false, null, -2001, "device not support live photo");
        }
    }
}
