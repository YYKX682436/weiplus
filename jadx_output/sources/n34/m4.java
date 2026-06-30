package n34;

/* loaded from: classes3.dex */
public final class m4 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f334683a;

    public m4(com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f334683a = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.SnsStarUIHelper$showFirstSettingDialog$1");
        this.f334683a.B();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.SnsStarUIHelper$showFirstSettingDialog$1");
    }
}
