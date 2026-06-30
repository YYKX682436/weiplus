package el2;

/* loaded from: classes3.dex */
public final class q2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.r2 f253895d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(el2.r2 r2Var) {
        super(0);
        this.f253895d = r2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        el2.r2 r2Var = this.f253895d;
        r2Var.f253904i.setVisibility(4);
        android.view.ViewGroup viewGroup = r2Var.f253899d;
        viewGroup.animate().setDuration(100L).scaleX(1.5f).scaleY(1.5f).start();
        viewGroup.postDelayed(new el2.o2(r2Var), 100L);
        viewGroup.postDelayed(new el2.p2(r2Var), 200L);
        return jz5.f0.f302826a;
    }
}
