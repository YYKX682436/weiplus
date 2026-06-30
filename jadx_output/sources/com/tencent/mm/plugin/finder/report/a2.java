package com.tencent.mm.plugin.finder.report;

/* loaded from: classes10.dex */
public final class a2 implements com.tencent.mm.plugin.finder.ui.gl {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.report.y1 f124938a = com.tencent.mm.plugin.finder.report.y1.f125459s;

    /* renamed from: b, reason: collision with root package name */
    public boolean f124939b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f124940c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.service.l3 f124941d;

    public a2(androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.plugin.finder.service.l3 l3Var) {
        this.f124940c = appCompatActivity;
        this.f124941d = l3Var;
    }

    public void a(java.lang.String lifecycle) {
        kotlin.jvm.internal.o.g(lifecycle, "lifecycle");
        int hashCode = lifecycle.hashCode();
        boolean z17 = false;
        androidx.appcompat.app.AppCompatActivity finder = this.f124940c;
        switch (hashCode) {
            case -1340212393:
                if (lifecycle.equals("onPause")) {
                    this.f124938a = com.tencent.mm.plugin.finder.report.y1.f125459s;
                    this.f124939b = false;
                    return;
                }
                return;
            case -918269635:
                if (lifecycle.equals("onNewIntent")) {
                    this.f124938a = com.tencent.mm.plugin.finder.report.y1.f125461u;
                    return;
                }
                return;
            case 94292548:
                if (lifecycle.equals("onScreenOff")) {
                    this.f124938a = com.tencent.mm.plugin.finder.report.y1.f125462v;
                    return;
                }
                return;
            case 1046116283:
                if (lifecycle.equals("onCreate")) {
                    this.f124938a = (finder.getIntent().getFlags() & 1048576) > 0 ? com.tencent.mm.plugin.finder.report.y1.f125459s : com.tencent.mm.plugin.finder.report.y1.f125460t;
                    return;
                }
                return;
            case 1463983852:
                if (lifecycle.equals("onResume") && !this.f124939b) {
                    this.f124939b = true;
                    com.tencent.mm.plugin.finder.service.l3 l3Var = this.f124941d;
                    int size = l3Var.f126132r.size();
                    java.util.Set set = l3Var.f126132r;
                    if (size == 2) {
                        kotlin.jvm.internal.o.f(set, "<get-foregroundFinderActivity>(...)");
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj : set) {
                            if (obj instanceof com.tencent.mm.plugin.finder.ui.FinderMultiTaskRouterUI) {
                                arrayList.add(obj);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            z17 = true;
                        }
                    }
                    if (set.size() == 1 || z17 || (kotlin.jvm.internal.o.b(finder.getClass(), com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI.class) && this.f124938a == com.tencent.mm.plugin.finder.report.y1.f125461u)) {
                        if (z17) {
                            this.f124938a = com.tencent.mm.plugin.finder.report.y1.f125463w;
                        }
                        com.tencent.mm.plugin.finder.report.b2 b2Var = com.tencent.mm.plugin.finder.report.b2.f124965a;
                        b2Var.a(com.tencent.mm.plugin.finder.report.y1.f125458r);
                        b2Var.a(this.f124938a);
                        if (this.f124938a == com.tencent.mm.plugin.finder.report.y1.f125459s) {
                            kotlin.jvm.internal.o.g(finder, "finder");
                            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).mj(3, null);
                            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(finder, "special_enter_source", java.lang.Integer.valueOf(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Bi()));
                            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127643ce).getValue()).r()).intValue() == 1) {
                                com.tencent.mars.xlog.Log.i("FinderMultiTaskReporter", "switch multi task sessionId " + ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(finder).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135385q);
                                pm0.v.V(50L, new com.tencent.mm.plugin.finder.report.z1(finder));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
