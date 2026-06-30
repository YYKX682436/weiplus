package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class gb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI f129293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f129294e;

    public gb(com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI finderMsgFeedDetailUI, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f129293d = finderMsgFeedDetailUI;
        this.f129294e = finderJumpInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc2.y2 y2Var = xc2.y2.f453343a;
        com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI finderMsgFeedDetailUI = this.f129293d;
        xc2.p0 p0Var = new xc2.p0(this.f129294e);
        p0Var.f453253o = "commentScene=" + this.f129293d.getD();
        xc2.y2.i(y2Var, finderMsgFeedDetailUI, p0Var, 0, null, 12, null);
    }
}
