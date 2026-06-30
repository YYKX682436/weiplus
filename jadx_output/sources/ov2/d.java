package ov2;

/* loaded from: classes10.dex */
public final class d implements pv2.j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f349174a;

    public d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f349174a = arrayList;
        arrayList.add(new vv2.a());
        arrayList.add(new vv2.b());
    }

    @Override // pv2.j
    public void a(java.lang.String taskId, pv2.g from, pv2.g to6) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        kotlin.jvm.internal.o.g(from, "from");
        kotlin.jvm.internal.o.g(to6, "to");
        com.tencent.mars.xlog.Log.i("Finder.FinderPostStageMonitor", "PostLog transfer from:" + pv2.i.a(from) + ", to:" + pv2.i.a(to6));
        java.util.Iterator it = this.f349174a.iterator();
        while (it.hasNext()) {
            ((pv2.j) it.next()).a(taskId, from, to6);
        }
    }

    @Override // pv2.j
    public void b(java.lang.String taskId, pv2.g endStage) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        kotlin.jvm.internal.o.g(endStage, "endStage");
        com.tencent.mars.xlog.Log.i("Finder.FinderPostStageMonitor", "PostLog end:" + pv2.i.a(endStage));
        java.util.Iterator it = this.f349174a.iterator();
        while (it.hasNext()) {
            ((pv2.j) it.next()).b(taskId, endStage);
        }
    }

    @Override // pv2.j
    public void c(java.lang.String taskId, pv2.g beginStage) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        kotlin.jvm.internal.o.g(beginStage, "beginStage");
        com.tencent.mars.xlog.Log.i("Finder.FinderPostStageMonitor", "PostLog begin:" + pv2.i.a(beginStage));
        java.util.Iterator it = this.f349174a.iterator();
        while (it.hasNext()) {
            ((pv2.j) it.next()).c(taskId, beginStage);
        }
    }
}
