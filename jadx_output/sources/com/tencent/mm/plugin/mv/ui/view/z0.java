package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class z0 implements oa.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView f151999d;

    public z0(com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView) {
        this.f151999d = musicMVCardChooseView;
    }

    @Override // oa.c
    public void h0(oa.i iVar) {
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
        if (iVar != null) {
            com.google.android.material.tabs.TabLayout tabLayout = this.f151999d.f151619d;
            android.view.View childAt = tabLayout != null ? tabLayout.getChildAt(0) : null;
            android.view.ViewGroup viewGroup = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
            android.view.View childAt2 = viewGroup != null ? viewGroup.getChildAt(iVar.f343782e) : null;
            android.view.ViewGroup viewGroup2 = childAt2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt2 : null;
            android.view.KeyEvent.Callback childAt3 = viewGroup2 != null ? viewGroup2.getChildAt(1) : null;
            android.widget.TextView textView = childAt3 instanceof android.widget.TextView ? (android.widget.TextView) childAt3 : null;
            if (textView == null) {
                return;
            }
            textView.setTypeface(android.graphics.Typeface.DEFAULT);
        }
    }

    @Override // oa.c
    public void u1(oa.i iVar) {
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText;
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText2;
        if (iVar != null) {
            com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView = this.f151999d;
            com.google.android.material.tabs.TabLayout tabLayout = musicMVCardChooseView.f151619d;
            android.view.View childAt = tabLayout != null ? tabLayout.getChildAt(0) : null;
            android.view.ViewGroup viewGroup = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
            android.view.View childAt2 = viewGroup != null ? viewGroup.getChildAt(iVar.f343782e) : null;
            android.view.ViewGroup viewGroup2 = childAt2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt2 : null;
            android.view.KeyEvent.Callback childAt3 = viewGroup2 != null ? viewGroup2.getChildAt(1) : null;
            android.widget.TextView textView = childAt3 instanceof android.widget.TextView ? (android.widget.TextView) childAt3 : null;
            if (textView != null) {
                textView.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
            }
            int i17 = iVar.f343782e;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMVCardChooseView", "setCurrentPage:" + i17);
            if (i17 == -1) {
                i17 = 0;
            }
            com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView fTSSearchNoActionBarView = musicMVCardChooseView.f151628o;
            if (fTSSearchNoActionBarView != null && (ftsEditText2 = fTSSearchNoActionBarView.getFtsEditText()) != null) {
                ftsEditText2.d();
            }
            com.tencent.mm.plugin.mv.ui.view.FTSSearchNoActionBarView fTSSearchNoActionBarView2 = musicMVCardChooseView.f151628o;
            if (fTSSearchNoActionBarView2 != null && (ftsEditText = fTSSearchNoActionBarView2.getFtsEditText()) != null) {
                ftsEditText.h();
            }
            if (i17 == 0) {
                androidx.recyclerview.widget.RecyclerView recyclerView = musicMVCardChooseView.f151620e;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                android.widget.RelativeLayout relativeLayout = musicMVCardChooseView.f151623h;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(4);
                }
            } else if (i17 == 1) {
                androidx.recyclerview.widget.RecyclerView recyclerView2 = musicMVCardChooseView.f151620e;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(4);
                }
                android.widget.RelativeLayout relativeLayout2 = musicMVCardChooseView.f151623h;
                if (relativeLayout2 != null) {
                    relativeLayout2.setVisibility(0);
                }
            }
            musicMVCardChooseView.m();
        }
    }
}
