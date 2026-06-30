package vd2;

/* loaded from: classes3.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd2.a2 f436026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.model.FinderLiveRelatedBaseLoader f436027e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(vd2.a2 a2Var, com.tencent.mm.plugin.finder.live.model.FinderLiveRelatedBaseLoader finderLiveRelatedBaseLoader) {
        super(1);
        this.f436026d = a2Var;
        this.f436027e = finderLiveRelatedBaseLoader;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        vd2.a2.a(this.f436026d, (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj, this.f436027e);
        return jz5.f0.f302826a;
    }
}
