package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class ff implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MultiTalkRoomPopupNav f208590e;

    public ff(com.tencent.mm.ui.MultiTalkRoomPopupNav multiTalkRoomPopupNav, java.lang.String str) {
        this.f208590e = multiTalkRoomPopupNav;
        this.f208589d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MultiTalkRoomPopupNav$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomPopupNav", "click enter button..");
        java.lang.String str = this.f208589d;
        com.tencent.mm.ui.MultiTalkRoomPopupNav multiTalkRoomPopupNav = this.f208590e;
        if (str != null) {
            if (((com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class)).ff()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkRoomPopupNav", "now is in other voip..");
                db5.e1.s(multiTalkRoomPopupNav.getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.h1z), null);
                yj0.a.h(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.util.List P6 = ((com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class)).P6(multiTalkRoomPopupNav.f197000m);
            if (P6 == null || P6.size() != 1) {
                com.tencent.mm.ui.kf kfVar = com.tencent.mm.ui.kf.Inviting;
                if (P6 != null && P6.size() >= zj3.j.e()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkRoomPopupNav", "now is up to the limit,memberList size:" + P6.size());
                    db5.e1.s(multiTalkRoomPopupNav.getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492592h26, java.lang.Integer.valueOf(zj3.j.e())), null);
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.Object[] objArr = new java.lang.Object[7];
                    objArr[0] = 1;
                    objArr[1] = java.lang.Integer.valueOf(multiTalkRoomPopupNav.f197003p == kfVar ? 1 : 0);
                    objArr[2] = 1;
                    objArr[3] = 1;
                    objArr[4] = multiTalkRoomPopupNav.f197000m;
                    objArr[5] = java.lang.Integer.valueOf(multiTalkRoomPopupNav.f197008u.field_roomId);
                    objArr[6] = java.lang.Long.valueOf(multiTalkRoomPopupNav.f197008u.field_roomKey);
                    g0Var.d(13945, objArr);
                    yj0.a.h(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                if (((com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class)).e5()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkRoomPopupNav", "now is inviting other people voip..");
                    db5.e1.s(multiTalkRoomPopupNav.getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.h1y), null);
                    com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.Object[] objArr2 = new java.lang.Object[7];
                    objArr2[0] = 1;
                    objArr2[1] = java.lang.Integer.valueOf(multiTalkRoomPopupNav.f197003p == kfVar ? 1 : 0);
                    objArr2[2] = 0;
                    objArr2[3] = 1;
                    objArr2[4] = multiTalkRoomPopupNav.f197000m;
                    objArr2[5] = java.lang.Integer.valueOf(multiTalkRoomPopupNav.f197008u.field_roomId);
                    objArr2[6] = java.lang.Long.valueOf(multiTalkRoomPopupNav.f197008u.field_roomKey);
                    g0Var2.d(13945, objArr2);
                    yj0.a.h(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.Z = new com.tencent.mm.ui.ff$$a();
                multiTalkRoomPopupNav.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomPopupNav", "now try enter multitalk:" + str);
                if (((com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class)).mh(str)) {
                    ((com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class)).B2(str);
                    com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.Object[] objArr3 = new java.lang.Object[7];
                    objArr3[0] = 1;
                    objArr3[1] = java.lang.Integer.valueOf(multiTalkRoomPopupNav.f197003p == kfVar ? 1 : 0);
                    objArr3[2] = 0;
                    objArr3[3] = 0;
                    objArr3[4] = multiTalkRoomPopupNav.f197000m;
                    objArr3[5] = java.lang.Integer.valueOf(multiTalkRoomPopupNav.f197008u.field_roomId);
                    objArr3[6] = java.lang.Long.valueOf(multiTalkRoomPopupNav.f197008u.field_roomKey);
                    g0Var3.d(13945, objArr3);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkRoomPopupNav", "try enter fail!" + str);
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    dp.a.makeText(context, context.getString(com.tencent.mm.R.string.h1k), 0).show();
                    com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.Object[] objArr4 = new java.lang.Object[7];
                    objArr4[0] = 1;
                    objArr4[1] = java.lang.Integer.valueOf(multiTalkRoomPopupNav.f197003p == kfVar ? 1 : 0);
                    objArr4[2] = 0;
                    objArr4[3] = 1;
                    objArr4[4] = multiTalkRoomPopupNav.f197000m;
                    objArr4[5] = java.lang.Integer.valueOf(multiTalkRoomPopupNav.f197008u.field_roomId);
                    objArr4[6] = java.lang.Long.valueOf(multiTalkRoomPopupNav.f197008u.field_roomKey);
                    g0Var4.d(13945, objArr4);
                }
                com.tencent.mm.ui.Cif cif = multiTalkRoomPopupNav.f197013z;
                if (cif != null) {
                    ((wj5.q) cif).f446833a.f446836g.m0();
                }
            } else {
                multiTalkRoomPopupNav.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomPopupNav", "when only on menber do clear banner!");
                ((com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class)).J4(str);
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomPopupNav", "when only on member do exit talk!");
                if (!((com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class)).Gf(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkRoomPopupNav", "when only on member do exit talk failure! groupId:" + str);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13945, 1, 0, 0, 1, multiTalkRoomPopupNav.f197000m, java.lang.Integer.valueOf(multiTalkRoomPopupNav.f197008u.field_roomId), java.lang.Long.valueOf(multiTalkRoomPopupNav.f197008u.field_roomKey));
            }
        }
        com.tencent.mm.ui.jf.a(multiTalkRoomPopupNav.f197004q);
        multiTalkRoomPopupNav.f196994d.setVisibility(0);
        multiTalkRoomPopupNav.setNavBackgroundResource(com.tencent.mm.R.drawable.b7a);
        multiTalkRoomPopupNav.f196995e.setVisibility(0);
        multiTalkRoomPopupNav.f197005r.setVisibility(8);
        yj0.a.h(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
