package lc3;

/* loaded from: classes7.dex */
public final class l0 extends lc3.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.u1 f317908a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.plugin.appbrand.appstorage.u1 assetFs) {
        super(null);
        kotlin.jvm.internal.o.g(assetFs, "assetFs");
        this.f317908a = assetFs;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lc3.l0) && kotlin.jvm.internal.o.b(this.f317908a, ((lc3.l0) obj).f317908a);
    }

    public int hashCode() {
        return this.f317908a.hashCode();
    }

    public java.lang.String toString() {
        return "AssetPkgFsDescriptor(assetFs=" + this.f317908a + ')';
    }
}
