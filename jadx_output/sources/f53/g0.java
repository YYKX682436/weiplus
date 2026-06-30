package f53;

/* loaded from: classes5.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI f259652d;

    public g0(com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI) {
        this.f259652d = postCommentDialogUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f259652d.f140011d;
        if (chatFooterPanel == null) {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
        if (chatFooterPanel.getVisibility() == 0) {
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI.T6(this.f259652d);
            com.tencent.mm.ui.widget.MMEditText mMEditText = this.f259652d.f140012e;
            if (mMEditText == null) {
                kotlin.jvm.internal.o.o("gameCommentInputTxt");
                throw null;
            }
            java.lang.Object systemService = mMEditText.getContext().getSystemService("input_method");
            android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                mMEditText.requestFocus();
                inputMethodManager.showSoftInput(mMEditText, 0);
            }
            this.f259652d.X6().setVisibility(0);
        } else {
            androidx.appcompat.app.AppCompatActivity context = this.f259652d.getContext();
            this.f259652d.getClass();
            com.tencent.mm.game.report.l.c(context, 90, 9001, 999, 2, 0, null);
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI = this.f259652d;
            com.tencent.mm.ui.widget.MMEditText mMEditText2 = postCommentDialogUI.f140012e;
            if (mMEditText2 == null) {
                kotlin.jvm.internal.o.o("gameCommentInputTxt");
                throw null;
            }
            java.lang.Object systemService2 = mMEditText2.getContext().getSystemService("input_method");
            android.view.inputmethod.InputMethodManager inputMethodManager2 = systemService2 instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService2 : null;
            if (inputMethodManager2 != null) {
                inputMethodManager2.hideSoftInputFromWindow(mMEditText2.getWindowToken(), 0);
            }
            com.tencent.mm.game.report.l.c(postCommentDialogUI.getContext(), 90, 9002, 0, 1, 0, null);
            ku5.u0 u0Var = ku5.t0.f312615d;
            f53.n0 n0Var = new f53.n0(postCommentDialogUI);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(n0Var, 200L, false);
            android.widget.ImageView imageView = postCommentDialogUI.f140013f;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("ivSmileyIcon");
                throw null;
            }
            postCommentDialogUI.U6(imageView, com.tencent.mm.R.raw.game_comment_input, postCommentDialogUI.C);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
