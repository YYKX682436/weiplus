package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class f0 extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AllRemindMsgUI f208406a;

    public f0(com.tencent.mm.ui.AllRemindMsgUI allRemindMsgUI) {
        this.f208406a = allRemindMsgUI;
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        com.tencent.mm.ui.AllRemindMsgUI allRemindMsgUI = this.f208406a;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.AllRemindMsgUI", "[onChanged] size:%s", java.lang.Integer.valueOf(allRemindMsgUI.f196572g.getItemCount()));
        if (allRemindMsgUI.f196572g.getItemCount() == 0) {
            android.view.View view = allRemindMsgUI.f196571f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/AllRemindMsgUI$1", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/AllRemindMsgUI$1", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            allRemindMsgUI.f196569d.setVisibility(8);
            return;
        }
        android.view.View view2 = allRemindMsgUI.f196571f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/AllRemindMsgUI$1", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/AllRemindMsgUI$1", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        allRemindMsgUI.f196569d.setVisibility(0);
    }
}
