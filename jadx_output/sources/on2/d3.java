package on2;

/* loaded from: classes3.dex */
public final class d3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f346877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f346878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f346879f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(kotlin.jvm.internal.h0 h0Var, android.widget.EditText editText, android.widget.TextView textView) {
        super(0);
        this.f346877d = h0Var;
        this.f346878e = editText;
        this.f346879f = textView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String obj = this.f346878e.getText().toString();
        kotlin.jvm.internal.h0 h0Var = this.f346877d;
        h0Var.f310123d = obj;
        android.widget.TextView confirm = this.f346879f;
        kotlin.jvm.internal.o.f(confirm, "$confirm");
        on2.l3.b(confirm, ((java.lang.CharSequence) h0Var.f310123d).length() > 0);
        return jz5.f0.f302826a;
    }
}
