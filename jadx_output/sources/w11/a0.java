package w11;

/* loaded from: classes12.dex */
public final class a0 {

    /* renamed from: a */
    public static final w11.a0 f441966a = new w11.a0();

    /* renamed from: b */
    public static final java.util.Map f441967b = new java.util.LinkedHashMap();

    public static /* synthetic */ void b(w11.a0 a0Var, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, int i17, int i18, java.lang.String str, boolean z17, int i19, java.lang.Object obj) {
        if ((i19 & 16) != 0) {
            z17 = false;
        }
        a0Var.a(msgIdTalker, i17, i18, str, z17);
    }

    public final void a(com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, int i17, int i18, java.lang.String str, boolean z17) {
        kotlin.jvm.internal.o.g(msgIdTalker, "msgIdTalker");
        java.util.Map map = f441967b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        if (str == null) {
            str = "no msg";
        }
        map.put(msgIdTalker, new jz5.o(valueOf, valueOf2, str));
        if (z17) {
            ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).getClass();
            pm0.v.Q("AndroidSendMsgFailReport", false, new hm.d(null, msgIdTalker, hm.f.f282148i.a()), 5000L, 2, null);
        }
    }
}
