package jx2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f302399a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f302400b;

    public a(int i17, java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        this.f302399a = i17;
        this.f302400b = text;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx2.a)) {
            return false;
        }
        jx2.a aVar = (jx2.a) obj;
        return this.f302399a == aVar.f302399a && kotlin.jvm.internal.o.b(this.f302400b, aVar.f302400b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f302399a) * 31) + this.f302400b.hashCode();
    }

    public java.lang.String toString() {
        return "FeedbackReason(id=" + this.f302399a + ", text=" + this.f302400b + ')';
    }
}
