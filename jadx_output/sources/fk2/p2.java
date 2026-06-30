package fk2;

/* loaded from: classes3.dex */
public final class p2 extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f263452m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(we2.a liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f263452m = "CommentItemRewardRankingNotice";
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object D = msg.D();
        boolean z17 = D instanceof r45.zj1;
        java.lang.String str = this.f263452m;
        if (!z17) {
            com.tencent.mars.xlog.Log.e(str, "onBindRewardRankNoticeMsg payloadContent isn't FinderLiveAppMsgRewardRankingNoticeInfo");
            return;
        }
        int integer = ((r45.zj1) D).getInteger(0);
        com.tencent.mars.xlog.Log.e(str, "onBindRewardRankNoticeMsg ranking_position " + integer);
        if (integer < 1) {
            return;
        }
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = holder.f21927e;
        android.text.TextPaint paint = mMNeat7extView.getPaint();
        kotlin.jvm.internal.o.f(paint, "getPaint(...)");
        java.lang.CharSequence nf6 = c61.yb.nf((c61.yb) c17, context, paint, zl2.r4.D0(zl2.r4.f473950a, msg.a(), msg.k(), false, 4, null), 0, 8, null);
        java.lang.String string = context.getString(com.tencent.mm.R.string.dyu, java.lang.Integer.valueOf(integer));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.d5t, ((java.lang.Object) nf6) + ' ' + string);
        ((ke0.e) xVar).getClass();
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string2));
        android.graphics.drawable.Drawable a17 = gm2.u.a(gm2.v.f273498f, g(), 0.0f, 0.0f, 6, null);
        java.lang.String g17 = g();
        float f17 = gm2.w.f273511k;
        f0Var.c(new gm2.v(a17, new gm2.w(g17, f17, f17, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3), gm2.w.f273509i, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479549ab0), gm2.w.f273510j, 0.0f, 128, null)), 0, g().length() + 0, 33);
        android.view.ViewParent parent = mMNeat7extView.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) parent;
        relativeLayout.setPadding(0, relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
        mMNeat7extView.b(f0Var);
        mMNeat7extView.setTextSize(this.f445247h);
        holder.f21929g.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.a1k));
    }

    @Override // we2.o
    public dk2.zf e(r45.ch1 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return new dk2.mc(msg);
    }

    @Override // we2.o
    public int n() {
        return 20014;
    }
}
