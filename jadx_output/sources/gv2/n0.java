package gv2;

/* loaded from: classes10.dex */
public class n0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.uniComments.g2 f276047e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f276048f;

    public n0(com.tencent.mm.plugin.finder.uniComments.g2 presenter, boolean z17) {
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f276047e = presenter;
        this.f276048f = z17;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f487858y;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0703  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r51, in5.c r52, int r53, int r54, boolean r55, java.util.List r56) {
        /*
            Method dump skipped, instructions count: 3262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gv2.n0.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.dz_);
        com.tencent.mm.ui.xj xjVar = new com.tencent.mm.ui.xj(p17);
        p17.setTouchDelegate(xjVar);
        android.content.Context context = holder.f293121e;
        int f17 = i65.a.f(context, com.tencent.mm.R.dimen.f479688cn);
        android.view.View p18 = holder.p(com.tencent.mm.R.id.c7p);
        if (p18 != null) {
            p18.post(new gv2.i0(p18, f17, xjVar));
        }
        android.view.View p19 = holder.p(com.tencent.mm.R.id.a_z);
        if (p19 != null) {
            p19.post(new gv2.j0(p19, f17, xjVar));
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.p(com.tencent.mm.R.id.a_z), "finder_feed_first_comment_awesome_iv");
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) holder.p(com.tencent.mm.R.id.f486643lz4);
        finderCollapsibleTextView.setLimitLine(2);
        finderCollapsibleTextView.setCollapse(true);
        finderCollapsibleTextView.f(false, true);
        finderCollapsibleTextView.setOnCollapse(new gv2.k0(holder));
        finderCollapsibleTextView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView2 = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) holder.p(com.tencent.mm.R.id.c6d);
        finderCollapsibleTextView2.setLimitLine(4);
        finderCollapsibleTextView2.setCollapse(true);
        finderCollapsibleTextView2.f(false, true);
        finderCollapsibleTextView2.setOnCollapse(new gv2.l0(holder));
    }
}
