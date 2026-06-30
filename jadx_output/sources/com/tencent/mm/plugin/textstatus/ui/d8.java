package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class d8 {
    public d8(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context context, bi4.d1 params, boolean z17, boolean z18, android.os.ResultReceiver resultReceiver) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(params, "params");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity.class);
        if (z17) {
            intent.addFlags(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62);
        }
        intent.putExtra("ACTION_NEED_HANDLE_LAST_RESP", z18);
        intent.putExtra("SET_TEXT_PARAMS", params.toByteArray());
        intent.putExtra("CALLBACK", resultReceiver);
        intent.putExtra("KEY_IS_FROM_RECENT_STATUS", params.H);
        intent.putExtra("KEY_IS_FROM_CUSTOM_ICON_RECOMMEND", params.I);
        intent.putExtra("KEY_LAST_CUSTOM_ICON_RECOMMEND_LIST", params.f354936J);
        boolean z19 = context instanceof android.app.Activity;
        if (!z19) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$Companion", "start", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/SetStatusParam;ZZLandroid/os/ResultReceiver;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$Companion", "start", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/SetStatusParam;ZZLandroid/os/ResultReceiver;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        android.app.Activity activity = z19 ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
        }
    }
}
