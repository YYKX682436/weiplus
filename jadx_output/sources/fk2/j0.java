package fk2;

/* loaded from: classes3.dex */
public final class j0 extends we2.o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(we2.a commentItemDependency) {
        super(commentItemDependency);
        kotlin.jvm.internal.o.g(commentItemDependency, "commentItemDependency");
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(msg, "msg");
        super.d(context, holder, msg, i17);
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = holder.f21927e;
        android.text.TextPaint paint = mMNeat7extView.getPaint();
        kotlin.jvm.internal.o.f(paint, "getPaint(...)");
        java.lang.String k17 = msg.k();
        if (k17 == null) {
            k17 = "";
        }
        java.lang.String obj = c61.yb.nf(ybVar, context, paint, k17, 0, 8, null).toString();
        dk2.a8 a8Var = msg instanceof dk2.a8 ? (dk2.a8) msg : null;
        java.lang.Object D = a8Var != null ? a8Var.D() : null;
        r45.bj1 bj1Var = D instanceof r45.bj1 ? (r45.bj1) D : null;
        if (bj1Var != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = obj + ' ' + bj1Var.getString(1);
            ((ke0.e) xVar).getClass();
            com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
            f0Var.b(this.f445245f, obj, 0, 33);
            mMNeat7extView.b(f0Var);
            android.view.ViewParent parent = mMNeat7extView.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.widget.RelativeLayout");
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) parent;
            relativeLayout.setPadding(((java.lang.Number) ((jz5.n) we2.o.f445237j).getValue()).intValue(), relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
        }
    }

    @Override // we2.o
    public dk2.zf e(r45.ch1 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return new dk2.a8(msg);
    }

    @Override // we2.o
    public int n() {
        return 20078;
    }
}
