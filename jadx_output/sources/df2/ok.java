package df2;

/* loaded from: classes3.dex */
public final class ok extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pk f230985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f230986e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(df2.pk pkVar, android.widget.EditText editText) {
        super(0);
        this.f230985d = pkVar;
        this.f230986e = editText;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        r45.na0 D0;
        r45.pa0 pa0Var;
        java.lang.String string;
        com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView;
        android.text.Editable text;
        android.text.Editable text2;
        df2.pk pkVar = this.f230985d;
        android.view.View view = pkVar.D;
        android.widget.EditText editText = this.f230986e;
        if (view != null) {
            java.lang.String obj = (editText == null || (text2 = editText.getText()) == null) ? null : text2.toString();
            view.setEnabled(!kotlin.jvm.internal.o.b(obj, pkVar.f231072J != null ? r6.A0() : null));
        }
        df2.pk.i7(editText, pkVar);
        if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        ce2.i iVar = pkVar.f231072J;
        if (iVar != null && (D0 = iVar.D0()) != null && (pa0Var = (r45.pa0) D0.getCustom(1)) != null) {
            com.tencent.mars.xlog.Log.i(pkVar.f231073m, "updateCustomTextEdit:".concat(str));
            if (pa0Var.getBoolean(0) && (string = pa0Var.getString(7)) != null && (magicRewardView = pkVar.f231079s) != null) {
                magicRewardView.j(string, str);
            }
        }
        return jz5.f0.f302826a;
    }
}
