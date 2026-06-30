package ii2;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f291617a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f291618b;

    /* renamed from: c, reason: collision with root package name */
    public final ii2.b f291619c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.p f291620d;

    public a(int i17, android.graphics.Rect dividerRect, ii2.b lineShow, yz5.p pVar, int i18, kotlin.jvm.internal.i iVar) {
        lineShow = (i18 & 4) != 0 ? ii2.b.f291622e : lineShow;
        pVar = (i18 & 8) != 0 ? null : pVar;
        kotlin.jvm.internal.o.g(dividerRect, "dividerRect");
        kotlin.jvm.internal.o.g(lineShow, "lineShow");
        this.f291617a = i17;
        this.f291618b = dividerRect;
        this.f291619c = lineShow;
        this.f291620d = pVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii2.a)) {
            return false;
        }
        ii2.a aVar = (ii2.a) obj;
        return this.f291617a == aVar.f291617a && kotlin.jvm.internal.o.b(this.f291618b, aVar.f291618b) && this.f291619c == aVar.f291619c && kotlin.jvm.internal.o.b(this.f291620d, aVar.f291620d);
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f291617a) * 31) + this.f291618b.hashCode()) * 31) + this.f291619c.hashCode()) * 31;
        yz5.p pVar = this.f291620d;
        return hashCode + (pVar == null ? 0 : pVar.hashCode());
    }

    public java.lang.String toString() {
        return "Config(color=" + this.f291617a + ", dividerRect=" + this.f291618b + ", lineShow=" + this.f291619c + ", skipBlock=" + this.f291620d + ')';
    }
}
