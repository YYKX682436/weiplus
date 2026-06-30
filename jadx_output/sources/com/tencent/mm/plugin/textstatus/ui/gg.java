package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes9.dex */
public final class gg {
    public gg(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context context, java.lang.String userName, mj4.h hVar, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.plugin.textstatus.ui.TextStatusShowStatusCardUI.f173694g = hVar;
        com.tencent.mm.plugin.textstatus.ui.TextStatusShowStatusCardUI.f173696i = str;
        com.tencent.mm.plugin.textstatus.ui.TextStatusShowStatusCardUI.f173695h = userName;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.textstatus.ui.TextStatusShowStatusCardUI.class);
        intent.putExtra("KEY_ACTION", 1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusShowStatusCardUI$Companion", "startForShowComment", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/textstatus/ui/TextStatusShowStatusCardUI$Companion", "startForShowComment", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void b(android.content.Context context, java.lang.String userName, mj4.h hVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.plugin.textstatus.ui.TextStatusShowStatusCardUI.f173694g = hVar;
        com.tencent.mm.plugin.textstatus.ui.TextStatusShowStatusCardUI.f173696i = com.tencent.mm.plugin.textstatus.ui.TextStatusShowStatusCardUI.f173696i;
        com.tencent.mm.plugin.textstatus.ui.TextStatusShowStatusCardUI.f173695h = userName;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.textstatus.ui.TextStatusShowStatusCardUI.class);
        intent.putExtra("KEY_ACTION", 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusShowStatusCardUI$Companion", "startForShowLikeHistory", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/textstatus/ui/TextStatusShowStatusCardUI$Companion", "startForShowLikeHistory", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
