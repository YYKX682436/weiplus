package ir1;

/* loaded from: classes11.dex */
public final class o1 implements androidx.activity.result.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI f294028a;

    public o1(com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI bizFansSettingUI) {
        this.f294028a = bizFansSettingUI;
    }

    @Override // androidx.activity.result.b
    public void a(java.lang.Object obj) {
        androidx.activity.result.ActivityResult result = (androidx.activity.result.ActivityResult) obj;
        kotlin.jvm.internal.o.g(result, "result");
        if (result.f9042d == -1) {
            com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI bizFansSettingUI = this.f294028a;
            android.content.Intent intent = result.f9043e;
            java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("key_ori_scope_type", bizFansSettingUI.f93961g)) : null;
            if (valueOf != null) {
                if (valueOf.intValue() != bizFansSettingUI.f93961g) {
                    bizFansSettingUI.d7(valueOf.intValue());
                    bizFansSettingUI.b7("biz_fans_private_msg_scope_pref");
                }
            }
        }
    }
}
