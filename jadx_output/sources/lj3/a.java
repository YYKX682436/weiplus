package lj3;

/* loaded from: classes14.dex */
public final class a implements ej3.c {

    /* renamed from: a, reason: collision with root package name */
    public lj3.d f318971a;

    @Override // ej3.c
    public java.lang.Object b(kotlin.coroutines.Continuation continuation) {
        lj3.d dVar = this.f318971a;
        if (dVar != null) {
            synchronized (dVar) {
                ar4.d dVar2 = dVar.f318977a;
                if (dVar2 != null) {
                    dVar2.a();
                }
                dVar.f318977a = null;
                android.opengl.GLES20.glDeleteProgram(dVar.f318978b);
                ar4.c cVar = ar4.c.f13401a;
                ar4.c.f13402b = null;
                ar4.c.f13403c = false;
            }
        }
        this.f318971a = null;
        jz5.f0 f0Var = jz5.f0.f302826a;
        pz5.a aVar = pz5.a.f359186d;
        return f0Var;
    }

    @Override // ej3.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(lj3.b bVar, kotlin.coroutines.Continuation continuation) {
        if (this.f318971a == null) {
            ar4.c.f13401a.b(rh0.b0.f395581e);
            lj3.d dVar = new lj3.d();
            this.f318971a = dVar;
            ar4.d dVar2 = dVar.f318977a;
            if (dVar2 != null && dVar2.f13410f) {
                dVar2.f13410f = false;
                p05.l4 l4Var = dVar2.f13409e;
                if (l4Var != null) {
                    l4Var.C(false);
                }
            }
        }
        mj3.g gVar = bVar.f318972a;
        is0.c cVar = bVar.f318973b;
        int i17 = gVar.f327050a;
        int i18 = gVar.f327051b;
        cVar.f294400m = i17;
        cVar.f294401n = i18;
        is0.c cVar2 = bVar.f318974c;
        cVar2.f294400m = i17;
        cVar2.f294401n = i18;
        lj3.d dVar3 = this.f318971a;
        if (dVar3 != null) {
            int i19 = gVar.f327052c;
            boolean z17 = gVar.f327053d;
            int i27 = cVar.f294395e;
            ar4.c cVar3 = ar4.c.f13401a;
            if (!ar4.c.f13403c) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VirtualBackgroundFilter", "initRenderProc");
                ar4.c.f13403c = true;
                ar4.c.f13404d = new org.json.JSONArray();
            }
            if (i27 != -1) {
                if (dVar3.f318977a == null) {
                    dVar3.f318977a = new ar4.d();
                    ar4.d dVar4 = dVar3.f318977a;
                    if (dVar4 != null) {
                        dVar4.c(i27, cVar2, true);
                    }
                }
                ar4.d dVar5 = dVar3.f318977a;
                if (dVar5 != null && dVar5.f13410f) {
                    dVar5.f13410f = false;
                    p05.l4 l4Var2 = dVar5.f13409e;
                    if (l4Var2 != null) {
                        l4Var2.C(false);
                    }
                }
                ar4.d dVar6 = dVar3.f318977a;
                if (dVar6 != null) {
                    dVar6.d(i17, i18);
                    dVar6.f13405a = i27;
                    dVar6.f13406b = cVar2;
                    dVar6.b(i19, 0, z17);
                }
                android.opengl.GLES20.glFinish();
            }
        }
        return new lj3.c(bVar.f318972a, bVar.f318974c.f294395e);
    }
}
