package jn2;

/* loaded from: classes10.dex */
public final class k1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.r1 f300638d;

    public k1(jn2.r1 r1Var) {
        this.f300638d = r1Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        mm2.j6 newState = (mm2.j6) obj;
        jn2.r1 r1Var = this.f300638d;
        jn2.z1 z1Var = r1Var.f300686x0;
        if (z1Var != null) {
            mm2.j6 j6Var = r1Var.A1;
            kotlin.jvm.internal.o.g(newState, "newState");
            java.lang.String str = j6Var instanceof mm2.h6 ? ((mm2.h6) j6Var).f329113a.f391629f : j6Var instanceof mm2.i6 ? ((mm2.i6) j6Var).f329141a.f391629f : null;
            java.lang.String str2 = newState instanceof mm2.h6 ? ((mm2.h6) newState).f329113a.f391629f : newState instanceof mm2.i6 ? ((mm2.i6) newState).f329141a.f391629f : null;
            java.lang.String str3 = z1Var.f300775q;
            java.util.LinkedHashSet<java.lang.String> linkedHashSet = new java.util.LinkedHashSet();
            if (str != null) {
                linkedHashSet.add(str);
            }
            if (str2 != null) {
                linkedHashSet.add(str2);
            }
            if (str3 != null) {
                linkedHashSet.add(str3);
            }
            if (kotlin.jvm.internal.o.b(str3, str2) || !(newState instanceof mm2.g6)) {
                z1Var.f300775q = null;
            }
            for (java.lang.String str4 : linkedHashSet) {
                java.util.Iterator it = z1Var.f300769h.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    if (kotlin.jvm.internal.o.b(((r45.z22) it.next()).f391629f, str4)) {
                        break;
                    }
                    i17++;
                }
                if (i17 >= 0) {
                    com.tencent.mars.xlog.Log.i(z1Var.f300768g, "onSingStateChanged: refresh cell, pos=" + i17 + ", id=" + str4);
                    z1Var.notifyItemChanged(i17, "payload_sing_state");
                }
            }
        }
        r1Var.A1 = newState;
        return jz5.f0.f302826a;
    }
}
