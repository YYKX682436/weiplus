package dk2;

/* loaded from: classes3.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.zv1 f233711d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(r45.zv1 zv1Var) {
        super(0);
        this.f233711d = zv1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.c9 c9Var;
        zg2.d dVar;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null && (c9Var = (df2.c9) liveRoomControllerStore.controller(df2.c9.class)) != null && (dVar = c9Var.f229867m) != null) {
            dVar.postValue(this.f233711d);
        }
        return jz5.f0.f302826a;
    }
}
