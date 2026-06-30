package vy3;

/* loaded from: classes.dex */
public final class t extends wy3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final vy3.t f441488e = new vy3.t();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 y2Var) {
        int i17;
        java.util.HashMap hashMap;
        ab1.f fVar;
        android.content.Context context;
        ab1.c a17;
        nw4.y2 msg = y2Var;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f340790a.get("current");
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str.length() > 0) {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            int length = jSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                java.lang.String string = jSONArray.getString(i18);
                if (string == null) {
                    string = "";
                }
                arrayList.add(string);
            }
        }
        try {
            java.lang.Object obj = msg.f340790a.get("mode");
            java.lang.String str3 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str3 != null) {
                str2 = str3;
            }
            java.lang.String str4 = "showAddressPickerView current: %s, mode: " + str2;
            java.lang.Object[] objArr = new java.lang.Object[1];
            try {
                objArr[0] = kz5.n0.g0(arrayList, ",", null, null, 0, null, null, 62, null);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowAddressPickerView", str4, objArr);
                hashMap = new java.util.HashMap();
                fVar = (ab1.f) i95.n0.c(ab1.f.class);
                context = env.f340860a;
                a17 = ab1.c.f2709e.a(str2);
                if (a17 == null) {
                    a17 = ab1.c.f2712h;
                }
                i17 = 0;
                msg = y2Var;
            } catch (java.lang.Exception e17) {
                e = e17;
                i17 = 0;
                msg = y2Var;
            }
            try {
                ((ab1.l) fVar).Ai(context, new com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectRequest(a17, arrayList, false), new vy3.r(hashMap, env, msg), new vy3.s(hashMap, env, msg));
                return true;
            } catch (java.lang.Exception e18) {
                e = e18;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiShowAddressPickerView", e, "showAddressPickerView exception", new java.lang.Object[i17]);
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("retCode", 1);
                env.f340863d.e(msg.f341013c, "showAddressPickerView:fail", hashMap2);
                return true;
            }
        } catch (java.lang.Exception e19) {
            e = e19;
            i17 = 0;
        }
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return ab1.x.NAME;
    }
}
