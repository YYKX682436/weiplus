package ix3;

/* loaded from: classes.dex */
public final class s0 implements java.util.function.BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public static final ix3.s0 f295550a = new ix3.s0();

    @Override // java.util.function.BiConsumer
    public void accept(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String key = (java.lang.String) obj;
        java.lang.String value = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        ((java.util.ArrayList) com.tencent.mm.repairer.config.debugger.RepairerConfigAssistNetworkProxy.f192211b).add(value);
        ((java.util.ArrayList) com.tencent.mm.repairer.config.debugger.RepairerConfigAssistNetworkProxy.f192212c).add(key);
    }
}
