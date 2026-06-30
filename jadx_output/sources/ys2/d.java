package ys2;

/* loaded from: classes3.dex */
public final class d extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public if2.d0 f465147m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f465148n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f465149o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) pluginLayout.findViewById(com.tencent.mm.R.id.fk7);
        kotlin.jvm.internal.o.d(viewGroup);
        this.f465147m = new if2.d0(viewGroup, this);
        this.f465148n = viewGroup.findViewById(com.tencent.mm.R.id.f486329kx1);
        this.f465149o = viewGroup.findViewById(com.tencent.mm.R.id.pnt);
        this.f291103i = new ys2.a(this);
        boolean z17 = ((ct2.j) business(ct2.j.class)).f222265f;
        ml2.z0 z0Var = ml2.z0.f328330a;
        if (z17) {
            android.view.View view = this.f465148n;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View view2 = this.f465148n;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = this.f465148n;
            if (view3 != null) {
                view3.setOnClickListener(new ys2.b(this));
            }
            zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
            ml2.o3[] o3VarArr = ml2.o3.f327773d;
            java.lang.String jSONObject = ml2.z0.b(z0Var, null, 1, null).toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            ((ml2.j0) zbVar).Wj("watch_live_speed_exp", jSONObject);
        }
        r45.i72 i72Var = (r45.i72) ((mm2.e1) business(mm2.e1.class)).f328988r.getCustom(44);
        java.util.LinkedList list = i72Var != null ? i72Var.getList(7) : null;
        if (list == null || list.isEmpty()) {
            android.view.View view4 = this.f465149o;
            if (view4 == null) {
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view5 = this.f465149o;
        if (view5 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view6 = this.f465149o;
        if (view6 != null) {
            view6.setOnClickListener(new ys2.c(this));
        }
        zy2.zb zbVar2 = (zy2.zb) i95.n0.c(zy2.zb.class);
        ml2.o3[] o3VarArr2 = ml2.o3.f327773d;
        java.lang.String jSONObject2 = ml2.z0.b(z0Var, null, 1, null).toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        ((ml2.j0) zbVar2).Wj("watch_live_wonderful_button_exp", jSONObject2);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f465147m = null;
        this.f465148n = null;
        this.f465149o = null;
    }
}
