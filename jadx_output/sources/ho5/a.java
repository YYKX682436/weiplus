package ho5;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f282895a;

    /* renamed from: b, reason: collision with root package name */
    public final int f282896b;

    /* renamed from: c, reason: collision with root package name */
    public final int f282897c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f282898d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f282899e;

    public a(int i17, int i18, int i19, boolean z17, boolean z18, int i27, kotlin.jvm.internal.i iVar) {
        i19 = (i27 & 4) != 0 ? i18 : i19;
        z17 = (i27 & 8) != 0 ? false : z17;
        z18 = (i27 & 16) != 0 ? false : z18;
        this.f282895a = i17;
        this.f282896b = i18;
        this.f282897c = i19;
        this.f282898d = z17;
        this.f282899e = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho5.a)) {
            return false;
        }
        ho5.a aVar = (ho5.a) obj;
        return this.f282895a == aVar.f282895a && this.f282896b == aVar.f282896b && this.f282897c == aVar.f282897c && this.f282898d == aVar.f282898d && this.f282899e == aVar.f282899e;
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f282895a) * 31) + java.lang.Integer.hashCode(this.f282896b)) * 31) + java.lang.Integer.hashCode(this.f282897c)) * 31) + java.lang.Boolean.hashCode(this.f282898d)) * 31) + java.lang.Boolean.hashCode(this.f282899e);
    }

    public java.lang.String toString() {
        return "MsgContentInfo(type=" + this.f282895a + ", contentResId=" + this.f282896b + ", contentResIdWithoutTime=" + this.f282897c + ", redDot=" + this.f282898d + ", needTime=" + this.f282899e + ')';
    }
}
