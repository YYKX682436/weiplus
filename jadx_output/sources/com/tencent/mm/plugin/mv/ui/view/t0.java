package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class t0 extends androidx.recyclerview.widget.u2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView f151949a;

    public t0(com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView) {
        this.f151949a = musicMVCardChooseView;
    }

    @Override // androidx.recyclerview.widget.u2
    public boolean a(int i17, int i18) {
        int i19 = com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView.B1;
        if (this.f151949a.h()) {
            return false;
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView = this.f151949a;
        if (musicMVCardChooseView.D) {
            return false;
        }
        if (i18 > 8000 && musicMVCardChooseView.f151644y1) {
            com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView.j(musicMVCardChooseView, false, null, null, 6, null);
            return false;
        }
        if (i18 >= -8000 || musicMVCardChooseView.f151644y1) {
            return false;
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView.j(musicMVCardChooseView, true, null, null, 6, null);
        return false;
    }
}
