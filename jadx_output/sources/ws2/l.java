package ws2;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public f25.m0 f449087a;

    public final void a(java.lang.String str) {
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy;
        com.tencent.mars.xlog.Log.i("FinderLiveReplayAudioManager", str + " AudioFocus gain!");
        dt2.a0 a0Var = ws2.k1.f449066r.a().f449083o;
        if (a0Var == null || (finderLiveThumbPlayerProxy = a0Var.f243158a) == null) {
            return;
        }
        finderLiveThumbPlayerProxy.setMute(false);
    }

    public final void b(java.lang.String str) {
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy;
        com.tencent.mars.xlog.Log.i("FinderLiveReplayAudioManager", str + " AudioFocus lossTransient!");
        dt2.a0 a0Var = ws2.k1.f449066r.a().f449083o;
        if (a0Var == null || (finderLiveThumbPlayerProxy = a0Var.f243158a) == null) {
            return;
        }
        finderLiveThumbPlayerProxy.setMute(true);
    }
}
