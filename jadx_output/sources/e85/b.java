package e85;

/* loaded from: classes10.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public static final void a(e85.b bVar) {
        bVar.getClass();
        java.util.LinkedList linkedList = com.tencent.mm.sensitive.business.BusinessStackRecorder.f193187m;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            d85.f0 f0Var = ((e85.c) it.next()).f250304g;
            arrayList.add(f0Var != null ? f0Var.f227176d : null);
        }
        com.tencent.mm.sensitive.business.BusinessStackRecorder.f193188n.putString("SENSITIVE_BUSINESS_STR", com.tencent.mm.sdk.platformtools.t8.c1(kz5.n0.V0(arrayList), ","));
    }

    public final com.tencent.mm.sensitive.business.BusinessStackRecorder b() {
        return (com.tencent.mm.sensitive.business.BusinessStackRecorder) com.tencent.mm.sensitive.business.BusinessStackRecorder.f193189o.getValue();
    }

    public final java.lang.String c() {
        d85.f0 f0Var;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            e85.c cVar = (e85.c) kz5.n0.k0(com.tencent.mm.sensitive.business.BusinessStackRecorder.f193187m);
            if (cVar == null || (f0Var = cVar.f250304g) == null) {
                return null;
            }
            return f0Var.f227176d;
        }
        java.lang.String string = com.tencent.mm.sensitive.business.BusinessStackRecorder.f193188n.getString("SENSITIVE_BUSINESS_STR", null);
        if (string == null) {
            return null;
        }
        java.util.List O1 = com.tencent.mm.sdk.platformtools.t8.O1(string, ",");
        kotlin.jvm.internal.o.f(O1, "stringToList(...)");
        return (java.lang.String) kz5.n0.k0(O1);
    }
}
