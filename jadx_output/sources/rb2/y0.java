package rb2;

/* loaded from: classes10.dex */
public final class y0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f393829e;

    /* renamed from: f, reason: collision with root package name */
    public final int f393830f;

    /* renamed from: g, reason: collision with root package name */
    public final gd2.n f393831g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f393832h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f393833i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.p f393834m;

    public y0(com.tencent.mm.plugin.finder.storage.FinderItem feedObj, int i17, gd2.n menuData, yz5.l onLikeComment, yz5.l onOpenCommentInputFooter, yz5.p onRunDragAnimation) {
        kotlin.jvm.internal.o.g(feedObj, "feedObj");
        kotlin.jvm.internal.o.g(menuData, "menuData");
        kotlin.jvm.internal.o.g(onLikeComment, "onLikeComment");
        kotlin.jvm.internal.o.g(onOpenCommentInputFooter, "onOpenCommentInputFooter");
        kotlin.jvm.internal.o.g(onRunDragAnimation, "onRunDragAnimation");
        this.f393829e = feedObj;
        this.f393830f = i17;
        this.f393831g = menuData;
        this.f393832h = onLikeComment;
        this.f393833i = onOpenCommentInputFooter;
        this.f393834m = onRunDragAnimation;
    }

    public static final void n(rb2.y0 y0Var, android.view.View view) {
        y0Var.getClass();
        if (view.getWidth() > 0) {
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.hke);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.oog);
            android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.u79);
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.vip);
            android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.vid);
            android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.f487464vj2);
            android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.ucc);
            int width = view.findViewById(com.tencent.mm.R.id.f485652uc4).getWidth();
            kotlin.jvm.internal.o.d(findViewById);
            int p17 = y0Var.p(findViewById);
            int p18 = findViewById2.getVisibility() == 0 ? y0Var.p(findViewById2) : 0;
            kotlin.jvm.internal.o.d(textView2);
            int q17 = y0Var.q(textView2);
            kotlin.jvm.internal.o.d(textView3);
            int q18 = y0Var.q(textView3);
            kotlin.jvm.internal.o.d(findViewById3);
            int p19 = y0Var.p(findViewById3);
            kotlin.jvm.internal.o.d(findViewById4);
            int p27 = y0Var.p(findViewById4);
            kotlin.jvm.internal.o.d(textView);
            int p28 = hc2.f1.p(textView);
            com.tencent.mars.xlog.Log.i("FinderCommentImageFlowConvert", "Width all:" + width + " avatar:" + p17 + " finderIcon:" + p18 + " ipRegion:" + q17);
            com.tencent.mars.xlog.Log.i("FinderCommentImageFlowConvert", "Width commentTime:" + q18 + " reply:" + p19 + " thumbLikeContainer:" + p27 + " char:" + p28);
            int i17 = ((((((width - p17) - p18) - q17) - q18) - p19) - p27) - p28;
            int i18 = (int) (((float) p28) * 2.5f);
            if (i17 < i18) {
                i17 = i18;
            }
            textView.setMaxWidth(i17);
        }
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.e66;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025c  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r28, in5.c r29, int r30, int r31, boolean r32, java.util.List r33) {
        /*
            Method dump skipped, instructions count: 1308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rb2.y0.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView finderCommentImageGalleryView = (com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView) holder.p(com.tencent.mm.R.id.u76);
        finderCommentImageGalleryView.setMenuData(this.f393831g);
        finderCommentImageGalleryView.setSingleClickOverListener(new rb2.v0(this, holder));
        finderCommentImageGalleryView.setOnItemSelectedListener(new rb2.w0(this, holder, finderCommentImageGalleryView));
        holder.p(com.tencent.mm.R.id.ssh).setClickable(true);
        com.tencent.mm.plugin.finder.view.CollapsibleTextView collapsibleTextView = (com.tencent.mm.plugin.finder.view.CollapsibleTextView) holder.p(com.tencent.mm.R.id.vic);
        android.content.Context context = holder.f293121e;
        int color = b3.l.getColor(context, com.tencent.mm.R.color.BW_100_Alpha_0_8);
        int color2 = b3.l.getColor(context, com.tencent.mm.R.color.ajw);
        collapsibleTextView.f130820p.setTextColor(color);
        collapsibleTextView.f130821q.setTextColor(color2);
        float dimension = context.getResources().getDimension(com.tencent.mm.R.dimen.f479674cb) * i65.a.q(context);
        collapsibleTextView.f130821q.setTextSize(0, dimension);
        collapsibleTextView.f130820p.setTextSize(0, dimension);
        collapsibleTextView.setOnClickListener(new rb2.x0(this, holder));
    }

    public final void o(in5.s0 s0Var, so2.y0 y0Var) {
        nv2.n1 n1Var = nv2.n1.f340551h;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f393829e;
        long j17 = finderItem.field_id;
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = y0Var.f410703d;
        int i17 = this.f393830f;
        r(s0Var, n1Var.i(j17, yj0Var, i17), n1Var.b(finderItem.field_id, y0Var.f410703d, i17));
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.ucc);
        viewGroup.setOnClickListener(new rb2.s0(this, s0Var, y0Var, viewGroup));
    }

    public final int p(android.view.View view) {
        int width = view.getWidth();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int c17 = width + (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.c((android.view.ViewGroup.MarginLayoutParams) layoutParams) : 0);
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        return c17 + (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.b((android.view.ViewGroup.MarginLayoutParams) layoutParams2) : 0);
    }

    public final int q(android.widget.TextView textView) {
        int r17 = hc2.f1.r(textView, textView.getPaddingStart() + textView.getPaddingEnd());
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        int c17 = r17 + (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.c((android.view.ViewGroup.MarginLayoutParams) layoutParams) : 0);
        android.view.ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        return c17 + (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.b((android.view.ViewGroup.MarginLayoutParams) layoutParams2) : 0);
    }

    public final void r(in5.s0 s0Var, boolean z17, int i17) {
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.vjf);
        if (i17 > 0) {
            textView.setVisibility(0);
            textView.setText(com.tencent.mm.plugin.finder.assist.w2.d(i17));
        } else {
            textView.setVisibility(8);
            textView.setText("");
        }
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int color = this.f393829e.isCommentClose() ? b3.l.getColor(context, com.tencent.mm.R.color.BW_90) : z17 ? b3.l.getColor(context, com.tencent.mm.R.color.Red_100) : b3.l.getColor(context, com.tencent.mm.R.color.BW_100_Alpha_0_5);
        textView.setTextColor(color);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.u7q);
        weImageView.setImageResource(z17 ? com.tencent.mm.R.raw.icons_filled_good : com.tencent.mm.R.raw.icons_outlined_star_new);
        weImageView.setIconColor(color);
        android.view.ViewGroup.LayoutParams layoutParams = weImageView.getLayoutParams();
        if (layoutParams != null) {
            int h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479688cn);
            layoutParams.width = h17;
            layoutParams.height = h17;
        }
    }
}
