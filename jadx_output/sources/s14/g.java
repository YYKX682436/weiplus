package s14;

/* loaded from: classes.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.permission.SettingVoiceAssistantPermissionUI f402148d;

    public g(com.tencent.mm.plugin.setting.ui.setting.permission.SettingVoiceAssistantPermissionUI settingVoiceAssistantPermissionUI) {
        this.f402148d = settingVoiceAssistantPermissionUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View childAt;
        android.widget.TextView textView;
        int height;
        com.tencent.mm.plugin.setting.ui.setting.permission.SettingVoiceAssistantPermissionUI settingVoiceAssistantPermissionUI = this.f402148d;
        android.widget.ScrollView scrollView = (android.widget.ScrollView) settingVoiceAssistantPermissionUI.findViewById(com.tencent.mm.R.id.mcq);
        if (scrollView == null || (childAt = scrollView.getChildAt(0)) == null || (textView = (android.widget.TextView) settingVoiceAssistantPermissionUI.findViewById(com.tencent.mm.R.id.f487608vo4)) == null || (height = scrollView.getHeight() - childAt.getMeasuredHeight()) <= 0) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = height;
        textView.setLayoutParams(layoutParams2);
    }
}
