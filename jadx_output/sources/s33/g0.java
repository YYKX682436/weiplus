package s33;

/* loaded from: classes15.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s33.h0 f402492d;

    public g0(s33.h0 h0Var) {
        this.f402492d = h0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        s33.h0 h0Var = this.f402492d;
        u33.h hVar = (u33.h) h0Var.f402497d.get(h0Var.f402498e.f402503a);
        boolean z17 = s33.y.e(h0Var.f402498e.f402504b).f402490a;
        boolean z18 = s33.y.e(h0Var.f402498e.f402504b).f402491b;
        if (hVar == null || z17 || z18) {
            return;
        }
        com.tencent.mm.autogen.events.ChatRoomAtFunctionEvent chatRoomAtFunctionEvent = new com.tencent.mm.autogen.events.ChatRoomAtFunctionEvent();
        y33.e eVar = (y33.e) hVar;
        java.lang.String str = eVar.field_userName;
        am.b2 b2Var = chatRoomAtFunctionEvent.f54037g;
        b2Var.f6208a = str;
        b2Var.f6209b = eVar.field_nickName;
        chatRoomAtFunctionEvent.e();
    }
}
