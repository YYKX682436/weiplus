package vv0;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.base.MJID f440398a;

    /* renamed from: b, reason: collision with root package name */
    public final dx0.p f440399b;

    /* renamed from: c, reason: collision with root package name */
    public final int f440400c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f440401d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f440402e;

    public n(com.tencent.maas.base.MJID segmentID, dx0.p pVar, int i17, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        this.f440398a = segmentID;
        this.f440399b = pVar;
        this.f440400c = i17;
        this.f440401d = z17;
        this.f440402e = z18;
    }

    public static vv0.n a(vv0.n nVar, com.tencent.maas.base.MJID segmentID, dx0.p pVar, int i17, boolean z17, boolean z18, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            segmentID = nVar.f440398a;
        }
        if ((i18 & 2) != 0) {
            pVar = nVar.f440399b;
        }
        dx0.p pVar2 = pVar;
        if ((i18 & 4) != 0) {
            i17 = nVar.f440400c;
        }
        int i19 = i17;
        if ((i18 & 8) != 0) {
            z17 = nVar.f440401d;
        }
        boolean z19 = z17;
        if ((i18 & 16) != 0) {
            z18 = nVar.f440402e;
        }
        nVar.getClass();
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        return new vv0.n(segmentID, pVar2, i19, z19, z18);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv0.n)) {
            return false;
        }
        vv0.n nVar = (vv0.n) obj;
        return kotlin.jvm.internal.o.b(this.f440398a, nVar.f440398a) && kotlin.jvm.internal.o.b(this.f440399b, nVar.f440399b) && this.f440400c == nVar.f440400c && this.f440401d == nVar.f440401d && this.f440402e == nVar.f440402e;
    }

    public int hashCode() {
        int hashCode = this.f440398a.hashCode() * 31;
        dx0.p pVar = this.f440399b;
        return ((((((hashCode + (pVar == null ? 0 : pVar.hashCode())) * 31) + java.lang.Integer.hashCode(this.f440400c)) * 31) + java.lang.Boolean.hashCode(this.f440401d)) * 31) + java.lang.Boolean.hashCode(this.f440402e);
    }

    public java.lang.String toString() {
        return "SegmentData(segmentID=" + this.f440398a + ", img=" + this.f440399b + ", order=" + this.f440400c + ", selected=" + this.f440401d + ", hasContentDesc=" + this.f440402e + ')';
    }

    public /* synthetic */ n(com.tencent.maas.base.MJID mjid, dx0.p pVar, int i17, boolean z17, boolean z18, int i18, kotlin.jvm.internal.i iVar) {
        this(mjid, pVar, (i18 & 4) != 0 ? 0 : i17, (i18 & 8) != 0 ? false : z17, (i18 & 16) != 0 ? false : z18);
    }
}
