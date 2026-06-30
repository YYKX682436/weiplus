package dq1;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final dq1.p f242353a = new dq1.p();

    public final boolean a(dq1.c type, dq1.b oldContext, dq1.b newContext) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(oldContext, "oldContext");
        kotlin.jvm.internal.o.g(newContext, "newContext");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("check context, type:");
        sb6.append(type);
        sb6.append(", oldContext: ");
        sb6.append("loginUin:" + oldContext.f242345a);
        sb6.append(", newContext:");
        sb6.append("loginUin:" + newContext.f242345a);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizSchemeUtil", sb6.toString());
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            return oldContext.a() && newContext.a() && kotlin.jvm.internal.o.b(oldContext.f242345a, newContext.f242345a);
        }
        if (ordinal != 1) {
            return ordinal == 2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizSchemeUtil", "oldContext.loginUin:" + oldContext.f242345a + ", newContext.loginUin:" + newContext.f242345a);
        return (oldContext.a() || newContext.a()) ? false : true;
    }

    public final dq1.b b() {
        java.lang.String str;
        dq1.b bVar = new dq1.b();
        if (gm0.j1.b().n()) {
            str = gm0.j1.b().j();
            kotlin.jvm.internal.o.f(str, "getUinString(...)");
        } else {
            str = "";
        }
        bVar.f242345a = str;
        return bVar;
    }
}
