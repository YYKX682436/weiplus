package yw2;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw2.n f466648d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yw2.n nVar) {
        super(0);
        this.f466648d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObj = this.f466648d.k().getFeedObj();
        return java.lang.Long.valueOf(feedObj != null ? feedObj.getId() : 0L);
    }
}
