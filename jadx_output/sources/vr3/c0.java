package vr3;

/* loaded from: classes3.dex */
public final class c0 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.a1q;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vr3.d0 item = (vr3.d0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ohd);
        if (textView == null) {
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = item.f439626d.f387473d;
        if (str == null) {
            str = "";
        }
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(holder.f293121e, str));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ohd);
        if (textView != null) {
            textView.setTextSize(1, i65.a.q(holder.f293121e) * 14.0f);
        }
    }
}
