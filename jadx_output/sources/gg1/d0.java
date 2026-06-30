package gg1;

/* loaded from: classes7.dex */
public final class d0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f271551d;

    public d0(gg1.c1 c1Var) {
        this.f271551d = c1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        gg1.c1 c1Var = this.f271551d;
        x91.h b17 = c1Var.f271539e.b();
        gg1.c0 c0Var = new gg1.c0(c1Var);
        x91.l lVar = b17.f452649c;
        if (lVar == null) {
            return true;
        }
        b17.f452648b.g(new w91.a(b17.a(lVar), b17.f452649c.f452664a), c0Var);
        return true;
    }
}
