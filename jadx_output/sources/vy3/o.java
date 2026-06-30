package vy3;

/* loaded from: classes.dex */
public final class o extends wy3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final vy3.o f441479e = new vy3.o();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) ((java.util.HashMap) msg.f340790a).get("content");
        if (str == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSend", "ScanJsApi-Call:send");
        if (str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSend", "ScanJsApi-Call:send text is empty");
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_content", str);
            intent.putExtra("Retr_Msg_Type", 4);
            intent.putExtra("Retr_show_success_tips", false);
            android.content.Context context = env.f340860a;
            if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
                int hashCode = hashCode() & 65535;
                android.content.Context context2 = env.f340860a;
                kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
                j45.l.x((com.tencent.mm.ui.MMFragmentActivity) context2, "com.tencent.mm.ui.transmit.MsgRetransmitUI", intent, hashCode, new vy3.n(this, env));
            } else {
                j45.l.u(context, "com.tencent.mm.ui.transmit.MsgRetransmitUI", intent, null);
                ((ku5.t0) ku5.t0.f312615d).B(new vy3.m(env));
            }
        }
        env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", null);
        return true;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "send";
    }
}
