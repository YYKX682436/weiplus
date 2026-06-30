package eh5;

/* loaded from: classes14.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.immersive.ImmersiveBaseActivity f252961d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.ui.immersive.ImmersiveBaseActivity immersiveBaseActivity) {
        super(0);
        this.f252961d = immersiveBaseActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.ui.immersive.ImmersiveBaseActivity.f208931s;
        com.tencent.mm.ui.immersive.ImmersiveBaseActivity immersiveBaseActivity = this.f252961d;
        androidx.constraintlayout.widget.ConstraintLayout d17 = immersiveBaseActivity.X6().d();
        kotlin.jvm.internal.o.f(d17, "getImmersiveBaseActivity(...)");
        return q26.h0.y(q26.h0.i(new n3.r1(d17), new eh5.h(immersiveBaseActivity)));
    }
}
