package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes.dex */
public final class h6 {
    public h6(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context context, android.os.Bundle bundle, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2.class);
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        bundle.putBoolean("KEY_IS_ENTER", true);
        intent.putExtras(bundle);
        if (num == null || !(context instanceof android.app.Activity)) {
            if (!(context instanceof android.app.Activity)) {
                intent.addFlags(268435456);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$Companion", "start", "(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$Companion", "start", "(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/Integer;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            int intValue = num.intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.k((android.app.Activity) context, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$Companion", "start", "(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/Integer;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
        }
    }
}
