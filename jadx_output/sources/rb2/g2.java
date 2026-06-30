package rb2;

/* loaded from: classes10.dex */
public final class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f393634e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean[] f393635f;

    public g2(in5.s0 s0Var, rb2.z2 z2Var, boolean[] zArr) {
        this.f393633d = s0Var;
        this.f393634e = z2Var;
        this.f393635f = zArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        android.graphics.drawable.Drawable e17;
        java.lang.String str2;
        java.lang.String str3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshAwesomeIv$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f393633d;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.a_z);
        so2.y0 y0Var = (so2.y0) s0Var.f293125i;
        nv2.h1 h1Var = nv2.n1.f340550g;
        nv2.n1 n1Var = nv2.n1.f340551h;
        rb2.z2 z2Var = this.f393634e;
        boolean i17 = n1Var.i(z2Var.f393686e.z0().field_id, y0Var.f410703d, z2Var.f393686e.W());
        if (z2Var.f393686e.h0()) {
            if (i17) {
                android.content.Context context = s0Var.f293121e;
                int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.d(com.tencent.mm.R.string.m7l);
                e4Var.c();
            } else {
                android.content.Context context2 = s0Var.f293121e;
                int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
                e4Var2.d(com.tencent.mm.R.string.m7j);
                e4Var2.c();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshAwesomeIv$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean z17 = !i17;
        rb2.n0 n0Var = rb2.n0.f393695a;
        android.content.Context context3 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        int a17 = n0Var.a(context3, z17, z2Var.f393686e.h0());
        if (z17) {
            str = "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshAwesomeIv$3";
            e17 = com.tencent.mm.ui.uk.e(s0Var.f293121e, com.tencent.mm.R.raw.icons_filled_good, a17);
        } else {
            str = "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshAwesomeIv$3";
            e17 = com.tencent.mm.ui.uk.e(s0Var.f293121e, com.tencent.mm.R.raw.icons_outlined_star_new, a17);
        }
        weImageView.setImageDrawable(e17);
        z2Var.f393686e.R(weImageView, s0Var.getAdapterPosition());
        int b17 = n1Var.b(z2Var.f393686e.z0().field_id, y0Var.f410703d, z2Var.f393686e.W());
        if (b17 > 0) {
            s0Var.w(com.tencent.mm.R.id.f483312aa0, 0);
            s0Var.s(com.tencent.mm.R.id.f483312aa0, java.lang.String.valueOf(b17));
        } else {
            s0Var.w(com.tencent.mm.R.id.f483312aa0, 8);
            s0Var.s(com.tencent.mm.R.id.f483312aa0, "");
        }
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f483312aa0);
        android.content.Context context4 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        textView.setTextColor(n0Var.a(context4, z17, z2Var.f393686e.h0()));
        if (z17) {
            str3 = str;
            str2 = "android/view/View$OnClickListener";
            uw2.h0.o(uw2.h0.f431674a, weImageView, 0L, 2, null);
            hc2.f1.d(weImageView);
        } else {
            str2 = "android/view/View$OnClickListener";
            str3 = str;
        }
        if (z17) {
            boolean[] zArr = this.f393635f;
            if (zArr[0]) {
                zArr[0] = false;
            } else {
                fo3.s sVar = fo3.s.INSTANCE;
                sVar.Z7("ce_feed_comment_like", "<FeedCommentLike>");
                sVar.H2("ce_feed_comment_like", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
                sVar.Qa("ce_feed_comment_like");
            }
        }
        view.setTag(com.tencent.mm.R.id.e5w, java.lang.Boolean.valueOf(z17));
        view.setTag(com.tencent.mm.R.id.f484408e61, java.lang.Integer.valueOf(b17));
        view.announceForAccessibility(s0Var.f293121e.getString(z17 ? com.tencent.mm.R.string.mgl : com.tencent.mm.R.string.mgm));
        yj0.a.h(this, str3, str2, "onClick", "(Landroid/view/View;)V");
    }
}
