package sm2;

/* loaded from: classes3.dex */
public final class w3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f409767e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(sm2.o4 o4Var, r45.xn1 xn1Var) {
        super(0);
        this.f409766d = o4Var;
        this.f409767e = xn1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        km2.m data;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore;
        qf2.v0 v0Var;
        sm2.o4 o4Var = this.f409766d;
        boolean isFinishing = o4Var.f19594b.isFinishing();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = o4Var.f19594b;
        if (isFinishing || appCompatActivity.isDestroyed()) {
            com.tencent.mars.xlog.Log.i(o4Var.f409610f, "onRandomMicAccept: context is dead:" + appCompatActivity);
        } else {
            fm2.a aVar = o4Var.f19595c;
            if (aVar != null && (data = aVar.getData()) != null && (liveRoomControllerStore = data.f309131f) != null && (v0Var = (qf2.v0) liveRoomControllerStore.controller(qf2.v0.class)) != null) {
                v0Var.b7(this.f409767e);
            }
        }
        return jz5.f0.f302826a;
    }
}
