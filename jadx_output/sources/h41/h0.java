package h41;

/* loaded from: classes15.dex */
public final class h0 implements ey.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h41.i0 f278792a;

    public h0(h41.i0 i0Var) {
        this.f278792a = i0Var;
    }

    @Override // ey.t
    public java.lang.String a() {
        return com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE;
    }

    @Override // ey.t
    public java.lang.String b() {
        return "message::start_msg_typing";
    }

    @Override // ey.t
    public void c(com.tencent.wechat.aff.function_call.o notification) {
        java.lang.String str = "";
        kotlin.jvm.internal.o.g(notification, "notification");
        try {
            java.lang.String string = new org.json.JSONObject(notification.f216910h[4] ? notification.f216909g : "").getString("chat_id");
            kotlin.jvm.internal.o.f(string, "getString(...)");
            str = string;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCFunctionCallEventStubImpl", "ask confirm send msg parametersJson error " + e17);
        }
        if (str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCFunctionCallEventStubImpl", "ask confirm send msg chat_id empty");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCFunctionCallEventStubImpl", "start msg typing ".concat(str));
        com.tencent.wechat.aff.ovc.d dVar = this.f278792a.f278794a;
        if (dVar != null) {
            dVar.B1(str);
        }
    }
}
