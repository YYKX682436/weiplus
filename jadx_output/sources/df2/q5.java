package df2;

/* loaded from: classes3.dex */
public final class q5 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.bib;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        df2.s5 item = (df2.s5) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.gqo);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.gqp);
        java.lang.String string = item.f231290d.getString(1);
        if (string == null) {
            string = "";
        }
        textView.setText(string);
        kotlinx.coroutines.y0 y0Var = holder.f293120d;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new df2.p5(item, imageView, null), 3, null);
        }
    }
}
