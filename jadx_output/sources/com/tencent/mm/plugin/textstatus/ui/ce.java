package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes.dex */
public final class ce {
    public ce(kotlin.jvm.internal.i iVar) {
    }

    public static void a(com.tencent.mm.plugin.textstatus.ui.ce ceVar, android.content.Context context, java.lang.String str, int i17, long j17, int i18, boolean z17, int i19, java.lang.Object obj) {
        java.lang.String str2 = (i19 & 2) != 0 ? "" : str;
        int i27 = (i19 & 4) != 0 ? 0 : i17;
        long j18 = (i19 & 8) != 0 ? 0L : j17;
        int i28 = (i19 & 16) != 0 ? 0 : i18;
        boolean z18 = (i19 & 32) != 0 ? false : z17;
        ceVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity.class);
        intent.putExtra("exclude_topic_id", str2);
        intent.putExtra("key_source", i27);
        intent.putExtra("KEY_RED_DOT_TYPE", j18);
        intent.putExtra("KEY_BTN_STYLE", i28);
        intent.putExtra("KEY_NOTIFY_RED_DOT", z18);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusOtherTopicFriendsActivity$Companion", "start", "(Landroid/content/Context;Ljava/lang/String;IJIZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/textstatus/ui/TextStatusOtherTopicFriendsActivity$Companion", "start", "(Landroid/content/Context;Ljava/lang/String;IJIZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
