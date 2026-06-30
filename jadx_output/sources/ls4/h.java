package ls4;

/* loaded from: classes8.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls4.u f321060d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ls4.u uVar) {
        super(1);
        this.f321060d = uVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long j17;
        ns4.c0 it = (ns4.c0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ls4.u uVar = this.f321060d;
        uVar.getClass();
        js4.n nVar = new js4.n();
        nVar.f301551i = it.f339464c;
        nVar.f301552j = false;
        pr4.l lVar = uVar.f321100a;
        nVar.f301544b = lVar.f358020a;
        if (it.b()) {
            j17 = 0;
        } else {
            j17 = r8.f339494a.f358029j - it.f339463b.f339495b;
        }
        nVar.f301553k = j17;
        nVar.f301546d = new ls4.n(uVar);
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).d(lVar.f358021b, nVar);
        return jz5.f0.f302826a;
    }
}
