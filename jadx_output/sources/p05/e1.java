package p05;

/* loaded from: classes14.dex */
public final class e1 implements p05.t0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f350503a;

    /* renamed from: b, reason: collision with root package name */
    public rh0.d0 f350504b;

    /* renamed from: c, reason: collision with root package name */
    public long f350505c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f350506d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f350507e = new java.util.ArrayList();

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
        com.tencent.mars.xlog.Log.i("FinderLiveLiveElementEffect", sb6.toString());
        if (this.f350503a && d0Var != null && ((p05.l4) d0Var).f350593f != this.f350505c) {
            com.tencent.mars.xlog.Log.i("FinderLiveLiveElementEffect", "Cannot attach twice!");
            return;
        }
        rh0.d0 d0Var2 = this.f350504b;
        if (d0Var2 != null) {
            ((p05.l4) d0Var2).u(this);
        }
        this.f350504b = d0Var;
        if (d0Var != null) {
            ((p05.l4) d0Var).f(this);
        }
        if (d0Var == null) {
            c(kz5.p0.f313996d);
            this.f350505c = 0L;
            this.f350503a = false;
        } else {
            long j17 = ((p05.l4) d0Var).f350593f;
            this.f350505c = j17;
            if (j17 == 0) {
                return;
            }
            this.f350503a = true;
        }
    }

    public final void c(java.util.List list) {
        java.util.List list2 = this.f350506d;
        ((java.util.ArrayList) list2).clear();
        ((java.util.ArrayList) list2).addAll(list);
        if (!this.f350503a) {
            com.tencent.mars.xlog.Log.i("FinderLiveLiveElementEffect", "This effect is not attached!");
        }
        if (this.f350503a) {
            java.util.ArrayList arrayList = this.f350507e;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.xeffect.WeEffectRender.nRemoveResource(this.f350505c, ((java.lang.Number) ((jz5.o) it.next()).f302841d).longValue());
            }
            arrayList.clear();
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                jz5.l lVar = (jz5.l) it6.next();
                com.tencent.mars.xlog.Log.i("FinderLiveLiveElementEffect", "#changeInner path=" + ((java.lang.String) lVar.f302834e));
                long j17 = this.f350505c;
                java.lang.Object obj = lVar.f302834e;
                long[] nAddEffectMaterialsFolder = com.tencent.mm.xeffect.WeEffectRender.nAddEffectMaterialsFolder(j17, (java.lang.String) obj);
                if (nAddEffectMaterialsFolder != null) {
                    for (long j18 : nAddEffectMaterialsFolder) {
                        arrayList.add(new jz5.o(java.lang.Long.valueOf(j18), lVar.f302833d, obj));
                    }
                }
            }
        }
    }
}
