package yr0;

/* loaded from: classes10.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f464628a = new java.util.HashMap();

    public final yr0.e a(java.lang.String str, yr0.f fVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Preload", b() + " getPreload key:" + str + " status:" + fVar);
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        java.util.HashMap hashMap = this.f464628a;
        if (!isEmpty) {
            return (yr0.e) hashMap.get(str);
        }
        if (fVar == null) {
            java.util.Iterator it = hashMap.entrySet().iterator();
            if (it.hasNext()) {
                return (yr0.e) ((java.util.Map.Entry) it.next()).getValue();
            }
            return null;
        }
        java.util.Iterator it6 = hashMap.entrySet().iterator();
        while (it6.hasNext()) {
            yr0.e eVar = (yr0.e) ((java.util.Map.Entry) it6.next()).getValue();
            if (eVar.f464630b == fVar) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Preload", b() + "finder select status");
                return eVar;
            }
        }
        return null;
    }

    public abstract java.lang.String b();

    public final void c(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        java.util.HashMap hashMap = this.f464628a;
        yr0.e eVar = (yr0.e) hashMap.remove(key);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(b());
        sb6.append(" remove size:");
        sb6.append(hashMap.size());
        sb6.append(" key:");
        sb6.append(key);
        sb6.append(" status:");
        sb6.append(eVar != null ? eVar.f464630b : null);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Camera.Preload", sb6.toString(), new java.lang.Object[0]);
    }
}
