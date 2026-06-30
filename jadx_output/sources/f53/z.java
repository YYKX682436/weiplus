package f53;

/* loaded from: classes5.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI f259698d;

    public z(com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI) {
        this.f259698d = postCommentDialogUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI = this.f259698d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = postCommentDialogUI.f140012e;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
        int selectionStart = mMEditText.getSelectionStart();
        if (postCommentDialogUI.D.f259691e.size() == 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        for (java.util.Map.Entry entry : postCommentDialogUI.D.f259691e.entrySet()) {
            if (selectionStart > ((java.lang.Number) ((jz5.l) entry.getValue()).f302833d).intValue() && selectionStart <= ((java.lang.Number) ((jz5.l) entry.getValue()).f302834e).intValue()) {
                com.tencent.mm.ui.widget.MMEditText mMEditText2 = postCommentDialogUI.f140012e;
                if (mMEditText2 == null) {
                    kotlin.jvm.internal.o.o("gameCommentInputTxt");
                    throw null;
                }
                mMEditText2.setSelection(((java.lang.Number) ((jz5.l) entry.getValue()).f302834e).intValue());
                yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
