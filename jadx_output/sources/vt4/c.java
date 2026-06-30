package vt4;

/* loaded from: classes9.dex */
public abstract class c {
    public static void a(android.content.Context context, android.widget.TextView textView) {
        iz5.a.g(null, (context == null || textView == null) ? false : true);
        com.tencent.mm.plugin.wallet_core.ui.b4 b4Var = new com.tencent.mm.plugin.wallet_core.ui.b4(context);
        b4Var.f180146d = new vt4.a(context);
        com.tencent.mm.plugin.wallet_core.ui.b4 b4Var2 = new com.tencent.mm.plugin.wallet_core.ui.b4(context);
        b4Var2.f180146d = new vt4.b(context);
        java.lang.String charSequence = context.getText(com.tencent.mm.R.string.kwe).toString();
        android.text.SpannableString spannableString = new android.text.SpannableString(charSequence);
        spannableString.setSpan(b4Var, 94, 115, 33);
        spannableString.setSpan(b4Var2, charSequence.length() - 3, charSequence.length(), 33);
        textView.setText(spannableString);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }
}
