package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class j5 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.r5 f117162d;

    public j5(com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var) {
        this.f117162d = r5Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        qk2.f fVar;
        r45.q12 q12Var = (r45.q12) obj;
        boolean T1 = zl2.r4.f473950a.T1(q12Var);
        com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = this.f117162d;
        if (!T1) {
            if (r5Var.f117359n == null) {
                com.tencent.mm.plugin.finder.live.viewmodel.r5.Z6(r5Var, q12Var);
            } else {
                r5Var.l7(q12Var);
                r5Var.n7();
            }
        }
        android.content.Context O6 = r5Var.O6();
        pf5.z zVar = pf5.z.f353948a;
        if (!(O6 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        pk2.o9 o9Var = ((com.tencent.mm.plugin.finder.live.viewmodel.s5) zVar.a((androidx.appcompat.app.AppCompatActivity) O6).a(com.tencent.mm.plugin.finder.live.viewmodel.s5.class)).f117394d;
        if (o9Var != null && (fVar = o9Var.f356086h) != null) {
            fVar.q();
        }
        return jz5.f0.f302826a;
    }
}
