package com.tencent.mm.plugin.finder.presenter.contract;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", ya.b.SUCCESS, "", "time", "Ljz5/f0;", "invoke", "(ZJ)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderMsgContract$convertCommentEmoji$1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f122907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f122908e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f122909f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f122910g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMsgContract$convertCommentEmoji$1(long j17, long j18, int i17, kotlin.jvm.internal.h0 h0Var) {
        super(2);
        this.f122907d = j17;
        this.f122908e = j18;
        this.f122909f = i17;
        this.f122910g = h0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        long longValue = ((java.lang.Number) obj2).longValue();
        com.tencent.mm.autogen.mmdata.rpt.FinderCommentResourceLoadingStruct finderCommentResourceLoadingStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderCommentResourceLoadingStruct();
        finderCommentResourceLoadingStruct.q(pm0.v.u(this.f122907d));
        finderCommentResourceLoadingStruct.p(pm0.v.u(this.f122908e));
        finderCommentResourceLoadingStruct.f56686f = this.f122909f;
        finderCommentResourceLoadingStruct.f56687g = !booleanValue ? 1L : 0L;
        finderCommentResourceLoadingStruct.f56688h = longValue;
        finderCommentResourceLoadingStruct.f56691k = finderCommentResourceLoadingStruct.b("EmoticonMd5", ((com.tencent.mm.api.IEmojiInfo) this.f122910g.f310123d).getMd5(), true);
        finderCommentResourceLoadingStruct.k();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(2091L, booleanValue ? 0L : 1L, 1L, false);
        return jz5.f0.f302826a;
    }
}
