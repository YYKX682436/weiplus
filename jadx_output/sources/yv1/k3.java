package yv1;

/* loaded from: classes12.dex */
public final class k3 implements xg3.i0 {
    @Override // xg3.i0
    public void c0(xg3.m0 m0Var, xg3.l0 notify) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(notify, "notify");
        if (z65.c.f470458d || (arrayList = notify.f454412c) == null || arrayList.isEmpty()) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
            if (f9Var != null && f9Var.getMsgId() != 0) {
                mt1.b0 b0Var = mt1.b0.f331191a;
                if (mt1.e0.f331213a.get(java.lang.Integer.valueOf(f9Var.getType())) != null) {
                    z17 = true;
                }
                java.lang.String Q0 = f9Var.Q0();
                if (Q0 == null) {
                    Q0 = "talker-ignore";
                }
                b0Var.r(f9Var.getMsgId(), Q0);
            }
        }
        if (z17) {
            yv1.f1 f1Var = yv1.g1.f466040p;
        }
    }
}
