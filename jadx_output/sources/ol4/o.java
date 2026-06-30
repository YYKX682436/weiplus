package ol4;

/* loaded from: classes14.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol4.q f346176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346177e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ol4.q qVar, java.lang.String str) {
        super(0);
        this.f346176d = qVar;
        this.f346177e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ol4.q qVar = this.f346176d;
        pl4.k kVar = qVar.f346199u;
        if (kVar != null) {
            kVar.j(true);
        }
        ((kk4.f0) qVar.f346180b).stop();
        wu5.c cVar = qVar.f346186h;
        if (cVar != null) {
            cVar.cancel(false);
        }
        qVar.f346186h = null;
        com.tencent.mars.xlog.Log.i(qVar.f346197s, "call stop cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", " + this.f346177e);
        return jz5.f0.f302826a;
    }
}
