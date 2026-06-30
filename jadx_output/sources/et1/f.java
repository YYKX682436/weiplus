package et1;

/* loaded from: classes12.dex */
public final class f extends et1.g implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final et1.a f256569d;

    public f(et1.a sendMsgInterceptorsImpl) {
        kotlin.jvm.internal.o.g(sendMsgInterceptorsImpl, "sendMsgInterceptorsImpl");
        this.f256569d = sendMsgInterceptorsImpl;
        gm0.j1.n().f273288b.a(3862, this);
    }

    @Override // et1.g, et1.l
    public w11.m1 c(w11.r1 r1Var) {
        w11.m1 m1Var = new w11.m1();
        if (r1Var instanceof m11.m1) {
            m11.m1 m1Var2 = (m11.m1) r1Var;
            int i17 = m1Var2.f442134i;
            if (i17 != 1 && i17 == 4) {
                et1.a aVar = this.f256569d;
                if (!aVar.o(r1Var)) {
                    return super.c(r1Var);
                }
                java.lang.String field_toUser = m1Var2.f322753r.field_toUser;
                kotlin.jvm.internal.o.f(field_toUser, "field_toUser");
                m1Var2.f442127b = aVar.t(field_toUser);
                m1Var2.f442128c = aVar.s(field_toUser);
                wf0.n1 n1Var = (wf0.n1) i95.n0.c(wf0.n1.class);
                java.lang.String str = m1Var2.f442141p;
                int i18 = m1Var2.f322752q;
                dn.h hVar = m1Var2.f322753r;
                m11.a0 a0Var = m1Var2.f322754s;
                ((vf0.q1) n1Var).getClass();
                m1Var.f442088a = new dt1.g(aVar.r(), field_toUser, m1Var2.f442128c, m1Var2.f442127b, new t21.q1(str, i18, hVar, a0Var));
            }
            return super.c(r1Var);
        }
        return m1Var;
    }

    @Override // et1.g, et1.l
    public w11.m1 f(w11.r1 r1Var) {
        w11.m1 m1Var = new w11.m1();
        if (r1Var instanceof m11.d) {
            m11.d dVar = (m11.d) r1Var;
            java.lang.String str = dVar.f442127b;
            et1.a aVar = this.f256569d;
            java.lang.String t17 = aVar.t(str);
            dVar.f442128c = aVar.s(str);
            m1Var.f442088a = new dt1.c(aVar.r(), str, dVar.f442128c, t17, dVar);
        }
        return m1Var;
    }

    @Override // et1.g, et1.l
    public w11.m1 l(w11.r1 r1Var) {
        return new w11.m1();
    }

    @Override // et1.g, et1.l
    public w11.m1 m(w11.r1 r1Var) {
        w11.m1 m1Var = new w11.m1();
        kotlin.jvm.internal.o.d(r1Var);
        java.lang.String str = r1Var.f442127b;
        et1.a aVar = this.f256569d;
        java.lang.String t17 = aVar.t(str);
        r1Var.f442128c = aVar.s(str);
        dt1.f fVar = new dt1.f(aVar.r(), str, r1Var.f442128c, t17, r1Var.f442129d, r1Var.f442132g);
        m1Var.f442089b = fVar.f243153p.getMsgId();
        m1Var.f442088a = fVar;
        return m1Var;
    }

    @Override // et1.g, et1.l
    public void n() {
        gm0.j1.n().f273288b.q(3862, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof dt1.a) {
            r45.fr frVar = ((dt1.a) m1Var).f243128g.f384217e;
            int i19 = frVar.f374555d;
            this.f256569d.u(frVar.f374557f, i17, i18, str, m1Var);
        }
    }
}
