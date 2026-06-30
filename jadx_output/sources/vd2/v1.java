package vd2;

/* loaded from: classes3.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd2.a2 f435939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader f435940e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(vd2.a2 a2Var, com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader finderLiveRelatedLoader) {
        super(1);
        this.f435939d = a2Var;
        this.f435940e = finderLiveRelatedLoader;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        vd2.a2.a(this.f435939d, (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj, this.f435940e);
        return jz5.f0.f302826a;
    }
}
