package nn0;

/* loaded from: classes10.dex */
public final class x extends nn0.i {

    /* renamed from: e, reason: collision with root package name */
    public final ls5.f f338633e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context, boolean z17, int i17, mn0.b0 player) {
        super(context, z17, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(player, "player");
        if (!z17) {
            throw new java.lang.RuntimeException("must be custom render");
        }
        if (i17 == 1) {
            throw new java.lang.RuntimeException("VR live can not use this render");
        }
        ls5.f fVar = new ls5.f(player);
        this.f338633e = fVar;
        ((com.tencent.mm.live.core.core.player.FinderNewLivePlayerDetector) ms5.f.f331158a.b(com.tencent.mm.live.core.core.player.FinderNewLivePlayerDetector.class)).e(fVar);
        ((nn0.p) this.f338584b).y4(new nn0.w(this));
    }

    @Override // nn0.i
    public nn0.o a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return ((pg2.j0) ((c50.s0) i95.n0.c(c50.s0.class))).wh() ? new nn0.z(context) : new nn0.u(context);
    }

    @Override // nn0.i, com.tencent.rtmp.TXLivePlayer
    public int startLivePlay(java.lang.String str, int i17) {
        nn0.o oVar;
        if (this.f338583a && (oVar = this.f338584b) != null) {
            ((nn0.p) oVar).startPlay();
        }
        return super.startLivePlay(str, i17);
    }
}
