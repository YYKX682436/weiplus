package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView f151882d;

    public k(com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView fTSSearchNoActionBarView) {
        this.f151882d = fTSSearchNoActionBarView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText;
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText2;
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/FTSSearchNoActionBarView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.view.j jVar = this.f151882d.f151596f;
        if (jVar != null) {
            com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView = (com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView) jVar;
            com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView fTSSearchNoActionBarView = musicMVCardChooseView.f151628o;
            if (fTSSearchNoActionBarView != null && (ftsEditText3 = fTSSearchNoActionBarView.getFtsEditText()) != null) {
                ftsEditText3.e();
            }
            com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView fTSSearchNoActionBarView2 = musicMVCardChooseView.f151628o;
            if (fTSSearchNoActionBarView2 != null && (ftsEditText2 = fTSSearchNoActionBarView2.getFtsEditText()) != null) {
                ftsEditText2.d();
            }
            com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView fTSSearchNoActionBarView3 = musicMVCardChooseView.f151628o;
            if (fTSSearchNoActionBarView3 != null && (ftsEditText = fTSSearchNoActionBarView3.getFtsEditText()) != null) {
                ftsEditText.h();
            }
            com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment musicMvTabSearchFragment = musicMVCardChooseView.f151629p;
            if (musicMvTabSearchFragment != null) {
                musicMvTabSearchFragment.dataList.clear();
                musicMvTabSearchFragment.getAdapter().notifyDataSetChanged();
            }
            android.widget.LinearLayout linearLayout = musicMVCardChooseView.f151627n;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            android.widget.RelativeLayout relativeLayout = musicMVCardChooseView.f151624i;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            musicMVCardChooseView.m();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/FTSSearchNoActionBarView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
