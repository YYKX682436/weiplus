package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes5.dex */
public final class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f204823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView f204824e;

    public l0(yz5.l lVar, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView chattingMediaGroupVideoItemMvvmView) {
        this.f204823d = lVar;
        this.f204824e = chattingMediaGroupVideoItemMvvmView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$bindNewViewModel$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f204823d.invoke(java.lang.Boolean.valueOf(this.f204824e.f204727n instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.State.Preparing.Uploading.UploadingOrigin));
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupVideoItemMvvmView$bindNewViewModel$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
