package h34;

/* loaded from: classes15.dex */
public class w extends c34.z {

    /* renamed from: g, reason: collision with root package name */
    public static h34.w f278566g;

    /* renamed from: e, reason: collision with root package name */
    public final h34.a f278567e;

    /* renamed from: f, reason: collision with root package name */
    public h34.t f278568f;

    public w(android.content.Context context, c34.x xVar) {
        super(xVar);
        this.f278567e = new h34.a();
    }

    @Override // c34.z
    public void a() {
        this.f278567e.b();
        this.f38247d = null;
    }

    @Override // c34.z
    public void b() {
    }

    @Override // c34.z
    public void c() {
    }

    @Override // c34.z
    public void d() {
    }

    @Override // c34.z
    public void e() {
        if (this.f38247d == null) {
            com.tencent.mars.xlog.Log.w("Micromsg.ShakeMusicMgr", "shakeGetListener == null");
            return;
        }
        java.lang.System.currentTimeMillis();
        h34.a aVar = this.f278567e;
        aVar.f278465o = this.f278568f;
        h34.s sVar = new h34.s() { // from class: h34.w$$a
            @Override // h34.s
            public final void a(r45.js5 js5Var, long j17, boolean z17) {
                h34.w wVar = h34.w.this;
                if (wVar.f38247d == null) {
                    com.tencent.mars.xlog.Log.w("Micromsg.ShakeMusicMgr", "shakeGetListener == null");
                    return;
                }
                if (js5Var == null) {
                    com.tencent.mars.xlog.Log.w("Micromsg.ShakeMusicMgr", "resp null & return");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    c34.x xVar = wVar.f38247d;
                    if (xVar != null) {
                        ((com.tencent.mm.plugin.shake.ui.ShakeReportUI) xVar).a7(arrayList, 4L);
                        return;
                    }
                    return;
                }
                java.util.LinkedList linkedList = ((r45.gh4) js5Var).f375251i;
                com.tencent.mars.xlog.Log.i("Micromsg.ShakeMusicMgr", "music size: %d", java.lang.Integer.valueOf(linkedList.size()));
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                if (linkedList.size() > 0) {
                    r45.eh4 eh4Var = (r45.eh4) linkedList.get(0);
                    com.tencent.mars.xlog.Log.i("Micromsg.ShakeMusicMgr", "shake music is success, songName: %s, singerName: %s, bgUrl: %s", eh4Var.f373484g, eh4Var.f373485h, eh4Var.f373487m);
                    c34.r rVar = new c34.r();
                    java.lang.String str = eh4Var.f373485h;
                    rVar.field_username = str;
                    rVar.field_nickname = eh4Var.f373484g;
                    rVar.field_distance = str;
                    rVar.field_sns_bgurl = eh4Var.f373487m;
                    rVar.field_type = 4;
                    rVar.field_insertBatch = 1;
                    rVar.field_reserved3 = "newShake";
                    try {
                        rVar.field_lvbuffer = js5Var.toByteArray();
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.w("Micromsg.ShakeMusicMgr", "insertItem, to lvbuf error [%s]", e17.getLocalizedMessage());
                    }
                    c34.h0.Ni().J0(rVar, true);
                    arrayList2.add(rVar);
                }
                ((com.tencent.mm.plugin.shake.ui.ShakeReportUI) wVar.f38247d).a7(arrayList2, j17);
            }
        };
        c01.d9.e().a(5245, aVar);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        aVar.f278459f = (int) java.lang.System.currentTimeMillis();
        aVar.f278464n = sVar;
        tl.w wVar = new tl.w(8000, 1, 4);
        aVar.f278463m = wVar;
        wVar.f420160m = -19;
        wVar.f420172y = aVar.f278470t;
        if (!wVar.k()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MusicAndSingRecorder", "start record failed clientId: %d", java.lang.Integer.valueOf(aVar.f278459f));
            aVar.a();
            return;
        }
        aVar.f278460g = java.lang.System.currentTimeMillis();
        aVar.f278462i = false;
        aVar.f278467q = 0;
        aVar.f278461h = 1;
        aVar.f278468r = 0;
        aVar.f278469s = false;
    }
}
