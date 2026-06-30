package zv;

/* loaded from: classes9.dex */
public final class k4 implements e31.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin f476014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476015b;

    public k4(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin, java.lang.String str) {
        this.f476014a = flutterBrandEcsPlugin;
        this.f476015b = str;
    }

    @Override // e31.i
    public void a() {
        com.tencent.mars.xlog.Log.e(this.f476014a.f65189d, "[BRS] updateTemplateMsgScopeItemScopeRecv: onError failed to update scope recv for " + this.f476015b);
    }

    @Override // e31.i
    public void b(java.lang.String templateId, e31.j result) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i(this.f476014a.f65189d, "[BRS] updateTemplateMsgScopeItemScopeRecv: onUpdated templateId=".concat(templateId));
    }
}
