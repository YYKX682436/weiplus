package ij4;

/* loaded from: classes11.dex */
public final class c extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.cyn;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ij4.a item = (ij4.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.oku);
        if (textView != null) {
            textView.setOnClickListener(new ij4.b(holder));
            java.lang.String a17 = en1.a.a();
            kotlin.jvm.internal.o.d(a17);
            qj4.s.f363958a.a(textView, new qj4.l(a17, false, 14L, null, null, null, null, 120, null));
            textView.setVisibility(ai4.m0.f5173a.M(en1.a.a()) != null ? 8 : 0);
            com.tencent.mm.ui.bk.s0(textView.getPaint());
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        holder.toString();
    }
}
