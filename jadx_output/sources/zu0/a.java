package zu0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.instamovie.base.asset.MJAssetInfo f475661a;

    /* renamed from: b, reason: collision with root package name */
    public final int f475662b;

    /* renamed from: c, reason: collision with root package name */
    public final int f475663c;

    public a(com.tencent.maas.instamovie.base.asset.MJAssetInfo assetInfo, int i17, int i18) {
        kotlin.jvm.internal.o.g(assetInfo, "assetInfo");
        this.f475661a = assetInfo;
        this.f475662b = i17;
        this.f475663c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu0.a)) {
            return false;
        }
        zu0.a aVar = (zu0.a) obj;
        return kotlin.jvm.internal.o.b(this.f475661a, aVar.f475661a) && this.f475662b == aVar.f475662b && this.f475663c == aVar.f475663c;
    }

    public int hashCode() {
        return (((this.f475661a.hashCode() * 31) + java.lang.Integer.hashCode(this.f475662b)) * 31) + java.lang.Integer.hashCode(this.f475663c);
    }

    public java.lang.String toString() {
        return "MCMediaFile(assetInfo=" + this.f475661a + ", width=" + this.f475662b + ", height=" + this.f475663c + ')';
    }
}
