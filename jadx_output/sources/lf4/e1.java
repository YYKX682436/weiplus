package lf4;

/* loaded from: classes4.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.j1 f318385d;

    public e1(lf4.j1 j1Var) {
        this.f318385d = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lf4.j1 j1Var = this.f318385d;
        int i17 = j1Var.f318428r;
        if (i17 < 0 || i17 >= j1Var.f318422i.size()) {
            return;
        }
        java.lang.Object obj = j1Var.f318422i.get(j1Var.f318428r);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        if4.f fVar = (if4.f) kz5.n0.a0(arrayList, j1Var.f318429s);
        if4.a aVar = fVar != null ? fVar.f291248f : null;
        if4.f fVar2 = (if4.f) kz5.n0.a0(arrayList, j1Var.f318429s);
        nf4.j jVar = fVar2 != null ? fVar2.f291243a : null;
        java.lang.String str = j1Var.f318421h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSelectedRead ");
        sb6.append(j1Var.f318429s);
        sb6.append(", ");
        sb6.append(aVar != null ? java.lang.Boolean.valueOf(aVar.f291236d) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (j1Var.f318432v) {
            if (jVar == null || !jVar.w0()) {
                return;
            }
            jVar.F0(false);
            long j17 = jVar.field_storyID;
            int i18 = jVar.field_localFlag;
            ef4.w.f252468t.i().f336872h.A("MMStoryInfo", "UPDATE MMStoryInfo SET localFlag = " + i18 + " Where storyID = '" + j17 + '\'');
            pm0.v.X(new lf4.c1(j1Var));
            return;
        }
        if (jVar != null && jVar.w0()) {
            jVar.F0(false);
            long j18 = jVar.field_storyID;
            int i19 = jVar.field_localFlag;
            ef4.w.f252468t.i().f336872h.A("MMStoryInfo", "UPDATE MMStoryInfo SET localFlag = " + i19 + " Where storyID = '" + j18 + '\'');
        }
        if (aVar != null) {
            java.util.LinkedList linkedList = aVar.f291239g;
            if (linkedList.size() > 0) {
                gf4.l lVar = gf4.l.f271354d;
                long j19 = aVar.f291234b;
                java.lang.Object last = linkedList.getLast();
                kotlin.jvm.internal.o.f(last, "getLast(...)");
                if (lVar.l(j19, (gf4.a) last)) {
                    pm0.v.X(new lf4.d1(aVar, j1Var));
                }
            }
        }
    }
}
