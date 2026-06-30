package ls5;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f321131a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f321132b = "";

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f321133c = new android.os.Bundle();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f321134d = "";

    public f(java.lang.Object obj) {
        this.f321131a = obj;
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new ls5.e(this, new java.lang.Throwable("DetectTrace"), null), 2, null);
    }

    public final java.lang.String a(byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (byte b17 : bArr) {
            java.lang.String format = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b17)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            sb6.append(format);
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.Object obj = this.f321131a;
        kotlin.jvm.internal.o.d(obj);
        sb6.append(kotlin.jvm.internal.i0.a(obj.getClass()).g());
        sb6.append('_');
        sb6.append(obj.hashCode());
        return sb6.toString();
    }

    public java.lang.String toString() {
        return "eventName: " + b() + " currentKey:  \n traceString: " + this.f321132b + " traceId: " + this.f321134d;
    }
}
