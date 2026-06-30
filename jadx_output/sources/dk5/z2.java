package dk5;

/* loaded from: classes9.dex */
public class z2 implements com.tencent.mm.plugin.base.stub.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f235016a;

    public z2(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI) {
        this.f235016a = selectConversationUI;
    }

    @Override // com.tencent.mm.plugin.base.stub.j
    public void a(boolean z17) {
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f235016a;
        boolean isFinishing = selectConversationUI.isFinishing();
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "onCheckEnd, isPass = " + z17 + ", isFinishing = " + isFinishing);
        if (z17 || isFinishing) {
            return;
        }
        com.tencent.mm.pluginsdk.model.app.m5.c(selectConversationUI, (com.tencent.mm.pluginsdk.model.app.ReportUtil$ReportArgs) selectConversationUI.getIntent().getParcelableExtra("Select_Report_Args"), true, false);
        selectConversationUI.finish();
    }
}
