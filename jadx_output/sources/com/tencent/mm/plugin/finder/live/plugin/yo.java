package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class yo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ap f115221d;

    public yo(com.tencent.mm.plugin.finder.live.plugin.ap apVar) {
        this.f115221d = apVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$updateGiftWallView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((mm2.f7) this.f115221d.P0(mm2.f7.class)).f329060h.postValue(new mm2.a7(true, null, 2, null));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$updateGiftWallView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
