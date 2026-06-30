package tt2;

/* loaded from: classes3.dex */
public final class a extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f421822d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f421823e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f421824f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f421825g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f421826h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f421827i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.nd f421828m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f421829n;

    public a(android.content.Context context, boolean z17, gk2.e liveData) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.f421822d = context;
        this.f421823e = liveData;
        this.f421824f = new java.util.ArrayList();
        this.f421825g = new java.util.ArrayList();
        this.f421826h = kz5.p0.f313996d;
        this.f421827i = new java.util.LinkedList();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f421827i.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((so2.j5) ((java.util.ArrayList) x()).get(i17)) instanceof cm2.k0 ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r11, int r12) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tt2.a.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.content.Context context = this.f421822d;
        if (i17 == 0) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dnw, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new ut2.n0(inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.azb, parent, false);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        ut2.o0 o0Var = new ut2.o0(inflate2);
        com.tencent.mm.plugin.finder.view.nd ndVar = this.f421828m;
        com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView = o0Var.f431020e;
        finderLiveShoppingCouponView.setCallback(ndVar);
        finderLiveShoppingCouponView.setRestrictCallback(this.f421829n);
        return o0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List x() {
        java.lang.String string;
        java.lang.String str;
        r45.c56 c56Var;
        r45.c56 c56Var2;
        java.lang.String string2;
        r45.zv2 zv2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.f421824f;
        int i17 = !list.isEmpty() ? 1 : 0;
        if (!this.f421825g.isEmpty()) {
            i17++;
        }
        if (!this.f421826h.isEmpty()) {
            i17++;
        }
        java.lang.Object[] objArr = i17 > 1;
        boolean z17 = !this.f421826h.isEmpty();
        android.content.Context context = this.f421822d;
        gk2.e eVar = this.f421823e;
        if (z17) {
            if (objArr != false) {
                r45.dv1 dv1Var = ((mm2.f6) eVar.a(mm2.f6.class)).P;
                if (dv1Var == null || (zv2Var = (r45.zv2) dv1Var.getCustom(34)) == null || (string2 = zv2Var.getString(1)) == null) {
                    string2 = context.getString(com.tencent.mm.R.string.nvk);
                }
                java.lang.String str2 = string2;
                kotlin.jvm.internal.o.d(str2);
                arrayList.add(new cm2.j0(str2, null, null, 6, null));
            }
            arrayList.addAll(this.f421826h);
        }
        if (!this.f421825g.isEmpty()) {
            if (objArr != false) {
                java.lang.String str3 = ((mm2.f6) eVar.a(mm2.f6.class)).f329045s;
                java.lang.String string3 = context.getString(com.tencent.mm.R.string.f491575m85);
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                arrayList.add(new cm2.j0(string3, str3, null, 4, null));
            }
            arrayList.addAll(this.f421825g);
        }
        r45.dv1 dv1Var2 = ((mm2.f6) eVar.a(mm2.f6.class)).P;
        if (dv1Var2 == null || (c56Var2 = (r45.c56) dv1Var2.getCustom(33)) == null || (string = c56Var2.getString(1)) == null) {
            string = context.getString(com.tencent.mm.R.string.m9f);
        }
        java.lang.String str4 = string;
        kotlin.jvm.internal.o.d(str4);
        r45.dv1 dv1Var3 = ((mm2.f6) eVar.a(mm2.f6.class)).P;
        if (dv1Var3 == null || (c56Var = (r45.c56) dv1Var3.getCustom(33)) == null || (str = c56Var.getString(0)) == null) {
            str = "";
        }
        java.lang.String str5 = str;
        if (objArr != false) {
            arrayList.add(new cm2.j0(str4, null, str5, 2, null));
        }
        arrayList.addAll(list);
        return arrayList;
    }
}
