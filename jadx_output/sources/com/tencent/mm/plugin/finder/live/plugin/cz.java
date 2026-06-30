package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class cz implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hz f112214d;

    public cz(com.tencent.mm.plugin.finder.live.plugin.hz hzVar) {
        this.f112214d = hzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveMultiStreamBubblePlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.hz hzVar = this.f112214d;
        ((mm2.h7) hzVar.P0(mm2.h7.class)).f329114f.postValue(java.lang.Boolean.TRUE);
        hzVar.v1();
        hzVar.w1();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMultiStreamBubblePlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
