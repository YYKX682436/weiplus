package rk4;

/* loaded from: classes11.dex */
public final class o8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f396886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ il4.e f396887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rk4.z8 f396888f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(java.util.List list, il4.e eVar, rk4.z8 z8Var) {
        super(0);
        this.f396886d = list;
        this.f396887e = eVar;
        this.f396888f = z8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zk4.l lVar = zk4.l.f473538a;
        java.util.List list = this.f396886d;
        il4.e eVar = this.f396887e;
        rk4.z8.wi(this.f396888f, (jm4.m3) lVar.a(list, null, null, eVar), eVar.f292105b);
        return jz5.f0.f302826a;
    }
}
