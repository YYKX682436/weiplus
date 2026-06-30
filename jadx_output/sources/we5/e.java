package we5;

/* loaded from: classes5.dex */
public final class e {
    public e(kotlin.jvm.internal.i iVar) {
    }

    public final void a(yb5.d ui6, android.widget.LinearLayout autoTranslationButton, android.widget.TextView autoTranslationText, com.tencent.mm.storage.f9 msg, android.app.Activity context) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(autoTranslationButton, "autoTranslationButton");
        kotlin.jvm.internal.o.g(autoTranslationText, "autoTranslationText");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.pluginsdk.ui.i0 i0Var = ((com.tencent.mm.ui.chatting.component.v2) ((sb5.e) ui6.f460708c.a(sb5.e.class))).f200111m;
        android.view.ViewGroup.LayoutParams layoutParams = autoTranslationButton.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        com.tencent.mm.ui.bk.s0(autoTranslationText.getPaint());
        if (i0Var.f190869d) {
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = i65.a.h(ui6.g(), com.tencent.mm.R.dimen.afe);
            }
            if (com.tencent.mm.ui.bk.C()) {
                autoTranslationButton.setBackgroundResource(com.tencent.mm.R.drawable.d_o);
            } else {
                autoTranslationButton.setBackgroundResource(com.tencent.mm.R.drawable.d_p);
            }
        } else {
            autoTranslationButton.setBackgroundResource(0);
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = i65.a.h(ui6.g(), com.tencent.mm.R.dimen.alk);
            }
        }
        autoTranslationButton.setLayoutParams(marginLayoutParams);
        com.tencent.mm.storage.a9 a9Var = msg.f193927g2;
        if (a9Var instanceof com.tencent.mm.ui.chatting.viewitems.un) {
            b(((com.tencent.mm.ui.chatting.viewitems.un) a9Var).f205716e, autoTranslationButton, autoTranslationText, msg, context);
            autoTranslationButton.setOnClickListener(new we5.c(context, msg, a9Var, ui6));
        } else if (a9Var instanceof com.tencent.mm.ui.chatting.viewitems.xb) {
            b(((com.tencent.mm.ui.chatting.viewitems.xb) a9Var).f205979e, autoTranslationButton, autoTranslationText, msg, context);
            autoTranslationButton.setOnClickListener(new we5.d(context, msg, a9Var, ui6));
        }
    }

    public final void b(int i17, android.widget.LinearLayout linearLayout, android.widget.TextView textView, com.tencent.mm.storage.f9 f9Var, android.app.Activity activity) {
        if (i17 == 1) {
            linearLayout.setVisibility(0);
            textView.setText(i65.a.r(activity, com.tencent.mm.R.string.nff));
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemTextFrom", "auto translation tail button at " + f9Var.getMsgId() + ": " + ((java.lang.Object) textView.getText()));
            return;
        }
        if (i17 != 2) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        textView.setText(i65.a.r(activity, com.tencent.mm.R.string.ndr));
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemTextFrom", "auto translation tail button at " + f9Var.getMsgId() + ": " + ((java.lang.Object) textView.getText()));
    }
}
