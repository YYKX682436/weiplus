package lj2;

/* loaded from: classes10.dex */
public final class l implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj2.n f318887d;

    public l(lj2.n nVar) {
        this.f318887d = nVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        xh2.e eVar = (xh2.e) obj;
        android.widget.TextView textView = this.f318887d.f318896i;
        if (textView == null) {
            return;
        }
        textView.setText(eVar.f454544b);
    }
}
