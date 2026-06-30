package ft4;

/* loaded from: classes14.dex */
public final class y0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f266729d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f266730e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f266731f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f266732g;

    /* renamed from: h, reason: collision with root package name */
    public int f266733h;

    /* renamed from: i, reason: collision with root package name */
    public int f266734i;

    /* renamed from: m, reason: collision with root package name */
    public int f266735m;

    /* renamed from: n, reason: collision with root package name */
    public long f266736n;

    /* renamed from: o, reason: collision with root package name */
    public long f266737o;

    /* renamed from: p, reason: collision with root package name */
    public int f266738p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.z1 f266739q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.z1 f266740r;

    /* renamed from: s, reason: collision with root package name */
    public ft4.s0 f266741s;

    public y0(android.content.Context context, java.util.List data) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        this.f266729d = context;
        this.f266730e = data;
        this.f266731f = "";
        this.f266732g = "";
        this.f266733h = 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f266730e.size() + 3;
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
        kotlin.jvm.internal.o.g(holder, "holder");
        if (getItemCount() <= i17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletLedgerPersonDetailAdapter", "itemCount:" + getItemCount() + " is small than " + i17);
            return;
        }
        boolean z17 = holder instanceof ft4.u0;
        android.content.Context context = this.f266729d;
        if (z17) {
            ft4.u0 u0Var = (ft4.u0) holder;
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(u0Var.f266712e, this.f266732g, 0.1f);
            u0Var.f266713f.setText(context.getString(com.tencent.mm.R.string.lh6, com.tencent.mm.wallet_core.ui.r1.A(this.f266732g, this.f266731f)));
            android.widget.TextView textView = u0Var.f266714g;
            textView.setVisibility(8);
            if (com.tencent.mm.storage.z3.R4(this.f266731f)) {
                textView.setVisibility(0);
                textView.setText(context.getString(com.tencent.mm.R.string.lgz, com.tencent.mm.wallet_core.ui.r1.A(this.f266731f, "")));
                return;
            }
            return;
        }
        if (holder instanceof ft4.w0) {
            com.tencent.mm.wallet_core.ui.z1 z1Var = this.f266739q;
            if (z1Var != null) {
                ((ft4.w0) holder).f266723f.setOnClickListener(z1Var);
            }
            ft4.w0 w0Var = (ft4.w0) holder;
            w0Var.f266722e.setText(context.getString(dt4.p.f243266f.c(this.f266738p)));
            w0Var.f266724g.a(this.f266740r);
            ft4.u uVar = w0Var.f266724g;
            uVar.f266699c = this.f266733h;
            uVar.b(this.f266734i, this.f266735m, this.f266736n, this.f266737o);
            return;
        }
        if (holder instanceof ft4.t0) {
            ((ft4.t0) holder).f266696e.setVisibility(8);
            return;
        }
        if (holder instanceof ft4.v0) {
            int i18 = i17 - 2;
            if (i18 >= this.f266730e.size() || i18 < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletLedgerPersonDetailAdapter", "position:" + i17 + "-2 is >=  " + this.f266730e.size() + " || < 0");
                return;
            }
            dt4.u uVar2 = (dt4.u) this.f266730e.get(i18);
            java.lang.String A = com.tencent.mm.wallet_core.ui.r1.A(uVar2.f243293b, this.f266731f);
            java.lang.String string = context.getString(dt4.p.f243266f.c(uVar2.f243296e));
            kotlin.jvm.internal.o.f(string, "getString(...)");
            if (uVar2.f243294c > 0) {
                ((ft4.v0) holder).f266716e.setText(context.getString(com.tencent.mm.R.string.lh9, string, A));
            } else {
                ((ft4.v0) holder).f266716e.setText(context.getString(com.tencent.mm.R.string.lh_, string, A));
            }
            ft4.v0 v0Var = (ft4.v0) holder;
            v0Var.f266717f.setText(com.tencent.mm.wallet_core.ui.r1.r(context.getString(com.tencent.mm.R.string.ley), uVar2.f243295d));
            java.lang.String C = com.tencent.mm.wallet_core.ui.r1.C(uVar2.f243294c);
            android.widget.TextView textView2 = v0Var.f266718g;
            textView2.setText(C);
            if (uVar2.f243294c > 0) {
                textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478554ao));
            } else {
                textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
            }
            if (i17 == getItemCount() - 2) {
                android.view.View view = v0Var.f266719h;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonDetailAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonDetailAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = v0Var.f266719h;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonDetailAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonDetailAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (this.f266741s != null) {
                v0Var.f266715d.setOnClickListener(new ft4.x0(holder, this));
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f489624de5, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new ft4.u0(inflate);
        }
        if (i17 == 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.de6, parent, false);
            kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
            return new ft4.w0(inflate2);
        }
        if (i17 == 3) {
            android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.deb, parent, false);
            kotlin.jvm.internal.o.f(inflate3, "inflate(...)");
            return new ft4.v0(inflate3);
        }
        if (i17 != 4) {
            android.view.View inflate4 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.deb, parent, false);
            kotlin.jvm.internal.o.f(inflate4, "inflate(...)");
            return new ft4.v0(inflate4);
        }
        android.view.View inflate5 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.de8, parent, false);
        kotlin.jvm.internal.o.f(inflate5, "inflate(...)");
        return new ft4.t0(inflate5);
    }
}
