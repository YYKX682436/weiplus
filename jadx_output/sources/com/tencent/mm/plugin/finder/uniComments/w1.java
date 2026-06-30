package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.a2 f130441d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.tencent.mm.plugin.finder.uniComments.a2 a2Var) {
        super(0);
        this.f130441d = a2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer e17 = this.f130441d.e();
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter = e17.footer;
        if (textStatusCommentFooter != null) {
            textStatusCommentFooter.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String();
        }
        int i17 = e17.sceneForReply == 2 ? 1 : 2;
        e17.sceneForReply = i17;
        com.tencent.mm.plugin.finder.storage.t70.f127590a.b3(i17);
        return jz5.f0.f302826a;
    }
}
