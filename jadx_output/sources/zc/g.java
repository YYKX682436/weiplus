package zc;

/* loaded from: classes11.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.WxaLiteAppWidgetAdapter f471346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f471347e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter, boolean z17) {
        super(1);
        this.f471346d = wxaLiteAppWidgetAdapter;
        this.f471347e = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        zc.x c17;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", "updatePopGestureEnableMessage ret: " + booleanValue, new java.lang.Object[0]);
        if (!booleanValue && (c17 = this.f471346d.c()) != null) {
            boolean z17 = !this.f471347e;
            com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity mMFlutterViewActivity = (com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity) c17;
            f03.a aVar = mMFlutterViewActivity.f137318s;
            if (aVar != null) {
                aVar.f258417b = z17;
            }
            if (aVar != null && aVar.f258418c) {
                mMFlutterViewActivity.S5(false);
            } else {
                mMFlutterViewActivity.S5(z17);
            }
        }
        return jz5.f0.f302826a;
    }
}
