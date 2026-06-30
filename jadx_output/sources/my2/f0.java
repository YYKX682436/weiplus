package my2;

/* loaded from: classes3.dex */
public final class f0 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my2.k0 f332729d;

    public f0(my2.k0 k0Var) {
        this.f332729d = k0Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteCardPlugin$setRestartVoteSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        my2.k0 k0Var = this.f332729d;
        mm2.e1 e1Var = (mm2.e1) k0Var.P0(mm2.e1.class);
        com.tencent.mars.xlog.Log.i("FinderLiveVoteCardPlugin", "voteInfo clear by restart");
        k0Var.K0(8);
        k0Var.v1(8);
        qo0.c.a(k0Var.f332743p, qo0.b.f365439y2, null, 2, null);
        mm2.c1 c1Var = (mm2.c1) k0Var.P0(mm2.c1.class);
        c1Var.f328784b6 = null;
        c1Var.f328789c6 = false;
        c1Var.f328794d6 = false;
        ky2.g0 g0Var = k0Var.f332752y;
        if (g0Var != null) {
            g0Var.f313543f.clear();
            g0Var.notifyDataSetChanged();
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context = k0Var.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r4Var.k1(context, e1Var.f328988r.getLong(0), e1Var.f328983m, e1Var.f328992v, ((mm2.c1) k0Var.P0(mm2.c1.class)).f328852o);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteCardPlugin$setRestartVoteSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f332729d.f365323d.getContext().getResources().getColor(com.tencent.mm.R.color.aki));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
