package sc2;

/* loaded from: classes2.dex */
public final class v0 implements cw2.ya {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f406295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.b f406296b;

    public v0(sc2.h1 h1Var, so2.b bVar) {
        this.f406295a = h1Var;
        this.f406296b = bVar;
    }

    @Override // cw2.ya
    public void b() {
        so2.b bVar;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f406295a.f405929x;
        long currentPlayMs = finderThumbPlayerProxy != null ? finderThumbPlayerProxy.getCurrentPlayMs() : 0L;
        if (currentPlayMs <= 0 || (bVar = this.f406296b) == null) {
            return;
        }
        bVar.f410265d = java.lang.Long.valueOf(currentPlayMs);
    }
}
