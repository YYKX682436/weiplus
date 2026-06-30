package n80;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f335598a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f335599b;

    /* renamed from: c, reason: collision with root package name */
    public int f335600c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f335601d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f335602e;

    /* renamed from: f, reason: collision with root package name */
    public n80.a f335603f;

    public e(boolean z17, java.lang.String desc, int i17, boolean z18, boolean z19, n80.a aVar, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 1) != 0 ? false : z17;
        desc = (i18 & 2) != 0 ? "" : desc;
        i17 = (i18 & 4) != 0 ? 0 : i17;
        z18 = (i18 & 8) != 0 ? false : z18;
        z19 = (i18 & 16) != 0 ? true : z19;
        aVar = (i18 & 32) != 0 ? null : aVar;
        kotlin.jvm.internal.o.g(desc, "desc");
        this.f335598a = z17;
        this.f335599b = desc;
        this.f335600c = i17;
        this.f335601d = z18;
        this.f335602e = z19;
        this.f335603f = aVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n80.e)) {
            return false;
        }
        n80.e eVar = (n80.e) obj;
        return this.f335598a == eVar.f335598a && kotlin.jvm.internal.o.b(this.f335599b, eVar.f335599b) && this.f335600c == eVar.f335600c && this.f335601d == eVar.f335601d && this.f335602e == eVar.f335602e && kotlin.jvm.internal.o.b(this.f335603f, eVar.f335603f);
    }

    public int hashCode() {
        int hashCode = ((((((((java.lang.Boolean.hashCode(this.f335598a) * 31) + this.f335599b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f335600c)) * 31) + java.lang.Boolean.hashCode(this.f335601d)) * 31) + java.lang.Boolean.hashCode(this.f335602e)) * 31;
        n80.a aVar = this.f335603f;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public java.lang.String toString() {
        return "LabelContactDialogBottomTipsConfig(enableShow=" + this.f335598a + ", desc=" + this.f335599b + ", textColor=" + this.f335600c + ", enableClick=" + this.f335601d + ", enableDismissDialogOnClick=" + this.f335602e + ", listener=" + this.f335603f + ')';
    }
}
