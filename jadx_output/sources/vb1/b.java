package vb1;

/* loaded from: classes7.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final vb1.d a(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        java.util.HashMap hashMap = vb1.d.f434474d;
        synchronized (hashMap) {
            vb1.d dVar = (vb1.d) hashMap.get(appId);
            if (dVar != null) {
                return dVar;
            }
            vb1.d dVar2 = new vb1.d(appId);
            hashMap.put(appId, dVar2);
            return dVar2;
        }
    }
}
