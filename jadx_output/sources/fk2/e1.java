package fk2;

/* loaded from: classes3.dex */
public final class e1 extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public final android.text.style.ForegroundColorSpan f263364m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(we2.a commentItemDependency) {
        super(commentItemDependency);
        kotlin.jvm.internal.o.g(commentItemDependency, "commentItemDependency");
        this.f263364m = new android.text.style.ForegroundColorSpan(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479222ta));
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var;
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
        java.lang.String obj = c61.yb.nf(ybVar, context, paint, k17 == null ? "" : k17, 0, 8, null).toString();
        i95.m c18 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        c61.yb ybVar2 = (c61.yb) c18;
        android.text.TextPaint paint2 = mMNeat7extView.getPaint();
        kotlin.jvm.internal.o.f(paint2, "getPaint(...)");
        java.lang.String y17 = msg.y();
        java.lang.String obj2 = c61.yb.nf(ybVar2, context, paint2, y17 == null ? "" : y17, 0, 8, null).toString();
        dk2.a8 a8Var = msg instanceof dk2.a8 ? (dk2.a8) msg : null;
        java.lang.Object D = a8Var != null ? a8Var.D() : null;
        r45.ej1 ej1Var = D instanceof r45.ej1 ? (r45.ej1) D : null;
        if (ej1Var != null) {
            int integer = ej1Var.getInteger(3);
            android.text.style.ForegroundColorSpan foregroundColorSpan = this.f445245f;
            if (integer == 0) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str = obj + ' ' + ej1Var.getString(1);
                ((ke0.e) xVar).getClass();
                f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
                f0Var.b(foregroundColorSpan, obj, 0, 33);
            } else if (integer != 1) {
                f0Var = new com.tencent.mm.pluginsdk.ui.span.f0();
            } else {
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str2 = obj + ' ' + ej1Var.getString(1) + ' ' + obj2;
                ((ke0.e) xVar2).getClass();
                com.tencent.mm.pluginsdk.ui.span.f0 f0Var2 = new com.tencent.mm.pluginsdk.ui.span.f0(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2));
                f0Var2.b(foregroundColorSpan, obj, 0, 33);
                int length = obj.length();
                java.lang.String string = ej1Var.getString(1);
                f0Var2.b(this.f263364m, obj2, length + (string != null ? string.length() : 0) + 2, 33);
                f0Var = f0Var2;
            }
            mMNeat7extView.b(f0Var);
        }
        android.view.ViewParent parent = mMNeat7extView.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) parent;
        relativeLayout.setPadding(((java.lang.Number) ((jz5.n) we2.o.f445237j).getValue()).intValue(), relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
    }

    @Override // we2.o
    public dk2.zf e(r45.ch1 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return new dk2.a8(msg);
    }

    @Override // we2.o
    public int n() {
        return 20125;
    }
}
