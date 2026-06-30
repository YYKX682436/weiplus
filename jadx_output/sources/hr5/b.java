package hr5;

/* loaded from: classes15.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr5.l f284303d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hr5.l lVar) {
        super(0);
        this.f284303d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hr5.l lVar = this.f284303d;
        gr5.b bVar = lVar.f284392d;
        long d17 = lVar.d();
        long a17 = ((gr5.e) bVar).a((d17 > zq5.t.f475091b ? 1 : (d17 == zq5.t.f475091b ? 0 : -1)) != 0 ? zq5.h.a(a06.d.b(zq5.t.b(d17)), a06.d.b(zq5.t.a(d17))) : zq5.g.f475065b, lVar.f284389a, lVar.f284394f);
        return new zq5.l(zq5.m.a((int) (a17 >> 32), zq5.c.a(a17)));
    }
}
