package io2;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io2.e f293466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f293467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f293468f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.mine.FinderMemberCardListContract$FinderMemberCardListLoader f293469g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f293470h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f293471i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(io2.e eVar, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.member.mine.FinderMemberCardListContract$FinderMemberCardListLoader finderMemberCardListContract$FinderMemberCardListLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f293466d = eVar;
        this.f293467e = y0Var;
        this.f293468f = s3Var;
        this.f293469g = finderMemberCardListContract$FinderMemberCardListLoader;
        this.f293470h = lVar;
        this.f293471i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        io2.e eVar = this.f293466d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f293467e;
        ym5.s3 s3Var = this.f293468f;
        eVar.convertOpToReason(y0Var, s3Var);
        this.f293469g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f293470h;
        if (lVar != null) {
            lVar.invoke(this.f293471i);
        }
        return jz5.f0.f302826a;
    }
}
