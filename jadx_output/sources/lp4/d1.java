package lp4;

/* loaded from: classes10.dex */
public final class d1 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f320337f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f320338g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f320339h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(android.content.Context context, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(status, "status");
        this.f320337f = context;
        this.f320338g = "MicroMsg.TimelineLoadingPlugin";
    }

    public static void A(lp4.d1 d1Var, java.lang.Integer num, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            num = null;
        }
        java.lang.String str = d1Var.f320338g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showLoading: ");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = d1Var.f320339h;
        sb6.append(u3Var != null ? java.lang.Boolean.valueOf(u3Var.isShowing()) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        com.tencent.mm.ui.widget.dialog.u3 u3Var2 = d1Var.f320339h;
        if (u3Var2 != null && u3Var2.isShowing()) {
            return;
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = i65.a.r(d1Var.f320337f, com.tencent.mm.R.string.ggc);
        if (num != null) {
            num.intValue();
            h0Var.f310123d = i65.a.r(d1Var.f320337f, num.intValue());
        }
        ((ku5.t0) ku5.t0.f312615d).B(new lp4.c1(d1Var, h0Var));
    }

    public final void z() {
        com.tencent.mars.xlog.Log.i(this.f320338g, "hideLoading: ");
        ((ku5.t0) ku5.t0.f312615d).B(new lp4.b1(this));
    }
}
