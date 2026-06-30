package df2;

/* loaded from: classes3.dex */
public final class xv extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.yv f231806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f231807e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv(df2.yv yvVar, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore) {
        super(0);
        this.f231806d = yvVar;
        this.f231807e = liveRoomControllerStore;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new jk2.l(new df2.wv(this.f231806d, this.f231807e));
    }
}
