package zf2;

/* loaded from: classes3.dex */
public final class g extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.aov;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        lm2.c item = (lm2.c) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.live.view.LiveNeat7extView liveNeat7extView = (com.tencent.mm.plugin.finder.live.view.LiveNeat7extView) holder.p(com.tencent.mm.R.id.awi);
        se2.w wVar = se2.w.f406895a;
        kotlin.jvm.internal.o.d(liveNeat7extView);
        wVar.q(liveNeat7extView);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.Object[] objArr = {item.j()};
        android.content.Context context = holder.f293121e;
        java.lang.String string = context.getString(com.tencent.mm.R.string.d5t, objArr);
        ((ke0.e) xVar).getClass();
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string));
        f0Var.b((gm2.i1) ((jz5.n) se2.w.f406901g).getValue(), (java.lang.String) ((jz5.n) se2.w.f406900f).getValue(), 0, 33);
        liveNeat7extView.b(f0Var);
        wVar.r(holder, item, null);
        holder.p(com.tencent.mm.R.id.awh).setBackground(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.a1k));
        holder.p(com.tencent.mm.R.id.awh).setOnTouchListener(null);
        holder.p(com.tencent.mm.R.id.c7g).setOnClickListener(null);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
