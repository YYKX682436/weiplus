package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView f151818d;

    public e3(com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView musicMvLyricView) {
        this.f151818d = musicMvLyricView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        androidx.recyclerview.widget.k3 p07;
        int i18;
        androidx.recyclerview.widget.k3 p08;
        com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView musicMvLyricView = this.f151818d;
        int i19 = musicMvLyricView.f151695u;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = musicMvLyricView.f151683f;
        java.lang.Integer valueOf = linearLayoutManager != null ? java.lang.Integer.valueOf(linearLayoutManager.w()) : null;
        kotlin.jvm.internal.o.e(valueOf, "null cannot be cast to non-null type kotlin.Int");
        int intValue = valueOf.intValue();
        int i27 = 0;
        if (intValue >= 0 && (i18 = i19 - intValue) > 0) {
            int i28 = i19 - 1;
            int i29 = 0;
            while (intValue < i28) {
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = musicMvLyricView.lyricRv;
                i29++;
                musicMvLyricView.d((wxRecyclerView == null || (p08 = wxRecyclerView.p0(intValue)) == null) ? null : p08.itemView, i29 / i18);
                intValue++;
            }
        }
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager2 = musicMvLyricView.f151683f;
        java.lang.Integer valueOf2 = linearLayoutManager2 != null ? java.lang.Integer.valueOf(linearLayoutManager2.w()) : null;
        kotlin.jvm.internal.o.e(valueOf2, "null cannot be cast to non-null type kotlin.Int");
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 0 || (i17 = intValue2 - i19) <= 0) {
            return;
        }
        while (true) {
            i19++;
            if (i19 >= intValue2) {
                return;
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = musicMvLyricView.lyricRv;
            i27++;
            float f17 = i17;
            musicMvLyricView.d((wxRecyclerView2 == null || (p07 = wxRecyclerView2.p0(i19)) == null) ? null : p07.itemView, (f17 - i27) / f17);
        }
    }
}
