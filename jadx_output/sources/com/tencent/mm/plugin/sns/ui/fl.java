package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public class fl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsLongMsgUI f168349d;

    public fl(com.tencent.mm.plugin.sns.ui.SnsLongMsgUI snsLongMsgUI) {
        this.f168349d = snsLongMsgUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLongMsgUI$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsLongMsgUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.sns.ui.SnsLongMsgUI snsLongMsgUI = this.f168349d;
        intent.setClass(snsLongMsgUI, com.tencent.mm.plugin.sns.ui.SnsUploadUI.class);
        intent.putExtra("KSnsPostManu", true);
        intent.putExtra("KTouchCameraTime", com.tencent.mm.sdk.platformtools.t8.i1());
        intent.putExtra("sns_comment_type", 1);
        intent.putExtra("Ksnsupload_type", 9);
        com.tencent.mm.plugin.sns.ui.SnsLongMsgUI snsLongMsgUI2 = this.f168349d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(snsLongMsgUI2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsLongMsgUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        snsLongMsgUI2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(snsLongMsgUI2, "com/tencent/mm/plugin/sns/ui/SnsLongMsgUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        snsLongMsgUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsLongMsgUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLongMsgUI$1");
    }
}
