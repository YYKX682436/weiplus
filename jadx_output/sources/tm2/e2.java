package tm2;

/* loaded from: classes3.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f420504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(tm2.s2 s2Var) {
        super(0);
        this.f420504d = s2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        km2.m data;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore;
        tm2.s2 s2Var = this.f420504d;
        fm2.b bVar = s2Var.f19601c;
        if (bVar != null && (data = bVar.getData()) != null && (liveRoomControllerStore = data.f309131f) != null) {
            if2.z.f291153a.i(liveRoomControllerStore, new mf2.g(liveRoomControllerStore));
        }
        zi2.w wVar = s2Var.f420590h0;
        if (wVar != null) {
            wVar.D1();
        }
        return jz5.f0.f302826a;
    }
}
