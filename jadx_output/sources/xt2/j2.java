package xt2;

/* loaded from: classes3.dex */
public final class j2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f456827d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(xt2.e3 e3Var) {
        super(0);
        this.f456827d = e3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xt2.e3 e3Var = this.f456827d;
        com.tencent.mars.xlog.Log.i(e3Var.f456706h, "subsidy onExitStart: promoteGroup alpha 0→1 (sync with bg shrink, 500ms)");
        android.widget.LinearLayout linearLayout = e3Var.f456723z;
        linearLayout.animate().cancel();
        linearLayout.setAlpha(0.0f);
        linearLayout.animate().alpha(1.0f).setDuration(500L).start();
        return jz5.f0.f302826a;
    }
}
