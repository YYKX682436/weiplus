package rw2;

/* loaded from: classes10.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rw2.t f400621d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(rw2.t tVar) {
        super(0);
        this.f400621d = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rw2.t tVar = this.f400621d;
        com.tencent.mars.xlog.Log.i(tVar.f400626c, "release");
        is0.c cVar = tVar.f400633j;
        if (cVar != null) {
            cVar.close();
        }
        android.view.Surface surface = tVar.f400631h;
        if (surface != null) {
            surface.release();
        }
        tVar.f400634k.b();
        is0.c cVar2 = tVar.f400636m;
        if (cVar2 != null) {
            cVar2.close();
        }
        rs0.h hVar = tVar.f400627d;
        if (hVar != null) {
            rs0.i.f399296a.u(hVar);
        }
        android.os.HandlerThread handlerThread = tVar.f400628e;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        tVar.f400628e = null;
        tVar.f400629f = null;
        return jz5.f0.f302826a;
    }
}
