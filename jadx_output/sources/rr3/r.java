package rr3;

/* loaded from: classes3.dex */
public final class r extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f399210d;

    /* renamed from: e, reason: collision with root package name */
    public final rr3.z f399211e;

    public r(java.util.LinkedList dataList, rr3.z scopeUIC) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        kotlin.jvm.internal.o.g(scopeUIC, "scopeUIC");
        this.f399210d = dataList;
        this.f399211e = scopeUIC;
    }

    public static final boolean x(rr3.r rVar, int i17) {
        int i18;
        int i19;
        rVar.getClass();
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        rr3.z zVar = rVar.f399211e;
        com.tencent.mm.storage.z3 n17 = Bi.n(((com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoAuthMainUI) ((jz5.n) zVar.f399225h).getValue()).U6(), true);
        if (n17 == null) {
            com.tencent.mars.xlog.Log.w("NewBizInfoAuthScopeUIC", "showNotifiedMenu:: get %s contact return null", ((com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoAuthMainUI) ((jz5.n) zVar.f399225h).getValue()).U6());
        }
        boolean z17 = false;
        if ((n17 != null && n17.r2()) && n17.m2()) {
            z17 = true;
        }
        if (z17) {
            i18 = com.tencent.mm.R.string.nay;
            i19 = com.tencent.mm.R.string.f490948na4;
        } else {
            i18 = com.tencent.mm.R.string.bbx;
            i19 = com.tencent.mm.R.string.f490947bc1;
        }
        java.lang.Object obj = rVar.f399210d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) zVar.getContext(), 1, true);
        java.lang.String string = zVar.getContext().getResources().getString(i18);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{((r45.tc5) obj).f386311e}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        k0Var.r(format, 17, i65.a.b(zVar.getContext(), 12), null);
        k0Var.f211872n = new rr3.p(i19);
        k0Var.f211881s = new rr3.q(rVar, i17);
        k0Var.v();
        return true;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f399210d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (holder instanceof rr3.m) {
            if (i17 == 0) {
                ((rr3.m) holder).f399202g.setVisibility(0);
            } else {
                ((rr3.m) holder).f399202g.setVisibility(8);
            }
            java.lang.Object obj = this.f399210d.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            r45.tc5 tc5Var = (r45.tc5) obj;
            rr3.z zVar = this.f399211e;
            int i18 = zVar.f399223f;
            if (i18 == 1) {
                android.widget.ImageView imageView = ((rr3.m) holder).f399199d;
                imageView.setVisibility(0);
                java.lang.String str = com.tencent.mm.ui.bk.C() ? tc5Var.f386314h : tc5Var.f386313g;
                int b17 = i65.a.b(zVar.getContext(), 24);
                o11.f fVar = new o11.f();
                fVar.f342078b = true;
                fVar.f342077a = true;
                fVar.f342086j = b17;
                fVar.f342087k = b17;
                n11.a.b().h(str, imageView, fVar.a());
                imageView.setOnClickListener(null);
            } else if (i18 == 2) {
                android.widget.ImageView imageView2 = ((rr3.m) holder).f399199d;
                imageView2.setImageResource(com.tencent.mm.R.raw.app_brand_star_delete);
                imageView2.setOnClickListener(new rr3.n(this, i17));
            }
            rr3.m mVar = (rr3.m) holder;
            mVar.f399200e.setText(tc5Var.f386311e);
            int i19 = tc5Var.f386312f;
            android.widget.TextView textView = mVar.f399201f;
            if (i19 == 7) {
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            if (zVar.f399223f == 2) {
                holder.itemView.setOnLongClickListener(null);
            } else {
                holder.itemView.setOnLongClickListener(new rr3.o(this, i17));
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a1s, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new rr3.m(this, inflate);
    }
}
