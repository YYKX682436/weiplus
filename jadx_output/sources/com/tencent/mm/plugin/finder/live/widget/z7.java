package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class z7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.i8 f120547d;

    public z7(com.tencent.mm.plugin.finder.live.widget.i8 i8Var) {
        this.f120547d = i8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.i8.e0(this.f120547d);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
