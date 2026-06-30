package ft4;

/* loaded from: classes14.dex */
public final class r0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f266679d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f266680e;

    /* renamed from: f, reason: collision with root package name */
    public int f266681f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f266682g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f266683h;

    /* renamed from: i, reason: collision with root package name */
    public int f266684i;

    /* renamed from: m, reason: collision with root package name */
    public int f266685m;

    /* renamed from: n, reason: collision with root package name */
    public int f266686n;

    /* renamed from: o, reason: collision with root package name */
    public long f266687o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f266688p;

    /* renamed from: q, reason: collision with root package name */
    public ft4.l0 f266689q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.z1 f266690r;

    public r0(android.content.Context context, java.util.List data) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        this.f266679d = context;
        this.f266680e = data;
        this.f266682g = "";
        this.f266683h = "";
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f266680e.size() + 3;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        if (i17 == 0) {
            return 1;
        }
        if (i17 == 1) {
            return 2;
        }
        return i17 == getItemCount() - 1 ? 4 : 3;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (getItemCount() <= i17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletLedgerPersonAdapter", "itemCount:" + getItemCount() + " is small than " + i17);
            return;
        }
        boolean z17 = holder instanceof ft4.n0;
        android.content.Context context = this.f266679d;
        if (z17) {
            ft4.n0 n0Var = (ft4.n0) holder;
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(n0Var.f266659e, this.f266683h, 0.1f);
            java.lang.String A = com.tencent.mm.wallet_core.ui.r1.A(this.f266683h, this.f266682g);
            if (this.f266684i > 0) {
                str = com.tencent.mm.wallet_core.ui.r1.t(java.lang.System.currentTimeMillis()) / 10000 == this.f266684i / 10000 ? com.tencent.mm.wallet_core.ui.r1.s(context.getString(com.tencent.mm.R.string.f492135fc2), this.f266684i) : com.tencent.mm.wallet_core.ui.r1.s(context.getString(com.tencent.mm.R.string.fcl), this.f266684i);
            } else if (this.f266686n % 100 > 31) {
                str = com.tencent.mm.wallet_core.ui.r1.r(context.getString(com.tencent.mm.R.string.ld_), com.tencent.mm.wallet_core.ui.r1.f(this.f266685m));
            } else {
                java.lang.String r17 = com.tencent.mm.wallet_core.ui.r1.r(context.getString(com.tencent.mm.R.string.fcl), com.tencent.mm.wallet_core.ui.r1.f(this.f266685m));
                java.lang.String r18 = com.tencent.mm.wallet_core.ui.r1.r(context.getString(com.tencent.mm.R.string.fcl), com.tencent.mm.wallet_core.ui.r1.f(this.f266686n));
                if (this.f266685m / 10000 == this.f266686n / 10000) {
                    r18 = com.tencent.mm.wallet_core.ui.r1.r(context.getString(com.tencent.mm.R.string.f492135fc2), com.tencent.mm.wallet_core.ui.r1.f(this.f266686n));
                }
                str = r17 + '-' + r18;
            }
            long j17 = this.f266687o;
            android.widget.TextView textView = n0Var.f266660f;
            if (j17 > 0) {
                textView.setText(context.getString(com.tencent.mm.R.string.lh7, str, A));
            } else {
                textView.setText(context.getString(com.tencent.mm.R.string.lh8, str, A));
            }
            n0Var.f266661g.setText(com.tencent.mm.wallet_core.ui.r1.C(this.f266687o));
            return;
        }
        if (holder instanceof ft4.p0) {
            if (this.f266687o > 0) {
                ((ft4.p0) holder).f266673e.setText(context.getString(com.tencent.mm.R.string.lhg));
                return;
            } else {
                ((ft4.p0) holder).f266673e.setText(context.getString(com.tencent.mm.R.string.lhi));
                return;
            }
        }
        if (holder instanceof ft4.m0) {
            android.widget.TextView textView2 = ((ft4.m0) holder).f266653e;
            this.f266688p = textView2;
            com.tencent.mm.wallet_core.ui.r1.d(textView2);
            int i18 = this.f266681f;
            if (i18 == 1) {
                textView2.setText(context.getString(com.tencent.mm.R.string.f493545lh5));
            } else if (i18 != 2) {
                textView2.setText(context.getString(com.tencent.mm.R.string.lo_));
            } else {
                textView2.setText(context.getString(com.tencent.mm.R.string.lo9));
            }
            com.tencent.mm.wallet_core.ui.z1 z1Var = this.f266690r;
            if (z1Var == null) {
                textView2.setVisibility(8);
                return;
            } else {
                textView2.setOnClickListener(z1Var);
                textView2.setVisibility(0);
                return;
            }
        }
        if (holder instanceof ft4.o0) {
            int i19 = i17 - 2;
            java.util.List list = this.f266680e;
            if (i19 >= list.size() || i19 < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletLedgerPersonAdapter", "position:" + i17 + "-2 is >=  " + list.size() + " || < 0");
                return;
            }
            dt4.u uVar = (dt4.u) list.get(i19);
            java.lang.String A2 = com.tencent.mm.wallet_core.ui.r1.A(uVar.f243293b, this.f266682g);
            java.lang.String string = context.getString(dt4.p.f243266f.c(uVar.f243296e));
            kotlin.jvm.internal.o.f(string, "getString(...)");
            if (this.f266687o > 0) {
                ((ft4.o0) holder).f266667e.setText(context.getString(com.tencent.mm.R.string.lh9, string, A2));
            } else {
                ((ft4.o0) holder).f266667e.setText(context.getString(com.tencent.mm.R.string.lh_, string, A2));
            }
            ft4.o0 o0Var = (ft4.o0) holder;
            o0Var.f266668f.setText(com.tencent.mm.wallet_core.ui.r1.r(context.getString(com.tencent.mm.R.string.ley), uVar.f243295d));
            o0Var.f266669g.setText(com.tencent.mm.wallet_core.ui.r1.C(uVar.f243294c));
            if (i17 == getItemCount() - 2) {
                android.view.View view = o0Var.f266670h;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = o0Var.f266670h;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (this.f266689q != null) {
                o0Var.f266666d.setOnClickListener(new ft4.q0(holder, this));
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.de9, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new ft4.n0(inflate);
        }
        if (i17 == 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.de_, parent, false);
            kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
            return new ft4.p0(inflate2);
        }
        if (i17 == 3) {
            android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.deb, parent, false);
            kotlin.jvm.internal.o.f(inflate3, "inflate(...)");
            return new ft4.o0(inflate3);
        }
        if (i17 != 4) {
            android.view.View inflate4 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.deb, parent, false);
            kotlin.jvm.internal.o.f(inflate4, "inflate(...)");
            return new ft4.o0(inflate4);
        }
        android.view.View inflate5 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.de8, parent, false);
        kotlin.jvm.internal.o.f(inflate5, "inflate(...)");
        return new ft4.m0(inflate5);
    }
}
