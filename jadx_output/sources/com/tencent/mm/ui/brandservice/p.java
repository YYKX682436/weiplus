package com.tencent.mm.ui.brandservice;

/* loaded from: classes.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.brandservice.r f198061d;

    public p(com.tencent.mm.ui.brandservice.r rVar) {
        this.f198061d = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/brandservice/BrsTimelineNotificationAutoNotifyEducationDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.brandservice.r rVar = this.f198061d;
        rVar.getClass();
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar2 != null) {
            ((cy1.a) rVar2).Bj("brs_timeline_auto_notify_education_view", "view_clk", kz5.c1.k(new jz5.l("button_name", "know"), new jz5.l("view_name", "brs_timeline_auto_notify_education")), 12, false);
        }
        rVar.dismiss();
        yj0.a.h(this, "com/tencent/mm/ui/brandservice/BrsTimelineNotificationAutoNotifyEducationDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
