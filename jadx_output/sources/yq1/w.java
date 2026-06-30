package yq1;

/* loaded from: classes7.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f464488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f464489e;

    public w(java.util.List list, int i17) {
        this.f464488d = list;
        this.f464489e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f464489e;
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1 t1Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a;
        java.util.List<java.lang.String[]> items = this.f464488d;
        kotlin.jvm.internal.o.g(items, "items");
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1 t1Var2 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a;
        if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(t1Var2.s(i17))) {
            int m17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.m(i17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String[] strArr : items) {
                int parseInt = java.lang.Integer.parseInt(strArr[2]);
                java.lang.String str = strArr[3];
                java.lang.Iterable<ot0.s0> iterable = ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(java.lang.Long.parseLong(strArr[0]), strArr[1]).f348581i;
                if (parseInt > 0) {
                    kotlin.jvm.internal.o.d(iterable);
                    iterable = kz5.n0.K0(iterable, parseInt);
                }
                kotlin.jvm.internal.o.f(iterable, "let(...)");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(iterable, 10));
                for (ot0.s0 s0Var : iterable) {
                    java.lang.String str2 = s0Var.f348762e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    arrayList2.add(new com.tencent.mm.plugin.brandservice.ui.timeline.preload.b1(str2, s0Var.f348770o, str));
                }
                kz5.h0.u(arrayList, arrayList2);
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.b1 b1Var = (com.tencent.mm.plugin.brandservice.ui.timeline.preload.b1) it.next();
                arrayList3.add(new com.tencent.mm.plugin.brandservice.ui.timeline.preload.z0(b1Var.f94188a, t1Var2.j(b1Var.f94189b), b1Var.f94190c));
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.z0 z0Var = (com.tencent.mm.plugin.brandservice.ui.timeline.preload.z0) next;
                java.lang.String str3 = z0Var.f94485a;
                if (!(!hy4.i.p(str3) || com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94443i.b(str3, z0Var.f94486b))) {
                    arrayList4.add(next);
                }
            }
            int size = arrayList4.size();
            int max = java.lang.Math.max(arrayList4.size() - m17, 0);
            java.util.List K0 = kz5.n0.K0(arrayList4, m17);
            if (!K0.isEmpty()) {
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).y(i17, size, K0.size(), K0.size() / size, max, m17);
                t1Var2.d(K0, i17, max, 1);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadData preloadByInfoIdAndBuffer toStrip:");
                sb6.append(m17);
                sb6.append(" strip:");
                sb6.append(max);
                sb6.append(" dispatch:");
                java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(K0, 10));
                java.util.Iterator it7 = K0.iterator();
                while (it7.hasNext()) {
                    arrayList5.add(com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.d(((com.tencent.mm.plugin.brandservice.ui.timeline.preload.z0) it7.next()).f94485a));
                }
                sb6.append(arrayList5);
                com.tencent.mars.xlog.Log.i("MicroMsg.PreloadLogic", sb6.toString());
            }
        }
    }
}
