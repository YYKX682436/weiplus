package gg3;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f271736a;

    /* renamed from: b, reason: collision with root package name */
    public final int f271737b;

    /* renamed from: c, reason: collision with root package name */
    public final float f271738c;

    public e(java.lang.String msg, int i17, float f17, int i18, kotlin.jvm.internal.i iVar) {
        msg = (i18 & 1) != 0 ? "" : msg;
        i17 = (i18 & 2) != 0 ? 0 : i17;
        f17 = (i18 & 4) != 0 ? 0.0f : f17;
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f271736a = msg;
        this.f271737b = i17;
        this.f271738c = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg3.e)) {
            return false;
        }
        gg3.e eVar = (gg3.e) obj;
        return kotlin.jvm.internal.o.b(this.f271736a, eVar.f271736a) && this.f271737b == eVar.f271737b && java.lang.Float.compare(this.f271738c, eVar.f271738c) == 0;
    }

    public int hashCode() {
        return (((this.f271736a.hashCode() * 31) + java.lang.Integer.hashCode(this.f271737b)) * 31) + java.lang.Float.hashCode(this.f271738c);
    }

    public java.lang.String toString() {
        return "VideoStateInfo(msg=" + this.f271736a + ", ret=" + this.f271737b + ", progress=" + this.f271738c + ')';
    }
}
