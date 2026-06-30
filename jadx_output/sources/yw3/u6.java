package yw3;

/* loaded from: classes11.dex */
public final class u6 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.cg7;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        yw3.s6 item = (yw3.s6) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View view = holder.itemView;
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.hc6)).setText(item.f466881d);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.icon_tv)).setImageResource(item.f466883f);
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.odf)).setText(item.f466884g);
    }
}
