package mi1;

/* loaded from: classes7.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f326672a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f326673b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f326674c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f326675d;

    /* renamed from: e, reason: collision with root package name */
    public final int f326676e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f326677f;

    /* renamed from: g, reason: collision with root package name */
    public final int f326678g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f326679h;

    public r1(java.lang.String wording, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i17, boolean z17, int i18, yz5.a aVar, int i19, kotlin.jvm.internal.i iVar) {
        str = (i19 & 2) != 0 ? null : str;
        str2 = (i19 & 4) != 0 ? null : str2;
        num = (i19 & 8) != 0 ? null : num;
        if ((i19 & 16) != 0) {
            mi1.z0 z0Var = mi1.z0.f326739e;
            i17 = 0;
        }
        z17 = (i19 & 32) != 0 ? false : z17;
        i18 = (i19 & 64) != 0 ? -1 : i18;
        aVar = (i19 & 128) != 0 ? null : aVar;
        kotlin.jvm.internal.o.g(wording, "wording");
        this.f326672a = wording;
        this.f326673b = str;
        this.f326674c = str2;
        this.f326675d = num;
        this.f326676e = i17;
        this.f326677f = z17;
        this.f326678g = i18;
        this.f326679h = aVar;
    }

    public final boolean a() {
        java.lang.String str = this.f326673b;
        if (str != null) {
            if (str.length() > 0) {
                return true;
            }
        }
        return this.f326675d != null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi1.r1)) {
            return false;
        }
        mi1.r1 r1Var = (mi1.r1) obj;
        return kotlin.jvm.internal.o.b(this.f326672a, r1Var.f326672a) && kotlin.jvm.internal.o.b(this.f326673b, r1Var.f326673b) && kotlin.jvm.internal.o.b(this.f326674c, r1Var.f326674c) && kotlin.jvm.internal.o.b(this.f326675d, r1Var.f326675d) && this.f326676e == r1Var.f326676e && this.f326677f == r1Var.f326677f && this.f326678g == r1Var.f326678g && kotlin.jvm.internal.o.b(this.f326679h, r1Var.f326679h);
    }

    public int hashCode() {
        int hashCode = this.f326672a.hashCode() * 31;
        java.lang.String str = this.f326673b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f326674c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Integer num = this.f326675d;
        int hashCode4 = (((((((hashCode3 + (num == null ? 0 : num.hashCode())) * 31) + java.lang.Integer.hashCode(this.f326676e)) * 31) + java.lang.Boolean.hashCode(this.f326677f)) * 31) + java.lang.Integer.hashCode(this.f326678g)) * 31;
        yz5.a aVar = this.f326679h;
        return hashCode4 + (aVar != null ? aVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CapsuleTipsConfig(wording=" + this.f326672a + ", iconUrl=" + this.f326673b + ", darkModeIconUrl=" + this.f326674c + ", iconResourceId=" + this.f326675d + ", type=" + this.f326676e + ", enableClickable=" + this.f326677f + ", ellipsizedTailIndex=" + this.f326678g + ", onClick=" + this.f326679h + ')';
    }
}
