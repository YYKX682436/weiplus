package et1;

/* loaded from: classes8.dex */
public abstract class e extends ct1.c {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f256567h = "BasePrivateMsgReceiveHandler";

    /* renamed from: i, reason: collision with root package name */
    public final et1.d f256568i = new et1.d(this);

    @Override // ct1.c
    public boolean b(r45.w3 rawBypMsg) {
        kotlin.jvm.internal.o.g(rawBypMsg, "rawBypMsg");
        if (u(rawBypMsg)) {
            return false;
        }
        java.lang.String str = rawBypMsg.f388827e;
        kotlin.jvm.internal.o.d(str);
        java.lang.Object q17 = q(str);
        if (!x(q17, rawBypMsg)) {
            return true;
        }
        java.lang.String msg_session_id = rawBypMsg.f388827e;
        kotlin.jvm.internal.o.f(msg_session_id, "msg_session_id");
        v(q17, msg_session_id);
        return true;
    }

    @Override // ct1.c
    public vg3.z4 k() {
        return this.f256568i;
    }

    public abstract java.lang.Object q(java.lang.String str);

    public java.lang.String r(r45.w3 rawBypMsg) {
        kotlin.jvm.internal.o.g(rawBypMsg, "rawBypMsg");
        java.lang.String g17 = x51.j1.g(rawBypMsg.f388826d.f377558e);
        java.lang.String g18 = x51.j1.g(rawBypMsg.f388826d.f377559f);
        if (rawBypMsg.f388830h) {
            kotlin.jvm.internal.o.d(g17);
            return g17;
        }
        kotlin.jvm.internal.o.d(g18);
        return g18;
    }

    public java.lang.String s(r45.w3 rawBypMsg) {
        kotlin.jvm.internal.o.g(rawBypMsg, "rawBypMsg");
        java.lang.String g17 = x51.j1.g(rawBypMsg.f388826d.f377558e);
        java.lang.String g18 = x51.j1.g(rawBypMsg.f388826d.f377559f);
        if (rawBypMsg.f388830h) {
            kotlin.jvm.internal.o.d(g18);
            return g18;
        }
        kotlin.jvm.internal.o.d(g17);
        return g17;
    }

    public java.lang.String t() {
        return this.f256567h;
    }

    public boolean u(r45.w3 rawBypMsg) {
        kotlin.jvm.internal.o.g(rawBypMsg, "rawBypMsg");
        com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(rawBypMsg.f388827e, rawBypMsg.f388826d.f377568r);
        kotlin.jvm.internal.o.f(o27, "getBySvrId(...)");
        if (o27.getMsgId() == 0) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(t(), "msg already exist");
        return true;
    }

    public abstract void v(java.lang.Object obj, java.lang.String str);

    public abstract boolean x(java.lang.Object obj, r45.w3 w3Var);
}
