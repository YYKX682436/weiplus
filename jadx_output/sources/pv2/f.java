package pv2;

/* loaded from: classes10.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f358578a = new java.util.HashMap();

    public final void a(pv2.m stage) {
        kotlin.jvm.internal.o.g(stage, "stage");
        com.tencent.mars.xlog.Log.i("Finder.PipelineCore", "[start] taskId:" + stage.f358582d);
        synchronized (this.f358578a) {
            if (this.f358578a.containsKey(stage.f358582d)) {
                com.tencent.mars.xlog.Log.i("Finder.PipelineCore", "[start] task in pipeline return, taskId:" + stage.f358582d);
                return;
            }
            ov2.c cVar = (ov2.c) this;
            pv2.c cVar2 = (pv2.c) ((java.util.LinkedHashMap) cVar.f349171d).get(java.lang.Integer.valueOf(stage.a()));
            if (cVar2 == null) {
                cVar2 = cVar.f349170c;
            }
            this.f358578a.put(stage.f358582d, stage);
            ov2.d dVar = cVar.f349172e;
            if (dVar != null) {
                dVar.c(stage.f358582d, stage);
            }
            com.tencent.mars.xlog.Log.i("Finder.PipelineCore", "[start] exec taskId:" + stage.f358582d);
            cVar2.a(new pv2.e(this, stage));
        }
    }
}
