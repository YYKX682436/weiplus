package jk3;

/* loaded from: classes8.dex */
public final class o implements kk3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jk3.v f300100a;

    public o(jk3.v vVar) {
        this.f300100a = vVar;
    }

    @Override // kk3.d
    public void b(android.graphics.Bitmap bitmap, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PageMultiTaskHelper", "swipeBack animation end, way:" + i17);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.multitask.l0.Bd((com.tencent.mm.plugin.multitask.l0) c17, 2, null, 0, null, 14, null);
        jk3.v vVar = this.f300100a;
        android.graphics.Bitmap P = vVar.F(i17) ? vVar.P(bitmap, vVar.f300124q) : null;
        vVar.r(P, vVar.f300127t);
        this.f300100a.X(P, i17 == 4, false, false, true);
        ak3.c cVar = vVar.f300111d;
        if (cVar != null) {
            ((ak3.i) cVar).t(true);
        }
    }

    @Override // kk3.d
    public void d(android.graphics.Bitmap bitmap, boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PageMultiTaskHelper", "swipeBack start, isSwipeBack:" + z17 + " ,way:" + i17);
        jk3.v vVar = this.f300100a;
        vVar.O(new jk3.n(vVar, z17, i17, bitmap));
    }

    @Override // kk3.d
    public void e(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PageMultiTaskHelper", "swipeBack animation cancel, way:" + i17);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.multitask.l0.Bd((com.tencent.mm.plugin.multitask.l0) c17, 2, null, 0, null, 14, null);
        jk3.v vVar = this.f300100a;
        ak3.c cVar = vVar.f300111d;
        if (vVar.F(i17)) {
            ak3.c cVar2 = vVar.f300111d;
            r2 = vVar.P(cVar2 != null ? cVar2.getBitmap() : null, vVar.f());
        }
        vVar.l(r2, i17 == 4);
        vVar.r(r2, vVar.f300127t);
        ak3.c cVar3 = vVar.f300111d;
        if (cVar3 != null) {
            cVar3.j(true, vVar);
        }
        ak3.c cVar4 = vVar.f300111d;
        if (cVar4 != null) {
            ((ak3.i) cVar4).t(true);
        }
    }
}
