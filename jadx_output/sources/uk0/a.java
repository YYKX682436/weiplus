package uk0;

/* loaded from: classes.dex */
public abstract class a {
    public static final /* synthetic */ void a(com.tencent.mm.ipcinvoker.r rVar) {
        kotlin.jvm.internal.o.g(rVar, "<this>");
        rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
    }

    public static final /* synthetic */ void b(java.lang.Object obj, com.tencent.mm.ipcinvoker.j invoke, com.tencent.mm.ipcinvoker.r rVar) {
        kotlin.jvm.internal.o.g(invoke, "invoke");
        iz5.a.g("invokeclass: " + invoke.getClass(), qk0.c.a(invoke.getClass()));
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, obj, invoke.getClass(), rVar);
    }

    public static /* synthetic */ void c(java.lang.Object obj, com.tencent.mm.ipcinvoker.j jVar, com.tencent.mm.ipcinvoker.r rVar, int i17, java.lang.Object obj2) {
        if ((i17 & 4) != 0) {
            rVar = null;
        }
        b(obj, jVar, rVar);
    }

    public static final java.lang.Object d(java.lang.Object obj, com.tencent.mm.ipcinvoker.k0 invoke) {
        kotlin.jvm.internal.o.g(invoke, "invoke");
        iz5.a.g(null, qk0.c.a(invoke.getClass()));
        return com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, obj, invoke.getClass());
    }
}
