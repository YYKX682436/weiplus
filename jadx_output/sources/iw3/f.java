package iw3;

/* loaded from: classes.dex */
public final class f implements nw4.j {

    /* renamed from: b, reason: collision with root package name */
    public static final iw3.f f295237b = new iw3.f();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f295238c = new java.util.HashMap();

    @Override // nw4.j
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.util.Map map = f295238c;
        if (((java.util.HashMap) map).containsKey(msg.f341019i)) {
            java.lang.Object obj = ((java.util.HashMap) map).get(msg.f341019i);
            kotlin.jvm.internal.o.d(obj);
            qw4.a aVar = (qw4.a) obj;
            aVar.b();
            if (aVar.b() == 10004) {
                aVar.a(env, msg);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.SelectTextJsApiPool", "handleMsg access denied func: " + msg.f341019i);
                env.f340863d.e(msg.f341013c, "system:access_denied", null);
            }
        }
        return true;
    }

    @Override // nw4.j
    public boolean b(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        return (((java.util.HashMap) f295238c).isEmpty() ^ true) && kotlin.jvm.internal.o.b(env.f340863d.g(), this);
    }

    @Override // nw4.j
    public qw4.a f(java.lang.String funcName) {
        kotlin.jvm.internal.o.g(funcName, "funcName");
        java.util.Map map = f295238c;
        if (((java.util.HashMap) map).containsKey(funcName)) {
            return (qw4.a) ((java.util.HashMap) map).get(funcName);
        }
        return null;
    }
}
