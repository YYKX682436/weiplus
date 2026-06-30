package ls4;

/* loaded from: classes8.dex */
public final class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls4.u f321090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f321091b;

    public p(ls4.u uVar, long j17) {
        this.f321090a = uVar;
        this.f321091b = j17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.d(fVar);
        boolean g17 = os4.h.g(fVar);
        ls4.u uVar = this.f321090a;
        if (g17) {
            uVar.d(new pr4.a(pr4.j.f358012d));
        } else {
            com.tencent.mm.protobuf.f resp = fVar.f70618d;
            kotlin.jvm.internal.o.f(resp, "resp");
            pm0.v.K(null, new os4.g((r45.js3) resp, uVar.f321100a.f358020a));
            uVar.e();
            androidx.fragment.app.FragmentActivity fragmentActivity = uVar.f321100a.f358021b;
            long j17 = this.f321091b;
            com.tencent.mm.protobuf.f resp2 = fVar.f70618d;
            kotlin.jvm.internal.o.f(resp2, "resp");
            ns4.c0 c0Var = new ns4.c0(fragmentActivity, new ns4.d0(uVar.f321100a, j17, (r45.js3) resp2, new ls4.h(uVar), new ls4.i(uVar), new ls4.j(uVar), new ls4.l(uVar)));
            uVar.f321102c = c0Var;
            com.tencent.mm.ui.widget.dialog.y1 y1Var = c0Var.f339464c;
            y1Var.f212038t = new ls4.o(uVar);
            y1Var.s();
        }
        return jz5.f0.f302826a;
    }
}
