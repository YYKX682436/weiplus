package oj4;

/* loaded from: classes11.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj4.b f345807d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(oj4.b bVar) {
        super(0);
        this.f345807d = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        oj4.b bVar = this.f345807d;
        bVar.f345809e = currentTimeMillis;
        ej4.b bVar2 = new ej4.b(bVar.f345808d);
        gm0.j1.d().a(5293, bVar);
        gm0.j1.d().g(bVar2);
        return jz5.f0.f302826a;
    }
}
