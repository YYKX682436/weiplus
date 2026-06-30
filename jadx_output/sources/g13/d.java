package g13;

/* loaded from: classes10.dex */
public final class d extends g13.b {
    @Override // g13.b
    public int n() {
        return com.tencent.mm.R.layout.bb_;
    }

    @Override // g13.b
    public void o(in5.s0 holder, i13.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        i13.h item = (i13.h) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        boolean z18 = k13.l1.I.a().f303213g;
        android.content.Context context = holder.f293121e;
        if (z18) {
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.odf);
            if (textView != null) {
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479147rb));
            }
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.gcj);
            if (textView2 != null) {
                textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.r_));
            }
        } else {
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.odf);
            if (textView3 != null) {
                textView3.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479146r9));
            }
            android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.gcj);
            if (textView4 != null) {
                textView4.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479145r8));
            }
        }
        ((android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.odf)).setText(item.f287285h);
        android.widget.TextView textView5 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.gcj);
        java.lang.String str = item.f287286i;
        if (str == null || str.length() == 0) {
            textView5.setVisibility(8);
            return;
        }
        textView5.setVisibility(0);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = textView5.getContext();
        float textSize = textView5.getTextSize();
        ((ke0.e) xVar).getClass();
        textView5.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, str, textSize));
    }

    @Override // g13.b
    public void p(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
