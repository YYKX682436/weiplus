package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class j4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.UniCommentFooter f130276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f130277e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(com.tencent.mm.plugin.finder.uniComments.UniCommentFooter uniCommentFooter, com.tencent.mm.plugin.finder.view.e3 e3Var) {
        super(1);
        this.f130276d = uniCommentFooter;
        this.f130277e = e3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.finder.uniComments.UniCommentFooter uniCommentFooter = this.f130276d;
        if (intValue != uniCommentFooter.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String()) {
            com.tencent.mm.plugin.finder.uniComments.UniCommentFooter.b(uniCommentFooter);
        }
        this.f130277e.h();
        return jz5.f0.f302826a;
    }
}
