package ga2;

/* loaded from: classes2.dex */
public final class c extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489064du4;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ha2.a item = (ha2.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.s0t);
        r45.ad1 ad1Var = (r45.ad1) item.f279791d.getCustom(6);
        textView.setText(ad1Var != null ? ad1Var.getString(0) : null);
    }
}
