package ie;

/* loaded from: classes7.dex */
public class e extends android.text.Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.game.widget.input.WAGamePanelInputEditText f290953a;

    public e(com.tencent.luggage.game.widget.input.WAGamePanelInputEditText wAGamePanelInputEditText) {
        this.f290953a = wAGamePanelInputEditText;
    }

    @Override // android.text.Editable.Factory
    public android.text.Editable newEditable(java.lang.CharSequence charSequence) {
        com.tencent.luggage.game.widget.input.WAGamePanelInputEditText wAGamePanelInputEditText = this.f290953a;
        com.tencent.mm.plugin.appbrand.widget.input.j4 j4Var = wAGamePanelInputEditText.f47262d;
        android.text.Editable editable = (android.text.Editable) com.tencent.luggage.game.widget.input.WAGamePanelInputEditText.a(wAGamePanelInputEditText, super.newEditable(charSequence));
        j4Var.a(editable);
        return editable;
    }
}
