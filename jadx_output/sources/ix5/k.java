package ix5;

/* loaded from: classes16.dex */
public final class k extends qz5.l implements yz5.p {
    public k(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ix5.k(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new ix5.k((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ix5.h.f295631b.c().info("exit");
        ix5.h.f295640k = ix5.s.f295671d;
        ((java.util.LinkedHashMap) ix5.h.f295641l).clear();
        com.tencent.shadow.dynamic.host.DynamicPluginManager dynamicPluginManager = ix5.h.f295637h;
        if (dynamicPluginManager == null) {
            return null;
        }
        dynamicPluginManager.exit();
        return jz5.f0.f302826a;
    }
}
