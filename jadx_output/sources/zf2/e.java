package zf2;

/* loaded from: classes3.dex */
public final class e extends in5.r {
    public static final void n(zf2.e eVar, android.content.Context context, r45.ze2 ze2Var) {
        eVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        r45.f96 f96Var = new r45.f96();
        f96Var.set(1, java.lang.Float.valueOf(ze2Var.getFloat(1)));
        f96Var.set(0, java.lang.Float.valueOf(ze2Var.getFloat(0)));
        intent.putExtra("key_location", f96Var.toByteArray());
        intent.putExtra("key_from_type", zy2.o9.f477517e);
        zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context);
        if (Sj != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj;
            intent.putExtra("key_from_scene", nyVar.f135380n);
            intent.putExtra("key_context_id", nyVar.f135382p);
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        g0Var.B(1663L, 8L);
        com.tencent.mm.repairer.config.global.RepairerConfigLocationPoiDrawer repairerConfigLocationPoiDrawer = new com.tencent.mm.repairer.config.global.RepairerConfigLocationPoiDrawer();
        if (j62.e.g().c(repairerConfigLocationPoiDrawer) == 1 || bm5.o1.f22719a.h(repairerConfigLocationPoiDrawer) == 1) {
            java.lang.String string = ze2Var.getString(5);
            if (!(string != null && r26.i0.y(string, "foursquare_", false)) && ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.b1().r()).intValue() != 0) {
                i95.m c17 = i95.n0.c(c61.ub.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c61.ub.w2((c61.ub) c17, context, intent, f96Var, 0, 8, null);
                return;
            }
        }
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Uk(context, intent);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.aov;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        int L;
        lm2.l0 item = (lm2.l0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        se2.w wVar = se2.w.f406895a;
        if (wVar.j(holder, item, i17, i18, z17, list)) {
            return;
        }
        com.tencent.mm.plugin.finder.live.view.LiveNeat7extView liveNeat7extView = (com.tencent.mm.plugin.finder.live.view.LiveNeat7extView) holder.p(com.tencent.mm.R.id.awi);
        kotlin.jvm.internal.o.d(liveNeat7extView);
        wVar.q(liveNeat7extView);
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.text.TextPaint paint = liveNeat7extView.getPaint();
        kotlin.jvm.internal.o.f(paint, "getPaint(...)");
        java.lang.String f17 = wVar.f(context, paint, item);
        java.lang.String string = context.getString(com.tencent.mm.R.string.f491500da0, item.i().getString(2));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String j17 = !(item.j().length() == 0) ? item.j() : string;
        boolean b17 = kotlin.jvm.internal.o.b(j17, string);
        java.lang.String c17 = wVar.c(f17, j17);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(com.tencent.mm.pluginsdk.ui.span.c0.n(context, c17, 0.0f));
        f0Var.c((android.text.style.ForegroundColorSpan) ((jz5.n) se2.w.f406899e).getValue(), 1, f17.length() + 1, 33);
        r45.ze2 i19 = item.i();
        java.lang.String string2 = i19.getString(2);
        if (!(string2 == null || string2.length() == 0) && (L = r26.n0.L(f0Var, string2, 0, false, 6, null)) >= 0 && string2.length() + L <= f0Var.length()) {
            f0Var.c(new zf2.c(this, context, i19), L, string2.length() + L, 33);
        }
        if (b17) {
            r45.ze2 i27 = item.i();
            android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.tencent.mm.R.raw.icons_filled_location);
            com.tencent.mm.ui.uk.f(drawable, context.getResources().getColor(com.tencent.mm.R.color.f479051of));
            drawable.setBounds(0, 0, ((java.lang.Number) ((jz5.n) se2.w.f406902h).getValue()).intValue(), se2.w.f406903i);
            f0Var.c(new al5.w(drawable, 1), f0Var.length() - 1, f0Var.length(), 33);
            f0Var.c(new zf2.d(this, context, i27), f0Var.length() - 1, f0Var.length(), 33);
        }
        liveNeat7extView.b(f0Var);
        wVar.i(liveNeat7extView, item.c(), 0, 1, wVar.e(), f0Var);
        wVar.r(holder, item, null);
        holder.p(com.tencent.mm.R.id.awh).setBackground(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.a1k));
        android.view.View p17 = holder.p(com.tencent.mm.R.id.awh);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        wVar.o("LocationCommentConvert", holder, false, item, p17);
        wVar.p("LocationCommentConvert", holder, item);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
