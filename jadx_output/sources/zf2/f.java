package zf2;

/* loaded from: classes3.dex */
public final class f extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.aov;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        lm2.m0 item = (lm2.m0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        se2.w wVar = se2.w.f406895a;
        if (wVar.j(holder, item, i17, i18, z17, list)) {
            return;
        }
        boolean A = zl2.r4.f473950a.A(item);
        android.content.Context context = holder.f293121e;
        if (A) {
            holder.p(com.tencent.mm.R.id.awh).setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.a08));
        } else {
            holder.p(com.tencent.mm.R.id.awh).setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.a1k));
        }
        com.tencent.mm.plugin.finder.live.view.LiveNeat7extView liveNeat7extView = (com.tencent.mm.plugin.finder.live.view.LiveNeat7extView) holder.p(com.tencent.mm.R.id.awi);
        kotlin.jvm.internal.o.d(liveNeat7extView);
        wVar.q(liveNeat7extView);
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.live.util.x xVar = com.tencent.mm.plugin.finder.live.util.x.f115742a;
        java.lang.String a17 = item.a();
        java.lang.String c17 = item.c();
        java.lang.String b17 = item.b();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        java.lang.String e17 = xVar.e(a17, c17, b17, false);
        i95.m c18 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        c61.yb ybVar = (c61.yb) c18;
        android.text.TextPaint paint = liveNeat7extView.getPaint();
        kotlin.jvm.internal.o.f(paint, "getPaint(...)");
        java.lang.String obj = c61.yb.nf(ybVar, context, paint, e17, 0, 8, null).toString();
        java.lang.String a18 = item.a();
        java.lang.String f17 = item.f();
        r45.xn1 xn1Var = (r45.xn1) item.f319372e.getCustom(0);
        java.lang.String nickname = (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        java.lang.String e18 = xVar.e(a18, f17, nickname, false);
        i95.m c19 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        c61.yb ybVar2 = (c61.yb) c19;
        android.text.TextPaint paint2 = liveNeat7extView.getPaint();
        kotlin.jvm.internal.o.f(paint2, "getPaint(...)");
        java.lang.String string = context.getString(com.tencent.mm.R.string.gc8, context.getString(com.tencent.mm.R.string.efj, obj, c61.yb.nf(ybVar2, context, paint2, e18, 0, 8, null).toString()));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String str2 = item.f319426i;
        if (str2 == null) {
            kotlin.jvm.internal.o.o("msgContent");
            throw null;
        }
        java.lang.String c27 = wVar.c(string, str2);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(com.tencent.mm.pluginsdk.ui.span.c0.j(context, c27, 0.0f));
        f0Var.c((android.text.style.ForegroundColorSpan) ((jz5.n) se2.w.f406899e).getValue(), 1, string.length() + 1, 33);
        liveNeat7extView.b(f0Var);
        wVar.i(liveNeat7extView, item.c(), 0, 1, wVar.e(), f0Var);
        wVar.r(holder, item, null);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.awh);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        wVar.o("ReplyCommentConvert", holder, false, item, p17);
        wVar.p("ReplyCommentConvert", holder, item);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
