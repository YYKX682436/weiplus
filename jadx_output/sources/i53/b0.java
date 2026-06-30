package i53;

/* loaded from: classes8.dex */
public class b0 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f288522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c0 f288523b;

    public b0(i53.c0 c0Var, long j17) {
        this.f288523b = c0Var;
        this.f288522a = j17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanPublishImpl", "errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        i53.c0 c0Var = this.f288523b;
        c0Var.f288528d.put("costtime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f288522a));
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((p33.x) oVar.f70711b.f70700a).f351666g);
        java.util.Map map = c0Var.f288528d;
        map.put("topicid", valueOf);
        int i19 = c0Var.f288533i;
        m33.m1 m1Var = c0Var.f288531g;
        i53.d0 d0Var = c0Var.f288534m;
        java.lang.String str2 = c0Var.f288530f;
        if (i17 != 0 || i18 != 0) {
            ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai().W0(str2, 1);
            if (m1Var.f323315a) {
                m33.i1 i1Var = g53.f.f268911a;
                if (i1Var != null) {
                    i1Var.a("publish error");
                    g53.f.f268911a = null;
                }
                i53.d0.wi(d0Var, false, m1Var.f323316b);
            }
            d0Var.Bi(str2, i18 > 0 ? -i18 : i18);
            map.put("failid", java.lang.Integer.valueOf(i18));
            com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 87, 8765, 0, 56, c0Var.f288532h, lj0.a.a(i19, map));
            return;
        }
        i53.g0 Ai = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai();
        Ai.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str2);
        Ai.y0(linkedList);
        if (m1Var.f323315a) {
            java.lang.String str3 = m1Var.f323316b;
            if (m1Var.f323317c && !com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                i53.d0.wi(d0Var, true, str3);
                ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(str3);
                ((p43.d) ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Bi()).z0(arrayList);
            }
            m33.i1 i1Var2 = g53.f.f268911a;
            if (i1Var2 != null) {
                i1Var2.onSuccess();
                g53.f.f268911a = null;
            }
        }
        d0Var.Bi(str2, 0);
        com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 87, 8765, 0, 48, c0Var.f288532h, lj0.a.a(i19, map));
    }
}
