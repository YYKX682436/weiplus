package lx;

/* loaded from: classes10.dex */
public final class x3 implements gy1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin f322005a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f322006b;

    public x3(com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin, yz5.l lVar) {
        this.f322005a = flutterBizPlugin;
        this.f322006b = lVar;
    }

    @Override // gy1.d
    public final void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i(this.f322005a.f65253d, "bobkw getSessionJumpPaths paths=" + obj);
        yz5.l lVar = this.f322006b;
        if (lVar != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str == null) {
                str = "";
            }
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(str)));
        }
    }
}
