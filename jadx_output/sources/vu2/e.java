package vu2;

/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vu2.f f440213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f440214e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f440215f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader f440216g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f440217h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f440218i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(vu2.f fVar, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader finderLocalFeedLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f440213d = fVar;
        this.f440214e = y0Var;
        this.f440215f = s3Var;
        this.f440216g = finderLocalFeedLoader;
        this.f440217h = lVar;
        this.f440218i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        vu2.f fVar = this.f440213d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f440214e;
        ym5.s3 s3Var = this.f440215f;
        fVar.convertOpToReason(y0Var, s3Var);
        this.f440216g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f440217h;
        if (lVar != null) {
            lVar.invoke(this.f440218i);
        }
        return jz5.f0.f302826a;
    }
}
