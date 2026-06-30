package sk4;

/* loaded from: classes15.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sk4.p f408980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sk4.c f408981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f408982f;

    public k(sk4.p pVar, sk4.c cVar, int i17) {
        this.f408980d = pVar;
        this.f408981e = cVar;
        this.f408982f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sk4.p pVar = this.f408980d;
        if (pVar.f408992g) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AudioRecorderImpl", "already get final");
            return;
        }
        boolean z17 = ((double) this.f408982f) < ((double) pVar.f409000r) * 0.8d;
        sk4.c cVar = this.f408981e;
        cVar.f300433f = z17;
        cVar.notifyFieldUpdated(2);
        pVar.f408992g = cVar.f300433f;
        yz5.l lVar = pVar.f408997o;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf((int) cVar.f300432e));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioRecorderImpl", "run: " + pVar.f408994i + ", pp: " + cVar.f300432e + ", final: " + cVar.f300433f + ", data: " + cVar.f408969g);
        if (!pVar.f408993h) {
            pVar.f408993h = true;
            jm4.q4.a(jm4.r4.f300421a, "RecordFirstBuffer", false, 0L, null, 14, null);
        }
        java.util.Iterator it = pVar.f408996n.iterator();
        while (it.hasNext()) {
            jm4.y0 y0Var = (jm4.y0) ((com.tencent.unit_rc.WeakPtr) it.next()).lock();
            if (y0Var != null) {
                y0Var.oe(cVar);
            }
        }
    }
}
