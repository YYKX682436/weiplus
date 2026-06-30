package rn2;

/* loaded from: classes15.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f397642d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(rn2.t2 t2Var) {
        super(0);
        this.f397642d = t2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        android.text.Editable text;
        rn2.t2 t2Var = this.f397642d;
        rn2.f fVar = t2Var.f397854f;
        if (fVar != null) {
            android.widget.EditText editText = t2Var.F;
            if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
                str = "";
            }
            rn2.c1 c1Var = (rn2.c1) fVar;
            c1Var.f397672o = str;
            c1Var.g(c1Var.f397668h, false);
        }
        return jz5.f0.f302826a;
    }
}
