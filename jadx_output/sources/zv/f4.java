package zv;

/* loaded from: classes8.dex */
public final class f4 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin f475969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f475970b;

    public f4(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin, yz5.l lVar) {
        this.f475969a = flutterBrandEcsPlugin;
        this.f475970b = lVar;
    }

    @Override // d85.k0
    public final void onOp(java.lang.Boolean bool) {
        com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin = this.f475969a;
        java.lang.String str = flutterBrandEcsPlugin.f65189d;
        kotlin.jvm.internal.o.d(bool);
        com.tencent.mars.xlog.Log.i(str, "[BRS]requestLocationAuth requestLocationAuth result: ".concat(bool.booleanValue() ? "granted" : "denied"));
        if (!bool.booleanValue()) {
            flutterBrandEcsPlugin.getClass();
            flutterBrandEcsPlugin.f65195m.c(flutterBrandEcsPlugin, com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin.B[0], java.lang.Boolean.TRUE);
        }
        this.f475970b.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(bool)));
    }
}
