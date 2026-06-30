package fi2;

/* loaded from: classes10.dex */
public final class r0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi2.x0 f262900d;

    public r0(fi2.x0 x0Var) {
        this.f262900d = x0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        android.widget.TextView textView;
        xh2.e eVar = (xh2.e) obj;
        fi2.x0 x0Var = this.f262900d;
        lj2.k b17 = x0Var.b();
        java.lang.String title = eVar.f454543a;
        b17.getClass();
        kotlin.jvm.internal.o.g(title, "title");
        if (b17.f318883d && (textView = b17.f318885g) != null) {
            textView.setText(title.concat(": "));
        }
        lj2.k b18 = x0Var.b();
        b18.getClass();
        java.lang.String text = eVar.f454544b;
        kotlin.jvm.internal.o.g(text, "text");
        if (b18.f318883d) {
            android.widget.TextView textView2 = b18.f318881b;
            if (textView2 != null) {
                textView2.setText(text);
            }
            b18.a();
        }
    }
}
