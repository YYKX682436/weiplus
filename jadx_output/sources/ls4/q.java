package ls4;

/* loaded from: classes8.dex */
public final class q implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls4.u f321092a;

    public q(ls4.u uVar) {
        this.f321092a = uVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.d(fVar);
        boolean g17 = os4.h.g(fVar);
        ls4.u uVar = this.f321092a;
        if (g17) {
            uVar.d(new pr4.a(pr4.j.f358012d));
            return jz5.f0.f302826a;
        }
        long j17 = ((r45.fs3) fVar.f70618d).f374585d;
        os4.h.l(j17);
        return new ks4.g(uVar.f321100a.f358020a, 0, 0).l().h(new ls4.p(uVar, j17));
    }
}
