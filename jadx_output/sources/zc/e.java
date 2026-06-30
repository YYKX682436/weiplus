package zc;

/* loaded from: classes11.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.WxaLiteAppWidgetAdapter f471342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f471343e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter, android.content.Intent intent) {
        super(1);
        this.f471342d = wxaLiteAppWidgetAdapter;
        this.f471343e = intent;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", "closeWindow result: " + booleanValue + '}', new java.lang.Object[0]);
        if (!booleanValue) {
            com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter = this.f471342d;
            wxaLiteAppWidgetAdapter.f45975q.setResult(-1, this.f471343e);
            wxaLiteAppWidgetAdapter.f45975q.finish();
        }
        return jz5.f0.f302826a;
    }
}
