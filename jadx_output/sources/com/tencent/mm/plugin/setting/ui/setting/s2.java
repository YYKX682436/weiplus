package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes3.dex */
public class s2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI f161527d;

    public s2(com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI) {
        this.f161527d = selfQRCodeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gm0.j1.u().c().w(143618, 0);
        boolean z17 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.global.RepairerConfigAddFriendVerifyRecordToCloud()) == 1;
        com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI = this.f161527d;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelfQRCodeNewUI", "updateNewFriendData, [AddFriendVerifyRecordToCloud] goto AddFriendVerifyRecordUI (new)");
            android.content.Intent intent = new android.content.Intent();
            lk5.s.e(intent, true);
            j45.l.j(selfQRCodeUI.getContext(), "subapp", ".ui.friend.AddFriendVerifyRecordUI", intent, null);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelfQRCodeNewUI", "updateNewFriendData, [AddFriendVerifyRecordToCloud] goto FMessageConversationUI (old)");
            j45.l.j(selfQRCodeUI.getContext(), "subapp", ".ui.friend.FMessageConversationUI", new android.content.Intent(), null);
        }
        selfQRCodeUI.getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.setting.ui.setting.k2(selfQRCodeUI, 1L));
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
