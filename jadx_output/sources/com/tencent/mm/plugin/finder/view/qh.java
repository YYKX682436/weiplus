package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class qh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPostTextModifyView f132894d;

    public qh(com.tencent.mm.plugin.finder.view.FinderPostTextModifyView finderPostTextModifyView) {
        this.f132894d = finderPostTextModifyView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderPostTextModifyView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.FinderPostTextModifyView finderPostTextModifyView = this.f132894d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = finderPostTextModifyView.f131421i;
        android.text.Editable text = mMEditText.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        finderPostTextModifyView.p(finderPostTextModifyView.f131425p, str, finderPostTextModifyView.f131428s, false);
        int length = str.length() - finderPostTextModifyView.f131425p.length();
        finderPostTextModifyView.o(length, finderPostTextModifyView.f131426q);
        finderPostTextModifyView.q(new so2.n6(finderPostTextModifyView.f131425p, str, finderPostTextModifyView.f131426q, finderPostTextModifyView.f131427r + length, finderPostTextModifyView.f131428s, so2.a.f410241e, null, 0, null, 0L, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, null));
        finderPostTextModifyView.f131422m.setText((java.lang.CharSequence) null);
        mMEditText.setText((java.lang.CharSequence) null);
        mMEditText.clearFocus();
        finderPostTextModifyView.n();
        finderPostTextModifyView.k();
        com.tencent.mm.plugin.finder.view.pp ppVar = finderPostTextModifyView.f131433x;
        if (ppVar != null) {
            com.tencent.mm.plugin.finder.view.pp.p5(ppVar, finderPostTextModifyView.f131425p, str, finderPostTextModifyView.f131426q, finderPostTextModifyView.f131427r, finderPostTextModifyView.f131428s, false, false, 64, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderPostTextModifyView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
