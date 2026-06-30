package cv4;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcv4/a0;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class a0 extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public final int f222583g = 10;

    /* renamed from: h, reason: collision with root package name */
    public final int f222584h = 11;

    /* renamed from: i, reason: collision with root package name */
    public final int f222585i = 1;

    /* renamed from: m, reason: collision with root package name */
    public final int f222586m = 6;

    /* renamed from: n, reason: collision with root package name */
    public final int f222587n = 11;

    /* renamed from: o, reason: collision with root package name */
    public final int f222588o = 1;

    /* renamed from: p, reason: collision with root package name */
    public final int f222589p = 2;

    /* renamed from: q, reason: collision with root package name */
    public final int f222590q = 3;

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        d85.g0 g0Var;
        d85.f0 f0Var;
        int i17 = jSONObject != null ? jSONObject.getInt("capability") : 0;
        int i18 = -1;
        int i19 = jSONObject != null ? jSONObject.getInt("authScene") : -1;
        if (i17 == this.f222585i) {
            g0Var = d85.g0.LOCAION;
        } else if (i17 == this.f222586m) {
            g0Var = d85.g0.STORAGE;
        } else {
            if (i17 != this.f222587n) {
                com.tencent.mars.xlog.Log.e("MicroMsg.systemCapabilityAuthorizationStatus", "capability error: " + i17);
                this.f143443f.a("capability error: " + i17);
                return;
            }
            g0Var = d85.g0.CAMERA;
        }
        if (i19 == this.f222583g) {
            f0Var = d85.f0.f227167r;
        } else {
            if (i19 != this.f222584h) {
                com.tencent.mars.xlog.Log.e("MicroMsg.systemCapabilityAuthorizationStatus", "authScene error: " + i19);
                this.f143443f.a("authScene error: " + i19);
                return;
            }
            f0Var = d85.f0.f227168s;
        }
        android.content.Context c17 = c();
        android.app.Activity activity = c17 instanceof android.app.Activity ? (android.app.Activity) c17 : null;
        if (activity != null) {
            java.util.HashMap hashMap = e85.i.f250315a;
            java.util.Set entrySet = e85.i.f250316b.entrySet();
            kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : entrySet) {
                if (((java.util.Map.Entry) obj).getValue() == g0Var) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((java.lang.String) ((java.util.Map.Entry) it.next()).getKey());
            }
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                d85.h0 ij6 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).ij(activity, (java.lang.String) it6.next(), f0Var.f227177e);
                if (ij6 == d85.h0.SYSTEM_REFUSE) {
                    i18 = this.f222589p;
                } else {
                    d85.h0 h0Var = d85.h0.BUSINESS_REFUSE;
                    int i27 = this.f222590q;
                    if (ij6 == h0Var) {
                        i18 = i27;
                    }
                    if (ij6 == d85.h0.GRANTED && i18 != i27) {
                        i18 = this.f222588o;
                    }
                    if (ij6 == d85.h0.ERROR) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.systemCapabilityAuthorizationStatus", "IPluginSensitive.PERMISSION_RESULT.ERROR = " + ij6.f227201d);
                    }
                }
            }
        }
        this.f143443f.b(kz5.c1.k(new jz5.l("retCode", 0), new jz5.l("status", java.lang.Integer.valueOf(i18)), new jz5.l("locationSystemAuthorizationStatus", 0), new jz5.l("accuracyAuthorization", java.lang.Boolean.FALSE), new jz5.l("isLocationAuthExptEnable", java.lang.Boolean.TRUE)));
    }
}
