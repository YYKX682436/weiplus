package zv;

/* loaded from: classes.dex */
public final class i4 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f475995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin f475996b;

    public i4(yz5.l lVar, com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin) {
        this.f475995a = lVar;
        this.f475996b = flutterBrandEcsPlugin;
    }

    @Override // j35.b0
    public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        kotlin.jvm.internal.o.d(iArr);
        boolean z17 = ((iArr.length == 0) ^ true) && iArr[0] == 0;
        yz5.l lVar = this.f475995a;
        com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin = this.f475996b;
        if (z17) {
            zv.h4 h4Var = new zv.h4(lVar);
            f06.v[] vVarArr = com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin.B;
            flutterBrandEcsPlugin.e(h4Var);
        } else {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
            com.tencent.mars.xlog.Log.i(flutterBrandEcsPlugin.f65189d, "requestLocationWithSystemAuth system permission denied");
        }
    }
}
