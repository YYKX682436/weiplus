package uf;

/* loaded from: classes7.dex */
public final class c0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f426980d;

    public c0(uf.o0 o0Var) {
        this.f426980d = o0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        uf.o0 o0Var = this.f426980d;
        x91.h c17 = o0Var.f427062e.c();
        uf.r rVar = new uf.r(o0Var);
        x91.l lVar = c17.f452649c;
        if (lVar == null) {
            return true;
        }
        c17.f452648b.g(new w91.b(c17.a(lVar), c17.f452649c.f452664a), rVar);
        return true;
    }
}
