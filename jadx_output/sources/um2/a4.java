package um2;

/* loaded from: classes3.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428715d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(um2.x5 x5Var) {
        super(0);
        this.f428715d = x5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        km2.m data;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore;
        um2.x5 x5Var = this.f428715d;
        fm2.c cVar = x5Var.f19606c;
        if (cVar != null && (data = cVar.getData()) != null && (liveRoomControllerStore = data.f309131f) != null) {
            if2.z.f291153a.i(liveRoomControllerStore, new mf2.g(liveRoomControllerStore));
        }
        zi2.w wVar = x5Var.I0;
        if (wVar != null) {
            wVar.D1();
        }
        return jz5.f0.f302826a;
    }
}
