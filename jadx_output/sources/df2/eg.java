package df2;

/* loaded from: classes3.dex */
public final class eg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ug f230058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f230059e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg(df2.ug ugVar, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore) {
        super(0);
        this.f230058d = ugVar;
        this.f230059e = liveRoomControllerStore;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new df2.dg(this.f230058d, this.f230059e);
    }
}
