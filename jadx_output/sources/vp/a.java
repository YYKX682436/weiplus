package vp;

/* loaded from: classes16.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public int f438721a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.TreeSet f438722b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f438723c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final yp.b f438724d;

    /* renamed from: e, reason: collision with root package name */
    public xp.d f438725e;

    /* renamed from: f, reason: collision with root package name */
    public final vp.b f438726f;

    /* renamed from: g, reason: collision with root package name */
    public final zp.i f438727g;

    /* renamed from: h, reason: collision with root package name */
    public final zp.e f438728h;

    public a(xp.d dVar, vp.b bVar, java.util.Comparator comparator, zp.i iVar, zp.e eVar) {
        this.f438725e = dVar;
        this.f438726f = bVar;
        this.f438727g = iVar;
        this.f438728h = eVar;
        this.f438724d = new yp.b(bVar);
        this.f438722b = new java.util.TreeSet(comparator);
        d();
    }

    public abstract void a();

    public final void b(android.graphics.Canvas canvas, long j17, android.view.View view) {
        zp.e eVar;
        vp.z0 z0Var = (vp.z0) this;
        java.util.List list = z0Var.f438880o;
        if (list != null) {
            ((java.util.LinkedList) list).clear();
        }
        int size = ((java.util.ArrayList) z0Var.f438879n).size();
        for (int i17 = 0; i17 < size; i17++) {
            ((java.util.List) ((java.util.ArrayList) z0Var.f438879n).get(i17)).size();
            java.util.Iterator it = ((java.util.List) ((java.util.ArrayList) z0Var.f438879n).get(i17)).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                eVar = z0Var.f438728h;
                if (!hasNext) {
                    break;
                }
                wp.a aVar = (wp.a) it.next();
                if (aVar.f448347r) {
                    if (z0Var.f438880o == null) {
                        z0Var.f438880o = new java.util.LinkedList();
                    }
                    ((java.util.LinkedList) z0Var.f438880o).add(aVar);
                } else {
                    aVar.t(eVar.f474909b, eVar.f474908a);
                    if (!aVar.l(eVar.f474908a)) {
                        z0Var.f438724d.a(canvas, aVar, z0Var.f438725e, z0Var.f438725e.c(aVar), view);
                        aVar.b();
                    }
                }
            }
            java.util.List list2 = z0Var.f438880o;
            if (list2 != null && !list2.isEmpty()) {
                for (wp.a aVar2 : z0Var.f438880o) {
                    aVar2.t(eVar.f474909b, eVar.f474908a);
                    if (!aVar2.l(eVar.f474908a)) {
                        z0Var.f438724d.a(canvas, aVar2, z0Var.f438725e, z0Var.f438725e.c(aVar2), view);
                        aVar2.b();
                    }
                }
                ((java.util.LinkedList) z0Var.f438880o).clear();
            }
        }
    }

    public abstract wp.a c(zp.m mVar);

    public abstract void d();
}
