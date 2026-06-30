package com.tencent.mm.ui.conversation;

/* loaded from: classes.dex */
public class k6 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f207812a;

    public k6(com.tencent.mm.ui.conversation.q5 q5Var, android.app.Activity activity) {
        this.f207812a = activity;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        if (!z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15181, 2);
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15181, 3);
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI");
        android.app.Activity activity = this.f207812a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/conversation/InitHelper$8", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/ui/conversation/InitHelper$8", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
