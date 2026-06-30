package zv;

/* loaded from: classes.dex */
public final class x3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin f476133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476134e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin, java.lang.String str) {
        super(1);
        this.f476133d = flutterBrandEcsPlugin;
        this.f476134e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        boolean m528isSuccessimpl = kotlin.Result.m528isSuccessimpl(value);
        com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin = this.f476133d;
        if (m528isSuccessimpl) {
            com.tencent.mars.xlog.Log.i(flutterBrandEcsPlugin.f65189d, "onUpdateTemplateMsgScopeItemList success for templateId: " + this.f476134e);
        } else {
            com.tencent.mars.xlog.Log.e(flutterBrandEcsPlugin.f65189d, "onUpdateTemplateMsgScopeItemList failed: " + kotlin.Result.m524exceptionOrNullimpl(value));
        }
        return jz5.f0.f302826a;
    }
}
