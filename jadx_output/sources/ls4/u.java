package ls4;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final pr4.l f321100a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f321101b;

    /* renamed from: c, reason: collision with root package name */
    public ns4.c0 f321102c;

    public u(pr4.l parameter) {
        kotlin.jvm.internal.o.g(parameter, "parameter");
        this.f321100a = parameter;
    }

    public static final void a(ls4.u uVar) {
        uVar.getClass();
        com.tencent.mars.xlog.Log.i("WeCoinConsumeLogic", "cancel");
        uVar.e();
        uVar.f321100a.f358024e.invoke();
    }

    public static final void b(ls4.u uVar) {
        uVar.getClass();
        com.tencent.mars.xlog.Log.i("WeCoinConsumeLogic", "directConsume");
        uVar.g();
        pr4.l lVar = uVar.f321100a;
        if (lVar.f358026g == null) {
            com.tencent.mars.xlog.Log.e("WeCoinConsumeLogic", "contextBuff == null");
            uVar.d(new pr4.a(pr4.j.f358012d));
            return;
        }
        r45.fc5 fc5Var = new r45.fc5();
        try {
            fc5Var.parseFrom(lVar.f358026g);
            os4.h.k("WeCoinConsumeLogic", fc5Var);
            r45.ie ieVar = fc5Var.BaseResponse;
            if (ieVar == null || ieVar.f376959d == 0) {
                uVar.h(fc5Var);
                return;
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.A(fe1.l.CTRL_INDEX, 72);
            if (fc5Var.f374207f != null) {
                com.tencent.mars.xlog.Log.i("WeCoinConsumeLogic", "consumeWeCoin intercept_info is not null");
                g0Var.A(fe1.l.CTRL_INDEX, 77);
                os4.h.f(lVar.f358021b, fc5Var.f374207f, new ls4.m(uVar, fc5Var));
                return;
            }
            if (ieVar.f376959d == 10003) {
                uVar.d(new pr4.a(pr4.j.f358013e));
            } else {
                uVar.d(new pr4.a(pr4.j.f358012d));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.l.CTRL_INDEX, 72);
            com.tencent.mars.xlog.Log.e("WeCoinConsumeLogic", "parse failed, exception: %s", e17.getMessage());
            uVar.d(new pr4.a(pr4.j.f358012d));
        }
    }

    public static final void c(ls4.u uVar) {
        uVar.getClass();
        com.tencent.mars.xlog.Log.i("WeCoinConsumeLogic", "showConsumePanel");
        uVar.g();
        new ks4.e().l().h(new ls4.q(uVar));
    }

    public final void d(pr4.a aVar) {
        com.tencent.mars.xlog.Log.i("WeCoinConsumeLogic", "fail");
        e();
        this.f321100a.f358023d.invoke(aVar);
    }

    public final void e() {
        pr4.k kVar = this.f321100a.f358025f;
        if (kVar == pr4.k.f358017e || kVar == pr4.k.f358018f) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f321101b;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            this.f321101b = null;
        }
    }

    public final void f() {
        pm0.v.X(new ls4.r(this));
    }

    public final void g() {
        pr4.l lVar = this.f321100a;
        pr4.k kVar = lVar.f358025f;
        if (kVar == pr4.k.f358017e || kVar == pr4.k.f358018f) {
            androidx.fragment.app.FragmentActivity fragmentActivity = lVar.f358021b;
            this.f321101b = com.tencent.mm.ui.widget.dialog.u3.f(fragmentActivity, fragmentActivity.getString(com.tencent.mm.R.string.ggc), false, 3, null);
        }
    }

    public final void h(r45.fc5 fc5Var) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.A(fe1.l.CTRL_INDEX, 71);
        com.tencent.mm.protobuf.g gVar = fc5Var.f374205d;
        if (gVar == null) {
            g0Var.A(fe1.l.CTRL_INDEX, 72);
            com.tencent.mars.xlog.Log.e("WeCoinConsumeLogic", "contextByteString is null");
            d(new pr4.a(pr4.j.f358012d));
            return;
        }
        g0Var.A(fe1.l.CTRL_INDEX, 73);
        byte[] d17 = com.tencent.mm.network.j.f72026e.d(gVar.f192156a);
        if (d17 != null) {
            new ks4.b(gVar, new com.tencent.mm.protobuf.g(d17, 0, d17.length)).l().h(new ls4.t(this, fc5Var));
            return;
        }
        com.tencent.mars.xlog.Log.e("WeCoinConsumeLogic", "signData is null");
        g0Var.A(fe1.l.CTRL_INDEX, 76);
        g0Var.A(fe1.l.CTRL_INDEX, 75);
        d(new pr4.a(pr4.j.f358012d));
    }
}
