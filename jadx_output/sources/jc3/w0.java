package jc3;

/* loaded from: classes7.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final jc3.w0 f299010a = new jc3.w0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f299011b = jz5.h.b(jc3.v0.f299009d);

    public final java.lang.Boolean a(java.lang.String bizName) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        return (java.lang.Boolean) ((java.util.HashMap) ((jz5.n) f299011b).getValue()).get(bizName);
    }

    public final java.lang.String b(java.lang.String bizName) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        jc3.u0 u0Var = jc3.u0.f298996a;
        java.lang.String str = (java.lang.String) jc3.u0.f299006k.get(bizName);
        return str == null ? bizName : str;
    }
}
