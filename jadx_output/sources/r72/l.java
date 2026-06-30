package r72;

/* loaded from: classes16.dex */
public abstract class l {
    public static final void a(r72.k kVar, o72.r2 favItemInfo) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(kVar, "<this>");
        kotlin.jvm.internal.o.g(favItemInfo, "favItemInfo");
        r45.bq0 bq0Var = favItemInfo.field_favProto;
        kVar.W(favItemInfo.field_type);
        java.lang.String str2 = bq0Var.f370972q;
        if (str2 != null) {
            kVar.U(str2);
        }
        java.lang.String str3 = bq0Var.f370974s;
        if (str3 != null) {
            kVar.H(str3);
        }
        long j17 = bq0Var.A;
        if (j17 > 0) {
            kVar.J(j17);
        }
        r45.sp0 sp0Var = bq0Var.G;
        if (sp0Var != null && (str = sp0Var.f385892e) != null) {
            kVar.K(str);
        }
        if (bq0Var.f370970o != null && bq0Var.f370976u > 0) {
            r72.f0 f0Var = new r72.f0();
            f0Var.n(bq0Var.f370976u);
            f0Var.l(bq0Var.f370970o);
            kVar.S(f0Var);
        }
        if (bq0Var.f370979x) {
            kVar.G(bq0Var.f370978w);
        }
        if (bq0Var.F) {
            kVar.Z(bq0Var.E);
        } else if (favItemInfo.field_type == 18) {
            kVar.Z(1);
        }
        java.lang.String str4 = bq0Var.R;
        if (str4 != null) {
            kVar.I(str4);
        }
        kVar.B().clear();
        r45.rq0 rq0Var = favItemInfo.field_tagProto;
        java.util.Iterator it = rq0Var.f385096e.iterator();
        while (it.hasNext()) {
            kVar.B().add((java.lang.String) it.next());
        }
        kVar.A().clear();
        java.util.Iterator it6 = rq0Var.f385097f.iterator();
        while (it6.hasNext()) {
            kVar.A().add((java.lang.Integer) it6.next());
        }
        kVar.x().clear();
        java.util.Iterator it7 = rq0Var.f385095d.iterator();
        while (it7.hasNext()) {
            kVar.x().add((java.lang.String) it7.next());
        }
        r45.jq0 jq0Var = favItemInfo.field_favProto.f370962d;
        if (jq0Var != null) {
            r72.g0 g0Var = new r72.g0();
            if (jq0Var.f378035e) {
                g0Var.A(jq0Var.f378034d);
            }
            if (jq0Var.f378041n) {
                g0Var.y(jq0Var.f378040m);
            }
            if (jq0Var.f378037g) {
                g0Var.t(jq0Var.f378036f);
            }
            if (jq0Var.f378039i) {
                g0Var.B(jq0Var.f378038h);
            }
            if (jq0Var.f378043p) {
                g0Var.x(jq0Var.f378042o);
            }
            if (jq0Var.f378047t) {
                g0Var.w(jq0Var.f378046s);
            }
            if (jq0Var.f378049v) {
                g0Var.s(jq0Var.f378048u);
            }
            if (jq0Var.f378051x) {
                g0Var.q(jq0Var.f378050w);
            }
            if (jq0Var.f378041n) {
                g0Var.z(jq0Var.f378040m);
            }
            if (jq0Var.f378053z) {
                g0Var.u(jq0Var.f378052y);
            }
            if (jq0Var.C) {
                g0Var.r(jq0Var.B);
            }
            kVar.T(g0Var);
        }
        java.util.LinkedList linkedList = favItemInfo.field_favProto.f370964f;
        if (linkedList.size() != 0) {
            java.util.Iterator it8 = linkedList.iterator();
            while (it8.hasNext()) {
                r45.gp0 gp0Var = (r45.gp0) it8.next();
                kotlin.jvm.internal.o.d(gp0Var);
                kVar.l().add(r72.e.b(gp0Var));
            }
        }
        r45.pp0 pp0Var = favItemInfo.field_favProto.f370966h;
        if (pp0Var != null) {
            r72.z zVar = new r72.z();
            if (pp0Var.f383273n) {
                zVar.A(pp0Var.f383272m);
            }
            if (pp0Var.f383269g) {
                zVar.B(pp0Var.f383268f);
            }
            if (pp0Var.f383267e) {
                zVar.C(pp0Var.f383266d);
            }
            if (pp0Var.f383271i) {
                zVar.K(pp0Var.f383270h);
            }
            if (pp0Var.f383275p) {
                zVar.G(pp0Var.f383274o);
            }
            if (pp0Var.f383277r) {
                zVar.J(pp0Var.f383276q);
            }
            if (pp0Var.f383279t) {
                zVar.F(pp0Var.f383278s);
            }
            if (pp0Var.f383281v) {
                zVar.E(pp0Var.f383280u);
            }
            if (pp0Var.f383283x) {
                zVar.H(pp0Var.f383282w);
            }
            if (pp0Var.f383285z) {
                zVar.I(pp0Var.f383284y);
            }
            if (pp0Var.B) {
                zVar.z(pp0Var.A ? 1 : 0);
            }
            if (pp0Var.D) {
                zVar.x(pp0Var.C);
            }
            if (pp0Var.F) {
                zVar.y(pp0Var.E);
            }
            kVar.P(zVar);
        }
        r45.bq0 bq0Var2 = favItemInfo.field_favProto;
        r45.tq0 tq0Var = bq0Var2.f370968m;
        if (tq0Var != null) {
            kVar.Y(r72.n0.b(tq0Var, bq0Var2.K));
        }
        r45.aq0 aq0Var = favItemInfo.field_favProto.f370980y;
        if (aq0Var != null) {
            kVar.R(r72.e0.a(aq0Var));
        }
        r45.mq0 mq0Var = favItemInfo.field_favProto.C;
        if (mq0Var != null) {
            kVar.V(r72.l0.b(mq0Var));
        }
        r45.sp0 sp0Var2 = favItemInfo.field_favProto.G;
        if (sp0Var2 != null) {
            r72.b0 b0Var = new r72.b0();
            b0Var.n(sp0Var2.f385892e);
            b0Var.l(sp0Var2.f385891d);
            kVar.Q(b0Var);
        }
        r45.dp0 dp0Var = favItemInfo.field_favProto.I;
        if (dp0Var != null) {
            kVar.F(r72.b.b(dp0Var));
        }
        r45.kv2 kv2Var = favItemInfo.field_favProto.M;
        if (kv2Var != null) {
            kVar.N(o72.s3.b(kv2Var));
        }
        r45.ev2 ev2Var = favItemInfo.field_favProto.Q;
        if (ev2Var != null) {
            kVar.L(r72.n.b(ev2Var));
        }
        r45.op0 op0Var = favItemInfo.field_favProto.P;
        if (op0Var == null) {
            return;
        }
        r72.y yVar = new r72.y();
        yVar.L(op0Var.f382407d);
        yVar.z(op0Var.f382408e);
        yVar.F(op0Var.f382410g);
        yVar.A(op0Var.f382413m);
        yVar.J(op0Var.f382412i);
        yVar.C(op0Var.f382414n);
        yVar.E(op0Var.f382411h);
        yVar.H(op0Var.f382416p);
        yVar.G(op0Var.f382415o);
        yVar.y(op0Var.f382417q);
        yVar.I(op0Var.f382409f);
        yVar.K(op0Var.f382419s);
        yVar.B(op0Var.f382420t);
        java.util.LinkedList<r45.np0> favLineExcerptList = op0Var.f382421u;
        kotlin.jvm.internal.o.f(favLineExcerptList, "favLineExcerptList");
        for (r45.np0 np0Var : favLineExcerptList) {
            r72.j jVar = new r72.j();
            jVar.l(np0Var.f381565e);
            jVar.n(np0Var.f381564d);
            jVar.o(np0Var.f381566f);
            yVar.l().add(jVar);
        }
        kVar.O(yVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x02d5, code lost:
    
        if ((r1.length() == 0) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02ee, code lost:
    
        if ((r1.length() == 0) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0306, code lost:
    
        if ((r1.length() == 0) != false) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(r72.k r7, o72.r2 r8) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r72.l.b(r72.k, o72.r2):void");
    }
}
