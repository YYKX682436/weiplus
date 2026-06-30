package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public class t3 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f121948e;

    /* renamed from: f, reason: collision with root package name */
    public final float f121949f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.q f121950g;

    public t3(int i17, float f17, sp2.k kVar, yz5.q optionClickHandler) {
        kotlin.jvm.internal.o.g(optionClickHandler, "optionClickHandler");
        this.f121948e = i17;
        this.f121949f = f17;
        this.f121950g = optionClickHandler;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.eiy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        dk2.hc hcVar;
        int i19;
        dk2.ic icVar;
        android.view.View view;
        int i27;
        vp2.h0 item = (vp2.h0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        int i28 = 0;
        java.util.List i29 = kz5.c0.i(holder.itemView.findViewById(com.tencent.mm.R.id.unc), holder.itemView.findViewById(com.tencent.mm.R.id.und), holder.itemView.findViewById(com.tencent.mm.R.id.une));
        int i37 = this.f121948e;
        int i38 = (int) (this.f121949f * i37);
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.s3 s3Var = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.s3(this, i38);
        android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.ukh);
        kotlin.jvm.internal.o.d(findViewById);
        s3Var.invoke(findViewById);
        dk2.bc bcVar = item.f438925e;
        if (bcVar == null || (hcVar = bcVar.f233256c) == null) {
            return;
        }
        ((android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.vfm)).setText(hcVar.f233582d);
        dk2.ic icVar2 = item.f438927g;
        dk2.dc dcVar = item.f438926f;
        if (dcVar != null) {
            dcVar.d(hcVar);
        }
        java.util.Iterator it = i29.iterator();
        while (it.hasNext()) {
            ((android.widget.Button) it.next()).setVisibility(8);
        }
        int i39 = 0;
        for (java.lang.Object obj : kz5.n0.K0(hcVar.f233583e, 3)) {
            int i47 = i39 + 1;
            if (i39 < 0) {
                kz5.c0.p();
                throw null;
            }
            dk2.ic icVar3 = (dk2.ic) obj;
            android.widget.Button button = (android.widget.Button) kz5.n0.a0(i29, i39);
            if (button != null) {
                button.setVisibility(i28);
                button.setText(icVar3.f233623b);
                icVar = icVar2;
                view = findViewById;
                i27 = i38;
                button.setOnClickListener(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.r3(item, this, i29, i39, icVar3, i17, holder));
                button.setSelected(kotlin.jvm.internal.o.b(icVar3, icVar));
            } else {
                icVar = icVar2;
                view = findViewById;
                i27 = i38;
            }
            icVar2 = icVar;
            i39 = i47;
            findViewById = view;
            i38 = i27;
            i28 = 0;
        }
        android.view.View view2 = findViewById;
        int i48 = i38;
        android.content.Context context = holder.f293121e;
        float q17 = i65.a.q(context);
        int paddingLeft = i37 - (view2.getPaddingLeft() + view2.getPaddingRight());
        android.view.View findViewById2 = holder.itemView.findViewById(com.tencent.mm.R.id.nei);
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.vfm);
        if (i29.isEmpty()) {
            i19 = 0;
        } else {
            java.util.Iterator it6 = i29.iterator();
            i19 = 0;
            while (it6.hasNext()) {
                if ((((android.widget.Button) it6.next()).getVisibility() == 0) && (i19 = i19 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        textView.measure(android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), 0);
        int measuredHeight = textView.getMeasuredHeight();
        float b17 = i65.a.b(context, 34) * q17;
        java.util.Iterator it7 = i29.iterator();
        while (it7.hasNext()) {
            ((android.widget.Button) it7.next()).getLayoutParams().height = (int) b17;
        }
        findViewById2.getLayoutParams().height = (int) e06.p.e(((i48 - measuredHeight) - (i19 > 0 ? (b17 * i19) + ((q17 * i65.a.h(context, com.tencent.mm.R.dimen.f479688cn)) * (i19 - 1)) : 0.0f)) - (r5 * 2), i65.a.b(context, 4), i65.a.b(context, 32));
        findViewById2.requestLayout();
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
    }
}
