package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class fm implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.wm f118362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f118364f;

    public fm(com.tencent.mm.plugin.finder.live.widget.wm wmVar, java.lang.String str, int i17) {
        this.f118362d = wmVar;
        this.f118363e = str;
        this.f118364f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveKTVSendFlowerEntranceWidget$checkAndShowGuide$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.wm.m(this.f118362d, null, this.f118363e, this.f118364f, 1, null);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f118362d.f120220u;
        if (k0Var != null) {
            k0Var.u();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveKTVSendFlowerEntranceWidget$checkAndShowGuide$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
