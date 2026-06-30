package fc4;

/* loaded from: classes.dex */
public final class l0 {
    public l0(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToPage", "com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity$Companion");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        intent.setClass(context, com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/flexible/SnsFlexibleVideoActivity$Companion", "jumpToPage", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/sns/ui/flexible/SnsFlexibleVideoActivity$Companion", "jumpToPage", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).overridePendingTransition(0, 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToPage", "com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity$Companion");
    }
}
