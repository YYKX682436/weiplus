package ir2;

/* loaded from: classes2.dex */
public interface a0 extends ay1.m {
    @Override // ay1.m
    default java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        return d(continuation);
    }

    @Override // ay1.m
    default void b() {
    }

    @Override // ay1.m
    default void c(java.lang.Object obj) {
        ir2.e1 value = (ir2.e1) obj;
        kotlin.jvm.internal.o.g(value, "value");
    }

    java.lang.Object d(kotlin.coroutines.Continuation continuation);

    @Override // ay1.m
    default ir2.z getKey() {
        return new ir2.z("");
    }
}
