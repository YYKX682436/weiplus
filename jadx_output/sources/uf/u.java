package uf;

/* loaded from: classes7.dex */
public final class u implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f427108d;

    public u(uf.o0 o0Var) {
        this.f427108d = o0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        uf.o0 o0Var = this.f427108d;
        x91.h c17 = o0Var.f427062e.c();
        uf.t tVar = new uf.t(o0Var);
        x91.l lVar = c17.f452649c;
        if (lVar == null) {
            return true;
        }
        c17.f452648b.g(new w91.a(c17.a(lVar), c17.f452649c.f452664a), tVar);
        return true;
    }
}
