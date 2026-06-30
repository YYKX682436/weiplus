package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class ef implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MultiTalkRoomPopupNav f208399d;

    public ef(com.tencent.mm.ui.MultiTalkRoomPopupNav multiTalkRoomPopupNav) {
        this.f208399d = multiTalkRoomPopupNav;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MultiTalkRoomPopupNav$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        q21.a a17 = q21.d.a();
        com.tencent.mm.ui.MultiTalkRoomPopupNav multiTalkRoomPopupNav = this.f208399d;
        if (a17 != null && ((com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class)).s4(multiTalkRoomPopupNav.getContext())) {
            yj0.a.h(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (q21.d.a() == null || !((va3.z0) q21.d.a()).e()) {
            multiTalkRoomPopupNav.a();
            yj0.a.h(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f492318g13), 0).show();
            yj0.a.h(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
