package pv2;

/* loaded from: classes10.dex */
public final class e extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final pv2.g f358576f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pv2.f f358577g;

    public e(pv2.f fVar, pv2.g stage) {
        kotlin.jvm.internal.o.g(stage, "stage");
        this.f358577g = fVar;
        this.f358576f = stage;
    }

    @Override // fp0.d
    public void a() {
        pv2.m mVar;
        pv2.g gVar = this.f358576f;
        if (gVar instanceof pv2.m) {
            pv2.g to6 = ((pv2.m) gVar).c();
            pv2.g from = this.f358576f;
            com.tencent.mars.xlog.Log.i("Finder.PipelineCore", "[dealNextStage] taskId:" + this.f358576f.b());
            if (to6 instanceof pv2.m) {
                pv2.g gVar2 = this.f358576f;
                mVar = gVar2 instanceof pv2.m ? (pv2.m) gVar2 : null;
                if (mVar != null) {
                    mVar.e(to6);
                }
            } else if (to6 instanceof pv2.l) {
                pv2.g gVar3 = this.f358576f;
                mVar = gVar3 instanceof pv2.m ? (pv2.m) gVar3 : null;
                if (mVar != null) {
                    mVar.e(to6);
                }
            } else if (to6 instanceof pv2.d) {
                pv2.g gVar4 = this.f358576f;
                mVar = gVar4 instanceof pv2.m ? (pv2.m) gVar4 : null;
                if (mVar != null) {
                    mVar.d(to6);
                }
            } else if (to6 instanceof pv2.n) {
                pv2.g gVar5 = this.f358576f;
                mVar = gVar5 instanceof pv2.m ? (pv2.m) gVar5 : null;
                if (mVar != null) {
                    mVar.f(to6);
                }
            }
            pv2.f fVar = this.f358577g;
            synchronized (fVar.f358578a) {
                fVar.f358578a.put(this.f358576f.b(), to6);
                com.tencent.mars.xlog.Log.i("Finder.PipelineCore", "[dealNextStage] add next stage, taskId:" + this.f358576f.b());
            }
            pv2.f fVar2 = this.f358577g;
            java.lang.String taskId = this.f358576f.b();
            fVar2.getClass();
            kotlin.jvm.internal.o.g(taskId, "taskId");
            kotlin.jvm.internal.o.g(from, "from");
            kotlin.jvm.internal.o.g(to6, "to");
            ov2.d dVar = ((ov2.c) this.f358577g).f349172e;
            if (dVar != null) {
                dVar.a(this.f358576f.b(), from, to6);
            }
            ov2.c cVar = (ov2.c) this.f358577g;
            cVar.getClass();
            pv2.c cVar2 = (pv2.c) ((java.util.LinkedHashMap) cVar.f349171d).get(java.lang.Integer.valueOf(to6.a()));
            if (cVar2 == null) {
                cVar2 = cVar.f349170c;
            }
            cVar2.a(new pv2.e(this.f358577g, to6));
        } else if (gVar instanceof pv2.a) {
            ((pv2.a) gVar).c();
            com.tencent.mars.xlog.Log.i("Finder.PipelineCore", "[call] taskId:" + ((pv2.a) this.f358576f).f358572d);
            pv2.f fVar3 = this.f358577g;
            synchronized (fVar3.f358578a) {
                fVar3.f358578a.remove(this.f358576f.b());
                com.tencent.mars.xlog.Log.i("Finder.PipelineCore", "[call] remove taskId:" + ((pv2.a) this.f358576f).f358572d);
            }
            ov2.d dVar2 = ((ov2.c) this.f358577g).f349172e;
            if (dVar2 != null) {
                dVar2.b(this.f358576f.b(), this.f358576f);
            }
            pv2.f fVar4 = this.f358577g;
            pv2.g finalStage = this.f358576f;
            java.lang.String taskId2 = ((pv2.a) finalStage).f358572d;
            ov2.c cVar3 = (ov2.c) fVar4;
            cVar3.getClass();
            kotlin.jvm.internal.o.g(taskId2, "taskId");
            kotlin.jvm.internal.o.g(finalStage, "finalStage");
            cVar3.b(finalStage);
        }
        b(fp0.u.f265290f);
    }

    @Override // fp0.d
    public java.lang.String d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        pv2.g gVar = this.f358576f;
        sb6.append(gVar.getClass().getSimpleName());
        sb6.append('_');
        sb6.append(gVar.b());
        return sb6.toString();
    }
}
