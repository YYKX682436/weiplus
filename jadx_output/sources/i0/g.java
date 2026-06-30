package i0;

/* loaded from: classes14.dex */
public final class g extends i0.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i0.b topStart, i0.b topEnd, i0.b bottomEnd, i0.b bottomStart) {
        super(topStart, topEnd, bottomEnd, bottomStart);
        kotlin.jvm.internal.o.g(topStart, "topStart");
        kotlin.jvm.internal.o.g(topEnd, "topEnd");
        kotlin.jvm.internal.o.g(bottomEnd, "bottomEnd");
        kotlin.jvm.internal.o.g(bottomStart, "bottomStart");
    }

    @Override // i0.a
    public i0.a b(i0.b topStart, i0.b topEnd, i0.b bottomEnd, i0.b bottomStart) {
        kotlin.jvm.internal.o.g(topStart, "topStart");
        kotlin.jvm.internal.o.g(topEnd, "topEnd");
        kotlin.jvm.internal.o.g(bottomEnd, "bottomEnd");
        kotlin.jvm.internal.o.g(bottomStart, "bottomStart");
        return new i0.g(topStart, topEnd, bottomEnd, bottomStart);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0.g)) {
            return false;
        }
        i0.g gVar = (i0.g) obj;
        if (!kotlin.jvm.internal.o.b(this.f286486a, gVar.f286486a)) {
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f286487b, gVar.f286487b)) {
            return false;
        }
        if (kotlin.jvm.internal.o.b(this.f286488c, gVar.f286488c)) {
            return kotlin.jvm.internal.o.b(this.f286489d, gVar.f286489d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f286486a.hashCode() * 31) + this.f286487b.hashCode()) * 31) + this.f286488c.hashCode()) * 31) + this.f286489d.hashCode();
    }

    public java.lang.String toString() {
        return "RoundedCornerShape(topStart = " + this.f286486a + ", topEnd = " + this.f286487b + ", bottomEnd = " + this.f286488c + ", bottomStart = " + this.f286489d + ')';
    }
}
