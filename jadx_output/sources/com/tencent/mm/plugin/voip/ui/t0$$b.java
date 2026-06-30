package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes.dex */
public final /* synthetic */ class t0$$b implements yz5.l {
    @Override // yz5.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add((android.content.Intent) obj);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/voip/ui/VoipMiniViewManager", "lambda$routToFlutterVoip$0", "(Landroid/content/Intent;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/voip/ui/VoipMiniViewManager", "lambda$routToFlutterVoip$0", "(Landroid/content/Intent;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return null;
    }
}
