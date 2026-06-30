package zf2;

/* loaded from: classes3.dex */
public final class a extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.aov;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        lm2.b item = (lm2.b) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        se2.w wVar = se2.w.f406895a;
        if (wVar.j(holder, item, i17, i18, z17, list)) {
            return;
        }
        if (zl2.r4.f473950a.y(item)) {
            holder.p(com.tencent.mm.R.id.awh).setBackground(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.a08));
        } else {
            holder.p(com.tencent.mm.R.id.awh).setBackground(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.a1k));
        }
        com.tencent.mm.plugin.finder.live.view.LiveNeat7extView liveNeat7extView = (com.tencent.mm.plugin.finder.live.view.LiveNeat7extView) holder.p(com.tencent.mm.R.id.awi);
        kotlin.jvm.internal.o.d(liveNeat7extView);
        wVar.q(liveNeat7extView);
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.text.TextPaint paint = liveNeat7extView.getPaint();
        kotlin.jvm.internal.o.f(paint, "getPaint(...)");
        java.lang.String f17 = wVar.f(context, paint, item);
        java.lang.String str = item.f319368m;
        if (str == null) {
            kotlin.jvm.internal.o.o("msgContent");
            throw null;
        }
        java.lang.String c17 = wVar.c(f17, str);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(com.tencent.mm.pluginsdk.ui.span.c0.j(context, c17, 0.0f));
        f0Var.c((android.text.style.ForegroundColorSpan) ((jz5.n) se2.w.f406899e).getValue(), 1, f17.length() + 1, 33);
        liveNeat7extView.b(f0Var);
        wVar.i(liveNeat7extView, item.c(), 0, 1, wVar.e(), f0Var);
        wVar.r(holder, item, null);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.awh);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        wVar.o("AtCommentConvert", holder, false, item, p17);
        wVar.p("AtCommentConvert", holder, item);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
