package df2;

/* loaded from: classes3.dex */
public final class s00 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.u00 f231281d;

    public s00(df2.u00 u00Var) {
        this.f231281d = u00Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/VisitorDefinitionController$onViewMount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        df2.u00 u00Var = this.f231281d;
        if (z17) {
            com.tencent.mars.xlog.Log.i(u00Var.f231487m, "rootView FastClick!");
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/VisitorDefinitionController$onViewMount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        u00Var.b7(2);
        com.tencent.mm.plugin.finder.live.widget.sx sxVar = com.tencent.mm.plugin.finder.live.widget.yx.f120478f;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (sxVar.b(context, u00Var.getStore().getLiveRoomData())) {
            android.content.Context context2 = view.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            u00Var.f231491q = new com.tencent.mm.plugin.finder.live.widget.yx(context2, u00Var.getStore().getLiveRoomData());
            com.tencent.mm.plugin.finder.live.widget.yx yxVar = u00Var.f231491q;
            if (yxVar != null) {
                yxVar.f120482d = u00Var.a7();
            }
            com.tencent.mm.plugin.finder.live.widget.yx yxVar2 = u00Var.f231491q;
            if (yxVar2 != null) {
                yxVar2.b(u00Var.U6(), 3);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/VisitorDefinitionController$onViewMount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
