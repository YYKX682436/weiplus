package yw4;

/* loaded from: classes.dex */
public final class r implements nw4.j {

    /* renamed from: b, reason: collision with root package name */
    public static final yw4.r f466990b = new yw4.r();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f466991c = new java.util.HashMap();

    @Override // nw4.j
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.util.HashMap hashMap = (java.util.HashMap) f466991c;
        boolean containsKey = hashMap.containsKey(msg.f341019i);
        nw4.g gVar = env.f340863d;
        if (!containsKey) {
            gVar.e(msg.f341013c, "system:function_not_exist", null);
            return false;
        }
        java.lang.Object obj = hashMap.get(msg.f341019i);
        kotlin.jvm.internal.o.d(obj);
        qw4.a aVar = (qw4.a) obj;
        int b17 = aVar.b();
        com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper = env.f340861b;
        if (jsapiPermissionWrapper != null ? jsapiPermissionWrapper.f(b17) : false) {
            aVar.a(env, msg);
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WebPrefetcherJsApiPool", "handleMsg access denied func: " + msg.f341019i);
        if (kotlin.jvm.internal.o.b(msg.f341019i, "log")) {
            return true;
        }
        gVar.e(msg.f341013c, "system:access_denied", null);
        return true;
    }

    @Override // nw4.j
    public boolean b(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        return (((java.util.HashMap) f466991c).isEmpty() ^ true) && kotlin.jvm.internal.o.b(env.f340863d.g(), this);
    }

    @Override // nw4.j
    public qw4.a f(java.lang.String funcName) {
        kotlin.jvm.internal.o.g(funcName, "funcName");
        return (qw4.a) ((java.util.HashMap) f466991c).get(funcName);
    }
}
