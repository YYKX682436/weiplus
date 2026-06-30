package kc5;

/* loaded from: classes9.dex */
public final class q implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f306575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f306576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f306577c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc5.s f306578d;

    public q(yz5.a aVar, yz5.a aVar2, android.view.View view, kc5.s sVar) {
        this.f306575a = aVar;
        this.f306576b = aVar2;
        this.f306577c = view;
        this.f306578d = sVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.e1 fromNewsJumpInfo;
        java.util.List list = (java.util.List) this.f306575a.invoke();
        java.util.List list2 = (java.util.List) this.f306576b.invoke();
        android.view.View view = this.f306577c;
        boolean z17 = view instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView = z17 ? (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView) view : null;
        int i17 = 0;
        boolean z18 = (chattingMediaGroupMvvmView == null || chattingMediaGroupMvvmView.fromNewsJumpInfo == null) ? false : true;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView2 = z17 ? (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView) view : null;
        if (chattingMediaGroupMvvmView2 != null && (fromNewsJumpInfo = chattingMediaGroupMvvmView2.getFromNewsJumpInfo()) != null) {
            i17 = fromNewsJumpInfo.f204784a;
        }
        kc5.s sVar = this.f306578d;
        kotlin.jvm.internal.o.d(str);
        return sVar.Ai(str, list, list2, z18, i17);
    }
}
