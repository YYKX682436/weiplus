package xj1;

/* loaded from: classes7.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList f454805d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList) {
        super(0);
        this.f454805d = appBrandCollectionDisplayVerticalList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int intValue = ((java.lang.Number) ((jz5.n) this.f454805d.f89644p).getValue()).intValue();
        if (intValue != 6 && intValue != 7 && intValue != 8) {
            return com.tencent.mm.plugin.appbrand.report.y0.a();
        }
        java.lang.String str = com.tencent.mm.plugin.appbrand.report.y0.f88430b;
        kotlin.jvm.internal.o.d(str);
        return str;
    }
}
