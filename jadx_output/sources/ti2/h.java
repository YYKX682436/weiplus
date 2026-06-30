package ti2;

/* loaded from: classes10.dex */
public class h extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.am6;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vi2.c item = (vi2.c) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.nzh);
        if (textView != null) {
            fj2.k kVar = fj2.k.f263175d;
            fj2.k kVar2 = item.f437543d;
            android.content.Context context = holder.f293121e;
            if (kVar2 == kVar) {
                textView.setText(context.getResources().getString(com.tencent.mm.R.string.eg8));
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479098px));
            } else {
                textView.setText(context.getResources().getString(com.tencent.mm.R.string.eg7));
                textView.setTextColor(android.graphics.Color.parseColor("#6467F0"));
            }
        }
    }
}
