package lf4;

/* loaded from: classes4.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.q0 f318437d;

    public l0(lf4.q0 q0Var) {
        this.f318437d = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lf4.q0 q0Var = this.f318437d;
        if4.f fVar = (if4.f) kz5.n0.a0(q0Var.f318465i, q0Var.f318469p);
        if4.a aVar = fVar != null ? fVar.f291248f : null;
        if4.f fVar2 = (if4.f) kz5.n0.a0(q0Var.f318465i, q0Var.f318469p);
        nf4.j jVar = fVar2 != null ? fVar2.f291243a : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSelectedRead ");
        sb6.append(q0Var.f318469p);
        sb6.append(", ");
        sb6.append(aVar != null ? java.lang.Boolean.valueOf(aVar.f291236d) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelfGalleryPresenter", sb6.toString());
        if (bf4.f.f19715b.f()) {
            if (jVar == null || !jVar.w0()) {
                return;
            }
            jVar.F0(false);
            long j17 = jVar.field_storyID;
            int i17 = jVar.field_localFlag;
            ef4.w.f252468t.i().f336872h.A("MMStoryInfo", "UPDATE MMStoryInfo SET localFlag = " + i17 + " Where storyID = '" + j17 + '\'');
            pm0.v.X(new lf4.j0(q0Var));
            return;
        }
        if (jVar != null && jVar.w0()) {
            jVar.F0(false);
            long j18 = jVar.field_storyID;
            int i18 = jVar.field_localFlag;
            ef4.w.f252468t.i().f336872h.A("MMStoryInfo", "UPDATE MMStoryInfo SET localFlag = " + i18 + " Where storyID = '" + j18 + '\'');
        }
        if (aVar != null) {
            java.util.LinkedList linkedList = aVar.f291239g;
            if (linkedList.size() > 0) {
                gf4.l lVar = gf4.l.f271354d;
                long j19 = aVar.f291234b;
                java.lang.Object last = linkedList.getLast();
                kotlin.jvm.internal.o.f(last, "getLast(...)");
                if (lVar.l(j19, (gf4.a) last)) {
                    pm0.v.X(new lf4.k0(aVar, q0Var));
                }
            }
        }
    }
}
