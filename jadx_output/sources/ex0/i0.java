package ex0;

/* loaded from: classes5.dex */
public abstract class i0 {
    public static final void a(ex0.a0 a0Var, com.tencent.maas.model.time.MJTime time) {
        kotlin.jvm.internal.o.g(a0Var, "<this>");
        kotlin.jvm.internal.o.g(time, "time");
        ex0.r b17 = b(a0Var, time);
        if (b17 == null || kotlin.jvm.internal.o.b(b17, a0Var.n())) {
            return;
        }
        ex0.r n17 = a0Var.n();
        if (n17 != null) {
            n17.f257171e = ax0.b.f14964d;
        }
        b17.f257171e = ax0.b.f14965e;
        a0Var.M(b17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r0.l().containsTime(r4) == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ex0.r b(ex0.a0 r3, com.tencent.maas.model.time.MJTime r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r0 = "time"
            kotlin.jvm.internal.o.g(r4, r0)
            androidx.lifecycle.j0 r0 = r3.f257114x
            java.lang.Object r0 = r0.getValue()
            ax0.e r0 = (ax0.e) r0
            if (r0 != 0) goto L16
            r0 = -1
            goto L1e
        L16:
            int[] r1 = ex0.b0.f257118a
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L1e:
            r1 = 0
            switch(r0) {
                case 1: goto L23;
                case 2: goto L23;
                case 3: goto L23;
                case 4: goto L47;
                case 5: goto L47;
                case 6: goto L47;
                case 7: goto L47;
                default: goto L22;
            }
        L22:
            goto L47
        L23:
            ex0.r r0 = r3.n()
            boolean r1 = r3.z()
            if (r1 == 0) goto L40
            if (r0 == 0) goto L3b
            com.tencent.maas.model.time.MJTimeRange r1 = r0.l()
            boolean r1 = r1.containsTime(r4)
            r2 = 1
            if (r1 != r2) goto L3b
            goto L3c
        L3b:
            r2 = 0
        L3c:
            if (r2 == 0) goto L40
            r1 = r0
            goto L47
        L40:
            ex0.v r3 = r3.f257097g
            ex0.r r3 = r3.f(r4)
            r1 = r3
        L47:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.i0.b(ex0.a0, com.tencent.maas.model.time.MJTime):ex0.r");
    }

    public static final ex0.b c(ex0.a0 a0Var, com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(a0Var, "<this>");
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        ex0.r g17 = a0Var.f257097g.g(segmentID);
        ex0.b bVar = g17 instanceof ex0.b ? (ex0.b) g17 : null;
        if (bVar != null) {
            return bVar;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return null;
    }

    public static final ex0.c d(ex0.a0 a0Var, com.tencent.maas.model.time.MJTime time) {
        kotlin.jvm.internal.o.g(a0Var, "<this>");
        kotlin.jvm.internal.o.g(time, "time");
        ex0.r f17 = a0Var.f257097g.f(time);
        ex0.c cVar = f17 instanceof ex0.c ? (ex0.c) f17 : null;
        if (cVar != null) {
            return cVar;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return null;
    }

    public static final ex0.f e(ex0.a0 a0Var, com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(a0Var, "<this>");
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        ex0.r g17 = a0Var.f257097g.g(segmentID);
        ex0.f fVar = g17 instanceof ex0.f ? (ex0.f) g17 : null;
        if (fVar != null) {
            return fVar;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return null;
    }

    public static final ex0.q f(ex0.a0 a0Var, com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(a0Var, "<this>");
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        ex0.r g17 = a0Var.f257097g.g(segmentID);
        ex0.q qVar = g17 instanceof ex0.q ? (ex0.q) g17 : null;
        if (qVar != null) {
            return qVar;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return null;
    }

    public static final ex0.q g(ex0.a0 a0Var, java.lang.String dummyID) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(a0Var, "<this>");
        kotlin.jvm.internal.o.g(dummyID, "dummyID");
        java.util.Iterator it = a0Var.f257097g.f257179g.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((ex0.q) obj).H(), dummyID)) {
                break;
            }
        }
        return (ex0.q) obj;
    }

    public static final void h(ex0.a0 a0Var, ax0.a edge) {
        kotlin.jvm.internal.o.g(a0Var, "<this>");
        kotlin.jvm.internal.o.g(edge, "edge");
        ax0.e eVar = (ax0.e) a0Var.f257114x.getValue();
        int i17 = eVar == null ? -1 : ex0.b0.f257118a[eVar.ordinal()];
        if (i17 == 3) {
            a0Var.c(edge);
            a0Var.O(ax0.e.f14978g);
        } else if (i17 != 7) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        } else {
            a0Var.c(edge);
            a0Var.O(ax0.e.f14981m);
        }
    }

    public static final void i(ex0.a0 a0Var) {
        kotlin.jvm.internal.o.g(a0Var, "<this>");
        ax0.e eVar = (ax0.e) a0Var.f257114x.getValue();
        int i17 = eVar == null ? -1 : ex0.b0.f257118a[eVar.ordinal()];
        if (i17 == 4) {
            a0Var.i();
            a0Var.O(ax0.e.f14977f);
        } else if (i17 != 5) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        } else {
            a0Var.i();
            a0Var.O(ax0.e.f14980i);
        }
    }

