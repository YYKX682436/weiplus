package rh3;

/* loaded from: classes15.dex */
public final class a implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh3.c f395659d;

    public a(rh3.c cVar) {
        this.f395659d = cVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        rh3.c cVar = this.f395659d;
        long currentPositionMs = ((sh3.a) cVar).getCurrentPositionMs();
        long durationMs = ((sh3.a) cVar).getDurationMs();
        rh3.c cVar2 = this.f395659d;
        rh3.j jVar = cVar2.f395673q;
        if (jVar == null) {
            return true;
        }
        jVar.n(cVar2, currentPositionMs, durationMs);
        return true;
    }
}
