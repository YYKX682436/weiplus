package hr5;

/* loaded from: classes15.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr5.l f284309d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(hr5.l lVar) {
        super(0);
        this.f284309d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hr5.l lVar = this.f284309d;
        return new zq5.n(zq5.l.b(lVar.a()), zq5.l.c(lVar.a()), zq5.l.b(lVar.a()) + zq5.t.b(lVar.d()), zq5.l.c(lVar.a()) + zq5.t.a(lVar.d()));
    }
}
