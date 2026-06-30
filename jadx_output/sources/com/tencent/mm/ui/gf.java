package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class gf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MultiTalkRoomPopupNav f208691d;

    public gf(com.tencent.mm.ui.MultiTalkRoomPopupNav multiTalkRoomPopupNav) {
        this.f208691d = multiTalkRoomPopupNav;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MultiTalkRoomPopupNav$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomPopupNav", "click cancel button..");
        com.tencent.mm.ui.MultiTalkRoomPopupNav multiTalkRoomPopupNav = this.f208691d;
        if (multiTalkRoomPopupNav.f197003p == com.tencent.mm.ui.kf.Inviting) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomPopupNav", "reject multiTalk!");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13945, 3, 1, 0, 0, multiTalkRoomPopupNav.f197000m, java.lang.Integer.valueOf(multiTalkRoomPopupNav.f197008u.field_roomId), java.lang.Long.valueOf(multiTalkRoomPopupNav.f197008u.field_roomKey));
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13945, 2, 0, 0, 0, multiTalkRoomPopupNav.f197000m, java.lang.Integer.valueOf(multiTalkRoomPopupNav.f197008u.field_roomId), java.lang.Long.valueOf(multiTalkRoomPopupNav.f197008u.field_roomKey));
        }
        com.tencent.mm.ui.jf.a(multiTalkRoomPopupNav.f197004q);
        multiTalkRoomPopupNav.f196994d.setVisibility(0);
        multiTalkRoomPopupNav.setNavBackgroundResource(com.tencent.mm.R.drawable.b7a);
        multiTalkRoomPopupNav.f196995e.setVisibility(0);
        multiTalkRoomPopupNav.f197005r.setVisibility(8);
        yj0.a.h(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
