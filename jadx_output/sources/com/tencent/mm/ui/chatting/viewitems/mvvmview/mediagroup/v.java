package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes12.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView f204864d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView) {
        super(0);
        this.f204864d = chattingMediaGroupMvvmView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List<android.view.View> childrenList;
        childrenList = this.f204864d.getChildrenList();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(childrenList, 10));
        for (android.view.View view : childrenList) {
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView<*>");
            arrayList.add(new jz5.l(view, ((com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView) view).getBitmap()));
        }
        return arrayList;
    }
}
