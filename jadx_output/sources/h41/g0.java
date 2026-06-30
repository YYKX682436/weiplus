package h41;

/* loaded from: classes15.dex */
public final class g0 implements ey.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h41.i0 f278785a;

    public g0(h41.i0 i0Var) {
        this.f278785a = i0Var;
    }

    @Override // ey.k
    public java.lang.String a() {
        return com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE;
    }

    @Override // ey.k
    public java.lang.String b() {
        return "message::send_text_message";
    }

    @Override // ey.k
    public void c(com.tencent.wechat.aff.function_call.e notification) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(notification, "notification");
        try {
            str = new org.json.JSONObject(notification.b()).getString("chat_id");
        } catch (java.lang.Exception unused) {
            str = "";
        }
        kotlin.jvm.internal.o.d(str);
        boolean z17 = false;
        if (str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCFunctionCallEventStubImpl", "onSendTextMsgEnd: username is empty");
            return;
        }
        try {
            z17 = new org.json.JSONObject(notification.c()).getBoolean(ya.b.SUCCESS);
        } catch (java.lang.Exception unused2) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCFunctionCallEventStubImpl", "onSendTextMsgEnd: username " + str + ' ' + z17);
        com.tencent.wechat.aff.ovc.d dVar = this.f278785a.f278794a;
        if (dVar != null) {
            dVar.l1(str, z17);
        }
    }
}
