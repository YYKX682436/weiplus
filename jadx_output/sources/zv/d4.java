package zv;

/* loaded from: classes8.dex */
public final class d4 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin f475934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f475935b;

    public d4(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin, yz5.l lVar) {
        this.f475934a = flutterBrandEcsPlugin;
        this.f475935b = lVar;
    }

    @Override // d85.k0
    public final void onOp(java.lang.Boolean bool) {
        java.lang.String str = this.f475934a.f65189d;
        kotlin.jvm.internal.o.d(bool);
        com.tencent.mars.xlog.Log.i(str, "requestBusinessLocationPermission result: ".concat(bool.booleanValue() ? "granted" : "denied"));
        this.f475935b.invoke(bool);
    }
}
