package dr4;

/* loaded from: classes14.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.h f242618d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(dr4.h hVar) {
        super(0);
        this.f242618d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.opengl.EGLSurface eGLSurface;
        com.tencent.mars.xlog.Log.i("MicroMsg.EncodeWindowSurfaceRenderer", "createEGLContext create surface");
        dr4.h hVar = this.f242618d;
        if (hVar.f242636x) {
            rs0.g gVar = rs0.i.f399296a;
            android.opengl.EGLContext eGLContext = hVar.f242622u;
            kotlin.jvm.internal.o.d(eGLContext);
            rs0.h m17 = gVar.m(null, null, 1, 1, eGLContext);
            hVar.f242685k = m17;
            pq4.c l17 = gq4.v.Bi().l("ENCODE");
            if (l17 != null) {
                l17.f357683d = m17;
            }
        } else {
            pq4.c l18 = gq4.v.Bi().l("CAMERA");
            hVar.f242685k = l18 != null ? l18.f357683d : null;
        }
        dr4.q qVar = new dr4.q(0, 0, 1, 1);
        hVar.f242684j = qVar;
        rs0.h hVar2 = hVar.f242685k;
        if (hVar2 != null && (eGLSurface = hVar2.f399293b) != null) {
            qVar.f242730c = eGLSurface;
        }
        hVar.f242686l = new dr4.q0(hVar.f242688n, hVar.f242689o, 0, 0, 0, 1, true, 28, null);
        if (vq4.b0.q()) {
            dr4.h.n(hVar, new android.util.Size(hVar.f242688n, hVar.f242689o));
        } else {
            dr4.r1 r1Var = hVar.f242686l;
            if (r1Var != null) {
                r1Var.f348010s = new dr4.c(hVar);
            }
        }
        hVar.B = new android.util.Size(hVar.f242688n, hVar.f242689o);
        return jz5.f0.f302826a;
    }
}
