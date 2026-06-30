package dk2;

/* loaded from: classes3.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.p0 f233885d = new dk2.p0();

    public p0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.a0 a0Var;
        zg2.d dVar;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null && (a0Var = (df2.a0) liveRoomControllerStore.controller(df2.a0.class)) != null && (dVar = a0Var.f229647m) != null) {
            dVar.postValue(null);
        }
        return jz5.f0.f302826a;
    }
}
