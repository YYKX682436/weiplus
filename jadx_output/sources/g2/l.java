package g2;

/* loaded from: classes14.dex */
public final class l {

    /* renamed from: f, reason: collision with root package name */
    public static final g2.l f267716f = new g2.l(false, 0, true, 1, 1, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f267717a;

    /* renamed from: b, reason: collision with root package name */
    public final int f267718b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f267719c;

    /* renamed from: d, reason: collision with root package name */
    public final int f267720d;

    /* renamed from: e, reason: collision with root package name */
    public final int f267721e;

    public l(boolean z17, int i17, boolean z18, int i18, int i19, kotlin.jvm.internal.i iVar) {
        this.f267717a = z17;
        this.f267718b = i17;
        this.f267719c = z18;
        this.f267720d = i18;
        this.f267721e = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2.l)) {
            return false;
        }
        g2.l lVar = (g2.l) obj;
        if (this.f267717a != lVar.f267717a) {
            return false;
        }
        if (!(this.f267718b == lVar.f267718b) || this.f267719c != lVar.f267719c) {
            return false;
        }
        if (this.f267720d == lVar.f267720d) {
            return this.f267721e == lVar.f267721e;
        }
        return false;
    }

    public int hashCode() {
        return (((((((java.lang.Boolean.hashCode(this.f267717a) * 31) + java.lang.Integer.hashCode(this.f267718b)) * 31) + java.lang.Boolean.hashCode(this.f267719c)) * 31) + java.lang.Integer.hashCode(this.f267720d)) * 31) + java.lang.Integer.hashCode(this.f267721e);
    }

    public java.lang.String toString() {
        return "ImeOptions(singleLine=" + this.f267717a + ", capitalization=" + ((java.lang.Object) g2.r.a(this.f267718b)) + ", autoCorrect=" + this.f267719c + ", keyboardType=" + ((java.lang.Object) g2.s.a(this.f267720d)) + ", imeAction=" + ((java.lang.Object) g2.k.a(this.f267721e)) + ')';
    }
}
