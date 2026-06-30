package rv0;

/* loaded from: classes5.dex */
public abstract class a4 {
    public static final void a(ex0.a0 a0Var, rv0.n1 n1Var) {
        boolean y17 = a0Var.y();
        rv0.j jVar = (rv0.j) n1Var.f69240i;
        if (jVar != null) {
            jVar.J(y17);
        }
    }

    public static final void b(rv0.n1 n1Var, com.tencent.maas.model.time.MJTime mJTime) {
        ug.m mVar;
        ex0.a0 s76 = n1Var.s7();
        if (s76 != null && s76.e(mJTime)) {
            java.util.Iterator it = ((java.util.ArrayList) s76.f257097g.f257177e).iterator();
            while (it.hasNext()) {
                ex0.r rVar = (ex0.r) it.next();
                if ((rVar instanceof ex0.f) && (mVar = rVar.f257169c) != ug.m.Transition) {
                    if (mVar == ug.m.ImageClip) {
                        ((ex0.f) rVar).y(mJTime);
                    } else if (rVar.j().bigThan(mJTime)) {
                        ((ex0.f) rVar).y(mJTime);
                    } else {
                        ex0.f fVar = (ex0.f) rVar;
                        com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment = fVar.f257130f;
                        elementSegment.getClass();
                        com.tencent.maas.model.time.MJTime mJTime2 = com.tencent.maas.model.time.MJTime.ZeroTime;
                        com.tencent.maas.moviecomposing.Timeline D = elementSegment.D();
                        if (D != null) {
                            mJTime2 = com.tencent.maas.moviecomposing.segments.ElementSegment.X(elementSegment, D);
                        }
                        kotlin.jvm.internal.o.f(mJTime2, "getTailExpandableDuration(...)");
                        if (rVar.j().add(mJTime2).bigThan(mJTime)) {
                            fVar.y(mJTime);
                        } else {
                            com.tencent.maas.model.time.MJTime add = rVar.j().add(mJTime2);
                            kotlin.jvm.internal.o.f(add, "add(...)");
                            fVar.y(add);
                            fVar.z(mJTime);
                        }
                    }
                }
            }
            gx0.kh q76 = n1Var.q7();
            java.lang.String string = n1Var.getContext().getString(com.tencent.mm.R.string.f492505lm0);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            q76.r7(string, null);
            kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new rv0.w3(n1Var, s76, null), 3, null);
        }
    }

    public static final void c(rv0.n1 n1Var) {
        int i17;
        com.tencent.maas.base.MJID mjid;
        kotlin.jvm.internal.o.g(n1Var, "<this>");
        ex0.a0 s76 = n1Var.s7();
        if (s76 == null) {
            return;
        }
        wv0.q qVar = new wv0.q(n1Var.getContext());
        java.util.List list = s76.f257097g.f257177e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            ug.m mVar = ((ex0.r) next).f257169c;
            if (((mVar == ug.m.ImageClip || mVar == ug.m.MovieClip || mVar == ug.m.VideoClip) ? 1 : 0) != 0) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            dx0.g gVar = s76.H;
            if (!hasNext) {
                qVar.N(arrayList2);
                java.util.Iterator it7 = arrayList2.iterator();
                while (it7.hasNext()) {
                    kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new wv0.a(gVar, (vv0.n) it7.next(), null), 3, null);
                }
                ex0.r n17 = s76.n();
                if (n17 != null && (mjid = n17.f257168b) != null) {
                    qVar.M(mjid);
                }
                qVar.setResult(java.lang.Boolean.TRUE);
                qVar.H();
                qVar.setOnAttached(new wv0.b(n1Var));
                qVar.setOnItemGrabbed(new wv0.c(s76, n1Var));
                qVar.setOnSegmentSwitch(new wv0.d(s76, qVar));
                qVar.setOnItemReleased(new wv0.f(n1Var, s76));
                qVar.setOnSegmentClicked(new wv0.g(s76, n1Var));
                qVar.I(new wv0.h(qVar, n1Var), new wv0.i(qVar, n1Var));
                qVar.setPanelResultListener(new wv0.j(qVar, n1Var));
                s76.A.observe(n1Var.W6(), new wv0.k(qVar, s76));
                n1Var.g7(qVar);
                return;
            }
            java.lang.Object next2 = it6.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.maas.base.MJID mjid2 = ((ex0.r) next2).f257168b;
            arrayList2.add(new vv0.n(mjid2, gVar.d(mjid2), i18, false, false, 24, null));
            i17 = i18;
        }
    }
}
