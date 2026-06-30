package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class la0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ma0 f113371d;

    public la0(com.tencent.mm.plugin.finder.live.plugin.ma0 ma0Var) {
        this.f113371d = ma0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.finder.live.plugin.ma0 ma0Var = this.f113371d;
        android.view.ViewGroup viewGroup = ma0Var.f113478p;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup.findViewById(com.tencent.mm.R.id.mxt);
        ((com.tencent.mm.view.MMPAGView) viewGroup.findViewById(com.tencent.mm.R.id.f486940my3)).setVisibility(8);
        weImageView.setImageResource(com.tencent.mm.R.raw.icon_song_filled);
        com.tencent.mm.plugin.finder.live.view.FinderMarqueeTextView finderMarqueeTextView = (com.tencent.mm.plugin.finder.live.view.FinderMarqueeTextView) viewGroup.findViewById(com.tencent.mm.R.id.f486942my4);
        finderMarqueeTextView.setMaxWidth((int) (finderMarqueeTextView.getTextSize() * 6));
        if (str == null || str.length() == 0) {
            weImageView.setIconColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            finderMarqueeTextView.setText(ma0Var.f365323d.getContext().getResources().getString(dk2.ef.f233384g ? com.tencent.mm.R.string.d5l : com.tencent.mm.R.string.f493782p20));
            finderMarqueeTextView.setTextColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            weImageView.setVisibility(0);
        } else {
            weImageView.setIconColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.Brand_100));
            weImageView.setVisibility(0);
            finderMarqueeTextView.setText(str);
        }
        finderMarqueeTextView.setSelected(true);
    }
}
