package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter f130293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f130294e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter, com.tencent.mm.plugin.finder.view.e3 e3Var) {
        super(1);
        this.f130293d = textStatusCommentFooter;
        this.f130294e = e3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter = this.f130293d;
        if (intValue != textStatusCommentFooter.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String()) {
            com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter.b(textStatusCommentFooter);
        }
        this.f130294e.h();
        return jz5.f0.f302826a;
    }
}
