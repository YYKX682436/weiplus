package q93;

/* loaded from: classes.dex */
public class j implements nw4.j {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f360926b;

    /* renamed from: c, reason: collision with root package name */
    public static q93.j f360927c;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f360926b = hashMap;
        hashMap.put("webTransfer", yx4.f.f467977d);
        f360927c = null;
    }

    @Override // nw4.j
    public boolean a(nw4.k kVar, nw4.y2 y2Var) {
        java.util.HashMap hashMap = f360926b;
        if (!hashMap.containsKey(y2Var.f341019i)) {
            return false;
        }
        qw4.a aVar = (qw4.a) hashMap.get(y2Var.f341019i);
        if (aVar != null) {
            int b17 = aVar.b();
            com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper = kVar.f340861b;
            if (jsapiPermissionWrapper != null ? jsapiPermissionWrapper.f(b17) : false) {
                aVar.a(kVar, y2Var);
                return true;
            }
        }
        com.tencent.mars.xlog.Log.e("LiteAppWebViewJsApiPool", "handleMsg access denied func: %s", y2Var.f341019i);
        kVar.f340863d.e(y2Var.f341013c, "system:access_denied", null);
        return true;
    }

    @Override // nw4.j
    public boolean b(nw4.k kVar, nw4.y2 y2Var) {
        return !f360926b.isEmpty() && kVar.f340863d.g() == this;
    }

    @Override // nw4.j
    public qw4.a f(java.lang.String str) {
        java.util.HashMap hashMap = f360926b;
        if (hashMap.containsKey(str)) {
            return (qw4.a) hashMap.get(str);
        }
        return null;
    }
}
