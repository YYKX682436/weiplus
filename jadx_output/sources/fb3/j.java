package fb3;

/* loaded from: classes.dex */
public final class j extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f260867d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f260868e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f260869f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f260867d = "";
        this.f260868e = "";
        this.f260869f = "";
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_FINISH_ACTIVITY_REASON", "KEY_FINISH_ACTIVITY_FOR_BACK_PRESSED");
        getActivity().setResult(-1, intent);
        return super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        ot5.g.c("MicroMsg.SendRedCoverAppMsgUIC", "onCreate");
        this.f260867d = java.lang.String.valueOf(getIntent().getStringExtra("KSendRedCoverAppMsgRequestUrl"));
        getIntent().getIntExtra("KSendRedCoverAppMsgRequestCode", 217);
        this.f260868e = java.lang.String.valueOf(getIntent().getStringExtra("KSendRedCoverAppMsgSessionId"));
        this.f260869f = java.lang.String.valueOf(getIntent().getStringExtra("KSendRedCoverAppMsgCoverId"));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29977, 1, this.f260869f, "", this.f260868e);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new fb3.i(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
    }
}
