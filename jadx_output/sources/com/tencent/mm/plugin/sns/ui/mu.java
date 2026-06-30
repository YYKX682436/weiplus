package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class mu implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.qu f169949d;

    public mu(com.tencent.mm.plugin.sns.ui.qu quVar) {
        this.f169949d = quVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$createView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsUserStarSlotHelper$createView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$goToStarList", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
        com.tencent.mm.plugin.sns.ui.qu quVar = this.f169949d;
        quVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("goToStarList", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_USER_NAME", quVar.f170359b);
        intent.putExtra("KEY_IS_SELF", quVar.f170360c);
        intent.putExtra("KEY_SNS_SOURCE", quVar.f170363f);
        android.app.Activity activity = quVar.f170358a;
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAlbumSessionId", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        java.lang.String str = ((com.tencent.mm.plugin.sns.ui.SnsUserUI) activity).K;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAlbumSessionId", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", str);
        intent.putExtra("INTENT_SOURCE_PATH", quVar.f170366i);
        intent.setClass(activity, com.tencent.mm.plugin.sns.ui.SnsStarListUI.class);
        android.app.Activity activity2 = quVar.f170358a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(23);
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.k(activity2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsUserStarSlotHelper", "goToStarList", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goToStarList", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$goToStarList", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsUserStarSlotHelper$createView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$createView$1");
    }
}
