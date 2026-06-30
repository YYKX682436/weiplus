package kk4;

/* loaded from: classes15.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.v f308573d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(kk4.v vVar) {
        super(0);
        this.f308573d = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kk4.v vVar = this.f308573d;
        if (vVar.f308581f instanceof ck4.b) {
            kk4.c cVar = vVar.f308577b;
            long currentPositionMs = cVar != null ? ((kk4.f0) cVar).getCurrentPositionMs() : 0L;
            kk4.c cVar2 = vVar.f308577b;
            long playerBufferedDurationMs = cVar2 != null ? ((kk4.f0) cVar2).getPlayerBufferedDurationMs() : 0L;
            kk4.c cVar3 = vVar.f308577b;
            long currentPositionMs2 = playerBufferedDurationMs - (cVar3 != null ? ((kk4.f0) cVar3).getCurrentPositionMs() : 0L);
            kk4.c cVar4 = vVar.f308577b;
            long durationMs = cVar4 != null ? ((kk4.f0) cVar4).getDurationMs() : 0L;
            nk4.s sVar = vVar.f308588m;
            if (sVar != null) {
                dn.o oVar = vVar.f308581f;
                ck4.b bVar = oVar instanceof ck4.b ? (ck4.b) oVar : null;
                long j17 = 1000;
                ((kw2.m0) sVar).v(new nk4.r(bVar != null ? bVar.f42534d2 : 0L, currentPositionMs / j17, durationMs / j17, currentPositionMs2, android.os.SystemClock.uptimeMillis(), null, 32, null));
            }
        }
        return jz5.f0.f302826a;
    }
}
