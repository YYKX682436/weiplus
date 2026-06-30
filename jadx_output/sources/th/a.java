package th;

/* loaded from: classes12.dex */
public class a implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ th.o f419232a;

    public a(th.o oVar) {
        this.f419232a = oVar;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        java.lang.StringBuilder sb6;
        com.tencent.matrix.batterycanary.stats.k kVar;
        java.util.Iterator it;
        java.lang.Object obj2;
        rh.o2 o2Var = (rh.o2) obj;
        th.o oVar = this.f419232a;
        if (o2Var == null) {
            android.view.View view = oVar.f419267e;
            if (view != null) {
                android.widget.Toast.makeText(view.getContext(), "Skip dump: no data", 0).show();
                return;
            }
            return;
        }
        com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot jiffiesMonitorFeature$JiffiesSnapshot = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var.f395486c;
        if (jiffiesMonitorFeature$JiffiesSnapshot.f52558d != android.os.Process.myPid()) {
            android.view.View view2 = oVar.f419267e;
            if (view2 != null) {
                android.widget.Toast.makeText(view2.getContext(), "Skip dump: only support curr process now", 0).show();
                return;
            }
            return;
        }
        qh.u uVar = new qh.u();
        uVar.i();
        uVar.a("| TOP_THREAD_DUMP\n");
        if (o2Var.b()) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            long longValue = ((java.lang.Long) jiffiesMonitorFeature$JiffiesSnapshot.f52561g.f395552a).longValue();
            long j17 = o2Var.f395487d / 10;
            float k17 = sh.c.k(longValue, j17);
            linkedHashMap.put("load", java.lang.Float.valueOf(k17));
            uVar.b("Proc");
            uVar.h("pid", java.lang.String.valueOf(jiffiesMonitorFeature$JiffiesSnapshot.f52558d));
            uVar.h("cmm", java.lang.String.valueOf(jiffiesMonitorFeature$JiffiesSnapshot.f52560f));
            uVar.h("load", sh.c.m(k17, 1) + "%");
            uVar.c("Thread(" + jiffiesMonitorFeature$JiffiesSnapshot.f52562h.f395560a.size() + ")");
            uVar.g("  TID\tLOAD \tSTATUS \tTHREAD_NAME \tJIFFY");
            java.util.Iterator it6 = jiffiesMonitorFeature$JiffiesSnapshot.f52562h.f395560a.iterator();
            while (true) {
                boolean hasNext = it6.hasNext();
                sb6 = uVar.f363387a;
                if (!hasNext) {
                    break;
                }
                com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesEntry threadJiffiesEntry = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesEntry) it6.next();
                java.util.Iterator it7 = it6;
                long longValue2 = ((java.lang.Long) threadJiffiesEntry.f395552a).longValue();
                sb6.append((java.lang.Object) "|   -> ");
                sb6.append((java.lang.Object) sh.c.l(java.lang.String.valueOf(threadJiffiesEntry.f52565b), 5));
                sb6.append((java.lang.Object) "\t");
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
                sb7.append(sh.c.m(sh.c.k(longValue2, j17), 1));
                sb7.append("%");
                sb6.append((java.lang.Object) sh.c.l(sb7.toString(), 4));
                sb6.append((java.lang.Object) "\t");
                sb6.append((java.lang.Object) (threadJiffiesEntry.f52567d ? "+" : "~"));
                sb6.append((java.lang.Object) "/");
                sb6.append((java.lang.Object) threadJiffiesEntry.f52568e);
                sb6.append((java.lang.Object) "\t");
                sb6.append((java.lang.Object) sh.c.l(threadJiffiesEntry.f52566c, 16));
                sb6.append((java.lang.Object) "\t");
                sb6.append(java.lang.Long.valueOf(longValue2));
                sb6.append((java.lang.Object) "\t");
                uVar.a("\n");
                it6 = it7;
                linkedHashMap = linkedHashMap2;
            }
            java.util.LinkedHashMap linkedHashMap3 = linkedHashMap;
            uVar.b("Stacks");
            java.util.Iterator it8 = jiffiesMonitorFeature$JiffiesSnapshot.f52562h.f395560a.iterator();
            while (it8.hasNext()) {
                com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesEntry threadJiffiesEntry2 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesEntry) it8.next();
                if (sh.c.k(((java.lang.Long) threadJiffiesEntry2.f395552a).longValue(), j17) <= 0.0f) {
                    break;
                }
                uVar.c(threadJiffiesEntry2.f52566c + "(" + threadJiffiesEntry2.f52565b + ")");
                java.lang.String a17 = oVar.f419271i.a(threadJiffiesEntry2.f52565b);
                java.util.LinkedHashMap linkedHashMap4 = linkedHashMap3;
                linkedHashMap4.put("stack_" + threadJiffiesEntry2.f52566c + "(" + threadJiffiesEntry2.f52565b + ")", a17);
                java.lang.String[] split = a17.split("\n");
                int length = split.length;
                int i17 = 0;
                int i18 = 0;
                while (i17 < length) {
                    java.lang.String str = split[i17];
                    if (i18 == 0) {
                        it = it8;
                        obj2 = "|   -> ";
                    } else {
                        it = it8;
                        obj2 = "|      ";
                    }
                    sb6.append(obj2);
                    sb6.append((java.lang.Object) str);
                    uVar.a("\n");
                    i18++;
                    i17++;
                    it8 = it;
                }
                linkedHashMap3 = linkedHashMap4;
            }
            java.util.LinkedHashMap linkedHashMap5 = linkedHashMap3;
            qh.f0 f0Var = oVar.f419268f;
            if (f0Var != null && (kVar = (com.tencent.matrix.batterycanary.stats.k) f0Var.i(com.tencent.matrix.batterycanary.stats.k.class)) != null) {
                kVar.k("MATRIX_TOP_DUMP", jiffiesMonitorFeature$JiffiesSnapshot.f52558d, linkedHashMap5);
            }
        } else {
            uVar.b("Invalid data, ignore");
        }
        uVar.f();
        uVar.d();
        android.view.View view3 = oVar.f419267e;
        if (view3 != null) {
            android.widget.Toast.makeText(view3.getContext(), "Dump finish, search TAG 'TOP_THREAD_DUMP' for detail", 1).show();
        }
    }
}
