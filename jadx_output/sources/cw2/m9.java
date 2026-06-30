package cw2;

/* loaded from: classes10.dex */
public final class m9 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListMap f223873a = new java.util.concurrent.ConcurrentSkipListMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListMap f223874b = new java.util.concurrent.ConcurrentSkipListMap();

    /* renamed from: c, reason: collision with root package name */
    public final cw2.l9 f223875c = new cw2.l9(this);

    public final boolean a(kk4.c cVar) {
        int i17 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().f464708y * 1000;
        kk4.f0 f0Var = (kk4.f0) cVar;
        long playerBufferedDurationMs = f0Var.getPlayerBufferedDurationMs() - f0Var.getCurrentPositionMs();
        return playerBufferedDurationMs < ((long) i17) && playerBufferedDurationMs < f0Var.getDurationMs();
    }

    public final void b(java.lang.String mediaId, kk4.c player) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(player, "player");
        cw2.j9 j9Var = (cw2.j9) this.f223873a.get(mediaId);
        if (j9Var == null || !a(player)) {
            return;
        }
        j9Var.f223792c++;
    }
}
