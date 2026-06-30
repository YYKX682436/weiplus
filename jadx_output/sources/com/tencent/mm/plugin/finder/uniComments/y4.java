package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class y4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.a5 f130464d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(com.tencent.mm.plugin.finder.uniComments.a5 a5Var) {
        super(0);
        this.f130464d = a5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer h17 = this.f130464d.h();
        com.tencent.mm.plugin.finder.uniComments.UniCommentFooter uniCommentFooter = h17.footer;
        if (uniCommentFooter != null) {
            uniCommentFooter.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String();
        }
        int i17 = h17.sceneForReply == 2 ? 1 : 2;
        h17.sceneForReply = i17;
        com.tencent.mm.plugin.finder.storage.t70.f127590a.b3(i17);
        return jz5.f0.f302826a;
    }
}
