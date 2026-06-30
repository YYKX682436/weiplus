package vd2;

/* loaded from: classes3.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd2.a2 f436043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader f436044e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(vd2.a2 a2Var, com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader finderLiveRelatedLoader) {
        super(1);
        this.f436043d = a2Var;
        this.f436044e = finderLiveRelatedLoader;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        vd2.a2.a(this.f436043d, (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj, this.f436044e);
        return jz5.f0.f302826a;
    }
}
