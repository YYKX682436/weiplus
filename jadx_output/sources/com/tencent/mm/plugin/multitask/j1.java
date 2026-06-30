package com.tencent.mm.plugin.multitask;

@j95.b
/* loaded from: classes8.dex */
public final class j1 extends jm0.o implements com.tencent.mm.plugin.multitask.k0 {
    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(ik3.q.class);
        set.add(ik3.t.class);
    }

    public com.tencent.mm.plugin.multitask.model.MultiTaskInfo Zi(java.lang.String multiTaskId, int i17) {
        kotlin.jvm.internal.o.g(multiTaskId, "multiTaskId");
        if (!jm0.g.class.isAssignableFrom(ik3.q.class)) {
            throw new java.lang.IllegalArgumentException(com.tencent.mm.plugin.multitask.j1.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(ik3.q.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ik3.q qVar = (ik3.q) ((jm0.g) a17);
        lk3.b U6 = qVar.U6();
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo Y6 = U6 != null ? U6.Y6(multiTaskId, i17) : null;
        if (Y6 != null) {
            return Y6;
        }
        bw5.a40 c17 = com.tencent.wechat.aff.star.d.f217506b.c(multiTaskId, qVar.T6(i17));
        if (!c17.f25011g[1] || !c17.b().f25741r[3] || !c17.b().f25741r[1]) {
            return null;
        }
        bw5.bl0 b17 = c17.b();
        if ((b17.f25741r[11] ? b17.f25740q : com.tencent.mm.protobuf.g.f192155b) != null) {
            return qVar.W6(0, c17);
        }
        return null;
    }

    public void aj(kk3.b bVar) {
        if (!jm0.g.class.isAssignableFrom(ik3.q.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(ik3.q.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.wechat.aff.star.d.f217506b.b(((java.lang.Number) ((jz5.n) r0.f291910g).getValue()).intValue(), new ik3.j((ik3.q) ((jm0.g) a17), bVar));
    }
}
