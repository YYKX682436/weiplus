package pq4;

/* loaded from: classes12.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pq4.c f357678d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(pq4.c cVar) {
        super(0);
        this.f357678d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pq4.c cVar = this.f357678d;
        rs0.h hVar = cVar.f357683d;
        if (hVar != null) {
            rs0.i.f399296a.u(hVar);
        }
        android.os.HandlerThread handlerThread = cVar.f357682c;
        handlerThread.quitSafely();
        com.tencent.mm.sdk.platformtools.n3 n3Var = cVar.f357681b;
        if (n3Var != null) {
            n3Var.quitSafely();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipThread", "release: " + handlerThread.getName());
        return jz5.f0.f302826a;
    }
}
