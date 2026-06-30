package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class fc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.jc f118340d;

    public fc(com.tencent.mm.plugin.finder.live.widget.jc jcVar) {
        this.f118340d = jcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.jc.b(this.f118340d, true, false, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
