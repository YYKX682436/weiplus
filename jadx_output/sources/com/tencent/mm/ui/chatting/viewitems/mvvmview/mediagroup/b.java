package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes5.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView f204772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f204773e;

    public b(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView chattingMediaGroupBaseItemMvvmView, android.view.View.OnClickListener onClickListener) {
        this.f204772d = chattingMediaGroupBaseItemMvvmView;
        this.f204773e = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupBaseItemMvvmView$setClickOnlyListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f204772d.isTopView) {
            this.f204773e.onClick(view);
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupBaseItemMvvmView$setClickOnlyListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMediaGroupBaseItemMvvmView", "clickOnlyListener, not topView, skip");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupBaseItemMvvmView$setClickOnlyListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
