package rt1;

/* loaded from: classes7.dex */
public final class g extends al5.j2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt1.l f399408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f399409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f399410f;

    public g(rt1.l lVar, int i17, android.widget.TextView textView) {
        this.f399408d = lVar;
        this.f399409e = i17;
        this.f399410f = textView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String obj;
        java.lang.Character B0;
        rt1.l lVar = this.f399408d;
        android.widget.TextView[] textViewArr = lVar.f399449f;
        if (textViewArr == null) {
            kotlin.jvm.internal.o.o("charViews");
            throw null;
        }
        android.widget.TextView textView = textViewArr[this.f399409e];
        kotlin.jvm.internal.o.d(textView);
        java.lang.CharSequence text = textView.getText();
        boolean z17 = false;
        if (text != null && (obj = text.toString()) != null && (B0 = r26.p0.B0(obj)) != null) {
            char charValue = B0.charValue();
            if (19968 <= charValue && charValue < 40892) {
                z17 = true;
            }
        }
        if (z17) {
            this.f399410f.post(new rt1.f(lVar));
        }
    }
}
