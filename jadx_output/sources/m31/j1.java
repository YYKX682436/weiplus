package m31;

/* loaded from: classes3.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m31.p1 f323158d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(m31.p1 p1Var) {
        super(0);
        this.f323158d = p1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        m31.p1 p1Var = this.f323158d;
        android.view.View view = new android.view.View(p1Var.f323180d);
        view.setBackgroundColor(p1Var.f323180d.getResources().getColor(com.tencent.mm.R.color.f478891k0));
        view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, 1));
        return view;
    }
}
