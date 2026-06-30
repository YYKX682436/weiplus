package yk4;

/* loaded from: classes10.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.comment.view.TingCommentFooter f462831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uk4.e f462832e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter, uk4.e eVar) {
        super(1);
        this.f462831d = tingCommentFooter;
        this.f462832e = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter = this.f462831d;
        if (intValue != tingCommentFooter.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String()) {
            com.tencent.mm.plugin.ting.comment.view.TingCommentFooter.c(tingCommentFooter);
        }
        this.f462832e.b();
        return jz5.f0.f302826a;
    }
}
