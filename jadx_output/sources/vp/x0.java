package vp;

/* loaded from: classes16.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public int f438853a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f438854b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final yp.b f438855c;

    /* renamed from: d, reason: collision with root package name */
    public xp.d f438856d;

    /* renamed from: e, reason: collision with root package name */
    public final zp.i f438857e;

    /* renamed from: f, reason: collision with root package name */
    public final zp.e f438858f;

    public x0(xp.d dVar, vp.b bVar, zp.i iVar, zp.e eVar) {
        this.f438856d = dVar;
        this.f438857e = iVar;
        this.f438858f = eVar;
        this.f438855c = new yp.b(bVar);
        e();
    }

    public abstract void a();

    public final void b(android.graphics.Canvas canvas, long j17, android.view.View view) {
        zp.e eVar;
        vp.y0 y0Var = (vp.y0) this;
        java.util.List list = y0Var.f438871o;
        if (list != null) {
            ((java.util.LinkedList) list).clear();
        }
        int size = ((java.util.ArrayList) y0Var.f438867k).size();
        int i17 = 0;
        while (true) {
            eVar = y0Var.f438858f;
            if (i17 >= size) {
                break;
            }
            for (wp.a aVar : (java.util.List) ((java.util.ArrayList) y0Var.f438867k).get(i17)) {
                if (aVar.f448347r) {
                    if (y0Var.f438871o == null) {
                        y0Var.f438871o = new java.util.LinkedList();
                    }
                    ((java.util.LinkedList) y0Var.f438871o).add(aVar);
                } else {
                    aVar.t(eVar.f474909b, eVar.f474908a);
                    if (!aVar.l(eVar.f474908a)) {
                        y0Var.c(canvas, aVar, view);
                    }
                }
            }
            i17++;
        }
        java.util.List list2 = y0Var.f438868l;
        if (list2 != null && !((java.util.ArrayList) list2).isEmpty()) {
            for (int i18 = 0; i18 < ((java.util.ArrayList) y0Var.f438868l).size(); i18++) {
                for (wp.a aVar2 : (java.util.List) ((java.util.ArrayList) y0Var.f438868l).get(i18)) {
                    aVar2.t(eVar.f474909b, eVar.f474908a);
                    if (!aVar2.l(eVar.f474908a)) {
                        y0Var.c(canvas, aVar2, view);
                    }
                }
            }
        }
        java.util.List list3 = y0Var.f438871o;
        if (list3 == null || list3.isEmpty()) {
            return;
        }
        for (wp.a aVar3 : y0Var.f438871o) {
            aVar3.t(eVar.f474909b, eVar.f474908a);
            if (!aVar3.l(eVar.f474908a)) {
                y0Var.c(canvas, aVar3, view);
            }
        }
        ((java.util.LinkedList) y0Var.f438871o).clear();
    }

    public void c(android.graphics.Canvas canvas, wp.a aVar, android.view.View view) {
        this.f438855c.a(canvas, aVar, this.f438856d, this.f438856d.c(aVar), view);
        aVar.b();
    }

    public abstract wp.a d(zp.m mVar);

    public abstract void e();
}
