package fk2;

/* loaded from: classes2.dex */
public final class x1 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gj1 f263515e;

    public x1(android.content.Context context, r45.gj1 gj1Var) {
        this.f263514d = context;
        this.f263515e = gj1Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLocation$Companion$setPoiSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        fk2.y1 y1Var = fk2.a2.f263309n;
        android.content.Context context = this.f263514d;
        kotlin.jvm.internal.o.g(context, "context");
        r45.gj1 payload = this.f263515e;
        kotlin.jvm.internal.o.g(payload, "payload");
        android.content.Intent intent = new android.content.Intent();
        r45.f96 f96Var = new r45.f96();
        boolean z17 = false;
        r45.ze2 ze2Var = (r45.ze2) payload.getCustom(0);
        f96Var.set(1, java.lang.Float.valueOf(ze2Var != null ? ze2Var.getFloat(1) : 0.0f));
        r45.ze2 ze2Var2 = (r45.ze2) payload.getCustom(0);
        f96Var.set(0, java.lang.Float.valueOf(ze2Var2 != null ? ze2Var2.getFloat(0) : 0.0f));
        r45.ze2 ze2Var3 = (r45.ze2) payload.getCustom(0);
        f96Var.set(2, ze2Var3 != null ? ze2Var3.getString(2) : null);
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
            r45.ze2 ze2Var4 = (r45.ze2) payload.getCustom(0);
            if (ze2Var4 != null && (string = ze2Var4.getString(5)) != null && r26.i0.y(string, "foursquare_", false)) {
                z17 = true;
            }
            if (!z17 && ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.b1().r()).intValue() != 0) {
                i95.m c17 = i95.n0.c(c61.ub.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c61.ub.w2((c61.ub) c17, context, intent, f96Var, 0, 8, null);
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLocation$Companion$setPoiSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
            }
        }
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Uk(context, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLocation$Companion$setPoiSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f263514d.getResources().getColor(com.tencent.mm.R.color.f479049ak4));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
