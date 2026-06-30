package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment f151780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment musicMvTabMyPostFragment) {
        super(0);
        this.f151780d = musicMvTabMyPostFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment musicMvTabMyPostFragment = this.f151780d;
        musicMvTabMyPostFragment.getRlLayout().N(0);
        com.tencent.mm.plugin.mv.ui.view.p3 resultListener = musicMvTabMyPostFragment.getResultListener();
        if (resultListener != null) {
            ((com.tencent.mm.plugin.mv.ui.view.h0) resultListener).a(1, musicMvTabMyPostFragment.getAdapter().getItemCount());
        }
        android.widget.LinearLayout emptyLL = musicMvTabMyPostFragment.getEmptyLL();
        if (emptyLL != null) {
            emptyLL.setVisibility(musicMvTabMyPostFragment.getAdapter().getItemCount() != 0 ? 8 : 0);
        }
        android.widget.TextView loadingTv = musicMvTabMyPostFragment.getLoadingTv();
        if (loadingTv != null) {
            loadingTv.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
