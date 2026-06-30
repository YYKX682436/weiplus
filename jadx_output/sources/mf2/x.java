package mf2;

/* loaded from: classes3.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f326097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f326098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f326099f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, int i17, android.os.Bundle bundle) {
        super(0);
        this.f326097d = liveRoomControllerStore;
        this.f326098e = i17;
        this.f326099f = bundle;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        for (java.lang.Object obj : this.f326097d.getControllers()) {
            mf2.v vVar = obj instanceof mf2.v ? (mf2.v) obj : null;
            if (vVar != null) {
                vVar.s6(this.f326098e, this.f326099f);
            }
        }
        return jz5.f0.f302826a;
    }
}
