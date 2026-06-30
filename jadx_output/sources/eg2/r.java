package eg2;

/* loaded from: classes3.dex */
public final class r implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg2.x f252619d;

    public r(eg2.x xVar) {
        this.f252619d = xVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        hk0.o oVar = (hk0.o) obj;
        android.widget.TextView textView = this.f252619d.f252645h;
        if (textView == null) {
            return;
        }
        textView.setVisibility(oVar.f281783b ? 4 : 0);
    }
}
