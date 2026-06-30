package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public final class u0 implements im5.a {

    /* renamed from: h, reason: collision with root package name */
    public boolean f175734h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f175735i;

    /* renamed from: m, reason: collision with root package name */
    public int f175736m;

    /* renamed from: n, reason: collision with root package name */
    public int f175737n;

    /* renamed from: r, reason: collision with root package name */
    public long f175741r;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.vlog.model.i1 f175747x;

    /* renamed from: y, reason: collision with root package name */
    public long f175748y;

    /* renamed from: z, reason: collision with root package name */
    public long f175749z;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f175730d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f175731e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f175732f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f175733g = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public float f175738o = dq4.c.f242369a.c();

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.RectF f175739p = new android.graphics.RectF();

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.RectF f175740q = new android.graphics.RectF();

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.model.k1 f175742s = new com.tencent.mm.plugin.vlog.model.k1();

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.vlog.model.h1 f175743t = new com.tencent.mm.plugin.vlog.model.h1(kz5.p0.f313996d);

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f175744u = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public int f175745v = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f175746w = -1;
    public float A = 1.0f;
    public final com.tencent.mm.plugin.vlog.model.w0 B = new com.tencent.mm.plugin.vlog.model.w0(0, 0);

    public final void a(com.tencent.mm.plugin.vlog.model.h1 refComposition, boolean z17) {
        kotlin.jvm.internal.o.g(refComposition, "refComposition");
        java.util.ArrayList arrayList = refComposition.f175597c;
        rm5.i iVar = rm5.j.f397498v;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            int i17 = ((com.tencent.mm.plugin.vlog.model.i1) obj).f175617b;
            boolean z18 = true;
            if (i17 != 2 && i17 != 1) {
                z18 = false;
            }
            if (z18) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((com.tencent.mm.plugin.vlog.model.i1) it.next()).f175627l);
        }
        iVar.a(arrayList3);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.addAll(arrayList);
        com.tencent.mm.plugin.vlog.model.h1 h1Var = new com.tencent.mm.plugin.vlog.model.h1(arrayList4);
        this.f175743t = h1Var;
        if (z17) {
            h1Var.r(this.f175741r);
        }
        com.tencent.mm.plugin.vlog.model.h1 h1Var2 = this.f175743t;
        so4.g gVar = so4.g.f410776a;
        h1Var2.q(so4.g.f410781f);
        this.f175743t.u(this.f175736m, this.f175737n);
    }

    public final void b() {
        this.f175745v = -1;
        java.util.LinkedList linkedList = this.f175744u;
        linkedList.clear();
        linkedList.addAll(this.f175733g);
        com.tencent.mm.plugin.vlog.model.h1 h1Var = new com.tencent.mm.plugin.vlog.model.h1(linkedList);
        this.f175743t = h1Var;
        h1Var.r(this.f175741r);
        com.tencent.mm.plugin.vlog.model.h1 h1Var2 = this.f175743t;
        so4.g gVar = so4.g.f410776a;
        h1Var2.q(so4.g.f410781f);
        this.f175743t.u(this.f175736m, this.f175737n);
    }

    public final void c(so4.b template) {
        kotlin.jvm.internal.o.g(template, "template");
        throw null;
    }

    public final com.tencent.mm.plugin.vlog.model.i1 d() {
        return this.f175747x;
    }

    @Override // im5.a
    public void dead() {
        com.tencent.mm.plugin.vlog.model.k1 k1Var = this.f175742s;
        k1Var.getClass();
        gm0.j1.d().q(1469, k1Var);
        gm0.j1.d().q(2972, k1Var);
    }

    public final void j(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiMediaModel", "editTrack index:" + i17);
        this.f175746w = i17;
        long j17 = this.f175743t.j();
        com.tencent.mm.plugin.vlog.model.w0 w0Var = this.B;
        w0Var.f175778a = j17;
        w0Var.f175779b = this.f175743t.h();
        int i18 = this.f175746w;
        if (i18 >= 0) {
            java.util.LinkedList linkedList = this.f175744u;
            if (i18 < linkedList.size()) {
                java.lang.Object obj = linkedList.get(this.f175746w);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                com.tencent.mm.plugin.vlog.model.i1 i1Var = (com.tencent.mm.plugin.vlog.model.i1) obj;
                this.f175747x = i1Var;
                rm5.j jVar = i1Var.f175627l;
                this.f175748y = jVar.f397504f;
                this.f175749z = jVar.f397505g;
                this.A = jVar.f397506h;
                com.tencent.mm.plugin.vlog.model.i1 i1Var2 = new com.tencent.mm.plugin.vlog.model.i1(i1Var.f175616a, i1Var.f175617b, 0, 4, null);
                rm5.j jVar2 = i1Var.f175627l;
                i1Var2.c(jVar2.f397508j);
                i1Var2.a(((float) jVar2.f397508j) / jVar2.f397506h);
                i1Var2.b(jVar2.f397506h);
                i1Var2.f175621f = i1Var.f175621f;
                i1Var2.f175622g = i1Var.f175622g;
                com.tencent.mm.plugin.vlog.model.y yVar = i1Var2.f175624i;
                android.graphics.Rect rect = yVar.f175785b;
                com.tencent.mm.plugin.vlog.model.y yVar2 = i1Var.f175624i;
                rect.set(yVar2.f175785b);
                yVar.f175787d.set(yVar2.f175787d);
                yVar.f175786c.set(yVar2.f175786c);
                yVar.f175784a.set(yVar2.f175784a);
                rm5.j jVar3 = i1Var2.f175627l;
                jVar3.f397512n.set(jVar2.f397512n);
                jVar3.g();
                com.tencent.mm.plugin.vlog.model.h1 h1Var = new com.tencent.mm.plugin.vlog.model.h1(kz5.b0.c(i1Var2));
                this.f175743t = h1Var;
                h1Var.u(this.f175736m, this.f175737n);
                this.f175743t.q(so4.g.f410781f);
                com.tencent.mm.plugin.vlog.model.h1 h1Var2 = this.f175743t;
                float f17 = (float) this.f175748y;
                float f18 = this.A;
                h1Var2.s(f17 / f18, ((float) this.f175749z) / f18);
            }
        }
    }

    public final void k(int i17, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiMediaModel", "editTrack editIndex:" + i17 + ", start:" + j17 + ", end:" + j18);
        java.util.LinkedList linkedList = this.f175744u;
        if (i17 >= 0 && i17 < linkedList.size()) {
            java.lang.Object obj = linkedList.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            com.tencent.mm.plugin.vlog.model.i1 i1Var = (com.tencent.mm.plugin.vlog.model.i1) obj;
            if (j17 >= 0 && j18 >= 0) {
                i1Var.d(j17);
                i1Var.c(j18);
            }
            rm5.i iVar = rm5.j.f397498v;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.tencent.mm.plugin.vlog.model.i1) it.next()).f175627l);
            }
            iVar.a(arrayList);
        }
        com.tencent.mm.plugin.vlog.model.h1 h1Var = new com.tencent.mm.plugin.vlog.model.h1(linkedList);
        this.f175743t = h1Var;
        h1Var.r(this.f175741r);
        com.tencent.mm.plugin.vlog.model.h1 h1Var2 = this.f175743t;
        so4.g gVar = so4.g.f410776a;
        h1Var2.q(so4.g.f410781f);
        this.f175743t.u(this.f175736m, this.f175737n);
    }

    public final void l(boolean z17, long j17, long j18, int i17, int i18, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiMediaModel", "endEditTrack editIndex:" + this.f175746w + ", confirm:" + z17 + ", start:" + j17 + ", end:" + j18);
        int i19 = this.f175746w;
        java.util.LinkedList linkedList = this.f175744u;
        if (i19 >= 0 && i19 < linkedList.size()) {
            java.lang.Object obj = linkedList.get(this.f175746w);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            com.tencent.mm.plugin.vlog.model.i1 i1Var = (com.tencent.mm.plugin.vlog.model.i1) obj;
            com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem editItem = i1Var.f175626k;
            editItem.clickEditCount++;
            editItem.durationCutCount += i17;
            editItem.durationScrollCount += i18;
            rm5.j jVar = i1Var.f175627l;
            if (!z17 || j17 < 0 || j18 < 0) {
                i1Var.d(this.f175748y);
                i1Var.c(this.f175749z);
            } else {
                i1Var.d(((float) j17) * jVar.f397506h);
                i1Var.c(((float) j18) * jVar.f397506h);
            }
            i1Var.f175626k.targetDuration = ((float) (jVar.f397505g - jVar.f397504f)) / jVar.f397506h;
            if (z18) {
                this.f175747x = null;
                this.f175746w = -1;
            }
            rm5.i iVar = rm5.j.f397498v;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.tencent.mm.plugin.vlog.model.i1) it.next()).f175627l);
            }
            iVar.a(arrayList);
        }
        com.tencent.mm.plugin.vlog.model.h1 h1Var = new com.tencent.mm.plugin.vlog.model.h1(linkedList);
        this.f175743t = h1Var;
        h1Var.r(this.f175741r);
        com.tencent.mm.plugin.vlog.model.h1 h1Var2 = this.f175743t;
        so4.g gVar = so4.g.f410776a;
        h1Var2.q(so4.g.f410781f);
        this.f175743t.u(this.f175736m, this.f175737n);
    }

    public final boolean s() {
        return this.f175745v >= 0;
    }

    public final android.graphics.Rect t() {
        return ((com.tencent.mm.plugin.vlog.model.i1) this.f175733g.getFirst()).f175624i.f175787d;
    }

    public final void u(float f17) {
        com.tencent.mm.plugin.vlog.model.i1 i1Var = this.f175747x;
        if (i1Var != null) {
            i1Var.b(f17);
            i1Var.f175627l.g();
        }
        com.tencent.mm.plugin.vlog.model.i1 i1Var2 = (com.tencent.mm.plugin.vlog.model.i1) kz5.n0.Z(this.f175743t.f175597c);
        if (i1Var2 != null) {
            i1Var2.b(f17);
            rm5.j jVar = i1Var2.f175627l;
            jVar.g();
            this.f175743t.s(jVar.f397502d, jVar.f397503e);
        }
    }

    public final void v(android.graphics.RectF maxVisibleRect, boolean z17) {
        kotlin.jvm.internal.o.g(maxVisibleRect, "maxVisibleRect");
        this.f175740q.set(maxVisibleRect);
        android.graphics.RectF rectF = this.f175739p;
        rectF.set(maxVisibleRect);
        if (z17) {
            rectF.inset(0.0f, (maxVisibleRect.height() - (maxVisibleRect.width() * this.f175738o)) / 2);
        }
    }

    public final void w(int i17, int i18) {
        com.tencent.mm.plugin.vlog.model.k1 k1Var = this.f175742s;
        k1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogDataManager", "setPreviewSize, width:" + i17 + ", " + i18);
        k1Var.getClass();
        k1Var.getClass();
    }

    public final void x(boolean z17, android.util.Size screenSize) {
        int width;
        int height;
        kotlin.jvm.internal.o.g(screenSize, "screenSize");
        android.graphics.Rect rect = new android.graphics.Rect();
        int i17 = 0;
        for (java.lang.Object obj : this.f175733g) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.vlog.model.i1 i1Var = (com.tencent.mm.plugin.vlog.model.i1) obj;
            com.tencent.mm.plugin.vlog.model.y yVar = i1Var.f175624i;
            float f17 = i1Var.f175622g / i1Var.f175621f;
            if (i17 == 0) {
                width = screenSize.getWidth();
                height = screenSize.getHeight();
            } else {
                width = rect.width();
                height = rect.height();
            }
            float f18 = height;
            float f19 = width;
            float f27 = f18 / f19;
            if (!(i17 == 0 && z17) && (i17 == 0 || f17 <= f27)) {
                float f28 = f18 / f17;
                float f29 = (f19 - f28) / 2;
                yVar.f175787d.set((int) f29, 0, (int) (f28 + f29), height);
            } else {
                float f37 = f19 * f17;
                float f38 = (f18 - f37) / 2;
                yVar.f175787d.set(0, (int) f38, width, (int) (f37 + f38));
            }
            if (i17 == 0) {
                android.graphics.Rect rect2 = yVar.f175787d;
                if (screenSize.getWidth() * screenSize.getHeight() < rect2.width() * rect2.height()) {
                    rect.set(0, 0, screenSize.getWidth(), screenSize.getHeight());
                } else {
                    rect.set(rect2);
                }
            }
            com.tencent.mm.plugin.vlog.model.q0.b(yVar.f175784a, new android.graphics.RectF(0.0f, 0.0f, i1Var.f175621f, i1Var.f175622g), new android.graphics.RectF(rect));
            float a17 = com.tencent.mm.plugin.vlog.model.q0.a(yVar.f175784a);
            yVar.f175788e = a17;
            yVar.f175789f = 5.0f * a17;
            yVar.f175790g = a17 * 0.25f;
            i1Var.f175627l.f397514p = true;
            i17 = i18;
        }
    }

    public final void y() {
        for (com.tencent.mm.plugin.vlog.model.i1 i1Var : this.f175733g) {
            com.tencent.mm.plugin.vlog.model.y yVar = i1Var.f175624i;
            boolean isIdentity = yVar.f175784a.isIdentity();
            rm5.j jVar = i1Var.f175627l;
            if (isIdentity) {
                float f17 = (i1Var.f175622g * 1.0f) / i1Var.f175621f;
                android.graphics.RectF rectF = this.f175739p;
                android.graphics.Rect rect = yVar.f175787d;
                rectF.round(rect);
                if (f17 > rectF.height() / rectF.width()) {
                    float width = ((i1Var.f175622g * ((rectF.width() * 1.0f) / i1Var.f175621f)) - rectF.height()) / 2;
                    rect.top = (int) (rectF.top - width);
                    rect.bottom = (int) (rectF.bottom + width);
                } else {
                    float height = ((i1Var.f175621f * ((rectF.height() * 1.0f) / i1Var.f175622g)) - rectF.width()) / 2;
                    rect.left = (int) (rectF.left - height);
                    rect.right = (int) (rectF.right + height);
                }
                rectF.round(yVar.f175785b);
                android.graphics.Matrix matrix = yVar.f175784a;
                com.tencent.mm.plugin.vlog.model.q0.b(matrix, new android.graphics.RectF(0.0f, 0.0f, i1Var.f175621f, i1Var.f175622g), new android.graphics.RectF(rect));
                android.graphics.RectF rectF2 = this.f175740q;
                rect.offset(-((int) rectF2.left), -((int) rectF2.top));
                jVar.f397512n.set(rect);
                float a17 = com.tencent.mm.plugin.vlog.model.q0.a(matrix);
                yVar.f175788e = a17;
                yVar.f175789f = 5.0f * a17;
                yVar.f175790g = a17 * 0.25f;
            }
            jVar.f397514p = true;
        }
    }

    public final void c(java.util.List trackList, java.util.List list) {
        java.lang.Object next;
        kotlin.jvm.internal.o.g(trackList, "trackList");
        rm5.i iVar = rm5.j.f397498v;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : trackList) {
            int i17 = ((com.tencent.mm.plugin.vlog.model.i1) obj).f175617b;
            boolean z17 = true;
            if (i17 != 2 && i17 != 1) {
                z17 = false;
            }
            if (z17) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.tencent.mm.plugin.vlog.model.i1) it.next()).f175627l);
        }
        iVar.a(arrayList2);
        java.util.Iterator it6 = trackList.iterator();
        java.util.ArrayList arrayList3 = null;
        if (it6.hasNext()) {
            next = it6.next();
            if (it6.hasNext()) {
                long j17 = ((com.tencent.mm.plugin.vlog.model.i1) next).f175627l.f397503e;
                do {
                    java.lang.Object next2 = it6.next();
                    long j18 = ((com.tencent.mm.plugin.vlog.model.i1) next2).f175627l.f397503e;
                    if (j17 < j18) {
                        next = next2;
                        j17 = j18;
                    }
                } while (it6.hasNext());
            }
        } else {
            next = null;
        }
        com.tencent.mm.plugin.vlog.model.i1 i1Var = (com.tencent.mm.plugin.vlog.model.i1) next;
        long j19 = i1Var != null ? i1Var.f175627l.f397503e : com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        if (list != null) {
            arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (java.util.Iterator it7 = list.iterator(); it7.hasNext(); it7 = it7) {
                jz5.o oVar = (jz5.o) it7.next();
                java.lang.String str = (java.lang.String) oVar.f302841d;
                long longValue = ((java.lang.Number) oVar.f302842e).longValue();
                long longValue2 = ((java.lang.Number) oVar.f302843f).longValue();
                com.tencent.mm.plugin.vlog.model.i1 i1Var2 = new com.tencent.mm.plugin.vlog.model.i1(str, 3, 0, 4, null);
                i1Var2.e(longValue);
                i1Var2.a(java.lang.Math.min(longValue2, j19));
                i1Var2.d(0L);
                i1Var2.c(longValue2 - longValue);
                i1Var2.f175627l.f(3.0f);
                arrayList3.add(i1Var2);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.addAll(trackList);
        if (arrayList3 != null) {
            arrayList4.addAll(arrayList3);
        }
        com.tencent.mm.plugin.vlog.model.h1 h1Var = new com.tencent.mm.plugin.vlog.model.h1(arrayList4);
        this.f175743t = h1Var;
        h1Var.r(this.f175741r);
        this.f175743t.q(so4.g.f410781f);
        this.f175743t.u(this.f175736m, this.f175737n);
    }
}
