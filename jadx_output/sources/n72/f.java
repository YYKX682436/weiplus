package n72;

/* loaded from: classes14.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n72.q f335256d;

    public f(n72.q qVar) {
        this.f335256d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        n72.q qVar = this.f335256d;
        qVar.f335281p = n72.q.b(qVar);
        if (!this.f335256d.f335281p) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(917L, this.f335256d.G == 1 ? 3L : 39L, 1L, false);
            n72.q qVar2 = this.f335256d;
            qVar2.f335281p = n72.q.b(qVar2);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(917L, this.f335256d.G == 1 ? 2L : 38L, 1L, false);
        com.tencent.mm.sdk.platformtools.u3.h(new n72.e(this));
    }
}
