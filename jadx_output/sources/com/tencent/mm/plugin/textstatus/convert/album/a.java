package com.tencent.mm.plugin.textstatus.convert.album;

/* loaded from: classes11.dex */
public final class a extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f173213e;

    public a(android.view.View.OnLongClickListener longClickListener) {
        kotlin.jvm.internal.o.g(longClickListener, "longClickListener");
        this.f173213e = longClickListener;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.cyk;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        fj4.a item = (fj4.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.AlbumItemConvert", "onBindViewHolder");
        java.lang.Object obj = holder.f293124h;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.api.IStatusCardView");
        bi4.n0 n0Var = (bi4.n0) obj;
        n0Var.getView().setTag(com.tencent.mm.R.id.ipp, item);
        n0Var.getView().setOnLongClickListener(this.f173213e);
        n0Var.getView().setTag(com.tencent.mm.R.id.nwq, java.lang.Integer.valueOf(i17));
        android.view.View view = n0Var.getView();
        pj4.n1 n1Var = item.f263223d;
        view.setTag(com.tencent.mm.R.id.nwo, n1Var);
        if (n0Var instanceof bi4.p0) {
            pj4.u0 u0Var = new pj4.u0();
            u0Var.f355303d = n1Var.f355202g + n1Var.f355204i;
            java.lang.String a17 = en1.a.a();
            kotlin.jvm.internal.o.f(a17, "username(...)");
            ((bi4.p0) n0Var).m(a17, item.f263224e, u0Var);
        }
        java.lang.String str = item.f263225f;
        boolean z18 = true;
        if (str == null || r26.n0.N(str)) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.oqw)).setVisibility(8);
        } else {
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.oqw);
            textView.setVisibility(0);
            textView.setText(item.f263225f);
        }
        java.lang.String str2 = item.f263226g;
        if (str2 != null && !r26.n0.N(str2)) {
            z18 = false;
        }
        if (z18) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.oo6)).setVisibility(8);
            return;
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.oo6);
        textView2.setVisibility(0);
        textView2.setText(item.f263226g);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.AlbumItemConvert", "onCreateViewHolder");
        android.view.View view = holder.itemView;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
        bi4.k1 k1Var = new bi4.k1();
        k1Var.j(true);
        k1Var.q(true);
        k1Var.f21065e = true;
        k1Var.f21067g = 6;
        k1Var.f21064d = (k1Var.f21064d & (-4097)) | 2048;
        xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
        android.content.Context context = recyclerView.getContext();
        ((we0.j1) l0Var).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.textstatus.ui.q3 n2Var = k1Var.l(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) ? new com.tencent.mm.plugin.textstatus.ui.n2(context, k1Var) : new com.tencent.mm.plugin.textstatus.ui.q3(context, k1Var);
        android.view.View view2 = n2Var.f174196m;
        linearLayout.addView(view2);
        holder.f293124h = n2Var;
        android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((android.widget.LinearLayout.LayoutParams) layoutParams).width = -1;
    }
}
