package tf5;

/* loaded from: classes11.dex */
public final class f extends in5.r {
    @Override // in5.r
    public android.view.View c(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        return android.view.LayoutInflater.from(recyclerView.getContext()).inflate(com.tencent.mm.R.layout.f487988de, (android.view.ViewGroup) recyclerView, false);
    }

    @Override // in5.r
    public in5.s0 d(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View convertView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(convertView, "convertView");
        return new tf5.e(this, convertView);
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        tf5.g item = (tf5.g) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        long c17 = c01.id.c();
        tf5.e eVar = (tf5.e) holder;
        boolean z18 = item.f418983i;
        android.widget.RelativeLayout relativeLayout = eVar.f418969s;
        if (z18) {
            relativeLayout.setBackground(null);
        } else {
            relativeLayout.setBackground(com.tencent.mm.ui.zk.d(eVar.f293121e, com.tencent.mm.R.attr.f478322gp));
        }
        boolean z19 = item.f418981g;
        android.widget.TextView textView = eVar.f418964n;
        android.widget.RelativeLayout relativeLayout2 = eVar.f418970t;
        if (z19) {
            relativeLayout2.setVisibility(0);
            textView.setText(item.f418982h);
            textView.setVisibility(0);
        } else {
            relativeLayout2.setVisibility(8);
            textView.setVisibility(8);
        }
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        com.tencent.mm.storage.z3 z3Var = item.f418978d;
        ((com.tencent.mm.feature.avatar.w) zVar).Ai(eVar.f418967q, z3Var.d1(), null);
        boolean m47 = com.tencent.mm.storage.z3.m4(z3Var.d1());
        android.widget.TextView textView2 = eVar.f418968r;
        if (m47) {
            textView2.setText(item.f418987p);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        java.lang.CharSequence charSequence = item.f418985n;
        android.widget.TextView textView3 = eVar.f418965o;
        textView3.setText(charSequence);
        java.lang.CharSequence charSequence2 = item.f418986o;
        boolean J0 = com.tencent.mm.sdk.platformtools.t8.J0(charSequence2);
        android.widget.TextView textView4 = eVar.f418966p;
        if (J0) {
            textView4.setVisibility(8);
        } else {
            textView4.setText(charSequence2);
            textView4.setVisibility(0);
        }
        boolean Di = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Di(z3Var.d1());
        android.widget.ImageView imageView = eVar.f418972v;
        if (Di) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).pj(textView3, z3Var.d1(), bi4.c.CONTACT_LIST, bi4.d.OUTLINED);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.AddressItemConvert", "onBindViewHolder " + (c01.id.c() - c17));
        android.view.View view = eVar.itemView;
        if (view == null) {
            return;
        }
        android.content.Context context = view.getContext();
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "addressbook_cell");
        aVar.fk(view, "addressbook_cell_type", 13);
        aVar.Ai(view, new tf5.k(context));
        aVar.ik(view, 8, 33926);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
