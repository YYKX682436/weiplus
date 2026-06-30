package vp;

/* loaded from: classes16.dex */
public class z0 extends vp.a {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f438874i;

    /* renamed from: j, reason: collision with root package name */
    public int f438875j;

    /* renamed from: k, reason: collision with root package name */
    public int f438876k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f438877l;

    /* renamed from: m, reason: collision with root package name */
    public wp.a[] f438878m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f438879n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f438880o;

    public z0(xp.d dVar, vp.b bVar, java.util.Comparator comparator, zp.i iVar, zp.e eVar) {
        super(dVar, bVar, comparator, iVar, eVar);
        this.f438874i = "Danmaku_R2LWindow";
        this.f438874i = dVar.f455841i + "_R2LWindow";
    }

    @Override // vp.a
    public void a() {
        for (int i17 = 0; i17 < this.f438876k; i17++) {
            this.f438878m[i17] = null;
        }
        int size = ((java.util.ArrayList) this.f438879n).size();
        for (int i18 = 0; i18 < size; i18++) {
            java.util.Iterator it = ((java.util.List) ((java.util.ArrayList) this.f438879n).get(i18)).iterator();
            while (it.hasNext()) {
                wp.a aVar = (wp.a) it.next();
                it.remove();
                this.f438721a--;
                ((java.util.LinkedList) this.f438723c).add(aVar);
            }
        }
    }

    @Override // vp.a
    public wp.a c(zp.m mVar) {
        int size = ((java.util.ArrayList) this.f438879n).size();
        for (int i17 = 0; i17 < size; i17++) {
            for (wp.a aVar : (java.util.List) ((java.util.ArrayList) this.f438879n).get(i17)) {
                aVar.getClass();
                if (xp.d.f().f455851h) {
                    android.graphics.Point point = mVar.f474923b;
                    if (aVar.k(point.x, point.y, mVar.f474924c, mVar.f474922a)) {
                        if (com.tencent.mars.xlog.Log.getLogLevel() <= 0) {
                            aVar.toString();
                            aVar.i();
                        }
                        return aVar;
                    }
                }
            }
        }
        return null;
    }

    @Override // vp.a
    public void d() {
        xp.i f17 = xp.d.f();
        this.f438875j = f17.f455845b;
        if (this.f438877l == null || this.f438876k != f17.f455846c) {
            int i17 = f17.f455846c;
            this.f438876k = i17;
            this.f438877l = new int[i17];
            wp.a[] aVarArr = new wp.a[i17];
            wp.a[] aVarArr2 = this.f438878m;
            if (aVarArr2 != null) {
                java.lang.System.arraycopy(aVarArr2, 0, aVarArr, 0, java.lang.Math.min(i17, aVarArr2.length));
            }
            this.f438878m = aVarArr;
            java.util.List list = this.f438879n;
            if (list != null) {
                int size = ((java.util.ArrayList) list).size();
                if (size >= this.f438876k) {
                    while (true) {
                        size--;
                        if (size < this.f438876k) {
                            break;
                        }
                        this.f438723c.addAll((java.util.List) ((java.util.ArrayList) this.f438879n).remove(size));
                    }
                } else {
                    while (size < this.f438876k) {
                        ((java.util.ArrayList) this.f438879n).add(new java.util.LinkedList());
                        size++;
                    }
                }
            } else {
                this.f438879n = new java.util.ArrayList(this.f438876k);
                for (int i18 = 0; i18 < this.f438876k; i18++) {
                    ((java.util.ArrayList) this.f438879n).add(new java.util.LinkedList());
                }
            }
        }
        int e17 = this.f438725e.e();
        for (int i19 = 0; i19 < this.f438876k; i19++) {
            this.f438877l[i19] = (i19 * e17) + this.f438875j;
        }
        f(this.f438879n, this.f438877l);
        f(this.f438879n, this.f438877l);
    }

    public final void e(wp.a aVar, int i17, int i18) {
        if (aVar.f448342m && xp.i.f455842v) {
            this.f438726f.getClass();
        }
        aVar.s(i18, i17, this.f438727g.f474914a, this.f438728h.f474908a);
    }

    public final void f(java.util.List list, int[] iArr) {
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.Iterator it = ((java.util.List) list.get(i17)).iterator();
            while (it.hasNext()) {
                wp.f fVar = (wp.f) ((wp.a) it.next());
                fVar.c();
                long j17 = this.f438728h.f474908a;
                int i18 = (int) fVar.D;
                fVar.f448353x = true;
                fVar.f448352w = true;
                float f17 = fVar.f448338i;
                vp.d0.b(this.f438725e, fVar);
                float h17 = (fVar.f448338i + fVar.h()) / (f17 + fVar.h());
                fVar.f448334e.f474913a = ((float) r7.f474913a) * h17;
                fVar.u(j17);
                fVar.E = iArr[i17];
                fVar.D = i18;
            }
        }
    }
}
