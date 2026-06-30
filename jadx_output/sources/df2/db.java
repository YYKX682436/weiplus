package df2;

/* loaded from: classes3.dex */
public final class db implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.zb f229962d;

    public db(df2.zb zbVar) {
        this.f229962d = zbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController$onViewMount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zl2.r4 r4Var = zl2.r4.f473950a;
        df2.zb zbVar = this.f229962d;
        boolean t17 = r4Var.t1(zbVar.getStore().getLiveRoomData());
        r45.n72 n72Var = r45.n72.kActionType_AiassistantExposed;
        if (t17 && zbVar.n7()) {
            com.tencent.mars.xlog.Log.i(zbVar.f231939m, "[aiAssistant] smallBanner clicked, voice dialog enabled, trigger wakeup");
            zbVar.q7(2);
            zbVar.s7(n72Var, 2, "");
            zbVar.o7("banner_click");
        } else {
            com.tencent.mars.xlog.Log.i(zbVar.f231939m, "[aiAssistant] smallBanner clicked, expand normal banner");
            df2.zb.w7(zbVar, true, null, 2, null);
            zbVar.q7(2);
            zbVar.s7(n72Var, 2, "");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController$onViewMount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
