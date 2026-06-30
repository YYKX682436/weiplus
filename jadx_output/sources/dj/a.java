package dj;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dj.b f232813d;

    public a(dj.b bVar) {
        this.f232813d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        dj.b bVar = this.f232813d;
        ej.c cVar = bVar.f232814h;
        if (cVar.f253255b || cVar.f253256c) {
            com.tencent.matrix.trace.core.AppMethodBeat.getInstance().onStart();
        } else {
            com.tencent.matrix.trace.core.AppMethodBeat.getInstance().forceStop();
        }
        gj.o.f272367n.e();
        ej.c cVar2 = bVar.f232814h;
        if (cVar2.f253257d) {
            bVar.f232818o.g();
        }
        if (cVar2.f253258e) {
            kj.q qVar = new kj.q(cVar2);
            bVar.getClass();
            qVar.g();
        }
        if (cVar2.f253259f) {
            com.tencent.matrix.trace.tracer.TouchEventLagTracer touchEventLagTracer = new com.tencent.matrix.trace.tracer.TouchEventLagTracer(cVar2);
            bVar.getClass();
            touchEventLagTracer.g();
        }
        cVar2.getClass();
        cVar2.getClass();
        if (cVar2.f253255b) {
            bVar.f232815i.g();
        }
        if (cVar2.f253256c) {
            bVar.f232816m.g();
        }
        cVar2.getClass();
    }
}
