package jn3;

/* loaded from: classes8.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn3.g f300780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(jn3.g gVar) {
        super(0);
        this.f300780d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.lifecycle.j0 j0Var = com.tencent.mm.plugin.finder.extension.reddot.aa.f105360d0;
        jn3.g gVar = this.f300780d;
        j0Var.observeForever(new jn3.a(gVar));
        jn3.d dVar = new jn3.d(gVar);
        com.tencent.mm.plugin.finder.extension.reddot.aa.f105362e0.observeForever(dVar);
        com.tencent.mm.plugin.finder.extension.reddot.aa.f105364f0.observeForever(dVar);
        com.tencent.mm.plugin.finder.extension.reddot.aa.f105392t0.observeForever(dVar);
        pm0.v.x(com.tencent.mm.plugin.finder.extension.reddot.aa.f105396v0, jn3.b.f300777d);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N0().add(new jn3.c(gVar));
        return jz5.f0.f302826a;
    }
}
