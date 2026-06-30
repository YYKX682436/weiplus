package hf2;

/* loaded from: classes10.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.y0 f281163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f281164e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(hf2.y0 y0Var, android.widget.EditText editText) {
        super(0);
        this.f281163d = y0Var;
        this.f281164e = editText;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        android.text.Editable text;
        android.text.Editable text2;
        hf2.y0 y0Var = this.f281163d;
        android.view.View view = y0Var.f281207h;
        android.widget.EditText editText = this.f281164e;
        if (view != null) {
            java.lang.String obj = (editText == null || (text2 = editText.getText()) == null) ? null : text2.toString();
            view.setEnabled(!(obj == null || obj.length() == 0));
        }
        hf2.y0.e(editText, y0Var);
        if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        com.tencent.mm.plugin.finder.live.util.y.o(y0Var.f281200a, null, null, new hf2.x0(y0Var, str, null), 3, null);
        return jz5.f0.f302826a;
    }
}
