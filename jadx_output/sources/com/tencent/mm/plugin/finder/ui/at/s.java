package com.tencent.mm.plugin.finder.ui.at;

/* loaded from: classes11.dex */
public final class s extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Boolean f128900e;

    public s(java.lang.Boolean bool) {
        this.f128900e = bool;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.anx;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.finder.ui.at.t item = (com.tencent.mm.plugin.finder.ui.at.t) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.content.Context context = holder.itemView.getContext();
        com.tencent.mm.ui.base.MaskLayout maskLayout = (com.tencent.mm.ui.base.MaskLayout) holder.itemView.findViewById(com.tencent.mm.R.id.a5y);
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.a5z);
        android.view.View contentView = maskLayout.getContentView();
        kotlin.jvm.internal.o.e(contentView, "null cannot be cast to non-null type android.widget.ImageView");
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.Boolean bool2 = this.f128900e;
        textView.setTextColor(kotlin.jvm.internal.o.b(bool2, bool) ? android.graphics.Color.parseColor("#CCFFFFFF") : context.getResources().getColor(com.tencent.mm.R.color.f479413yk));
        if (kotlin.jvm.internal.o.b(bool2, bool)) {
            holder.itemView.findViewById(com.tencent.mm.R.id.a5x).setBackgroundDrawable(context.getResources().getDrawable(com.tencent.mm.R.drawable.f481537vy));
        }
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        android.view.View contentView2 = maskLayout.getContentView();
        kotlin.jvm.internal.o.e(contentView2, "null cannot be cast to non-null type android.widget.ImageView");
        com.tencent.mm.storage.z3 z3Var = item.f128902e;
        ((com.tencent.mm.feature.avatar.w) zVar).Ai((android.widget.ImageView) contentView2, z3Var.d1(), null);
        if (z3Var.f1() == 0) {
            maskLayout.setMaskDrawable(null);
        } else if (c01.n8.b() != null) {
            java.lang.String b17 = ((xf4.d) c01.n8.b()).b(z3Var.f1(), false);
            if (b17 != null) {
                ((qv.y) ((rv.b3) i95.n0.c(rv.b3.class))).getClass();
                maskLayout.b(r01.y1.a(b17, 1.5f), db5.r8.SUBSCRIPT_DRAWABLE_DIRECTION_BOTTOM_RIGHT);
            } else {
                maskLayout.setMaskDrawable(null);
            }
        } else {
            maskLayout.setMaskDrawable(null);
        }
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String md6 = c61.yb.md((c61.yb) c17, z3Var.d1(), z3Var.P0(), false, 4, null);
        if (com.tencent.mm.storage.z3.m4(z3Var.d1())) {
            ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).ij(context, textView, md6, z3Var.Q0(), z3Var.G0(), (int) textView.getTextSize());
        } else {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, md6, textSize));
        }
        if (!item.f128906i) {
            android.widget.TextView textView2 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.bde);
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
            return;
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.bde);
        if (textView3 != null) {
            textView3.setText(item.f128908n);
            textView3.setVisibility(0);
            if (kotlin.jvm.internal.o.b(bool2, bool)) {
                textView3.setBackgroundColor(android.graphics.Color.parseColor("#0DFFFFFF"));
                textView3.setTextColor(android.graphics.Color.parseColor("#80FFFFFF"));
            }
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
