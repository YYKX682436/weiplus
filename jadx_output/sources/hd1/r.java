package hd1;

/* loaded from: classes7.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd1.w f280420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f280421e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280422f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f280423g;

    public r(hd1.w wVar, yz5.l lVar, java.lang.String str, int i17) {
        this.f280420d = wVar;
        this.f280421e = lVar;
        this.f280422f = str;
        this.f280423g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        android.nfc.tech.TagTechnology tagTechnology;
        java.lang.Object obj;
        hd1.w wVar = this.f280420d;
        android.nfc.Tag a17 = hd1.w.a(wVar);
        yz5.l lVar = this.f280421e;
        if (a17 == null) {
            lVar.invoke(new hd1.x(13013, "NFC tag has not been discovered"));
        }
        if (a17 == null) {
            return;
        }
        id1.d.f290459h.getClass();
        id1.d dVar = (id1.d) id1.d.f290460i.get(this.f280422f);
        if (dVar == null) {
            lVar.invoke(new hd1.x(13014, "invalid tech"));
        }
        if (dVar == null) {
            return;
        }
        java.lang.Class[] clsArr = {java.lang.Integer.TYPE};
        id1.c cVar = new id1.c("setTimeout", clsArr);
        android.util.ArrayMap arrayMap = dVar.f290472g;
        java.lang.Boolean bool = (java.lang.Boolean) arrayMap.get(cVar);
        java.lang.String str = dVar.f290470e;
        if (bool == null) {
            try {
                java.lang.Class.forName(str).getDeclaredMethod("setTimeout", (java.lang.Class[]) java.util.Arrays.copyOf(clsArr, 1));
                z17 = true;
            } catch (java.lang.Exception e17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get ");
                sb6.append(str);
                sb6.append(".setTimeout(");
                java.lang.String arrays = java.util.Arrays.toString(clsArr);
                kotlin.jvm.internal.o.f(arrays, "toString(...)");
                sb6.append(arrays);
                sb6.append(") failed since ");
                sb6.append(e17);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.NFCTech", sb6.toString());
                z17 = false;
            }
            bool = java.lang.Boolean.valueOf(z17);
            arrayMap.put(cVar, java.lang.Boolean.valueOf(bool.booleanValue()));
        }
        if (!bool.booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.NFCReadWriteManager", "setTimeout, " + dVar.f290469d + ".setTimeout is not supported");
            lVar.invoke(new hd1.x(13024, "function not support"));
            return;
        }
        try {
            obj = d56.b.i(str).b("get", a17).f226632b;
        } catch (java.lang.Exception unused) {
            lVar.invoke(new hd1.x(13015, "unavailable tech"));
            tagTechnology = null;
        }
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        tagTechnology = (android.nfc.tech.TagTechnology) obj;
        if (tagTechnology == null) {
            return;
        }
        try {
            d56.b.h(tagTechnology).b("setTimeout", java.lang.Integer.valueOf(this.f280423g));
            lVar.invoke(new hd1.y(jz5.f0.f302826a));
        } catch (java.lang.Exception e18) {
            java.lang.Throwable b17 = hd1.w.b(wVar, e18);
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.NFCReadWriteManager", "setTimeout failed since " + b17);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("system internal error: ");
            sb7.append(b17 != null ? b17.getMessage() : null);
            lVar.invoke(new hd1.x(13017, sb7.toString()));
        }
    }
}
