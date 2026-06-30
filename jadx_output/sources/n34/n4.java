package n34;

/* loaded from: classes.dex */
public final class n4 implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f334689a;

    public n4(yz5.a aVar) {
        this.f334689a = aVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dismiss", "com.tencent.mm.plugin.sns.SnsStarUIHelper$showFirstSettingDialog$2");
        this.f334689a.invoke();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dismiss", "com.tencent.mm.plugin.sns.SnsStarUIHelper$showFirstSettingDialog$2");
    }
}
