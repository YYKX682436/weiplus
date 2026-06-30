package di1;

/* loaded from: classes8.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ di1.f f232624d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(di1.f fVar) {
        super(0);
        this.f232624d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List list;
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection = this.f232624d.f232631c;
        return java.lang.Long.valueOf((appBrandOpenMaterialCollection == null || (list = appBrandOpenMaterialCollection.f86251f) == null) ? 0L : list.size());
    }
}
