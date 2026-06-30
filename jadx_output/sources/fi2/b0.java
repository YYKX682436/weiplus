package fi2;

/* loaded from: classes10.dex */
public final class b0 implements ah2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fi2.e0 f262806a;

    public b0(fi2.e0 e0Var) {
        this.f262806a = e0Var;
    }

    @Override // ah2.a
    public lj2.w0 f() {
        return this.f262806a.f262818c.f();
    }

    @Override // ah2.a
    public android.view.View g() {
        mh2.k0 k0Var = this.f262806a.f262823h;
        if (k0Var != null) {
            return k0Var.getKTVSongCoverAnchorView();
        }
        return null;
    }

    @Override // ah2.a
    public r45.yx1 h() {
        return null;
    }

    @Override // ah2.a
    public java.lang.Object i(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.feed.ag agVar;
        com.tencent.mm.plugin.finder.feed.y20 y20Var = this.f262806a.f262817b;
        if (y20Var == null || (agVar = ((com.tencent.mm.plugin.finder.feed.df) y20Var).f106558a.f107203q) == null) {
            return null;
        }
        return agVar.b(str, str2, continuation);
    }
}
