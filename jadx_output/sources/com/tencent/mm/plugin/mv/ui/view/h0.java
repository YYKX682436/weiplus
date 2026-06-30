package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class h0 implements com.tencent.mm.plugin.mv.ui.view.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView f151838a;

    public h0(com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView) {
        this.f151838a = musicMVCardChooseView;
    }

    public void a(int i17, int i18) {
        if (i17 == 4) {
            com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView = this.f151838a;
            if (i18 > 0) {
                android.widget.TextView textView = musicMVCardChooseView.f151632q;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                android.widget.LinearLayout linearLayout = musicMVCardChooseView.f151633r;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment musicMvTabSearchFragment = musicMVCardChooseView.f151629p;
                if (musicMvTabSearchFragment != null) {
                    musicMvTabSearchFragment.setResultView(0);
                    return;
                }
                return;
            }
            android.widget.TextView textView2 = musicMVCardChooseView.f151632q;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            android.widget.LinearLayout linearLayout2 = musicMVCardChooseView.f151633r;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment musicMvTabSearchFragment2 = musicMVCardChooseView.f151629p;
            if (musicMvTabSearchFragment2 != null) {
                musicMvTabSearchFragment2.setResultView(8);
            }
        }
    }
}
