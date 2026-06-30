package qh;

/* loaded from: classes12.dex */
public class t {
    public void a(rh.c1 c1Var, qh.u uVar) {
        qh.b bVar;
        qh.b bVar2;
        if (c1Var.f395329k != null && (bVar2 = c1Var.f395330l) != null) {
            long j17 = bVar2.f363321n;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j18 = currentTimeMillis - j17;
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
            long hours = timeUnit.toHours(j17);
            long millis = j17 - java.util.concurrent.TimeUnit.HOURS.toMillis(hours);
            long minutes = timeUnit.toMinutes(millis);
            long seconds = timeUnit.toSeconds(millis - java.util.concurrent.TimeUnit.MINUTES.toMillis(minutes));
            uVar.f363387a.append((java.lang.Object) "| Time Range: ");
            java.lang.String c17 = wh.m.c(j18, null, 2, null);
            java.lang.StringBuilder sb6 = uVar.f363387a;
            sb6.append((java.lang.Object) c17);
            sb6.append((java.lang.Object) "\t~\t");
            sb6.append((java.lang.Object) wh.m.c(currentTimeMillis, null, 2, null));
            sb6.append((java.lang.Object) "\t=\t");
            sb6.append(java.lang.Long.valueOf(hours));
            sb6.append((java.lang.Object) "h");
            sb6.append(java.lang.Long.valueOf(minutes));
            sb6.append((java.lang.Object) "m");
            sb6.append(java.lang.Long.valueOf(seconds));
            sb6.append((java.lang.Object) "s");
            sb6.append("\n");
        }
        c(c1Var, uVar);
        if (c1Var.f395329k == null || (bVar = c1Var.f395330l) == null) {
            return;
        }
        uVar.b("app_stats");
        uVar.c("stat_time");
        uVar.h("time", bVar.e() + "(min)");
        uVar.h("fg", java.lang.String.valueOf(bVar.f363308a));
        uVar.h("bg", java.lang.String.valueOf(bVar.f363309b));
        uVar.h("fgSrv", java.lang.String.valueOf(bVar.f363310c));
        uVar.h("float", java.lang.String.valueOf(bVar.f363311d));
        uVar.h("devCharging", java.lang.String.valueOf(bVar.f363312e));
        uVar.h("devScreenOff", java.lang.String.valueOf(bVar.f363314g));
        if (!android.text.TextUtils.isEmpty(bVar.f363316i)) {
            uVar.h("sceneTop1", bVar.f363316i + "/" + bVar.f363317j);
        }
        if (!android.text.TextUtils.isEmpty(bVar.f363318k)) {
            uVar.h("sceneTop2", bVar.f363318k + "/" + bVar.f363319l);
        }
        c1Var.x(rh.w.class, new qh.j(this, uVar));
    }

