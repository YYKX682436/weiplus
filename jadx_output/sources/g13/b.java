package g13;

/* loaded from: classes10.dex */
public abstract class b extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.bbd;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        i13.c item = (i13.c) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String c17 = item.c();
        android.graphics.drawable.Drawable b17 = item.b();
        int a17 = item.a();
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.bcj);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.h6y);
        if (textView != null) {
            textView.setText(c17);
        }
        weImageView.setVisibility(b17 != null ? 0 : 8);
        weImageView.setImageDrawable(b17);
        weImageView.setIconColor(a17);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.f483487b03);
        if (p17 != null) {
            p17.setOnClickListener(new g13.a(item));
        }
        o(holder, item, i17, i18, z17, list);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.itemView.findViewById(com.tencent.mm.R.id.cgz);
        android.content.Context context = holder.f293121e;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(n(), (android.view.ViewGroup) null);
        p(recyclerView, holder, i17);
        frameLayout.addView(inflate);
        if (k13.l1.I.a().f303213g) {
            android.view.View p17 = holder.p(com.tencent.mm.R.id.b98);
            if (p17 != null) {
                p17.setBackground(context.getDrawable(com.tencent.mm.R.drawable.adq));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.h6y);
            if (weImageView != null) {
                weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.r_));
            }
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.bcj);
            if (textView != null) {
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.r_));
            }
            android.view.View p18 = holder.p(com.tencent.mm.R.id.f483487b03);
            if (p18 != null) {
                p18.setBackground(context.getDrawable(com.tencent.mm.R.drawable.f481270p2));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.f483490b06);
            if (weImageView2 != null) {
                weImageView2.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f479139r2));
            }
        } else {
            android.view.View p19 = holder.p(com.tencent.mm.R.id.b98);
            if (p19 != null) {
                p19.setBackground(context.getDrawable(com.tencent.mm.R.drawable.adp));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.h6y);
            if (weImageView3 != null) {
                weImageView3.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f479144r7));
            }
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.bcj);
            if (textView2 != null) {
                textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479144r7));
            }
            android.view.View p27 = holder.p(com.tencent.mm.R.id.f483487b03);
            if (p27 != null) {
                p27.setBackground(context.getDrawable(com.tencent.mm.R.drawable.f481271p3));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.f483490b06);
            if (weImageView4 != null) {
                weImageView4.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f479138r1));
            }
        }
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.odf)).getPaint(), 0.8f);
    }

    public abstract int n();

    public abstract void o(in5.s0 s0Var, i13.c cVar, int i17, int i18, boolean z17, java.util.List list);

    public abstract void p(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 s0Var, int i17);
}
