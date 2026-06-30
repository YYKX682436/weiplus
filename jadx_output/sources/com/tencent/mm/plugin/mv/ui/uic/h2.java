package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class h2 extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC f151157a;

    public h2(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC) {
        this.f151157a = musicMvMainUIC;
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = this.f151157a;
        java.lang.String str = musicMvMainUIC.f150974d;
        int i17 = musicMvMainUIC.f150982o;
        musicMvMainUIC.f150977g.size();
        if (musicMvMainUIC.f150977g.size() <= 0 || musicMvMainUIC.f150982o < 0 || (wxRecyclerView = musicMvMainUIC.f150976f) == null) {
            return;
        }
        wxRecyclerView.post(new com.tencent.mm.plugin.mv.ui.uic.f2(musicMvMainUIC));
    }

    @Override // androidx.recyclerview.widget.h2
    public void c(int i17, int i18) {
        int i19;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = this.f151157a;
        com.tencent.mars.xlog.Log.i(musicMvMainUIC.f150974d, "onItemRangeChanged, lastPos:" + musicMvMainUIC.f150982o + ", positionStart:" + i17 + ", itemCount:" + i18 + ", dataList.size:" + musicMvMainUIC.f150977g.size());
        if (musicMvMainUIC.f150977g.size() <= 0 || (i19 = musicMvMainUIC.f150982o) < 0) {
            return;
        }
        int i27 = i18 + i17;
        boolean z17 = false;
        if (i17 <= i19 && i19 < i27) {
            z17 = true;
        }
        if (!z17 || musicMvMainUIC.f150981n.f151861j || (wxRecyclerView = musicMvMainUIC.f150976f) == null) {
            return;
        }
        wxRecyclerView.post(new com.tencent.mm.plugin.mv.ui.uic.g2(musicMvMainUIC));
    }

    @Override // androidx.recyclerview.widget.h2
    public void d(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = this.f151157a;
        com.tencent.mars.xlog.Log.i(musicMvMainUIC.f150974d, "onItemRangeChanged, lastPos:" + musicMvMainUIC.f150982o + ", positionStart:" + i17 + ", itemCount:" + i18 + ", dataList.size:" + musicMvMainUIC.f150977g.size() + ", payLoad:" + obj);
        java.lang.Object obj2 = com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.f150973J;
        if (kotlin.jvm.internal.o.b(obj, com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.f150973J)) {
            return;
        }
        c(i17, i18);
    }
}