    public boolean b(rh.o2 o2Var, rh.c1 c1Var, qh.u uVar) {
        qh.b bVar;
        rh.f1 f1Var;
        long j17;
        if (c1Var.f395329k == null || (bVar = c1Var.f395330l) == null) {
            return false;
        }
        rh.d3 d3Var = o2Var.f395486c;
        boolean z17 = d3Var instanceof com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot;
        rh.d3 d3Var2 = o2Var.f395485b;
        long j18 = o2Var.f395487d;
        if (z17) {
            long max = java.lang.Math.max(1L, j18 / 60000);
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot jiffiesMonitorFeature$JiffiesSnapshot = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) d3Var;
            long e17 = c1Var.e(((java.lang.Long) jiffiesMonitorFeature$JiffiesSnapshot.f52561g.f395552a).longValue());
            uVar.f363387a.append((java.lang.Object) "| ");
            java.lang.StringBuilder sb6 = uVar.f363387a;
            sb6.append((java.lang.Object) "cpu=");
            sb6.append(java.lang.Integer.valueOf(c1Var.s()));
            sb6.append((java.lang.Object) "/");
            sb6.append(java.lang.Integer.valueOf(c1Var.A()));
            uVar.e();
            uVar.e();
            sb6.append((java.lang.Object) "fg=");
            int c17 = bVar.c();
            java.lang.Integer num = wh.m.f445830a;
            sb6.append((java.lang.Object) (c17 != 1 ? c17 != 2 ? c17 != 3 ? c17 != 4 ? com.eclipsesource.mmv8.Platform.UNKNOWN : "float" : "fgSrv" : "bg" : "fg"));
            uVar.e();
            uVar.e();
            sb6.append((java.lang.Object) "during(min)=");
            sb6.append(java.lang.Long.valueOf(max));
            uVar.e();
            uVar.e();
            sb6.append((java.lang.Object) "diff(jiffies)=");
            sb6.append(jiffiesMonitorFeature$JiffiesSnapshot.f52561g.f395552a);
            uVar.e();
            uVar.e();
            sb6.append((java.lang.Object) "avg(jiffies/min)=");
            sb6.append(java.lang.Long.valueOf(e17));
            sb6.append("\n");
            uVar.b("jiffies(" + jiffiesMonitorFeature$JiffiesSnapshot.f52562h.f395560a.size() + ")");
            uVar.h("desc", "(status)name(tid)\tavg/total");
            uVar.h("inc_thread_num", java.lang.String.valueOf(jiffiesMonitorFeature$JiffiesSnapshot.f52563i.f395552a));
            uVar.h("cur_thread_num", java.lang.String.valueOf(((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) d3Var2).f52563i.f395552a));
            long j19 = 0;
            int i17 = 0;
            while (true) {
                j17 = max;
                if (i17 >= jiffiesMonitorFeature$JiffiesSnapshot.f52562h.f395560a.size()) {
                    break;
                }
                com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesEntry threadJiffiesEntry = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesEntry) jiffiesMonitorFeature$JiffiesSnapshot.f52562h.f395560a.get(i17);
                long j27 = j19;
                long longValue = ((java.lang.Long) threadJiffiesEntry.f395552a).longValue();
                if (i17 < 8) {
                    sb6.append((java.lang.Object) "|   -> (");
                    sb6.append((java.lang.Object) (threadJiffiesEntry.f52567d ? "+" : "~"));
                    sb6.append((java.lang.Object) "/");
                    sb6.append((java.lang.Object) threadJiffiesEntry.f52568e);
                    sb6.append((java.lang.Object) ")");
                    sb6.append((java.lang.Object) threadJiffiesEntry.f52566c);
                    sb6.append((java.lang.Object) "(");
                    sb6.append(java.lang.Integer.valueOf(threadJiffiesEntry.f52565b));
                    sb6.append((java.lang.Object) ")\t");
                    sb6.append(java.lang.Long.valueOf(c1Var.e(longValue)));
                    sb6.append((java.lang.Object) "/");
                    sb6.append(java.lang.Long.valueOf(longValue));
                    sb6.append((java.lang.Object) "\tjiffies");
                    uVar.a("\n");
                    j19 = j27;
                } else {
                    j19 = j27 + longValue;
                }
                i17++;
                max = j17;
            }
            long j28 = j19;
            uVar.a("|\t\t......\n");
            if (j28 > 0) {
                sb6.append((java.lang.Object) "|   -> R/R)");
                sb6.append((java.lang.Object) "REMAINS");
                sb6.append((java.lang.Object) "(");
                sb6.append(java.lang.Integer.valueOf(jiffiesMonitorFeature$JiffiesSnapshot.f52562h.f395560a.size() - 8));
                sb6.append((java.lang.Object) ")\t");
                sb6.append(java.lang.Long.valueOf(c1Var.e(j28) / j17));
                sb6.append((java.lang.Object) "/");
                sb6.append(java.lang.Long.valueOf(j28));
                sb6.append((java.lang.Object) "\tjiffies");
                uVar.a("\n");
            }
            if (e17 <= 1000 && o2Var.b()) {
                return true;
            }
            sb6.append((java.lang.Object) "|  ");
            sb6.append((java.lang.Object) (e17 > 1000 ? " #overHeat" : ""));
            sb6.append((java.lang.Object) (o2Var.b() ? "" : " #invalid"));
            uVar.a("\n");
            return true;
        }
        if (d3Var instanceof rh.k) {
            uVar.c("alarm");
            uVar.g(j18 + "(mls)\t" + (j18 / 60000) + "(min)");
            rh.k kVar = (rh.k) d3Var;
            uVar.h("inc_alarm_count", java.lang.String.valueOf(kVar.f395429d.f395552a));
            uVar.h("inc_trace_count", java.lang.String.valueOf(kVar.f395430e.f395552a));
            uVar.h("inc_dupli_group", java.lang.String.valueOf(kVar.f395431f.f395552a));
            uVar.h("inc_dupli_count", java.lang.String.valueOf(kVar.f395432g.f395552a));
        } else {
            if (d3Var instanceof rh.t3) {
                uVar.c("wake_lock");
                uVar.g(j18 + "(mls)\t" + (j18 / 60000) + "(min)");
                rh.t3 t3Var = (rh.t3) d3Var;
                uVar.h("inc_lock_count", java.lang.String.valueOf(t3Var.f395510e));
                uVar.h("inc_time_total", java.lang.String.valueOf(t3Var.f395509d));
                java.util.List list = ((rh.t3) d3Var2).f395511f.f395560a;
                if (list.isEmpty()) {
                    return true;
                }
                uVar.c("locking");
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    java.lang.Object obj = ((rh.s2) it.next()).f395506a;
                    rh.w3 w3Var = (rh.w3) obj;
                    if (!(w3Var.f395544f >= w3Var.f395543e)) {
                        uVar.g(((rh.w3) obj).toString());
                    }
                }
                return true;
            }
            if (d3Var instanceof rh.z) {
                uVar.c("bluetooh");
                uVar.g(j18 + "(mls)\t" + (j18 / 60000) + "(min)");
                rh.z zVar = (rh.z) d3Var;
                uVar.h("inc_regs_count", java.lang.String.valueOf(zVar.f395566d.f395552a));
                uVar.h("inc_dics_count", java.lang.String.valueOf(zVar.f395567e.f395552a));
                uVar.h("inc_scan_count", java.lang.String.valueOf(zVar.f395568f.f395552a));
            } else if (d3Var instanceof rh.c4) {
                uVar.c("wifi");
                uVar.g(j18 + "(mls)\t" + (j18 / 60000) + "(min)");
                rh.c4 c4Var = (rh.c4) d3Var;
                uVar.h("inc_scan_count", java.lang.String.valueOf(c4Var.f395354d.f395552a));
                uVar.h("inc_qury_count", java.lang.String.valueOf(c4Var.f395355e.f395552a));
            } else {
                if (!(d3Var instanceof rh.k2)) {
                    if (d3Var instanceof rh.w1) {
                        uVar.c("cpufreq");
                        uVar.g(j18 + "(mls)\t" + (j18 / 60000) + "(min)");
                        uVar.h("inc", java.util.Arrays.toString(((rh.w1) d3Var).f395538d.f395560a.toArray()));
                        uVar.h("cur", java.util.Arrays.toString(((rh.w1) d3Var2).f395538d.f395560a.toArray()));
                        c1Var.C(rh.w1.class, new qh.g(this, uVar));
                        return true;
                    }
                    if (!(d3Var instanceof rh.f1)) {
                        if (!(d3Var instanceof rh.t1)) {
                            return false;
                        }
                        uVar.c("batt_temp");
                        uVar.g(j18 + "(mls)\t" + (j18 / 60000) + "(min)");
                        uVar.h("inc", java.lang.String.valueOf(((rh.t1) d3Var).f395508d.f395552a));
                        uVar.h("cur", java.lang.String.valueOf(((rh.t1) d3Var2).f395508d.f395552a));
                        c1Var.C(rh.t1.class, new qh.i(this, uVar));
                        return true;
                    }
                    long j29 = j18 / 60000;
                    long max2 = java.lang.Math.max(1L, j29);
                    uVar.c("dev_cpu_load");
                    uVar.g(j18 + "(mls)\t" + j29 + "(min)");
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(c1Var.v());
                    sb7.append("%");
                    uVar.h("usage", sb7.toString());
                    int i18 = 0;
                    while (true) {
                        f1Var = (rh.f1) d3Var;
                        if (i18 >= f1Var.f395385d.size()) {
                            break;
                        }
                        uVar.h("cpu" + i18, java.util.Arrays.toString(((rh.y2) f1Var.f395385d.get(i18)).f395560a.toArray()));
                        i18++;
                    }
                    rh.k1 k1Var = (rh.k1) c1Var.w(rh.k1.class);
                    if (k1Var == null || !k1Var.y()) {
                        return true;
                    }
                    uVar.c("cpu_sip");
                    wh.n1 n1Var = k1Var.f395435k;
                    java.util.Locale locale = java.util.Locale.US;
                    uVar.h("inc_cpu_sip", java.lang.String.format(locale, "%.2f(mAh)/min", java.lang.Double.valueOf(f1Var.b(n1Var) / max2)));
                    uVar.h("cur_cpu_sip", java.lang.String.format(locale, "%.2f(mAh)", java.lang.Double.valueOf(((rh.f1) d3Var2).b(n1Var))));
                    c1Var.u(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.class, new qh.h(this, o2Var, n1Var, uVar, max2));
                    return true;
                }
                uVar.c(ya.b.LOCATION);
                uVar.g(j18 + "(mls)\t" + (j18 / 60000) + "(min)");
                uVar.h("inc_scan_count", java.lang.String.valueOf(((rh.k2) d3Var).f395436d.f395552a));
            }
        }
        return true;
    }

    public void c(rh.c1 c1Var, qh.u uVar) {
        if (c1Var.f395329k == null || c1Var.f395330l == null) {
            return;
        }
        c1Var.u(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.class, new qh.k(this, c1Var, uVar));
        if (c1Var.t(rh.k.class) != null || c1Var.t(rh.t3.class) != null) {
            uVar.b("awake");
            c1Var.u(rh.k.class, new qh.l(this, c1Var, uVar));
            c1Var.u(rh.t3.class, new qh.m(this, c1Var, uVar));
        }
        if (c1Var.t(rh.z.class) != null || c1Var.t(rh.c4.class) != null || c1Var.t(rh.k2.class) != null) {
            uVar.b("scanning");
            c1Var.u(rh.z.class, new qh.n(this, c1Var, uVar));
            c1Var.u(rh.c4.class, new qh.o(this, c1Var, uVar));
            c1Var.u(rh.k2.class, new qh.p(this, c1Var, uVar));
        }
        if (c1Var.w(rh.w.class) == null && c1Var.t(rh.f1.class) == null && c1Var.t(rh.w1.class) == null && c1Var.t(rh.t1.class) == null) {
            return;
        }
        uVar.b("dev_stats");
        c1Var.u(rh.f1.class, new qh.q(this, c1Var, uVar));
        c1Var.u(rh.w1.class, new qh.r(this, c1Var, uVar));
        c1Var.u(rh.t1.class, new qh.s(this, c1Var, uVar));
    }
}
