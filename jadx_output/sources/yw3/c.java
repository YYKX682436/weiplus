package yw3;

/* loaded from: classes4.dex */
public final class c extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.cey;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        yw3.j item = (yw3.j) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.odf);
        yw3.p pVar = item.f466773d;
        textView.setText(pVar.t0());
        ((android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.cut)).setText(pVar.u0());
        ((android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.o7z)).setText(k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, pVar.v0() / 1000));
        android.widget.TextView textView2 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.f487504ot3);
        if (textView2 != null) {
            textView2.setOnClickListener(new yw3.a(item));
        }
        ((android.widget.Button) holder.itemView.findViewById(com.tencent.mm.R.id.ct6)).setOnClickListener(new yw3.b(item));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
