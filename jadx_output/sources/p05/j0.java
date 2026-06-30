package p05;

/* loaded from: classes3.dex */
public final class j0 implements p05.p0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f350553a;

    /* renamed from: b, reason: collision with root package name */
    public rh0.d0 f350554b;

    /* renamed from: c, reason: collision with root package name */
    public long f350555c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f350556d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f350557e = new java.util.ArrayList();

    @Override // p05.e2
    public int a() {
        return 0;
    }

    @Override // p05.e2
    public void b(rh0.d0 d0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attach WeVision=");
        if (tq5.i.f421269a == 0) {
            tq5.i.f421269a = 2014500;
        }
        sb6.append(tq5.i.f421269a);
        com.tencent.mars.xlog.Log.i("FinderLiveGestureIdentificationEffect", sb6.toString());
        if (this.f350553a && d0Var != null && ((p05.l4) d0Var).f350593f != this.f350555c) {
            com.tencent.mars.xlog.Log.i("FinderLiveGestureIdentificationEffect", "Cannot attach twice!");
            return;
        }
        rh0.d0 d0Var2 = this.f350554b;
        if (d0Var2 != null) {
            ((p05.l4) d0Var2).u(this);
        }
        this.f350554b = d0Var;
        if (d0Var != null) {
            ((p05.l4) d0Var).f(this);
        }
        if (d0Var == null) {
            c(kz5.p0.f313996d);
            this.f350555c = 0L;
            this.f350553a = false;
        } else {
            long j17 = ((p05.l4) d0Var).f350593f;
            this.f350555c = j17;
            if (j17 == 0) {
                return;
            }
            this.f350553a = true;
        }
    }

    public final void c(java.util.List list) {
        java.util.List list2 = this.f350556d;
        ((java.util.ArrayList) list2).clear();
        ((java.util.ArrayList) list2).addAll(list);
        if (!this.f350553a) {
            com.tencent.mars.xlog.Log.i("FinderLiveGestureIdentificationEffect", "This effect is not attached!");
        }
        if (this.f350553a) {
            java.util.ArrayList<jz5.o> arrayList = this.f350557e;
            for (jz5.o oVar : arrayList) {
                rh0.d0 d0Var = this.f350554b;
                if (d0Var != null) {
                    ((p05.l4) d0Var).t(((java.lang.Number) oVar.f302841d).longValue());
                }
            }
            arrayList.clear();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                jz5.l lVar = (jz5.l) it.next();
                rh0.d0 d0Var2 = this.f350554b;
                java.lang.Long valueOf = d0Var2 != null ? java.lang.Long.valueOf(((p05.l4) d0Var2).d((java.lang.String) lVar.f302834e)) : null;
                if (valueOf != null && valueOf.longValue() != -1) {
                    arrayList.add(new jz5.o(valueOf, lVar.f302833d, lVar.f302834e));
                }
            }
        }
    }
}
