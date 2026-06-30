package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes5.dex */
public class no implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI f170020d;

    public no(com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI snsSelectChatRoomUI) {
        this.f170020d = snsSelectChatRoomUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsSelectChatRoomUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() != null && (view.getTag() instanceof com.tencent.mm.storage.z3)) {
            com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI.w7(this.f170020d, (com.tencent.mm.storage.z3) view.getTag());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsSelectChatRoomUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI$2");
    }
}
