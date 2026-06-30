package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class au implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f117796d;

    public au(android.widget.CheckBox checkBox) {
        this.f117796d = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayGenWidget$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.CheckBox checkBox = this.f117796d;
        checkBox.setChecked(!checkBox.isChecked());
        com.tencent.mm.plugin.finder.assist.s3.f102523a.a(ml2.t1.f327977p3, java.lang.Integer.valueOf(checkBox.isChecked() ? 1 : 0));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayGenWidget$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
