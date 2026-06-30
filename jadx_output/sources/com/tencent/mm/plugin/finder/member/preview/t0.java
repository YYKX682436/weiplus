package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.u0 f121277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f121278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f121279f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader f121280g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f121281h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f121282i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.tencent.mm.plugin.finder.member.preview.u0 u0Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader finderPreviewFeedListLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f121277d = u0Var;
        this.f121278e = y0Var;
        this.f121279f = s3Var;
        this.f121280g = finderPreviewFeedListLoader;
        this.f121281h = lVar;
        this.f121282i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.member.preview.u0 u0Var = this.f121277d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f121278e;
        ym5.s3 s3Var = this.f121279f;
        u0Var.convertOpToReason(y0Var, s3Var);
        this.f121280g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f121281h;
        if (lVar != null) {
            lVar.invoke(this.f121282i);
        }
        return jz5.f0.f302826a;
    }
}
