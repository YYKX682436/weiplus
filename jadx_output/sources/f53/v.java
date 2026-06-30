package f53;

/* loaded from: classes5.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI f259694d;

    public v(com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI) {
        this.f259694d = postCommentDialogUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI.G;
        com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI = this.f259694d;
        postCommentDialogUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) postCommentDialogUI.getContext(), false, 1);
        java.lang.String str = postCommentDialogUI.f140025u;
        java.lang.String string = str == null || str.length() == 0 ? postCommentDialogUI.getString(com.tencent.mm.R.string.fnl) : postCommentDialogUI.getString(com.tencent.mm.R.string.fnm);
        kotlin.jvm.internal.o.d(string);
        k0Var.f211872n = new f53.l0(postCommentDialogUI, string);
        k0Var.f211881s = new f53.m0(postCommentDialogUI);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
