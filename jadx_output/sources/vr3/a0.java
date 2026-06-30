package vr3;

/* loaded from: classes11.dex */
public final class a0 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.a18;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vr3.b0 item = (vr3.b0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ang);
        if (textView != null) {
            textView.setText(item.f439623d.f380637f);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.anh);
        if (weImageView == null) {
            return;
        }
        weImageView.setVisibility(i18 == 0 ? 0 : 8);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
    }
}
