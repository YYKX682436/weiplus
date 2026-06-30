package lf4;

/* loaded from: classes4.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.q0 f318447d;

    public n0(lf4.q0 q0Var) {
        this.f318447d = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lf4.q0 q0Var = this.f318447d;
        if4.f fVar = (if4.f) kz5.n0.a0(q0Var.f318465i, q0Var.f318469p);
        if4.a aVar = fVar != null ? fVar.f291248f : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSelectedRead ");
        sb6.append(q0Var.f318469p);
        sb6.append(", ");
        sb6.append(aVar != null ? java.lang.Boolean.valueOf(aVar.f291237e) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelfGalleryPresenter", sb6.toString());
        if (aVar != null) {
            java.util.LinkedList linkedList = aVar.f291242j;
            if (linkedList.size() > 0) {
                gf4.l lVar = gf4.l.f271354d;
                long j17 = aVar.f291234b;
                java.lang.Object last = linkedList.getLast();
                kotlin.jvm.internal.o.f(last, "getLast(...)");
                lVar.l(j17, (gf4.a) last);
                pm0.v.X(new lf4.m0(aVar, q0Var));
            }
        }
    }
}
