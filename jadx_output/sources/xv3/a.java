package xv3;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final xv3.a f457429a = new xv3.a();

    public static void a(xv3.a aVar, ev3.d dVar, int i17, rv3.h hVar, android.view.View view, boolean z17, boolean z18, android.os.Bundle bundle, int i18, java.lang.Object obj) {
        int i19;
        int i27;
        wv3.k kVar;
        boolean z19 = (i18 & 16) != 0 ? false : z17;
        boolean z27 = (i18 & 32) != 0 ? false : z18;
        java.lang.Integer num = null;
        android.os.Bundle bundle2 = (i18 & 64) != 0 ? null : bundle;
        aVar.getClass();
        if (hVar == null) {
            return;
        }
        if (dVar != null) {
            dVar.k(hVar.f400395d, i17, view, z19, z27, bundle2);
        }
        wv3.b bVar = wv3.b.f450048a;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = hVar.f400395d;
        if (audioCacheInfo == null || view == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMusicReporter", "info or itemView is null return");
            return;
        }
        if (i17 != 5 && i17 != 6 && i17 != 15 && i17 != 16) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMusicReporter", "dataType:" + i17 + " return");
            return;
        }
        if (i17 != 5) {
            if (i17 == 6) {
                wv3.d dVar2 = wv3.d.f450054e;
                wv3.c cVar = wv3.c.f450050e;
                i19 = 1;
            } else if (i17 == 15) {
                wv3.d dVar3 = wv3.d.f450054e;
                wv3.c cVar2 = wv3.c.f450050e;
                i27 = 2;
                i19 = 1;
            } else if (i17 != 16) {
                i19 = 0;
            } else {
                wv3.d dVar4 = wv3.d.f450054e;
                wv3.c cVar3 = wv3.c.f450050e;
                i19 = 2;
            }
            i27 = i19;
        } else {
            wv3.d dVar5 = wv3.d.f450054e;
            wv3.c cVar4 = wv3.c.f450050e;
            i19 = 2;
            i27 = 1;
        }
        wv3.l a17 = wv3.m.f450068a.a(audioCacheInfo.C);
        jz5.l[] lVarArr = new jz5.l[7];
        lVarArr[0] = new jz5.l("musiceditsource", java.lang.Integer.valueOf(i19));
        lVarArr[1] = new jz5.l("sns_publish_sessionid", ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi());
        lVarArr[2] = new jz5.l("singername", kz5.n0.g0(audioCacheInfo.f155714h, null, null, null, 0, null, null, 63, null));
        lVarArr[3] = new jz5.l("songname", audioCacheInfo.f155723t);
        lVarArr[4] = new jz5.l("musicscene", java.lang.Integer.valueOf(i27));
        lVarArr[5] = new jz5.l("musicid", a17 != null ? a17.f450065a : null);
        if (a17 != null && (kVar = a17.f450066b) != null) {
            num = java.lang.Integer.valueOf(kVar.a());
        }
        lVarArr[6] = new jz5.l("snspostmusictype", num);
        java.util.Map k17 = kz5.c1.k(lVarArr);
        cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar2.pk(view, "sns_publish_music");
        aVar2.gk(view, k17);
        aVar2.ik(view, 40, 36244);
    }
}
