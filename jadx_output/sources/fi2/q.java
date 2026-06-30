package fi2;

/* loaded from: classes10.dex */
public final class q implements ah2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fi2.w f262897a;

    public q(fi2.w wVar) {
        this.f262897a = wVar;
    }

    @Override // ah2.a
    public lj2.w0 f() {
        this.f262897a.f262915a.getClass();
        return lj2.w0.f318958d;
    }

    @Override // ah2.a
    public android.view.View g() {
        return this.f262897a.m().getKTVSongCoverAnchorView();
    }

    @Override // ah2.a
    public r45.yx1 h() {
        return ((om2.g) this.f262897a.f262915a.P0(om2.g.class)).Q6();
    }

    @Override // ah2.a
    public java.lang.Object i(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        ch2.o2 o2Var;
        zi2.w wVar = this.f262897a.f262915a;
        if (!(wVar instanceof com.tencent.mm.plugin.finder.live.plugin.l)) {
            wVar = null;
        }
        if (wVar == null || (o2Var = (ch2.o2) wVar.U0(ch2.o2.class)) == null) {
            return null;
        }
        return o2Var.r7(str, str2, continuation);
    }
}
