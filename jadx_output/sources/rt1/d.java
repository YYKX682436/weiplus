package rt1;

/* loaded from: classes7.dex */
public final class d extends al5.j2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt1.l f399392d;

    public d(rt1.l lVar) {
        this.f399392d = lVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        rt1.l lVar = this.f399392d;
        android.widget.TextView[] textViewArr = lVar.f399449f;
        if (textViewArr == null) {
            kotlin.jvm.internal.o.o("charViews");
            throw null;
        }
        boolean z17 = false;
        java.lang.String d07 = kz5.z.d0(textViewArr, "", null, null, 0, null, rt1.k.f399432d, 30, null);
        lVar.f399447d = d07;
        rt1.j jVar = new rt1.j(lVar);
        int length = d07.length();
        if ((7 <= length && length < 9) && ((java.lang.Boolean) jVar.invoke()).booleanValue()) {
            z17 = true;
        }
        rt1.a aVar = lVar.f399446c;
        if (aVar != null) {
            java.lang.String text = lVar.f399447d;
            kotlin.jvm.internal.o.g(text, "text");
            android.view.View view = ((rt1.t) aVar).f399486a.f94612g;
            if (view != null) {
                view.setEnabled(z17);
            } else {
                kotlin.jvm.internal.o.o("finishBtn");
                throw null;
            }
        }
    }
}
