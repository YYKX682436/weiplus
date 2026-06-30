package wv3;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final wv3.b f450048a = new wv3.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f450049b = new java.util.LinkedHashSet();

    public final java.lang.String a(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, wv3.d editSource, wv3.c musicScene) {
        wv3.k kVar;
        kotlin.jvm.internal.o.g(editSource, "editSource");
        kotlin.jvm.internal.o.g(musicScene, "musicScene");
        if (audioCacheInfo == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMusicReporter", "info is null return");
            return "";
        }
        wv3.l a17 = wv3.m.f450068a.a(audioCacheInfo.C);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("musiceditsource", editSource.f450057d);
        jSONObject.put("songname", audioCacheInfo.f155723t);
        jSONObject.put("singername", kz5.n0.g0(audioCacheInfo.f155714h, null, null, null, 0, null, null, 63, null));
        java.lang.String str = null;
        jSONObject.put("musicid", a17 != null ? a17.f450065a : null);
        jSONObject.put("musicscene", musicScene.f450053d);
        if (a17 != null && (kVar = a17.f450066b) != null) {
            str = kVar.f450064a;
        }
        jSONObject.put("musicidtype", str);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return r26.i0.t(jSONObject2, ",", ";", false);
    }

    public final void b(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, wv3.d editSource, wv3.c musicScene) {
        wv3.k kVar;
        kotlin.jvm.internal.o.g(editSource, "editSource");
        kotlin.jvm.internal.o.g(musicScene, "musicScene");
        if (audioCacheInfo == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMusicReporter", "info is null return");
            return;
        }
        wv3.l a17 = wv3.m.f450068a.a(audioCacheInfo.C);
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("view_id", "musiceditfinish");
        lVarArr[1] = new jz5.l("musiceditsource", java.lang.Integer.valueOf(editSource.f450057d));
        lVarArr[2] = new jz5.l("sns_publish_sessionid", ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi());
        lVarArr[3] = new jz5.l("singername", kz5.n0.g0(audioCacheInfo.f155714h, null, null, null, 0, null, null, 63, null));
        lVarArr[4] = new jz5.l("songname", audioCacheInfo.f155723t);
        lVarArr[5] = new jz5.l("musicscene", java.lang.Integer.valueOf(musicScene.f450053d));
        java.lang.Integer num = null;
        lVarArr[6] = new jz5.l("musicid", a17 != null ? a17.f450065a : null);
        if (a17 != null && (kVar = a17.f450066b) != null) {
            num = java.lang.Integer.valueOf(kVar.a());
        }
        lVarArr[7] = new jz5.l("snspostmusictype", num);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", kz5.c1.k(lVarArr), 36244);
    }

    public final void c(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, boolean z17, int i17) {
        wv3.k kVar;
        if (audioCacheInfo == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMusicReporter", "info is null return");
            return;
        }
        if (i17 != 5 && i17 != 6 && i17 != 15 && i17 != 16) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMusicReporter", "dataType:" + i17 + " return");
            return;
        }
        wv3.d dVar = (i17 == 5 || i17 == 16) ? wv3.d.f450055f : wv3.d.f450054e;
        wv3.c cVar = (i17 == 5 || i17 == 6) ? wv3.c.f450050e : wv3.c.f450051f;
        wv3.l a17 = wv3.m.f450068a.a(audioCacheInfo.C);
        int i18 = !z17 ? 1 : 2;
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("musiceditsource", java.lang.Integer.valueOf(dVar.f450057d));
        lVarArr[1] = new jz5.l("sns_publish_sessionid", ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi());
        lVarArr[2] = new jz5.l("singername", kz5.n0.g0(audioCacheInfo.f155714h, null, null, null, 0, null, null, 63, null));
        lVarArr[3] = new jz5.l("songname", audioCacheInfo.f155723t);
        lVarArr[4] = new jz5.l("musicscene", java.lang.Integer.valueOf(cVar.f450053d));
        lVarArr[5] = new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PLAY_TYPE, java.lang.Integer.valueOf(i18));
        java.lang.Integer num = null;
        lVarArr[6] = new jz5.l("musicid", a17 != null ? a17.f450065a : null);
        if (a17 != null && (kVar = a17.f450066b) != null) {
            num = java.lang.Integer.valueOf(kVar.a());
        }
        lVarArr[7] = new jz5.l("snspostmusictype", num);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("musiclisting", kz5.c1.k(lVarArr), 36244);
    }

    public final void d(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, boolean z17) {
        int i17;
        wv3.k kVar;
        if (audioCacheInfo == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMusicReporter", "info is null return");
            return;
        }
        wv3.d dVar = wv3.d.f450054e;
        if (f450049b.contains(audioCacheInfo.C)) {
            wv3.c cVar = wv3.c.f450050e;
            i17 = 2;
        } else {
            wv3.c cVar2 = wv3.c.f450050e;
            i17 = 1;
        }
        wv3.l a17 = wv3.m.f450068a.a(audioCacheInfo.C);
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("view_id", "sns_publish_music");
        lVarArr[1] = new jz5.l("musiceditsource", 2);
        lVarArr[2] = new jz5.l("sns_publish_sessionid", ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi());
        lVarArr[3] = new jz5.l("singername", kz5.n0.g0(audioCacheInfo.f155714h, null, null, null, 0, null, null, 63, null));
        lVarArr[4] = new jz5.l("songname", audioCacheInfo.f155723t);
        lVarArr[5] = new jz5.l("musicscene", java.lang.Integer.valueOf(i17));
        java.lang.Integer num = null;
        lVarArr[6] = new jz5.l("musicid", a17 != null ? a17.f450065a : null);
        if (a17 != null && (kVar = a17.f450066b) != null) {
            num = java.lang.Integer.valueOf(kVar.a());
        }
        lVarArr[7] = new jz5.l("snspostmusictype", num);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(!z17 ? "view_exp" : "view_clk", kz5.c1.k(lVarArr), 36244);
    }
}
