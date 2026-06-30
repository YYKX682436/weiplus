package jr4;

/* loaded from: classes11.dex */
public final class i extends et1.a implements et1.n {
    @Override // et1.l
    public boolean k(w11.r1 r1Var) {
        kotlin.jvm.internal.o.d(r1Var);
        return com.tencent.mm.storage.z3.J4(r1Var.f442127b) || o(r1Var);
    }

    @Override // et1.a, et1.l
    public w11.m1 m(w11.r1 r1Var) {
        w11.m1 m1Var = new w11.m1();
        kotlin.jvm.internal.o.d(r1Var);
        java.lang.String str = r1Var.f442127b;
        java.lang.String z07 = ((fr4.g0) i95.n0.c(fr4.g0.class)).Vi().z0(str);
        r1Var.f442128c = ((fr4.g0) i95.n0.c(fr4.g0.class)).Di();
        m1Var.f442088a = ((px.c) ((qx.e0) i95.n0.c(qx.e0.class))).Ai(20, str, r1Var.f442128c, z07, r1Var.f442129d, r1Var.f442132g);
        return m1Var;
    }

    @Override // et1.a
    public boolean o(w11.r1 params) {
        kotlin.jvm.internal.o.g(params, "params");
        if (!(params instanceof m11.m1)) {
            return false;
        }
        java.lang.String str = params.f442141p;
        java.lang.String str2 = com.tencent.mm.storage.v3.f196273a;
        return str != null && str.endsWith("zhugemsg");
    }

    @Override // et1.a
    public int r() {
        return 20;
    }

    @Override // et1.a
    public java.lang.String s(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        java.lang.String str = ((fr4.g0) i95.n0.c(fr4.g0.class)).Vi().y0(sessionId).field_selfUserName;
        return str == null ? "" : str;
    }

    @Override // et1.a
    public java.lang.String t(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        return ((fr4.g0) i95.n0.c(fr4.g0.class)).Vi().z0(sessionId);
    }

    @Override // et1.a
    public void u(java.lang.String str, int i17, int i18, java.lang.String str2, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("W1wPersonalMsg.MsgInterceptor", "w1wpersonalmsg cgi callback, errCode: " + i18 + ", errMsg: " + str2);
    }
}
