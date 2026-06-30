package ow1;

/* loaded from: classes14.dex */
public final class a implements hw1.c {

    /* renamed from: a, reason: collision with root package name */
    public ow1.b f349360a;

    @Override // hw1.c
    public java.lang.Object b(kotlin.coroutines.Continuation continuation) {
        ow1.b bVar = this.f349360a;
        if (bVar != null) {
            synchronized (bVar) {
                ar4.d dVar = bVar.f349361a;
                if (dVar != null) {
                    dVar.a();
                }
                bVar.f349361a = null;
                android.opengl.GLES20.glDeleteProgram(bVar.f349362b);
                ar4.c cVar = ar4.c.f13401a;
                ar4.c.f13402b = null;
                ar4.c.f13403c = false;
            }
        }
        this.f349360a = null;
        jz5.f0 f0Var = jz5.f0.f302826a;
        pz5.a aVar = pz5.a.f359186d;
        return f0Var;
    }

    @Override // hw1.c
    public java.lang.Object c(hw1.a aVar, kotlin.coroutines.Continuation continuation) {
        android.support.v4.media.f.a(aVar);
        if (this.f349360a == null) {
            ar4.c.f13401a.b(rh0.b0.f395581e);
            ow1.b bVar = new ow1.b();
            this.f349360a = bVar;
            ar4.d dVar = bVar.f349361a;
            if (dVar != null && dVar.f13410f) {
                dVar.f13410f = false;
                p05.l4 l4Var = dVar.f13409e;
                if (l4Var != null) {
                    l4Var.C(false);
                }
            }
        }
        throw null;
    }
}
