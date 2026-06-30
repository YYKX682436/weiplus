package vv0;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: f, reason: collision with root package name */
    public static final vv0.k f440383f;

    /* renamed from: g, reason: collision with root package name */
    public static final vv0.k f440384g;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f440385a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f440386b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f440387c;

    /* renamed from: d, reason: collision with root package name */
    public final int f440388d;

    /* renamed from: e, reason: collision with root package name */
    public final zu0.i f440389e;

    static {
        zu0.i iVar = zu0.i.f475676f;
        f440383f = new vv0.k("NONE", "NONE", "NONE", Integer.MIN_VALUE, iVar);
        f440384g = new vv0.k("DIVIDER", "DIVIDER", "DIVIDER", Integer.MIN_VALUE, iVar);
    }

    public k(java.lang.String filterID, java.lang.String filterName, java.lang.String previewImageURL, int i17, zu0.i materialLoadState) {
        kotlin.jvm.internal.o.g(filterID, "filterID");
        kotlin.jvm.internal.o.g(filterName, "filterName");
        kotlin.jvm.internal.o.g(previewImageURL, "previewImageURL");
        kotlin.jvm.internal.o.g(materialLoadState, "materialLoadState");
        this.f440385a = filterID;
        this.f440386b = filterName;
        this.f440387c = previewImageURL;
        this.f440388d = i17;
        this.f440389e = materialLoadState;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv0.k)) {
            return false;
        }
        vv0.k kVar = (vv0.k) obj;
        return kotlin.jvm.internal.o.b(this.f440385a, kVar.f440385a) && kotlin.jvm.internal.o.b(this.f440386b, kVar.f440386b) && kotlin.jvm.internal.o.b(this.f440387c, kVar.f440387c) && this.f440388d == kVar.f440388d && this.f440389e == kVar.f440389e;
    }

    public int hashCode() {
        return (((((((this.f440385a.hashCode() * 31) + this.f440386b.hashCode()) * 31) + this.f440387c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f440388d)) * 31) + this.f440389e.hashCode();
    }

    public java.lang.String toString() {
        return "FilterInfo(filterID=" + this.f440385a + ", filterName=" + this.f440386b + ", previewImageURL=" + this.f440387c + ", categoryID=" + this.f440388d + ", materialLoadState=" + this.f440389e + ')';
    }
}
