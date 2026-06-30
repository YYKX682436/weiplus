package w6;

/* loaded from: classes13.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f443236a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f443237b;

    /* renamed from: c, reason: collision with root package name */
    public final i7.e f443238c;

    /* renamed from: d, reason: collision with root package name */
    public final m3.e f443239d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f443240e;

    public v(java.lang.Class cls, java.lang.Class cls2, java.lang.Class cls3, java.util.List list, i7.e eVar, m3.e eVar2) {
        this.f443236a = cls;
        this.f443237b = list;
        this.f443238c = eVar;
        this.f443239d = eVar2;
        this.f443240e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public w6.z0 a(u6.g gVar, int i17, int i18, t6.l lVar, w6.u uVar) {
        w6.z0 z0Var;
        t6.p pVar;
        t6.c cVar;
        boolean z17;
        t6.h hVar;
        m3.e eVar = this.f443239d;
        java.lang.Object a17 = eVar.a();
        q7.n.b(a17);
        java.util.List list = (java.util.List) a17;
        try {
            w6.z0 b17 = b(gVar, i17, i18, lVar, list);
            eVar.b(list);
            w6.n nVar = (w6.n) uVar;
            w6.t tVar = nVar.f443173b;
            tVar.getClass();
            java.lang.Class<?> cls = b17.get().getClass();
            t6.a aVar = t6.a.RESOURCE_DISK_CACHE;
            t6.a aVar2 = nVar.f443172a;
            w6.l lVar2 = tVar.f443210d;
            t6.o oVar = null;
            if (aVar2 != aVar) {
                t6.p e17 = lVar2.e(cls);
                z0Var = e17.a(tVar.f443217n, b17, tVar.f443221r, tVar.f443222s);
                pVar = e17;
            } else {
                z0Var = b17;
                pVar = null;
            }
            if (!b17.equals(z0Var)) {
                b17.recycle();
            }
            if (lVar2.f443135c.f43946b.f43962d.a(z0Var.a()) != null) {
                com.bumptech.glide.m mVar = lVar2.f443135c.f43946b;
                mVar.getClass();
                oVar = mVar.f43962d.a(z0Var.a());
                if (oVar == null) {
                    throw new com.bumptech.glide.k(z0Var.a());
                }
                cVar = oVar.a(tVar.f443224u);
            } else {
                cVar = t6.c.NONE;
            }
            t6.h hVar2 = tVar.D;
            java.util.ArrayList arrayList = (java.util.ArrayList) lVar2.b();
            int size = arrayList.size();
            int i19 = 0;
            while (true) {
                if (i19 >= size) {
                    z17 = false;
                    break;
                }
                if (((a7.o0) arrayList.get(i19)).f1846a.equals(hVar2)) {
                    z17 = true;
                    break;
                }
                i19++;
            }
            if (tVar.f443223t.d(!z17, aVar2, cVar)) {
                if (oVar == null) {
                    throw new com.bumptech.glide.k(z0Var.get().getClass());
                }
                int ordinal = cVar.ordinal();
                if (ordinal == 0) {
                    hVar = new w6.h(tVar.D, tVar.f443218o);
                } else {
                    if (ordinal != 1) {
                        throw new java.lang.IllegalArgumentException("Unknown strategy: " + cVar);
                    }
                    hVar = new w6.b1(lVar2.f443135c.f43945a, tVar.D, tVar.f443218o, tVar.f443221r, tVar.f443222s, pVar, cls, tVar.f443224u);
                }
                w6.y0 y0Var = (w6.y0) ((r7.e) w6.y0.f443246h).a();
                q7.n.b(y0Var);
                y0Var.f443250g = false;
                y0Var.f443249f = true;
                y0Var.f443248e = z0Var;
                w6.o oVar2 = tVar.f443215i;
                oVar2.f443174a = hVar;
                oVar2.f443175b = oVar;
                oVar2.f443176c = y0Var;
                z0Var = y0Var;
            }
            return this.f443238c.a(z0Var, lVar);
        } catch (java.lang.Throwable th6) {
            eVar.b(list);
            throw th6;
        }
    }

    public final w6.z0 b(u6.g gVar, int i17, int i18, t6.l lVar, java.util.List list) {
        java.util.List list2 = this.f443237b;
        int size = list2.size();
        w6.z0 z0Var = null;
        for (int i19 = 0; i19 < size; i19++) {
            t6.n nVar = (t6.n) list2.get(i19);
            try {
                if (nVar.b(gVar.a(), lVar)) {
                    z0Var = nVar.a(gVar.a(), i17, i18, lVar);
                }
            } catch (java.io.IOException | java.lang.OutOfMemoryError | java.lang.RuntimeException e17) {
                if (android.util.Log.isLoggable("DecodePath", 2)) {
                    java.util.Objects.toString(nVar);
                }
                list.add(e17);
            }
            if (z0Var != null) {
                break;
            }
        }
        if (z0Var != null) {
            return z0Var;
        }
        throw new w6.t0(this.f443240e, new java.util.ArrayList(list));
    }

    public java.lang.String toString() {
        return "DecodePath{ dataClass=" + this.f443236a + ", decoders=" + this.f443237b + ", transcoder=" + this.f443238c + '}';
    }
}
