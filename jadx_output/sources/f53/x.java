package f53;

/* loaded from: classes5.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI f259696d;

    public x(com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI) {
        this.f259696d = postCommentDialogUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI = this.f259696d;
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = postCommentDialogUI.f140011d;
        if (chatFooterPanel == null) {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
        if (chatFooterPanel.getVisibility() == 0) {
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI.T6(postCommentDialogUI);
            postCommentDialogUI.Y6();
            yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig = postCommentDialogUI.f140023s;
        boolean z17 = true;
        if (gameInputConfig != null && gameInputConfig.stickBtmIfNonEmpty) {
            com.tencent.mm.ui.widget.MMEditText mMEditText = postCommentDialogUI.f140012e;
            if (mMEditText == null) {
                kotlin.jvm.internal.o.o("gameCommentInputTxt");
                throw null;
            }
            android.text.Editable text = mMEditText.getText();
            if (text != null && text.length() != 0) {
                z17 = false;
            }
            if (!z17 && postCommentDialogUI.A) {
                com.tencent.mm.ui.widget.MMEditText mMEditText2 = postCommentDialogUI.f140012e;
                if (mMEditText2 == null) {
                    kotlin.jvm.internal.o.o("gameCommentInputTxt");
                    throw null;
                }
                java.lang.Object systemService = mMEditText2.getContext().getSystemService("input_method");
                android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(mMEditText2.getWindowToken(), 0);
                }
                postCommentDialogUI.X6().setVisibility(8);
                postCommentDialogUI.Y6();
                yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        if (postCommentDialogUI.B) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193055c;
            com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig2 = postCommentDialogUI.f140023s;
            com.tencent.mm.ipcinvoker.d0.d(str, new com.tencent.mm.ipcinvoker.type.IPCString(gameInputConfig2 != null ? gameInputConfig2.identifier : null), com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI.a.class, null);
        } else {
            m33.y0 y0Var = m33.x0.f323344a;
            com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig3 = postCommentDialogUI.f140023s;
            y0Var.a(gameInputConfig3 != null ? gameInputConfig3.identifier : null, null);
        }
        postCommentDialogUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
