package ze5;

/* loaded from: classes9.dex */
public final class u5 {
    public u5(kotlin.jvm.internal.i iVar) {
    }

    public static final z01.h a(ze5.u5 u5Var, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        u5Var.getClass();
        java.lang.String U1 = f9Var.U1();
        if (!(true ^ (U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return new z01.h();
        }
        l15.c cVar = new l15.c();
        cVar.fromXml(U1);
        v05.b k17 = cVar.k();
        if (k17 == null) {
            return new z01.h();
        }
        z01.h hVar = new z01.h();
        int i17 = k17.f432315e;
        int i18 = i17 + 25;
        r05.g gVar = (r05.g) k17.getCustom(i18);
        hVar.f469039d = gVar != null ? gVar.o() : -1;
        hVar.f469040e = k17.getString(k17.f368365d + 2);
        hVar.f469041f = k17.getString(i17 + 11);
        r05.g gVar2 = (r05.g) k17.getCustom(i18);
        hVar.f469042g = gVar2 != null ? gVar2.k() : null;
        r05.g gVar3 = (r05.g) k17.getCustom(i18);
        hVar.f469044i = gVar3 != null ? (int) gVar3.j() : 0;
        r05.g gVar4 = (r05.g) k17.getCustom(i18);
        hVar.f469043h = gVar4 != null ? (int) gVar4.l() : 0;
        r05.g gVar5 = (r05.g) k17.getCustom(i18);
        if (gVar5 != null) {
            gVar5.q();
        }
        r05.g gVar6 = (r05.g) k17.getCustom(i18);
        if (gVar6 != null) {
            gVar6.r();
        }
        r05.g gVar7 = (r05.g) k17.getCustom(i18);
        hVar.f469045m = gVar7 != null ? gVar7.n() : 0;
        hVar.f469046n = new com.tencent.mm.ui.chatting.viewitems.h0(dVar, new ze5.t5(dVar, f9Var));
        return hVar;
    }

    public static final void b(ze5.u5 u5Var, ze5.n8 n8Var, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        u5Var.getClass();
        l15.c cVar = new l15.c();
        java.lang.String U1 = f9Var.U1();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (U1 == null) {
            U1 = "";
        }
        cVar.fromXml(U1);
        te5.t.a(str, dVar, f9Var, cVar);
        v05.b k17 = cVar.k();
        if (k17 == null) {
            return;
        }
        r05.g gVar = (r05.g) k17.getCustom(k17.f432315e + 25);
        int o17 = gVar != null ? gVar.o() : -1;
        if (o17 != -1 && ot0.f.f(o17)) {
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.u uVar = com.tencent.mm.plugin.brandservice.ui.timeline.preload.u.f94451a;
            v05.b k18 = cVar.k();
            uVar.e(k18 != null ? k18.getString(k18.f368365d + 9) : null, o17);
        }
    }
}
