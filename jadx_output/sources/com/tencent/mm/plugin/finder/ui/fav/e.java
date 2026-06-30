package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.f f129158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f129159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f129160f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoader f129161g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f129162h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f129163i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.finder.ui.fav.f fVar, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoader finderGlobalFavLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f129158d = fVar;
        this.f129159e = y0Var;
        this.f129160f = s3Var;
        this.f129161g = finderGlobalFavLoader;
        this.f129162h = lVar;
        this.f129163i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.ui.fav.f fVar = this.f129158d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f129159e;
        ym5.s3 s3Var = this.f129160f;
        fVar.convertOpToReason(y0Var, s3Var);
        this.f129161g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f129162h;
        if (lVar != null) {
            lVar.invoke(this.f129163i);
        }
        return jz5.f0.f302826a;
    }
}
