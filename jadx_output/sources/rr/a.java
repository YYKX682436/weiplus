package rr;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f399118a;

    /* renamed from: b, reason: collision with root package name */
    public final long f399119b;

    /* renamed from: c, reason: collision with root package name */
    public final long f399120c;

    /* renamed from: d, reason: collision with root package name */
    public final int f399121d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f399122e;

    public a(java.lang.String text, long j17, long j18, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(text, "text");
        this.f399118a = text;
        this.f399119b = j17;
        this.f399120c = j18;
        this.f399121d = i17;
        this.f399122e = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr.a)) {
            return false;
        }
        rr.a aVar = (rr.a) obj;
        return kotlin.jvm.internal.o.b(this.f399118a, aVar.f399118a) && this.f399119b == aVar.f399119b && this.f399120c == aVar.f399120c && this.f399121d == aVar.f399121d && this.f399122e == aVar.f399122e;
    }

    public int hashCode() {
        return (((((((this.f399118a.hashCode() * 31) + java.lang.Long.hashCode(this.f399119b)) * 31) + java.lang.Long.hashCode(this.f399120c)) * 31) + java.lang.Integer.hashCode(this.f399121d)) * 31) + java.lang.Boolean.hashCode(this.f399122e);
    }

    public java.lang.String toString() {
        return "CustomEmojiWeTypeConfig(text=" + this.f399118a + ", showInterval=" + this.f399119b + ", maxShowDuration=" + this.f399120c + ", maxShowCount=" + this.f399121d + ", dismissAfterClicked=" + this.f399122e + ')';
    }
}
