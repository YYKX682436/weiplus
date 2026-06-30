package sm2;

/* loaded from: classes3.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.f f409363d;

    public b(sm2.f fVar) {
        this.f409363d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rl2.i iVar = (rl2.i) ((jz5.n) ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).f66997u).getValue();
        java.lang.String liveId = java.lang.String.valueOf(((mm2.e1) ((mm2.c1) this.f409363d.c(mm2.c1.class)).business(mm2.e1.class)).f328988r.getLong(0));
        iVar.getClass();
        kotlin.jvm.internal.o.g(liveId, "liveId");
        iVar.f397198e.A("FinderLiveLastRewardInfo", "DELETE FROM FinderLiveLastRewardInfo WHERE liveId = '" + liveId + '\'');
    }
}
