package sd5;

/* loaded from: classes9.dex */
public final class f extends ke5.u {

    /* renamed from: n, reason: collision with root package name */
    public final yb5.d f406708n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f406709o;

    /* renamed from: p, reason: collision with root package name */
    public sd5.o f406710p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yb5.d chattingContext, hd5.v loader) {
        super(chattingContext, loader);
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        kotlin.jvm.internal.o.g(loader, "loader");
        this.f406708n = chattingContext;
        this.f406709o = chattingContext.x();
    }

    @Override // ke5.f0
    public boolean d() {
        return true;
    }

    @Override // ke5.u, ke5.a
    public he5.t e(hd5.n action, android.os.Bundle bundle, hd5.q qVar) {
        kotlin.jvm.internal.o.g(action, "action");
        if (this.f406710p == null) {
            java.lang.String talkUsername = this.f406709o;
            kotlin.jvm.internal.o.f(talkUsername, "talkUsername");
            this.f406710p = new sd5.o(talkUsername, new sd5.e(this));
        }
        yb5.d dVar = this.f406708n;
        sd5.o oVar = this.f406710p;
        kotlin.jvm.internal.o.d(oVar);
        return new sd5.h(dVar, oVar, action, bundle, qVar);
    }

    @Override // ke5.u
    public boolean h() {
        sd5.o oVar = this.f406710p;
        return oVar != null && oVar.f();
    }

    @Override // ke5.u
    public boolean i() {
        sd5.o oVar = this.f406710p;
        return oVar != null && oVar.f406724e;
    }
}
