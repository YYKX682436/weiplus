package ol2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f346145a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Integer f346146b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f346147c;

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.o.b(ol2.c.class, obj.getClass())) {
            return false;
        }
        ol2.c cVar = (ol2.c) obj;
        return kotlin.jvm.internal.o.b(this.f346145a, cVar.f346145a) && kotlin.jvm.internal.o.b(this.f346146b, cVar.f346146b);
    }

    public int hashCode() {
        java.lang.String str = this.f346145a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        java.lang.Integer num = this.f346146b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }
}
