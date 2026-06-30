package gl5;

/* loaded from: classes5.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f273109d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(gl5.d1 d1Var) {
        super(0);
        this.f273109d = d1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gl5.d1 d1Var = this.f273109d;
        android.view.View inflate = android.view.LayoutInflater.from(d1Var.f272924a).inflate(com.tencent.mm.R.layout.egr, (android.view.ViewGroup) null);
        android.view.ViewParent parent = d1Var.f272924a.findViewById(com.tencent.mm.R.id.jlt).getParent().getParent().getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.addView(inflate);
        }
        return inflate;
    }
}
