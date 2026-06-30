package zc;

/* loaded from: classes11.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.WxaLiteAppWidgetAdapter f471348d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter) {
        super(1);
        this.f471348d = wxaLiteAppWidgetAdapter;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", "flutter ui handle navigate back.", new java.lang.Object[0]);
        } else {
            this.f471348d.f45975q.finish();
        }
        return jz5.f0.f302826a;
    }
}
