package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes10.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.b0 f154616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154617e;

    public v(com.tencent.mm.plugin.profile.ui.tab.b0 b0Var, java.lang.String str) {
        this.f154616d = b0Var;
        this.f154617e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.an anVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic$initMore$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.tab.b0 b0Var = this.f154616d;
        r45.wl v2resp = b0Var.f154233b;
        kotlin.jvm.internal.o.g(v2resp, "v2resp");
        r45.j32 j32Var = new r45.j32();
        if (v2resp.f389251y != null) {
            java.util.LinkedList<r45.mk> linkedList = v2resp.f389247u;
            if (linkedList.size() != 0 && (anVar = v2resp.f389245s) != null) {
                java.lang.String b17 = x51.j1.b(anVar.f370126d);
                for (r45.mk mkVar : linkedList) {
                    r45.h32 h32Var = new r45.h32();
                    h32Var.set(0, java.lang.Integer.valueOf(mkVar.f380596d));
                    h32Var.set(3, mkVar.f380598f);
                    h32Var.set(4, mkVar.f380599g);
                    com.tencent.mm.plugin.finder.feed.model.i1 i1Var = com.tencent.mm.plugin.finder.feed.model.i1.f107930a;
                    kotlin.jvm.internal.o.d(b17);
                    java.lang.String string = h32Var.getString(4);
                    if (string == null) {
                        string = "";
                    }
                    r45.h32 e17 = i1Var.e(b17, string);
                    h32Var.set(1, java.lang.Integer.valueOf(e17 != null ? e17.getInteger(1) : 1));
                    j32Var.getList(0).add(h32Var);
                }
                j32Var.set(1, java.lang.Integer.valueOf(v2resp.f389251y.f373982f));
                j32Var.set(2, java.lang.Integer.valueOf(v2resp.f389251y.f373980d));
                j32Var.set(3, java.lang.Integer.valueOf(v2resp.f389251y.f373981e));
            }
        }
        com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogic", "click show more, finderusername = " + this.f154617e + ", initCount = " + j32Var.getList(0).size() + ", totalNotice = " + j32Var.getInteger(2) + ", totalReserve = " + j32Var.getInteger(3));
        java.lang.String UserName = b0Var.f154233b.f389233d.f383065d;
        kotlin.jvm.internal.o.f(UserName, "UserName");
        gr3.e.d(UserName, 1704, b0Var.f154235d, b0Var.f154232a.getIntent(), b0Var.f154248q, 0, 0, null, null, null, 0, 0, 4064, null);
        zy2.ic icVar = b0Var.f154247p;
        kotlin.jvm.internal.o.d(icVar);
        zy2.ic.a(icVar, j32Var, null, false, null, 0, 0, null, 126, null);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic$initMore$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
