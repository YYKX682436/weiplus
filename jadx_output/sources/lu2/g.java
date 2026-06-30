package lu2;

/* loaded from: classes.dex */
public final class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f321372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f321373e;

    public g(yz5.q qVar, android.widget.EditText editText) {
        this.f321372d = qVar;
        this.f321373e = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        kotlin.jvm.internal.o.d(dialogInterface);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        android.text.Editable text = this.f321373e.getText();
        kotlin.jvm.internal.o.f(text, "getText(...)");
        this.f321372d.invoke(dialogInterface, valueOf, text);
    }
}
