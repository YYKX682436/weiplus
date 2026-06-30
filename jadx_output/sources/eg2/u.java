package eg2;

/* loaded from: classes3.dex */
public final class u implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg2.x f252638d;

    public u(eg2.x xVar) {
        this.f252638d = xVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        hk0.c1 c1Var = (hk0.c1) obj;
        android.widget.TextView textView = this.f252638d.f252645h;
        if (textView == null) {
            return;
        }
        textView.setVisibility(c1Var.f281712b ? 0 : 4);
    }
}
