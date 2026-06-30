package dy3;

/* loaded from: classes11.dex */
public final class o extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.cgt;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        dy3.p item = (dy3.p) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.content.Context context = holder.itemView.getContext();
        com.tencent.mm.ui.base.MaskLayout maskLayout = (com.tencent.mm.ui.base.MaskLayout) holder.itemView.findViewById(com.tencent.mm.R.id.a5y);
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.a5z);
        android.view.View contentView = maskLayout.getContentView();
        kotlin.jvm.internal.o.e(contentView, "null cannot be cast to non-null type android.widget.ImageView");
        com.tencent.mm.storage.z3 z3Var = item.f244596e;
        textView.setTextColor(i65.a.e(context, !c01.e2.D(z3Var.d1()) ? com.tencent.mm.R.color.f479413yk : com.tencent.mm.R.color.f479414yl));
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        android.view.View contentView2 = maskLayout.getContentView();
        kotlin.jvm.internal.o.e(contentView2, "null cannot be cast to non-null type android.widget.ImageView");
        ((com.tencent.mm.feature.avatar.w) zVar).Ai((android.widget.ImageView) contentView2, z3Var.d1(), null);
        if (z3Var.f1() == 0) {
            maskLayout.setMaskDrawable(null);
        } else if (c01.n8.b() != null) {
            java.lang.String b17 = ((xf4.d) c01.n8.b()).b(z3Var.f1(), false);
            if (b17 != null) {
                ((c01.m0) ((qk.p6) i95.n0.c(qk.p6.class))).getClass();
                maskLayout.b(r01.y1.a(b17, 1.5f), db5.r8.SUBSCRIPT_DRAWABLE_DIRECTION_BOTTOM_RIGHT);
            } else {
                maskLayout.setMaskDrawable(null);
            }
        } else {
            maskLayout.setMaskDrawable(null);
        }
        java.lang.String w07 = com.tencent.mm.sdk.platformtools.t8.K0(z3Var.w0()) ? null : z3Var.w0();
        if (com.tencent.mm.sdk.platformtools.t8.K0(w07)) {
            w07 = z3Var.f2();
        }
        if (com.tencent.mm.storage.z3.m4(z3Var.d1())) {
            ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).ij(context, textView, w07, z3Var.Q0(), z3Var.G0(), (int) textView.getTextSize());
        } else {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, w07, textSize));
        }
        if (!item.f244599h) {
            android.widget.TextView textView2 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.bde);
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
            return;
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.bde);
        if (textView3 != null) {
            textView3.setText(item.f244601m);
            textView3.setVisibility(0);
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
