package ye5;

/* loaded from: classes9.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView f461287d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView) {
        super(0);
        this.f461287d = chattingMediaGroupMvvmView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.e1 fromNewsJumpInfo;
        int i17 = 0;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView = this.f461287d;
        boolean z17 = (chattingMediaGroupMvvmView == null || chattingMediaGroupMvvmView.fromNewsJumpInfo == null) ? false : true;
        if (chattingMediaGroupMvvmView != null && (fromNewsJumpInfo = chattingMediaGroupMvvmView.getFromNewsJumpInfo()) != null) {
            i17 = fromNewsJumpInfo.f204784a;
        }
        return new jz5.l(java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
    }
}