    public static final void j(ex0.a0 a0Var, com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(a0Var, "<this>");
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        ex0.r K = a0Var.K(segmentID);
        if (K == null) {
            return;
        }
        k(a0Var, K);
    }

    public static final void k(ex0.a0 a0Var, ex0.r segmentVM) {
        kotlin.jvm.internal.o.g(a0Var, "<this>");
        kotlin.jvm.internal.o.g(segmentVM, "segmentVM");
        ax0.e eVar = (ax0.e) a0Var.f257114x.getValue();
        if (eVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("TimelineViewModelEditingState", "handleSelectSegment: segmentType " + segmentVM.f257169c + " segmentUIState " + segmentVM.f257171e + " editingState " + eVar);
        yz5.l lVar = (yz5.l) a0Var.f257096f.get(java.lang.Integer.valueOf(eVar.ordinal()));
        if (lVar != null) {
            lVar.invoke(segmentVM);
        }
    }

    public static final void l(ex0.a0 a0Var) {
        kotlin.jvm.internal.o.g(a0Var, "<this>");
        ex0.r n17 = a0Var.n();
        if ((n17 != null ? n17.f257169c : null) != ug.m.Caption) {
            m(a0Var);
            return;
        }
        ax0.e eVar = (ax0.e) a0Var.f257114x.getValue();
        if ((eVar == null ? -1 : ex0.b0.f257118a[eVar.ordinal()]) == 7) {
            a0Var.O(ax0.e.f14979h);
        }
    }

    public static final void m(ex0.a0 a0Var) {
        kotlin.jvm.internal.o.g(a0Var, "<this>");
        if (((java.util.ArrayList) a0Var.f257097g.f257178f).isEmpty()) {
            a0Var.O(ax0.e.f14975d);
            if (a0Var.n() != null) {
                ex0.r n17 = a0Var.n();
                if (n17 != null) {
                    n17.f257171e = ax0.b.f14964d;
                }
                a0Var.M(null);
                return;
            }
            return;
        }
        a0Var.O(ax0.e.f14975d);
        if (a0Var.n() != null) {
            ex0.r n18 = a0Var.n();
            if (n18 != null) {
                n18.f257171e = ax0.b.f14964d;
            }
            a0Var.M(null);
        }
        com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) a0Var.f257106p.getValue();
        if (mJTime == null) {
            mJTime = com.tencent.maas.model.time.MJTime.InvalidTime;
        }
        kotlin.jvm.internal.o.d(mJTime);
        ex0.r b17 = b(a0Var, mJTime);
        if (b17 != null) {
            a0Var.l(b17);
        }
        if (b17 == null) {
            return;
        }
        b17.f257171e = ax0.b.f14965e;
    }
}
