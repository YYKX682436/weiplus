package ol4;

/* loaded from: classes14.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol4.q f346154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ol4.q qVar) {
        super(0);
        this.f346154d = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ol4.q qVar = this.f346154d;
        qVar.f346189k = true;
        ((kk4.f0) qVar.f346180b).pause();
        pl4.k kVar = qVar.f346199u;
        if (kVar != null) {
            kVar.j(false);
        }
        wu5.c cVar = qVar.f346186h;
        if (cVar != null) {
            cVar.cancel(false);
        }
        qVar.f346186h = null;
        com.tencent.mars.xlog.Log.i(qVar.f346197s, "call pause cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return jz5.f0.f302826a;
    }
}
