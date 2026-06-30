package rr3;

/* loaded from: classes4.dex */
public final class g0 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.a1v;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        rr3.d item = (rr3.d) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        ((android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.d1x)).setVisibility(i17 == 0 ? 0 : 8);
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.f486570lp0);
        r45.ym ymVar = item.f399181d;
        r45.nm nmVar = ymVar.f391208d;
        textView.setText(nmVar != null ? nmVar.f381493e : null);
        android.widget.TextView textView2 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.f486572lp2);
        long j17 = ymVar.f391209e;
        java.util.Locale locale = java.util.Locale.US;
        long j18 = j17 * 1000;
        textView2.setText(android.text.format.DateUtils.isToday(j18) ? new java.text.SimpleDateFormat("HH:mm", locale).format(new java.util.Date(j18)) : new java.text.SimpleDateFormat("MM/dd HH:mm", locale).format(new java.util.Date(j18)));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
