package jk2;

/* loaded from: classes2.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f300062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx2.q f300063e;

    public c(android.app.Activity activity, gx2.q qVar) {
        this.f300062d = activity;
        this.f300063e = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/guide/LiveEntranceEducationDialogHelper$checkShowEducationDialog$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f328008y3, new java.util.HashMap(), null, "135", null, null, false, 116, null);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_START_HALF_ACTIVITY_PREFERENCE", "settings_finder_live_switch");
        java.lang.Long FINDER_SHARE_ENTER_TIMELINE = com.tencent.mm.ui.t2.f209869c;
        kotlin.jvm.internal.o.f(FINDER_SHARE_ENTER_TIMELINE, "FINDER_SHARE_ENTER_TIMELINE");
        intent.putExtra("KEY_ENTER_SCENE", FINDER_SHARE_ENTER_TIMELINE.longValue());
        i95.m c18 = i95.n0.c(wd0.z1.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ((vd0.o3) ((wd0.z1) c18)).Zi(this.f300062d, intent);
        com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(this.f300063e, false, null, false, null, 15, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/guide/LiveEntranceEducationDialogHelper$checkShowEducationDialog$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
