package q81;

/* loaded from: classes4.dex */
public final class i extends q81.a {
    @Override // q81.a
    public java.lang.Object b(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        r45.nf7 nf7Var = (r45.nf7) obj;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (!(!(str2 == null || str2.length() == 0))) {
            str2 = null;
        }
        if (str2 != null) {
            linkedList.add(str2);
        }
        java.util.LinkedList linkedList2 = nf7Var != null ? nf7Var.f381369f : null;
        if (!(true ^ (linkedList2 == null || linkedList2.isEmpty()))) {
            linkedList2 = null;
        }
        if (linkedList2 != null) {
            linkedList.addAll(linkedList2);
        }
        if (linkedList.isEmpty()) {
            return java.lang.Boolean.FALSE;
        }
        kotlin.jvm.internal.o.d(nf7Var);
        boolean z17 = nf7Var.f381368e;
        java.util.UUID randomUUID = java.util.UUID.randomUUID();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doSyncJsApiControlBytes with appId:");
        java.lang.String arrays = java.util.Arrays.toString(linkedList.toArray(new java.lang.String[0]));
        kotlin.jvm.internal.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        sb6.append(", forceUpdate:");
        sb6.append(z17);
        sb6.append(", requestId:");
        sb6.append(randomUUID);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CmdGetJsApiControlBytes", sb6.toString());
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            kotlinx.coroutines.l.d(lifecycleScope, kotlinx.coroutines.q1.f310570c, null, new q81.h(z17, linkedList, randomUUID, null), 2, null);
        }
        return java.lang.Boolean.TRUE;
    }

    @Override // q81.a
    public r45.cf7 d(java.lang.Object obj) {
        r45.nf7 nf7Var = (r45.nf7) obj;
        if (nf7Var != null) {
            return nf7Var.f381367d;
        }
        return null;
    }

    @Override // q81.a
    public java.lang.String e() {
        return "CmdGetJsApiControlBytes";
    }
}
