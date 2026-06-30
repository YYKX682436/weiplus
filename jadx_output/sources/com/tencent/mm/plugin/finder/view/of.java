package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class of implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.rf f132787d;

    public of(com.tencent.mm.plugin.finder.view.rf rfVar) {
        this.f132787d = rfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderMusicTipsBubbleWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.rf rfVar = this.f132787d;
        android.view.View.OnClickListener onClickListener = rfVar.f132954c;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        rfVar.dismiss();
        android.view.View contentView = rfVar.getContentView();
        if (contentView != null) {
            contentView.removeCallbacks(new com.tencent.mm.plugin.finder.view.qf(rfVar.f132958g));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderMusicTipsBubbleWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
