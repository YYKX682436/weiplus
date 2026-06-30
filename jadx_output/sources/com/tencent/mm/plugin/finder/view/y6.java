package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class y6 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f133378d;

    public y6(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        this.f133378d = finderCommentFooter;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f133378d;
        finderCommentFooter.getEditText().postDelayed(new com.tencent.mm.plugin.finder.view.w6(finderCommentFooter), 160L);
        java.lang.String valueOf = java.lang.String.valueOf(editable);
        android.text.Editable editableText = finderCommentFooter.getEditText().getEditableText();
        kotlin.jvm.internal.o.f(editableText, "getEditableText(...)");
        rx2.d dVar = finderCommentFooter.D1;
        dVar.b(valueOf, editableText);
        dVar.f400965a.clear();
        java.util.Iterator it = dVar.f400966b.iterator();
        while (it.hasNext()) {
            r45.gb4 gb4Var = (r45.gb4) it.next();
            if (gb4Var.getInteger(5) != 5) {
                dVar.a(gb4Var);
            }
        }
        if (hc2.f0.a(finderCommentFooter.getFeedObj(), finderCommentFooter.getFromMention(), finderCommentFooter.getMentionExtFlag())) {
            finderCommentFooter.getSmileyPanel().setToSendText(java.lang.String.valueOf(editable));
        }
        int commentTextLimit = (finderCommentFooter.getCommentTextLimit() / 2) - com.tencent.mm.ui.tools.v4.g(java.lang.String.valueOf(editable));
        if (commentTextLimit < -999) {
            commentTextLimit = -999;
        }
        boolean z17 = false;
        if (commentTextLimit <= finderCommentFooter.getCommentTextLimitStart()) {
            finderCommentFooter.getLastWordCountTv().setVisibility(0);
            finderCommentFooter.getLastWordCountTv().setTextColor(finderCommentFooter.getContext().getResources().getColor(commentTextLimit >= 0 ? com.tencent.mm.R.color.f478889pr : com.tencent.mm.R.color.Red_100));
            finderCommentFooter.getLastWordCountTv().setText(java.lang.String.valueOf(commentTextLimit));
            finderCommentFooter.getLastWordCountTv().post(new com.tencent.mm.plugin.finder.view.x6(editable, finderCommentFooter));
            return;
        }
        finderCommentFooter.getLastWordCountTv().setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams = finderCommentFooter.getEditText().getLayoutParams();
        if (layoutParams != null && layoutParams.height == -2) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = finderCommentFooter.getEditText().getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -2;
        }
        finderCommentFooter.getEditText().requestLayout();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        if (i19 == 1) {
            if ((charSequence != null ? charSequence.charAt(i17) : ' ') == '@') {
                int i27 = com.tencent.mm.plugin.finder.view.FinderCommentFooter.N1;
                com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f133378d;
                finderCommentFooter.getClass();
                if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.j0().r()).intValue() == 1) {
                    finderCommentFooter.isFrozen = true;
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("key_scene", 2);
                    intent.putExtra("key_remind_finder_half_screen_source", 2);
                    com.tencent.mm.plugin.finder.storage.FinderItem finderItem = finderCommentFooter.feedObj;
                    intent.putExtra("key_finder_object_id", finderItem != null ? java.lang.Long.valueOf(finderItem.getId()) : null);
                    com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                    android.content.Context context = finderCommentFooter.getContext();
                    kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    i0Var.Yk((com.tencent.mm.ui.MMActivity) context, intent, 501, true);
                }
            }
        }
    }
}
