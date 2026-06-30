package ri;

/* loaded from: classes12.dex */
public class m extends qh.t {
    @Override // qh.t
    public boolean b(rh.o2 o2Var, rh.c1 c1Var, qh.u uVar) {
        if (super.b(o2Var, c1Var, uVar)) {
            if (!(o2Var.f395486c instanceof com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot)) {
                return false;
            }
            uVar.c("dead_threads");
            rh.d3 d3Var = o2Var.f395486c;
            uVar.h("cont", java.lang.String.valueOf(((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) d3Var).f52564j.f395560a.size()));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (mm.l.b()) {
                for (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesEntry threadJiffiesEntry : ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) d3Var).f52564j.f395560a) {
                    sb6.append(sb6.length() == 0 ? "" : ",");
                    sb6.append(threadJiffiesEntry.f52566c);
                    sb6.append("(");
                    sb6.append(threadJiffiesEntry.f52565b);
                    sb6.append(")");
                }
            } else {
                sb6.append("skip");
            }
            uVar.h("list", sb6.toString());
            return false;
        }
        rh.d3 d3Var2 = o2Var.f395486c;
        boolean z17 = d3Var2 instanceof rh.f;
        long j17 = o2Var.f395487d;
        rh.d3 d3Var3 = o2Var.f395486c;
        if (z17) {
            long max = java.lang.Math.max(1L, j17 / 60000);
            long longValue = ((java.lang.Long) ((rh.f) d3Var3).f395377g.f395552a).longValue() / max;
            if (longValue > 0) {
                java.lang.CharSequence format = android.text.format.DateFormat.format("HH:mm:ss", ((rh.f) o2Var.f395484a).f395376f);
                uVar.f363387a.append((java.lang.Object) "|   -> (");
                uVar.f363387a.append((java.lang.Object) (((rh.f) d3Var3).f395381k ? "-" : "~"));
                uVar.f363387a.append((java.lang.Object) ",");
                uVar.f363387a.append(java.lang.Integer.valueOf(((rh.f) d3Var3).f395378h));
                uVar.f363387a.append((java.lang.Object) "-");
                uVar.f363387a.append(java.lang.Integer.valueOf(((rh.f) d3Var3).f395379i));
                uVar.f363387a.append((java.lang.Object) ",");
                uVar.f363387a.append((java.lang.Object) format);
                uVar.f363387a.append((java.lang.Object) "-");
                uVar.f363387a.append(java.lang.Long.valueOf(max));
                uVar.f363387a.append((java.lang.Object) "min");
                uVar.f363387a.append((java.lang.Object) ")");
                uVar.f363387a.append((java.lang.Object) ((rh.f) d3Var3).f395375e);
                uVar.f363387a.append((java.lang.Object) "(");
                uVar.f363387a.append(java.lang.Integer.valueOf(((rh.f) d3Var3).f395374d));
                uVar.f363387a.append((java.lang.Object) ")\t");
                uVar.f363387a.append(java.lang.Long.valueOf(longValue));
                uVar.f363387a.append((java.lang.Object) "/");
                uVar.f363387a.append(((rh.f) d3Var3).f395377g.f395552a);
                uVar.f363387a.append((java.lang.Object) "\tjiffies");
                uVar.a("\n");
            }
            return true;
        }
        if (d3Var2 instanceof gi.j) {
            long max2 = java.lang.Math.max(1L, j17 / 60000);
            long longValue2 = ((java.lang.Long) ((gi.j) d3Var3).f272060d.f395552a).longValue() / max2;
            uVar.c("during");
            uVar.g(j17 + "(mls)\t" + max2 + "(min)");
            uVar.h("avgAlarmCount", java.lang.String.valueOf(((java.lang.Integer) ((gi.j) d3Var3).f272061e.f395552a).intValue() / max2));
            uVar.h("avgAddMsgCount", java.lang.String.valueOf(longValue2));
            return true;
        }
        if (!(d3Var2 instanceof rh.n3)) {
            return false;
        }
        long max3 = java.lang.Math.max(1L, j17 / 60000);
        long longValue3 = ((java.lang.Long) ((rh.n3) d3Var3).f395470d.f395552a).longValue() / max3;
        long longValue4 = ((java.lang.Long) ((rh.n3) d3Var3).f395471e.f395552a).longValue() / max3;
        long longValue5 = ((java.lang.Long) ((rh.n3) d3Var3).f395474h.f395552a).longValue() / max3;
        long longValue6 = ((java.lang.Long) ((rh.n3) d3Var3).f395475i.f395552a).longValue() / max3;
        uVar.c("traffic");
        uVar.h("avgWifiRx", java.lang.String.valueOf(longValue3));
        uVar.h("avgWifiTx", java.lang.String.valueOf(longValue4));
        uVar.h("avgMobileRx", java.lang.String.valueOf(longValue5));
        uVar.h("avgMobileTx", java.lang.String.valueOf(longValue6));
        return true;
    }

    @Override // qh.t
    public void c(final rh.c1 c1Var, final qh.u uVar) {
        super.c(c1Var, uVar);
        c1Var.x(gi.y1.class, new wh.t0() { // from class: ri.m$$a
            @Override // wh.t0
            public final void accept(java.lang.Object obj) {
                ri.m mVar = ri.m.this;
                mVar.getClass();
                rh.c1 c1Var2 = c1Var;
                java.util.List D = ((gi.w0) c1Var2).D(gi.y1.class);
                if (D.isEmpty()) {
                    return;
                }
                java.lang.String str = "thread_pool(" + D.size() + ")";
                qh.u uVar2 = uVar;
                uVar2.b(str);
                mVar.d(D, c1Var2, uVar2);
            }
        });
        c1Var.x(gi.g1.class, new wh.t0() { // from class: ri.m$$b
            @Override // wh.t0
            public final void accept(java.lang.Object obj) {
                ri.m mVar = ri.m.this;
                mVar.getClass();
                rh.c1 c1Var2 = c1Var;
                java.util.List D = ((gi.w0) c1Var2).D(gi.g1.class);
                if (D.isEmpty()) {
                    return;
                }
                java.lang.String str = "mm_handler(" + D.size() + ")";
                qh.u uVar2 = uVar;
                uVar2.b(str);
                mVar.d(D, c1Var2, uVar2);
            }
        });
        c1Var.x(gi.v0.class, new wh.t0() { // from class: ri.m$$c
            @Override // wh.t0
            public final void accept(java.lang.Object obj) {
                ri.m mVar = ri.m.this;
                mVar.getClass();
                rh.c1 c1Var2 = c1Var;
                java.util.List D = ((gi.w0) c1Var2).D(gi.v0.class);
                if (D.isEmpty()) {
                    return;
                }
                java.lang.String str = "ipc_pool(" + D.size() + ")";
                qh.u uVar2 = uVar;
                uVar2.b(str);
                mVar.d(D, c1Var2, uVar2);
            }
        });
        if (c1Var.t(gi.j.class) != null || c1Var.t(rh.n3.class) != null) {
            uVar.b("extra_info");
            c1Var.u(gi.j.class, new wh.t0() { // from class: ri.m$$d
                @Override // wh.t0
                public final void accept(java.lang.Object obj) {
                    ri.m.this.b((rh.o2) obj, c1Var, uVar);
                }
            });
            c1Var.u(rh.n3.class, new wh.t0() { // from class: ri.m$$e
                @Override // wh.t0
                public final void accept(java.lang.Object obj) {
                    ri.m.this.b((rh.o2) obj, c1Var, uVar);
                }
            });
        }
        final qh.b bVar = c1Var.f395330l;
        if (bVar != null) {
            ((gi.w0) c1Var).p(new wh.t0() { // from class: ri.m$$f
                @Override // wh.t0
                public final void accept(java.lang.Object obj) {
                    java.util.List<rh.o2> list = (java.util.List) obj;
                    if (list.isEmpty()) {
                        return;
                    }
                    java.util.Iterator it = list.iterator();
                    long j17 = 0;
                    while (it.hasNext()) {
                        j17 += ((java.lang.Long) ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) ((rh.o2) it.next()).f395486c).f52561g.f395552a).longValue();
                    }
                    qh.b bVar2 = qh.b.this;
                    long j18 = 10;
                    float k17 = sh.c.k(j17, bVar2.f363321n / 10);
                    qh.u uVar2 = uVar;
                    uVar2.b("all_pids");
                    java.lang.StringBuilder sb6 = uVar2.f363387a;
                    sb6.append((java.lang.Object) "|   -> TOP Thread\tpidNum=");
                    sb6.append(java.lang.Integer.valueOf(list.size()));
                    sb6.append((java.lang.Object) "\tcpuLoad=");
                    sb6.append((java.lang.Object) sh.c.m(k17, 1));
                    sb6.append((java.lang.Object) "%\tmin=");
                    sb6.append(java.lang.Long.valueOf(bVar2.e()));
                    sb6.append((java.lang.Object) "\n");
                    uVar2.a("|   -> TID\tLOAD \tSTATUS \tTHREAD_NAME \tJIFFY\n");
                    for (rh.o2 o2Var : list) {
                        if (o2Var.b()) {
                            uVar2.a("|\n");
                            uVar2.c("Proc");
                            sb6.append((java.lang.Object) "|   -> :");
                            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot jiffiesMonitorFeature$JiffiesSnapshot = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var.f395486c;
                            sb6.append((java.lang.Object) jiffiesMonitorFeature$JiffiesSnapshot.f52560f);
                            sb6.append((java.lang.Object) "\tpid=");
                            sb6.append(java.lang.Integer.valueOf(jiffiesMonitorFeature$JiffiesSnapshot.f52558d));
                            sb6.append((java.lang.Object) "\tload=");
                            sb6.append((java.lang.Object) sh.c.m(sh.c.k(((java.lang.Long) jiffiesMonitorFeature$JiffiesSnapshot.f52561g.f395552a).longValue(), bVar2.f363321n / j18), 1));
                            sb6.append((java.lang.Object) "%\tmin=");
                            sb6.append(java.lang.Long.valueOf(bVar2.e()));
                            uVar2.a("\n");
                            uVar2.c("Thread(" + jiffiesMonitorFeature$JiffiesSnapshot.f52562h.f395560a.size() + ")");
                            for (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesEntry threadJiffiesEntry : jiffiesMonitorFeature$JiffiesSnapshot.f52562h.f395560a) {
                                long longValue = ((java.lang.Long) threadJiffiesEntry.f395552a).longValue();
                                float k18 = sh.c.k(longValue, bVar2.f363321n / j18);
                                sb6.append((java.lang.Object) "|   -> ");
                                sb6.append((java.lang.Object) sh.c.l(java.lang.String.valueOf(threadJiffiesEntry.f52565b), 5));
                                sb6.append((java.lang.Object) "\t");
                                sb6.append((java.lang.Object) sh.c.l(sh.c.m(k18, 1), 4));
                                sb6.append((java.lang.Object) "\t");
                                sb6.append((java.lang.Object) (threadJiffiesEntry.f52567d ? "+" : "~"));
                                sb6.append((java.lang.Object) "/");
                                sb6.append((java.lang.Object) threadJiffiesEntry.f52568e);
                                sb6.append((java.lang.Object) "\t");
                                sb6.append((java.lang.Object) sh.c.l(threadJiffiesEntry.f52566c, 16));
                                sb6.append((java.lang.Object) "\t");
                                sb6.append(java.lang.Long.valueOf(longValue));
                                sb6.append((java.lang.Object) "\t");
                                uVar2.a("\n");
                                if (k18 < 5.0f) {
                                    break;
                                } else {
                                    j18 = 10;
                                }
                            }
                        }
                        j18 = 10;
                    }
                }
            });
        }
    }

    public final void d(java.util.List list, rh.c1 c1Var, qh.u uVar) {
        boolean z17 = false;
        boolean z18 = false;
        for (int i17 = 0; i17 < java.lang.Math.min(list.size(), 10); i17++) {
            rh.o2 o2Var = (rh.o2) list.get(i17);
            b(o2Var, c1Var, uVar);
            if (!o2Var.b()) {
                z18 = true;
            }
            if (!z17 && ((java.lang.Long) ((rh.f) o2Var.f395486c).f395377g.f395552a).longValue() / java.lang.Math.max(1L, o2Var.f395487d / 60000) > java.lang.Math.max(gi.d.f271998f, 1000L)) {
                z17 = true;
            }
        }
        uVar.a("|\t\t......\n");
        if (z17 || z18) {
            java.lang.StringBuilder sb6 = uVar.f363387a;
            sb6.append((java.lang.Object) "|  ");
            sb6.append((java.lang.Object) (z17 ? " #overHeat" : ""));
            sb6.append((java.lang.Object) (z18 ? " #invalid" : ""));
            uVar.a("\n");
        }
    }
}
