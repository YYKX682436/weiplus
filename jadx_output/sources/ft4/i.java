package ft4;

/* loaded from: classes14.dex */
public final class i extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f266622d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f266623e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f266624f;

    /* renamed from: g, reason: collision with root package name */
    public int f266625g;

    /* renamed from: h, reason: collision with root package name */
    public int f266626h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f266627i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f266628m;

    /* renamed from: n, reason: collision with root package name */
    public ft4.a f266629n;

    public i(android.content.Context context, java.util.List data) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        this.f266622d = context;
        this.f266623e = data;
        this.f266624f = "";
        this.f266627i = true;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f266623e.size() + this.f266625g + this.f266626h;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        if (i17 == 0) {
            if (this.f266625g == 1) {
                return 3;
            }
            return ((ft4.j) this.f266623e.get(0)).f266631a;
        }
        if (i17 == getItemCount() - 1 && this.f266626h == 1) {
            return 3;
        }
        return ((ft4.j) this.f266623e.get(i17 - this.f266625g)).f266631a;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        ft4.j jVar;
        dt4.q qVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (getItemCount() <= i17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletLedgerDayAdapter", "itemCount:" + getItemCount() + " is small than " + i17);
            return;
        }
        if (holder instanceof ft4.b) {
            ft4.j jVar2 = (ft4.j) this.f266623e.get(i17 - this.f266625g);
            ft4.b bVar = (ft4.b) holder;
            bVar.f266583f.a(new ft4.e(this, jVar2));
            ft4.k kVar = jVar2.f266632b;
            int i18 = kVar.f266636a;
            ft4.u uVar = bVar.f266583f;
            uVar.f266699c = i18;
            uVar.b(kVar.f266637b, kVar.f266638c, kVar.f266639d, kVar.f266640e);
            return;
        }
        if (holder instanceof ft4.d) {
            if (i17 == 0) {
                if (this.f266625g == 0) {
                    ((ft4.d) holder).f266601e.setVisibility(8);
                } else {
                    ((ft4.d) holder).f266601e.setVisibility(0);
                }
            }
            if (i17 == getItemCount() - 1) {
                if (this.f266626h == 0) {
                    ((ft4.d) holder).f266601e.setVisibility(8);
                    return;
                } else {
                    ((ft4.d) holder).f266601e.setVisibility(0);
                    return;
                }
            }
            return;
        }
        if (!(holder instanceof ft4.c) || (qVar = (jVar = (ft4.j) this.f266623e.get(i17 - this.f266625g)).f266633c) == null) {
            return;
        }
        if (qVar.f243275c == 0 && qVar.f243274b == 0) {
            ((ft4.c) holder).f266586e.setVisibility(8);
        } else {
            ((ft4.c) holder).f266586e.setVisibility(0);
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int t17 = com.tencent.mm.wallet_core.ui.r1.t(calendar.getTimeInMillis());
        calendar.add(6, -1);
        int t18 = com.tencent.mm.wallet_core.ui.r1.t(calendar.getTimeInMillis());
        int i19 = qVar.f243273a;
        android.content.Context context = this.f266622d;
        if (i19 > 0) {
            ft4.c cVar = (ft4.c) holder;
            android.widget.TextView textView = cVar.f266587f;
            textView.setVisibility(0);
            if (this.f266628m) {
                textView.setText(com.tencent.mm.wallet_core.ui.r1.r(context.getString(com.tencent.mm.R.string.fcl), com.tencent.mm.wallet_core.ui.r1.f(qVar.f243273a)));
            } else {
                textView.setText(com.tencent.mm.wallet_core.ui.r1.r(context.getString(com.tencent.mm.R.string.f492135fc2), com.tencent.mm.wallet_core.ui.r1.f(qVar.f243273a)));
            }
            android.widget.TextView textView2 = cVar.f266588g;
            textView2.setVisibility(8);
            int i27 = qVar.f243273a;
            if (i27 == t17) {
                textView2.setVisibility(0);
                textView2.setText(context.getString(com.tencent.mm.R.string.fd_));
            } else if (i27 == t18) {
                textView2.setVisibility(0);
                textView2.setText(context.getString(com.tencent.mm.R.string.fdi));
            }
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        } else {
            ft4.c cVar2 = (ft4.c) holder;
            cVar2.f266587f.setVisibility(8);
            cVar2.f266588g.setVisibility(8);
        }
        ft4.c cVar3 = (ft4.c) holder;
        com.tencent.mm.ui.bk.r0(cVar3.f266591m.getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(cVar3.f266595q.getPaint(), 0.8f);
        android.widget.LinearLayout linearLayout = cVar3.f266589h;
        linearLayout.setVisibility(8);
        android.widget.LinearLayout linearLayout2 = cVar3.f266593o;
        linearLayout2.setVisibility(8);
        if (qVar.f243274b != 0) {
            java.util.LinkedHashMap linkedHashMap = qVar.f243276d;
            if (linkedHashMap.size() > 0) {
                linearLayout.setVisibility(0);
                cVar3.f266590i.setText(com.tencent.mm.wallet_core.ui.r1.C(qVar.f243274b));
                java.util.Collection values = linkedHashMap.values();
                kotlin.jvm.internal.o.f(values, "<get-values>(...)");
                ft4.o oVar = new ft4.o(context, kz5.n0.S0(values));
                java.lang.String str = this.f266624f;
                kotlin.jvm.internal.o.g(str, "<set-?>");
                oVar.f266664e = str;
                androidx.recyclerview.widget.RecyclerView recyclerView = cVar3.f266592n;
                recyclerView.setAdapter(oVar);
                recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
                oVar.f266665f = new ft4.f(this);
            }
        }
        if (qVar.f243275c != 0) {
            java.util.LinkedHashMap linkedHashMap2 = qVar.f243277e;
            if (linkedHashMap2.size() > 0) {
                linearLayout2.setVisibility(0);
                cVar3.f266594p.setText(com.tencent.mm.wallet_core.ui.r1.C(qVar.f243275c));
                java.util.Collection values2 = linkedHashMap2.values();
                kotlin.jvm.internal.o.f(values2, "<get-values>(...)");
                ft4.o oVar2 = new ft4.o(context, kz5.n0.S0(values2));
                java.lang.String str2 = this.f266624f;
                kotlin.jvm.internal.o.g(str2, "<set-?>");
                oVar2.f266664e = str2;
                androidx.recyclerview.widget.RecyclerView recyclerView2 = cVar3.f266596r;
                recyclerView2.setAdapter(oVar2);
                recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
                oVar2.f266665f = new ft4.g(this);
            }
        }
        boolean z17 = this.f266627i;
        android.widget.LinearLayout linearLayout3 = cVar3.f266597s;
        if (!z17) {
            linearLayout3.setVisibility(8);
        } else {
            linearLayout3.setVisibility(0);
            linearLayout3.setOnClickListener(new ft4.h(this, jVar));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f489620de1, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new ft4.b(inflate);
        }
        if (i17 == 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.ddx, parent, false);
            kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
            return new ft4.c(inflate2);
        }
        if (i17 != 3) {
            android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.ddx, parent, false);
            kotlin.jvm.internal.o.f(inflate3, "inflate(...)");
            return new ft4.c(inflate3);
        }
        android.view.View inflate4 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f489621de2, parent, false);
        kotlin.jvm.internal.o.f(inflate4, "inflate(...)");
        return new ft4.d(inflate4);
    }
}
