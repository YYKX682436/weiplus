package kl2;

/* loaded from: classes3.dex */
public final class b implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kl2.g f308751a;

    public b(kl2.g gVar) {
        this.f308751a = gVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton buttonView, boolean z17) {
        kotlin.jvm.internal.o.g(buttonView, "buttonView");
        kl2.g gVar = this.f308751a;
        android.widget.TextView textView = gVar.f308775p;
        if (textView == null) {
            kotlin.jvm.internal.o.o("rightBtn");
            throw null;
        }
        textView.setEnabled(z17);
        if (z17) {
            il2.s.f292086a.a(zl2.e5.f473744n, gVar.f308781v);
        }
    }
}
