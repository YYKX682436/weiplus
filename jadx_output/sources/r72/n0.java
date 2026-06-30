package r72;

/* loaded from: classes16.dex */
public abstract class n0 {
    public static final jz5.l a(r72.m0 urlItem) {
        kotlin.jvm.internal.o.g(urlItem, "urlItem");
        r45.tq0 tq0Var = new r45.tq0();
        tq0Var.i(urlItem.k());
        tq0Var.j(urlItem.t());
        tq0Var.o(urlItem.u());
        tq0Var.p(urlItem.w());
        if (com.tencent.mm.sdk.platformtools.t8.K0(tq0Var.f386664d) && !com.tencent.mm.sdk.platformtools.t8.K0(urlItem.x())) {
            tq0Var.p(urlItem.x());
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(tq0Var.f386666f) && !com.tencent.mm.sdk.platformtools.t8.K0(urlItem.o())) {
            tq0Var.j(urlItem.o());
        }
        tq0Var.n(urlItem.s());
        tq0Var.f386674q = urlItem.l();
        tq0Var.f386675r = true;
        tq0Var.f386676s = urlItem.j();
        tq0Var.f386677t = true;
        tq0Var.k(urlItem.p());
        tq0Var.q(urlItem.y());
        tq0Var.l(urlItem.q());
        java.util.LinkedList n17 = urlItem.n();
        tq0Var.f386682y.clear();
        java.util.Iterator it = n17.iterator();
        while (it.hasNext()) {
            r72.j jVar = (r72.j) it.next();
            r45.np0 np0Var = new r45.np0();
            np0Var.f381565e = jVar.getContent();
            np0Var.f381564d = jVar.j();
            np0Var.f381566f = jVar.k();
            tq0Var.f386682y.add(np0Var);
        }
        r45.qp0 qp0Var = new r45.qp0();
        r72.o0 r17 = urlItem.r();
        if (r17 != null) {
            qp0Var = new r45.qp0();
            qp0Var.f384168m = r17.r();
            qp0Var.f384169n = r17.q();
            qp0Var.f384170o = r17.p();
            qp0Var.f384173r = r17.j();
            qp0Var.f384162d = r17.l();
            qp0Var.f384176u = r17.u();
            qp0Var.f384163e = r17.n();
            qp0Var.f384164f = r17.t();
            qp0Var.f384165g = r17.s();
            qp0Var.f384166h = r17.o();
            qp0Var.f384167i = r17.k();
            qp0Var.f384171p = r17.getFuncFlag();
        }
        return new jz5.l(tq0Var, qp0Var);
    }

    public static final r72.m0 b(r45.tq0 originUrl, r45.qp0 qp0Var) {
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(originUrl, "originUrl");
        r72.m0 m0Var = new r72.m0();
        if (originUrl.f386669i) {
            m0Var.A(originUrl.f386668h);
        }
        if (originUrl.f386667g) {
            m0Var.I(originUrl.f386666f);
        }
        if (originUrl.f386671n) {
            m0Var.J(originUrl.f386670m);
        }
        if (originUrl.f386665e) {
            m0Var.K(originUrl.f386664d);
        }
        if (originUrl.f386665e) {
            m0Var.L(originUrl.f386664d);
        }
        if (originUrl.f386667g) {
            m0Var.C(originUrl.f386666f);
        }
        if (originUrl.f386673p) {
            m0Var.H(originUrl.f386672o);
        }
        if (originUrl.f386675r) {
            m0Var.B(originUrl.f386674q);
        }
        if (originUrl.f386677t) {
            m0Var.z(originUrl.f386676s);
        }
        if (originUrl.B) {
            m0Var.E(originUrl.A);
        }
        if (originUrl.f386679v) {
            m0Var.N(originUrl.f386678u);
        }
        if (originUrl.f386681x) {
            m0Var.F(originUrl.f386680w);
        }
        if (originUrl.f386683z && (linkedList = originUrl.f386682y) != null && linkedList.size() != 0) {
            java.util.Iterator it = originUrl.f386682y.iterator();
            while (it.hasNext()) {
                r45.np0 np0Var = (r45.np0) it.next();
                r72.j jVar = new r72.j();
                jVar.o(np0Var.f381566f);
                jVar.n(np0Var.f381564d);
                jVar.l(np0Var.f381565e);
                m0Var.n().add(jVar);
            }
        }
        if (qp0Var != null) {
            r72.o0 o0Var = new r72.o0();
            o0Var.G(qp0Var.f384168m);
            o0Var.F(qp0Var.f384169n);
            o0Var.E(qp0Var.f384170o);
            o0Var.w(qp0Var.f384173r);
            o0Var.z(qp0Var.f384162d);
            o0Var.B(qp0Var.f384176u);
            o0Var.A(qp0Var.f384163e);
            o0Var.I(qp0Var.f384164f);
            o0Var.H(qp0Var.f384165g);
            o0Var.C(qp0Var.f384166h);
            o0Var.x(qp0Var.f384167i);
            o0Var.y(qp0Var.f384171p);
            m0Var.G(o0Var);
        }
        return m0Var;
    }
}
