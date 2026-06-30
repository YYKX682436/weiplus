package n91;

/* loaded from: classes7.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f335894d;

    public q(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f335894d = o6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final n91.g gVar = this.f335894d.K2;
        if (gVar != null) {
            if (gVar.f335873c.ordinal() >= 2) {
                gVar.a();
                return;
            }
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: n91.g$$b
                @Override // java.lang.Runnable
                public final void run() {
                    n91.g.this.a();
                }
            };
            if (gVar.f335873c.ordinal() >= 3) {
                runnable.run();
            } else {
                gVar.f335874d.add(runnable);
            }
        }
    }
}
