package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class iz implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f118709d;

    public iz(android.widget.CheckBox checkBox) {
        this.f118709d = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$Companion$jumpGame$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Uj((ml2.r0) c17, 28, 0, null, null, 14, null);
        this.f118709d.setChecked(!r9.isChecked());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$Companion$jumpGame$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
