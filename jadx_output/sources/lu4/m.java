package lu4;

/* loaded from: classes7.dex */
public final class m extends lu4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final lu4.j f321441d = new lu4.j(null);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f321442e = jz5.h.b(lu4.i.f321436d);

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f321443f = lp0.b.D() + "jsengine/trace/";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(lu4.c context) {
        super("wxJsEngine", context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ea  */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lu4.m.dump(java.lang.String, java.lang.String):void");
    }

    @android.webkit.JavascriptInterface
    public final int getLogLevel() {
        return com.tencent.mars.xlog.Log.getLogLevel();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getNetWorkType() {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lu4.m.getNetWorkType():java.lang.String");
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getPlatform() {
        return com.eclipsesource.mmv8.Platform.ANDROID;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getSystemInfo() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("devicesType", 2);
        jSONObject.put("osVersion", android.os.Build.VERSION.SDK_INT);
        jSONObject.put("brand", android.os.Build.BRAND);
        jSONObject.put("model", wo.w0.m());
        jz5.g gVar = lu4.e.f321433d;
        jSONObject.put("pixelRatio", java.lang.Float.valueOf(((java.lang.Number) ((jz5.n) lu4.e.f321433d).getValue()).floatValue()));
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    @android.webkit.JavascriptInterface
    public final void idkey(long j17, long j18, long j19) {
        if (j17 <= 0) {
            com.tencent.mars.xlog.Log.e(this.f321431c, "idkey id can't be 0");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(j17, j18, j19);
        }
    }

    @android.webkit.JavascriptInterface
    public final void idkeyList(java.lang.String idkeyList) {
        kotlin.jvm.internal.o.g(idkeyList, "idkeyList");
        cl0.e eVar = new cl0.e(idkeyList);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int length = eVar.length();
        for (int i17 = 0; i17 < length; i17++) {
            cl0.e a17 = eVar.a(i17);
            linkedList.add(new com.tencent.mars.smc.IDKey(a17.getLong(0), a17.getLong(1), a17.getLong(2)));
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : linkedList) {
            if (((com.tencent.mars.smc.IDKey) obj).GetID() > 0) {
                arrayList.add(obj);
            }
        }
        g0Var.j(new java.util.ArrayList(arrayList), false, false);
    }

    @android.webkit.JavascriptInterface
    public final void kv(int i17, java.lang.String data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i(this.f321431c, "kvStat id=" + i17 + ", data=" + data);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(i17, data);
    }

    @android.webkit.JavascriptInterface
    public final void reportCgi(java.lang.Number businessId, java.lang.String reqJson, java.lang.String callback) {
        kotlin.jvm.internal.o.g(businessId, "businessId");
        kotlin.jvm.internal.o.g(reqJson, "reqJson");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i(this.f321431c, "reportCgi businessId=" + businessId);
        lx3.r.f322113a.a(businessId, reqJson, new lu4.k(this, callback), new lu4.l(this, callback));
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String userAgent() {
        java.lang.String a17 = ik1.l0.a(com.tencent.mm.sdk.platformtools.x2.f193071a, hy4.w.f286200f.a(), f321441d.a());
        kotlin.jvm.internal.o.d(a17);
        return a17;
    }
}
