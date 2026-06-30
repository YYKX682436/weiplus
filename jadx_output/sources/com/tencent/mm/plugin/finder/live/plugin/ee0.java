package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ee0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.le0 f112403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f112404e;

    public ee0(com.tencent.mm.plugin.finder.live.plugin.le0 le0Var, android.view.ViewGroup viewGroup) {
        this.f112403d = le0Var;
        this.f112404e = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVideoOrientationPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.le0 le0Var = this.f112403d;
        ((mm2.c1) le0Var.P0(mm2.c1.class)).R5 = true;
        android.view.ViewGroup viewGroup = this.f112404e;
        if (viewGroup.getAlpha() <= 0.0f || le0Var.f113387p.getAlpha() <= 0.0f) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVideoOrientationPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (viewGroup.getContext().getResources().getConfiguration().orientation == 1) {
            le0Var.getClass();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("ACTION_POST_LANDSCAPE", "LANDSCAPE_ACTION_CHANGE_VIDEO");
            ((mm2.c1) le0Var.P0(mm2.c1.class)).f328853o2 = new km2.i("EVENT_POST_LANDSCAPE_ACTION", bundle, null);
            le0Var.R0().onLandscapeAction(((mm2.c1) le0Var.P0(mm2.c1.class)).f328813h2, ((mm2.c1) le0Var.P0(mm2.c1.class)).f328807g2, bundle, null);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.f327987t, kz5.c1.l(new jz5.l("screen_type", "1")), null, null, null, null, false, 124, null);
        } else {
            com.tencent.mm.plugin.finder.live.plugin.l.q1(le0Var, "PORTRAIT_ACTION_CHANGE_VIDEO", null, 2, null);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.T8((zy2.zb) c18, ml2.t1.f327987t, kz5.c1.l(new jz5.l("screen_type", "2")), null, null, null, null, false, 124, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVideoOrientationPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
