package e85;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f250308a;

    /* renamed from: b, reason: collision with root package name */
    public final int f250309b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f250310c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f250311d;

    public g(int i17, int i18, boolean z17, java.util.List list, int i19, kotlin.jvm.internal.i iVar) {
        z17 = (i19 & 4) != 0 ? true : z17;
        list = (i19 & 8) != 0 ? null : list;
        this.f250308a = i17;
        this.f250309b = i18;
        this.f250310c = z17;
        this.f250311d = list;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e85.g)) {
            return false;
        }
        e85.g gVar = (e85.g) obj;
        return this.f250308a == gVar.f250308a && this.f250309b == gVar.f250309b && this.f250310c == gVar.f250310c && kotlin.jvm.internal.o.b(this.f250311d, gVar.f250311d);
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f250308a) * 31) + java.lang.Integer.hashCode(this.f250309b)) * 31) + java.lang.Boolean.hashCode(this.f250310c)) * 31;
        java.util.List list = this.f250311d;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public java.lang.String toString() {
        return "BusinessConfigItem(descPrefix=" + this.f250308a + ", descSuffix=" + this.f250309b + ", needCheckSwitch=" + this.f250310c + ", noNeedDialogPageList=" + this.f250311d + ')';
    }
}
