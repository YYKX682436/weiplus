package yw0;

/* loaded from: classes5.dex */
public final class l implements yw0.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yw0.n f466569a;

    public l(yw0.n nVar) {
        this.f466569a = nVar;
    }

    public void a() {
        this.f466569a.f466571a.invalidate();
    }

    public void b(java.lang.Integer num) {
        yw0.n nVar = this.f466569a;
        com.tencent.mm.ui.kk.f(nVar.f466572b, num != null ? num.intValue() - nVar.f466572b.getHeight() : (int) nVar.f466574d);
        android.widget.TextView textView = nVar.f466572b;
        textView.setLayoutParams(textView.getLayoutParams());
    }

    public void c(java.lang.String text, boolean z17) {
        kotlin.jvm.internal.o.g(text, "text");
        yw0.n nVar = this.f466569a;
        nVar.f466572b.setVisibility(z17 ? 0 : 8);
        nVar.f466572b.setText(text);
    }
}
