package rb2;

/* loaded from: classes10.dex */
public final class h2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f393644d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(so2.y0 y0Var) {
        super(2);
        this.f393644d = y0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        long longValue = ((java.lang.Number) obj2).longValue();
        com.tencent.mm.autogen.mmdata.rpt.FinderCommentResourceLoadingStruct finderCommentResourceLoadingStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderCommentResourceLoadingStruct();
        so2.y0 y0Var = this.f393644d;
        finderCommentResourceLoadingStruct.q(pm0.v.u(y0Var.f410703d.field_feedId));
        finderCommentResourceLoadingStruct.p(pm0.v.u(y0Var.f410703d.t0()));
        finderCommentResourceLoadingStruct.f56686f = 1L;
        finderCommentResourceLoadingStruct.f56687g = !booleanValue ? 1L : 0L;
        finderCommentResourceLoadingStruct.f56688h = longValue;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = y0Var.f410714r;
        finderCommentResourceLoadingStruct.f56691k = finderCommentResourceLoadingStruct.b("EmoticonMd5", iEmojiInfo != null ? iEmojiInfo.getMd5() : null, true);
        finderCommentResourceLoadingStruct.k();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(2091L, booleanValue ? 0L : 1L, 1L, false);
        return jz5.f0.f302826a;
    }
}
