package com.tencent.mm.ui;

/* loaded from: classes.dex */
public final class nj extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f209427e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f209428f = jz5.h.b(com.tencent.mm.ui.lj.f209083d);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f209429g = jz5.h.b(com.tencent.mm.ui.kj.f209049d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f209430h = jz5.h.b(com.tencent.mm.ui.jj.f209010d);

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f209431i = jz5.h.b(com.tencent.mm.ui.ij.f208930d);

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489581eq3;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.storage.k4 Bi;
        com.tencent.mm.ui.hj item = (com.tencent.mm.ui.hj) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.kbq);
        vg3.x3 x3Var = (vg3.x3) ((jz5.n) this.f209428f).getValue();
        java.lang.String str = item.f208886d;
        com.tencent.mm.storage.z3 n17 = (x3Var == null || (Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) x3Var).Bi()) == null) ? null : Bi.n(str, true);
        if (n17 != null) {
            tg3.v0 v0Var = (tg3.v0) ((jz5.n) this.f209429g).getValue();
            java.lang.String wi6 = v0Var != null ? ((sg3.a) v0Var).wi(n17) : null;
            if (wi6 == null) {
                wi6 = str;
            }
            if (com.tencent.mm.storage.z3.R4(str)) {
                wi6 = wi6 + '(' + (((rv1.e) ((jz5.n) this.f209430h).getValue()) != null ? c01.v1.o(n17.d1()) : 0) + ')';
            }
            textView.setText(wi6);
        }
        kv.b0 b0Var = (kv.b0) ((jz5.n) this.f209431i).getValue();
        if (b0Var != null) {
            android.view.View p17 = holder.p(com.tencent.mm.R.id.a_4);
            kotlin.jvm.internal.o.f(p17, "getView(...)");
            ((hn1.s) b0Var).Ai((android.widget.ImageView) p17, str);
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.tencent.mm.R.id.vfd);
        int i19 = item.f208887e;
        int i27 = item.f208888f;
        if (i27 == 1) {
            linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.d_0);
        } else if (i19 == 0) {
            linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.d_3);
        } else if (i19 == i27 - 1) {
            linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.d_1);
        } else {
            linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.d_2);
        }
        android.view.View p18 = holder.p(com.tencent.mm.R.id.d0v);
        if (i27 == 1 || i19 == i27 - 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/ui/TipUseDuplicateGroupItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/TipUseDuplicateGroupConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/ui/TipUseDuplicateGroupItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/TipUseDuplicateGroupConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        holder.itemView.setOnClickListener(new com.tencent.mm.ui.mj(this, item));
    }
}
