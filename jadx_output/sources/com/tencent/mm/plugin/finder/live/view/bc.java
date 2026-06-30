package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class bc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.mc f116213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.lv1 f116214e;

    public bc(com.tencent.mm.plugin.finder.live.view.mc mcVar, r45.lv1 lv1Var) {
        this.f116213d = mcVar;
        this.f116214e = lv1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.p42 p42Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindAttendButton$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.mc mcVar = this.f116213d;
        mcVar.b("attendClick");
        mcVar.getClass();
        boolean z17 = true;
        r45.uv1 uv1Var = (r45.uv1) this.f116214e.getCustom(1);
        java.lang.String string = (uv1Var == null || (p42Var = (r45.p42) uv1Var.getCustom(10)) == null) ? null : p42Var.getString(2);
        if (string != null && string.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.w(mcVar.f116485c, "no noticeID");
        } else {
            com.tencent.mm.plugin.finder.live.util.y.d(mcVar.f116484b, null, null, new com.tencent.mm.plugin.finder.live.view.jc(string, mcVar, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindAttendButton$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
