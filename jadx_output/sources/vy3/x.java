package vy3;

/* loaded from: classes.dex */
public final class x implements nw4.j {

    /* renamed from: b, reason: collision with root package name */
    public static final vy3.x f441492b = new vy3.x();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f441493c;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f441493c = hashMap;
        jz5.g gVar = wy3.b.f450646a;
        java.util.Map jsApiList = (java.util.Map) ((jz5.n) wy3.b.f450646a).getValue();
        kotlin.jvm.internal.o.g(jsApiList, "jsApiList");
        hashMap.clear();
        hashMap.putAll(jsApiList);
    }

    @Override // nw4.j
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.util.Map map = f441493c;
        if (((java.util.HashMap) map).containsKey(msg.f341019i)) {
            java.lang.Object obj = ((java.util.HashMap) map).get(msg.f341019i);
            kotlin.jvm.internal.o.d(obj);
            qw4.a aVar = (qw4.a) obj;
            if (aVar.b() == 10007) {
                aVar.a(env, msg);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScanWebViewJsApiPool", "handleMsg access denied func: " + msg.f341019i);
                env.f340863d.e(msg.f341013c, "system:access_denied", null);
            }
        }
        return true;
    }

    @Override // nw4.j
    public boolean b(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        return (((java.util.HashMap) f441493c).isEmpty() ^ true) && kotlin.jvm.internal.o.b(env.f340863d.g(), this);
    }

    @Override // nw4.j
    public qw4.a f(java.lang.String funcName) {
        kotlin.jvm.internal.o.g(funcName, "funcName");
        java.util.Map map = f441493c;
        if (((java.util.HashMap) map).containsKey(funcName)) {
            return (qw4.a) ((java.util.HashMap) map).get(funcName);
        }
        return null;
    }
}
