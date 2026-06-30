package s61;

/* loaded from: classes8.dex */
public class d0 implements db5.l4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f403339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.pm.PackageManager f403340b;

    public d0(s61.i0 i0Var, java.util.HashMap hashMap, android.content.pm.PackageManager packageManager) {
        this.f403339a = hashMap;
        this.f403340b = packageManager;
    }

    @Override // db5.l4
    public void a(android.widget.TextView textView, android.view.MenuItem menuItem) {
        java.lang.CharSequence loadLabel = ((android.content.pm.ResolveInfo) this.f403339a.get(((java.lang.Object) menuItem.getTitle()) + "")).loadLabel(this.f403340b);
        if (loadLabel != null) {
            textView.setText(loadLabel.toString());
        } else {
            textView.setText("");
        }
    }
}
