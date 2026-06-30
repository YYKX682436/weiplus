package id1;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f290457a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Class[] f290458b;

    public c(java.lang.String name, java.lang.Class[] parameterTypes) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(parameterTypes, "parameterTypes");
        this.f290457a = name;
        this.f290458b = parameterTypes;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(id1.c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.nfc.rw.model.NFCTech.MethodSignature");
        id1.c cVar = (id1.c) obj;
        return kotlin.jvm.internal.o.b(this.f290457a, cVar.f290457a) && java.util.Arrays.equals(this.f290458b, cVar.f290458b);
    }

    public int hashCode() {
        return (this.f290457a.hashCode() * 31) + java.util.Arrays.hashCode(this.f290458b);
    }

    public java.lang.String toString() {
        return "MethodSignature(name=" + this.f290457a + ", parameterTypes=" + java.util.Arrays.toString(this.f290458b) + ')';
    }
}
