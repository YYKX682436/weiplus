package sj4;

/* loaded from: classes10.dex */
public final class i1 extends bi4.o0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sj4.k1 f408854c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(java.lang.String str, sj4.k1 k1Var) {
        super(str);
        this.f408854c = k1Var;
    }

    @Override // bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String string;
        pj4.j0 j0Var = this.f21074b;
        if (j0Var == null || !kotlin.jvm.internal.o.b(j0Var.f355139d, "12")) {
            return false;
        }
        java.lang.String str2 = "";
        if (bundle == null || (str = bundle.getString("textStatusModelInfoStr")) == null) {
            str = "";
        }
        if (bundle != null && (string = bundle.getString("clickTagName")) != null) {
            str2 = string;
        }
        this.f408854c.getClass();
        l81.b1 b1Var = new l81.b1();
        b1Var.f317012a = "gh_390359b3fd13@app";
        b1Var.f317032k = 1190;
        b1Var.f317016c = kotlin.jvm.internal.o.b(bm5.o1.f22719a.b(bm5.h0.RepairerConfig_TextStatus_UsePreviewMiniApp_Int, 0), 1) ? 2 : 0;
        b1Var.f317028i = new sj4.j1(str, str2);
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
        return true;
    }

    @Override // bi4.o0
    public boolean j() {
        return false;
    }

    @Override // bi4.o0
    public void m(java.lang.String str, pj4.j0 j0Var) {
        super.m(str, j0Var);
        this.f408854c.getClass();
        ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Rh(com.tencent.mm.plugin.appbrand.service.x6.F);
        long c17 = c01.id.c();
        if (java.lang.Math.abs(c17 - sj4.k1.f408861d) > 3600000) {
            ((com.tencent.mm.plugin.appbrand.service.s6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.s6.class)).h8("gh_390359b3fd13@app", 0);
            sj4.k1.f408861d = c17;
        }
    }

    @Override // bi4.o0
    public void n() {
    }
}
