package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class u3 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment f151961a;

    public u3(com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment musicMvTabFragment) {
        this.f151961a = musicMvTabFragment;
    }

    @Override // ym5.q3
    public void a(int i17) {
    }

    @Override // ym5.q3
    public void b(int i17) {
        com.tencent.mars.xlog.Log.i("Music.MusicMvTabFragment", "onLoadMoreBegin");
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment musicMvTabFragment = this.f151961a;
        if (musicMvTabFragment.getHasMore()) {
            musicMvTabFragment.c(musicMvTabFragment.getMusic(), musicMvTabFragment.getKeyword());
        } else {
            musicMvTabFragment.getRlLayout().N(0);
        }
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment musicMvTabFragment = this.f151961a;
        if (musicMvTabFragment.getHasMore()) {
            return;
        }
        com.tencent.mm.view.RefreshLoadMoreLayout.I(musicMvTabFragment.getRlLayout(), null, 1, null);
    }
}
