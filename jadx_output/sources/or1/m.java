package or1;

/* loaded from: classes12.dex */
public class m extends fb5.e {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f347527g;

    /* renamed from: h, reason: collision with root package name */
    public int f347528h;

    /* renamed from: i, reason: collision with root package name */
    public int f347529i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f347530m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f347531n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f347532o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f347533p;

    /* renamed from: q, reason: collision with root package name */
    public int f347534q;

    /* renamed from: r, reason: collision with root package name */
    public long[] f347535r;

    /* renamed from: s, reason: collision with root package name */
    public or1.l f347536s;

    public m(android.content.Context context) {
        super(context);
        this.f347527g = new java.util.ArrayList();
        this.f347533p = true;
        this.f347532o = true;
        this.f347531n = true;
        this.f347535r = new long[]{1};
    }

    @Override // fb5.e
    public java.lang.Object[] a(int i17) {
        or1.k l17 = l(i17);
        r45.qp j17 = j(i17);
        java.lang.String str = j17 != null ? j17.f384160m : "";
        if (l17 != null) {
            return new java.lang.Object[]{this, l17.f347517d, java.lang.Integer.valueOf(this.f347529i), str};
        }
        return null;
    }

    public final synchronized void d() {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i17 = 0; i17 < ((java.util.ArrayList) this.f347527g).size(); i17++) {
            or1.k kVar = (or1.k) ((java.util.ArrayList) this.f347527g).get(i17);
            if (kVar != null) {
                hashMap.put(java.lang.Long.valueOf(kVar.f347514a), kVar);
            }
        }
        ((java.util.ArrayList) this.f347527g).clear();
        this.f347528h = 0;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f347535r;
            if (i18 >= jArr.length) {
                break;
            }
            or1.k kVar2 = (or1.k) hashMap.get(java.lang.Long.valueOf(jArr[i18]));
            if (kVar2 != null) {
                ((java.util.ArrayList) this.f347527g).add(kVar2);
                this.f347528h += m(kVar2);
            }
            i18++;
        }
        if (((java.util.ArrayList) this.f347527g).size() > 0) {
            java.util.List list = this.f347527g;
            or1.k kVar3 = (or1.k) ((java.util.ArrayList) list).get(((java.util.ArrayList) list).size() - 1);
            boolean z17 = kVar3.f347520g;
            boolean z18 = this.f347531n;
            if (z17 == z18) {
                this.f347528h += z17 ? -1 : 1;
                kVar3.f347520g = z18 ? false : true;
            }
        }
        hashMap.clear();
    }

    public void f(r45.qp qpVar, boolean z17) {
        if ((this.f347531n && qpVar == null) || qpVar.f384158h == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandService.BizSearchResultAdapter", "The content or content.ItemList is null or the mode do not support to append data.");
            return;
        }
        if (isEmpty()) {
            this.f347534q = (int) (java.lang.System.currentTimeMillis() / 1000);
        }
        or1.k k17 = k(qpVar.f384154d);
        if (k17 != null) {
            if (k17.f347518e == null) {
                k17.f347518e = new java.util.LinkedList();
            }
            java.util.List list = k17.f347518e;
            java.util.LinkedList linkedList = qpVar.f384158h;
            ((java.util.LinkedList) list).addAll(linkedList);
            if (k17.f347521h == null) {
                k17.f347521h = new java.util.LinkedList();
            }
            ((java.util.LinkedList) k17.f347521h).add(qpVar);
            k17.f347515b += linkedList.size();
            this.f347528h += linkedList.size();
        } else if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandService.BizSearchResultAdapter", "The type(%d) do not exist.", java.lang.Long.valueOf(qpVar.f384154d));
            return;
        } else {
            ((java.util.ArrayList) this.f347527g).add(h(qpVar));
            d();
        }
        com.tencent.mm.sdk.platformtools.u3.h(this.f260887f);
    }

    public void g() {
        n(null, null);
        this.f347534q = 0;
    }

    @Override // fb5.e, android.widget.Adapter
    public int getCount() {
        return this.f347528h;
    }

    public final or1.k h(r45.qp qpVar) {
        or1.k kVar = new or1.k();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        kVar.f347521h = linkedList;
        linkedList.add(qpVar);
        kVar.f347514a = qpVar.f384154d;
        java.util.LinkedList linkedList2 = qpVar.f384158h;
        kVar.f347515b = linkedList2.size();
        kVar.f347516c = qpVar.f384155e;
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        kVar.f347518e = linkedList3;
        linkedList3.addAll(linkedList2);
        kVar.f347517d = qpVar.f384157g;
        kVar.f347519f = this.f347533p;
        kVar.f347520g = this.f347532o && kVar.f347516c != 0;
        return kVar;
    }

    public r45.qp j(int i17) {
        if (i17 < 0) {
            return null;
        }
        int i18 = 0;
        int i19 = 0;
        while (true) {
            java.util.List list = this.f347527g;
            if (i18 >= ((java.util.ArrayList) list).size()) {
                return null;
            }
            or1.k kVar = (or1.k) ((java.util.ArrayList) list).get(i18);
            int m17 = m(kVar);
            i19 += m17;
            if (i17 < i19) {
                int i27 = (i19 - m17) + (kVar.f347519f ? 1 : 0);
                for (int i28 = 0; i28 < kVar.f347521h.size(); i28++) {
                    r45.qp qpVar = (r45.qp) kVar.f347521h.get(i28);
                    i27 += qpVar.f384158h.size();
                    if (i17 < i27) {
                        return qpVar;
                    }
                }
                return null;
            }
            i18++;
        }
    }

    public final or1.k k(long j17) {
        java.util.List list;
        int i17 = 0;
        while (true) {
            list = this.f347527g;
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (i17 >= arrayList.size()) {
                i17 = -1;
                break;
            }
            if (((or1.k) arrayList.get(i17)).f347514a == j17) {
                break;
            }
            i17++;
        }
        if (i17 >= 0) {
            return (or1.k) ((java.util.ArrayList) list).get(i17);
        }
        return null;
    }

    public or1.k l(int i17) {
        if (i17 < 0) {
            return null;
        }
        int i18 = 0;
        int i19 = 0;
        while (true) {
            java.util.List list = this.f347527g;
            if (i18 >= ((java.util.ArrayList) list).size()) {
                return null;
            }
            or1.k kVar = (or1.k) ((java.util.ArrayList) list).get(i18);
            i19 += m(kVar);
            if (i17 < i19) {
                return kVar;
            }
            i18++;
        }
    }

    public final int m(or1.k kVar) {
        if (kVar == null) {
            return 0;
        }
        return (kVar.f347520g ? 1 : 0) + kVar.f347515b + (kVar.f347519f ? 1 : 0);
    }

    public void n(java.lang.String str, java.util.List list) {
        java.util.LinkedList linkedList;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f347527g;
        arrayList.clear();
        this.f260885d.clear();
        java.lang.Runnable runnable = this.f260887f;
        com.tencent.mm.sdk.platformtools.u3.h(runnable);
        this.f347528h = 0;
        this.f347530m = str;
        if (list != null) {
            this.f347534q = (int) (java.lang.System.currentTimeMillis() / 1000);
            for (int i17 = 0; i17 < list.size(); i17++) {
                r45.qp qpVar = (r45.qp) list.get(i17);
                if (qpVar != null && (linkedList = qpVar.f384158h) != null && linkedList.size() > 0) {
                    or1.k h17 = h(qpVar);
                    this.f347528h += m(h17);
                    arrayList.add(h17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.BizSearchResultAdapter", "type(%d) , count(%d) , offset(%d)", java.lang.Long.valueOf(h17.f347514a), java.lang.Integer.valueOf(h17.f347515b), java.lang.Integer.valueOf(this.f347528h));
                }
            }
            d();
        }
        com.tencent.mm.sdk.platformtools.u3.h(runnable);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
    }
}
