package fb3;

/* loaded from: classes.dex */
public final class e extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f260856d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f260857e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f260858f;

    /* renamed from: g, reason: collision with root package name */
    public int f260859g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f260856d = "";
        this.f260857e = "";
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == this.f260859g && i18 == -1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("KEY_FINISH_ACTIVITY_REASON");
            if (kotlin.jvm.internal.o.b(stringExtra, "KEY_FINISH_ACTIVITY_FOR_BACK_PRESSED")) {
                return;
            }
            if (!kotlin.jvm.internal.o.b(stringExtra, "KEY_FINISH_ACTIVITY_FOR_PAY_SUCCESS")) {
                ot5.g.c("MicroMsg.QuickSendRedPacketUIC", "unknown finish activity reason, do nothing");
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("KEY_FINISH_ACTIVITY_REASON", "KEY_FINISH_ACTIVITY_FOR_PAY_SUCCESS");
            getActivity().setResult(-1, intent2);
            getActivity().finish();
        }
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
        ot5.g.c("MicroMsg.QuickSendRedPacketUIC", "onCreate");
        this.f260856d = java.lang.String.valueOf(getIntent().getStringExtra("KQuickSendRedPacketMaterialId"));
        this.f260857e = java.lang.String.valueOf(getIntent().getStringExtra("KQuickSendRedPacketSessionId"));
        this.f260858f = getIntent().getBooleanExtra("KQuickSendRedPacketFromMakeSkinMiniProgram", false);
        this.f260859g = getIntent().getIntExtra("KQuickSendRedPacketRequestCode", 215);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new fb3.d(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
    }
}
