package zi4;

/* loaded from: classes4.dex */
public final class i1 extends zi4.o1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host) {
        super(cmdId, weakReference, host, zi4.h1.f473224d);
        kotlin.jvm.internal.o.g(cmdId, "cmdId");
        kotlin.jvm.internal.o.g(host, "host");
    }

    @Override // zi4.o1
    public zi4.s1 b(com.tencent.mm.protobuf.f fVar) {
        java.util.LinkedList<bw5.vb> linkedList;
        java.util.LinkedList linkedList2;
        bw5.wb wbVar = (bw5.wb) fVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (wbVar != null && (linkedList2 = wbVar.f34633d) != null) {
            arrayList.addAll(linkedList2);
        }
        if (wbVar != null && (linkedList = wbVar.f34634e) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (bw5.vb vbVar : linkedList) {
                java.lang.String str = "";
                java.lang.String str2 = vbVar.f34274f[1] ? vbVar.f34272d : "";
                if (str2 != null) {
                    str = str2;
                }
                arrayList2.add(str);
            }
            arrayList.addAll(arrayList2);
        }
        if (!arrayList.isEmpty()) {
            zi4.g0 g0Var = this.f473182f;
            g0Var.getClass();
            com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = g0Var.f473218d;
            if (lifecycleScope != null) {
                v65.i.b(lifecycleScope, null, new zi4.b0(g0Var, arrayList, null), 1, null);
            }
        }
        return new zi4.s1(new bw5.xb(), 0L, null, 6, null);
    }
}
