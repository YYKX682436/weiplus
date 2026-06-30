package g13;

/* loaded from: classes10.dex */
public final class g extends g13.b {
    @Override // g13.b
    public int n() {
        return com.tencent.mm.R.layout.bba;
    }

    @Override // g13.b
    public void o(in5.s0 holder, i13.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        i13.p item = (i13.p) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        boolean z18 = k13.l1.I.a().f303213g;
        android.content.Context context = holder.f293121e;
        if (z18) {
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.odf);
            if (textView != null) {
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479147rb));
            }
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.po8);
            if (textView2 != null) {
                textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.r_));
            }
        } else {
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.odf);
            if (textView3 != null) {
                textView3.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479146r9));
            }
            android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.po8);
            if (textView4 != null) {
                textView4.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479144r7));
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.a_4);
        if (r26.i0.o(item.f287275d, "@miniapp", false, 2, null)) {
            n11.a.b().g(item.f287317o, imageView);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView, item.f287313h, 0.12f);
        }
        android.widget.TextView textView5 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.odf);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = textView5.getContext();
        float textSize = textView5.getTextSize();
        ((ke0.e) xVar).getClass();
        textView5.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, item.f287314i, textSize));
        ((android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.po8)).setText(item.f287315m);
        textView5.requestLayout();
    }

    @Override // g13.b
    public void p(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
