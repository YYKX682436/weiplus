package kc2;

/* loaded from: classes15.dex */
public final class o implements java.util.function.BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kc2.q f306464a;

    public o(kc2.q qVar) {
        this.f306464a = qVar;
    }

    @Override // java.util.function.BiConsumer
    public void accept(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String key = (java.lang.String) obj;
        java.lang.Integer value = (java.lang.Integer) obj2;
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        this.f306464a.f306474e.put(key, value);
    }
}
