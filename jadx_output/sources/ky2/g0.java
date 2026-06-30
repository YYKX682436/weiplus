package ky2;

/* loaded from: classes3.dex */
public final class g0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f313541d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f313542e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f313543f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.p f313544g;

    /* renamed from: h, reason: collision with root package name */
    public long f313545h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f313546i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f313547m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f313548n;

    public g0(android.view.ViewGroup root, gk2.e liveData) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.f313541d = root;
        this.f313542e = liveData;
        this.f313543f = new java.util.ArrayList();
        this.f313546i = true;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f313543f.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        ky2.d0 holder = (ky2.d0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.b1n, parent, false);
        android.view.ViewGroup viewGroup = this.f313541d;
        if (viewGroup.getContext().getResources().getConfiguration().orientation == 2) {
            android.view.ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = viewGroup.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = inflate.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = viewGroup.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        }
        kotlin.jvm.internal.o.d(inflate);
        return new ky2.d0(this, inflate);
    }

    public final void x(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 3);
        r45.me2 me2Var = ((mm2.c1) this.f313542e.a(mm2.c1.class)).f328784b6;
        jSONObject.put("vote_id", me2Var != null ? me2Var.getString(5) : null);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.E1, t17, 0L, null, null, null, null, null, 252, null);
        java.lang.Object obj = this.f313543f.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.l30 l30Var = (r45.l30) obj;
        l30Var.set(2, 1);
        l30Var.set(3, java.lang.Integer.valueOf(l30Var.getInteger(3) + 1));
        this.f313545h++;
    }

    public final void y(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 4);
        r45.me2 me2Var = ((mm2.c1) this.f313542e.a(mm2.c1.class)).f328784b6;
        jSONObject.put("vote_id", me2Var != null ? me2Var.getString(5) : null);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.E1, t17, 0L, null, null, null, null, null, 252, null);
        java.lang.Object obj = this.f313543f.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.l30 l30Var = (r45.l30) obj;
        l30Var.set(2, 0);
        if (l30Var.getInteger(3) > 0) {
            l30Var.set(3, java.lang.Integer.valueOf(l30Var.getInteger(3) - 1));
        }
        this.f313545h--;
    }

    public final void z(java.util.LinkedList respList, long j17, boolean z17, boolean z18, boolean z19) {
        boolean z27;
        kotlin.jvm.internal.o.g(respList, "respList");
        this.f313548n = z18;
        this.f313546i = z17;
        boolean z28 = this.f313545h != j17;
        this.f313545h = j17;
        java.util.ArrayList arrayList = this.f313543f;
        if (arrayList.size() != respList.size() || z19) {
            arrayList.clear();
            arrayList.addAll(respList);
            notifyItemRangeChanged(0, respList.size(), java.lang.Boolean.TRUE);
            return;
        }
        int i17 = 0;
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (((r45.l30) arrayList.get(i17)).getInteger(0) != ((r45.l30) respList.get(i17)).getInteger(0)) {
                arrayList.clear();
                arrayList.addAll(respList);
                notifyItemRangeChanged(0, respList.size(), java.lang.Boolean.TRUE);
            } else {
                if (((r45.l30) arrayList.get(i17)).getInteger(3) != ((r45.l30) respList.get(i17)).getInteger(3) || z28) {
                    ((r45.l30) arrayList.get(i17)).set(3, java.lang.Integer.valueOf(((r45.l30) respList.get(i17)).getInteger(3)));
                    z27 = true;
                } else {
                    z27 = false;
                }
                if (((r45.l30) arrayList.get(i17)).getInteger(2) != ((r45.l30) respList.get(i17)).getInteger(2)) {
                    ((r45.l30) arrayList.get(i17)).set(2, java.lang.Integer.valueOf(((r45.l30) respList.get(i17)).getInteger(2)));
                    z27 = true;
                }
                if (z27) {
                    notifyItemChanged(i17, java.lang.Boolean.TRUE);
                }
            }
            i17 = i18;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r16, int r17, java.util.List r18) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ky2.g0.onBindViewHolder(androidx.recyclerview.widget.k3, int, java.util.List):void");
    }
}
