package s33;

/* loaded from: classes15.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f402497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s33.i0 f402498e;

    public h0(s33.i0 i0Var, java.util.Map map) {
        this.f402498e = i0Var;
        this.f402497d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = this.f402497d;
        if (map == null || !map.containsKey(this.f402498e.f402503a)) {
            return;
        }
        com.tencent.mm.autogen.events.ChatRoomLocateInfoEvent chatRoomLocateInfoEvent = new com.tencent.mm.autogen.events.ChatRoomLocateInfoEvent();
        am.d2 d2Var = chatRoomLocateInfoEvent.f54039g;
        d2Var.f6428a = 0;
        d2Var.f6430c = false;
        chatRoomLocateInfoEvent.e();
        ku5.u0 u0Var = ku5.t0.f312615d;
        s33.g0 g0Var = new s33.g0(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(g0Var, 200L, false);
    }
}
