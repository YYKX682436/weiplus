package n91;

/* loaded from: classes7.dex */
public class c implements com.tencent.mm.plugin.appbrand.td {

    /* renamed from: d, reason: collision with root package name */
    public final n91.g f335855d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.y f335856e = new n91.b(this);

    public c(n91.g gVar) {
        this.f335855d = gVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.td
    public com.tencent.mm.plugin.appbrand.w0 Cf() {
        return com.tencent.mm.plugin.appbrand.w0.HIDE;
    }

    @Override // com.tencent.mm.plugin.appbrand.td
    public void Cg(com.tencent.mm.plugin.appbrand.sd sdVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.td
    public boolean D0() {
        return this.f335855d.f335873c.ordinal() == 2;
    }

    @Override // com.tencent.mm.plugin.appbrand.td
    public void Q5(com.tencent.mm.plugin.appbrand.sd sdVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.td
    public boolean S1() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.td
    public void Yh() {
        n91.g gVar = this.f335855d;
        if (gVar.f335873c == n91.j.ENTERING_FULL_SCREEN) {
            n91.c0 c0Var = (n91.c0) gVar.f335871a;
            c0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicGameLoadingImpl", "[gameload] onRotationDone");
            ((ne0.n) ((oe0.r) i95.n0.c(oe0.r.class))).Ai("rotationDone", c0Var.f335859c, "");
            c0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicGameLoadingImpl", "[gameload] onFullScreenDone");
            ((ne0.n) ((oe0.r) i95.n0.c(oe0.r.class))).Ai("fullScreenDone", c0Var.f335859c, "");
            com.tencent.mm.ui.widget.RoundCornerLinearLayout roundCornerLinearLayout = c0Var.f335868l;
            if (roundCornerLinearLayout != null) {
                roundCornerLinearLayout.setVisibility(4);
            }
            gVar.f335873c = n91.j.FULL_SCREEN;
            java.util.LinkedList linkedList = gVar.f335874d;
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
            linkedList.clear();
        }
        com.tencent.mm.plugin.appbrand.o6 o6Var = gVar.f335872b;
        new com.tencent.mm.plugin.appbrand.task.ipc.AppBrandUpdateTask(o6Var, o6Var.S2(false), true).d();
    }

    @Override // com.tencent.mm.plugin.appbrand.td
    public void bringToFront() {
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.td tdVar = (com.tencent.mm.plugin.appbrand.td) obj;
        if (tdVar instanceof n91.c) {
            if (this.f335855d == ((n91.c) tdVar).f335855d) {
                return 0;
            }
        }
        return hashCode() - tdVar.hashCode();
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return ((n91.b) this.f335856e).f335853d;
    }

    @Override // com.tencent.mm.plugin.appbrand.td
    public void h2() {
    }
}
