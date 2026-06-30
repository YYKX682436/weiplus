package vd0;

/* loaded from: classes5.dex */
public final class v2 implements r14.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vd0.w2 f435524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f435525b;

    public v2(vd0.w2 w2Var, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f435524a = w2Var;
        this.f435525b = mMActivity;
    }

    @Override // r14.b
    public void a() {
        this.f435524a.getClass();
        com.tencent.mm.ui.MMActivity mMActivity = this.f435525b;
        db5.e1.K(mMActivity, true, mMActivity.getString(com.tencent.mm.R.string.i2g), mMActivity.getString(com.tencent.mm.R.string.i2h), mMActivity.getString(com.tencent.mm.R.string.i2i), mMActivity.getString(com.tencent.mm.R.string.f490347sg), new vd0.q2(mMActivity), null);
    }

    @Override // r14.b
    public void b() {
        com.tencent.mm.ui.MMActivity activity = this.f435525b;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.setting.ui.setting.i0) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.setting.ui.setting.i0.class)).R6();
    }

    @Override // r14.b
    public void c(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String str = lp0.b.h0("qrcode_tmp").o() + "mmqrcode-" + java.lang.System.currentTimeMillis() + ".png";
        vd0.w2 w2Var = this.f435524a;
        com.tencent.mm.ui.MMActivity activity = this.f435525b;
        kotlin.jvm.internal.o.g(activity, "activity");
        android.graphics.Bitmap Q6 = ((com.tencent.mm.plugin.setting.ui.setting.i0) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.setting.ui.setting.i0.class)).Q6();
        vd0.u2 u2Var = new vd0.u2(callback, str);
        w2Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new vd0.t2(Q6, str, activity, u2Var));
    }

    @Override // r14.b
    public int d() {
        com.tencent.mm.ui.MMActivity activity = this.f435525b;
        kotlin.jvm.internal.o.g(activity, "activity");
        return ((com.tencent.mm.plugin.setting.ui.setting.i0) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.setting.ui.setting.i0.class)).W6();
    }
}
