package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class c2 extends androidx.recyclerview.widget.d3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC f151073d;

    public c2(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC) {
        this.f151073d = musicMvMainUIC;
    }

    @Override // androidx.recyclerview.widget.v2
    public boolean b(androidx.recyclerview.widget.RecyclerView rv6, android.view.MotionEvent e17) {
        android.view.View view;
        kotlin.jvm.internal.o.g(rv6, "rv");
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = this.f151073d;
        androidx.appcompat.app.AppCompatActivity activity = musicMvMainUIC.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        ((com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC) zVar.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC.class)).getClass();
        androidx.appcompat.app.AppCompatActivity activity2 = musicMvMainUIC.getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        boolean b17 = ((com.tencent.mm.plugin.mv.ui.uic.e1) zVar.a(activity2).a(com.tencent.mm.plugin.mv.ui.uic.e1.class)).f151108f.f151843f.b();
        java.lang.String str = musicMvMainUIC.f150974d;
        com.tencent.mm.view.layoutmanager.Flip3DLayoutManager flip3DLayoutManager = musicMvMainUIC.f150986s;
        if (b17) {
            com.tencent.mars.xlog.Log.i(str, "mv list dialog showing now enable scroll");
            flip3DLayoutManager.f213605w = true;
            musicMvMainUIC.f150992y = -1L;
        } else {
            if (e17.getAction() == 3 || e17.getAction() == 1) {
                if (musicMvMainUIC.f150991x == 0 && musicMvMainUIC.f150993z >= 0.0f) {
                    long j17 = musicMvMainUIC.f150992y;
                    if (j17 > 0) {
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        if (android.os.SystemClock.elapsedRealtime() - j17 <= android.view.ViewConfiguration.getTapTimeout()) {
                            flip3DLayoutManager.f213605w = false;
                            com.tencent.mars.xlog.Log.i(str, "tap disable scroll");
                            musicMvMainUIC.f150993z = -1.0f;
                        }
                    }
                }
                flip3DLayoutManager.f213605w = true;
                musicMvMainUIC.f150993z = -1.0f;
            } else {
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = musicMvMainUIC.f150976f;
                android.view.View view2 = null;
                androidx.recyclerview.widget.k3 p07 = wxRecyclerView != null ? wxRecyclerView.p0(musicMvMainUIC.f150981n.f151864m) : null;
                if (e17.getAction() == 0) {
                    if (p07 != null && (view = p07.itemView) != null) {
                        view2 = view.findViewById(com.tencent.mm.R.id.gcd);
                    }
                    int[] iArr = new int[2];
                    if (view2 != null) {
                        view2.getLocationInWindow(iArr);
                    }
                    if (iArr[1] <= 0 || e17.getY() < iArr[1]) {
                        musicMvMainUIC.f150993z = e17.getY();
                    } else {
                        com.tencent.mars.xlog.Log.i(str, "touch bottom area ignore");
                        musicMvMainUIC.f150993z = -1.0f;
                        flip3DLayoutManager.f213605w = true;
                        musicMvMainUIC.f150992y = -1L;
                    }
                }
                if (p07 != null) {
                    p07.itemView.findViewById(com.tencent.mm.R.id.gyy).getLocationInWindow(new int[2]);
                    if (musicMvMainUIC.A <= 0) {
                        musicMvMainUIC.A = i65.a.h(musicMvMainUIC.getContext(), com.tencent.mm.R.dimen.f479720dd);
                    }
                    float f17 = musicMvMainUIC.f150993z;
                    if (f17 < 0.0f || f17 > r0.getHeight() + r2[1] + musicMvMainUIC.A) {
                        flip3DLayoutManager.f213605w = true;
                    } else {
                        flip3DLayoutManager.f213605w = false;
                    }
                } else {
                    flip3DLayoutManager.f213605w = true;
                }
            }
            musicMvMainUIC.f150991x = e17.getAction();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            musicMvMainUIC.f150992y = android.os.SystemClock.elapsedRealtime();
        }
        return false;
    }
}
