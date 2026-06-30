package uc4;

/* loaded from: classes4.dex */
public final class w extends com.tencent.mm.plugin.sns.ui.listener.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc4.x f426459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f426460e;

    public w(uc4.x xVar, android.content.Context context) {
        this.f426459d = xVar;
        this.f426460e = context;
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public void a(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentClick$descMenuListener$1");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        uc4.x xVar = this.f426459d;
        xc4.p c17 = xVar.c();
        if (c17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentClick$descMenuListener$1");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNoCopy", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) c17.V1).getValue()).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNoCopy", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        android.content.Context context = this.f426460e;
        if (!booleanValue) {
            menu.add(0, 0, 0, context.getString(com.tencent.mm.R.string.f490359sr));
        }
        j45.l.g("favorite");
        menu.add(0, 1, 0, context.getString(com.tencent.mm.R.string.hjg));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsTranslateView", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMenuActionReporter", "setIsTranslateView >> false");
        ta4.y0.f416865c = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsTranslateView", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        if (!c17.isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTranslatedPost", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentClick");
            xc4.p c18 = xVar.c();
            com.tencent.mm.plugin.sns.model.r6 f17 = com.tencent.mm.plugin.sns.model.s6.f(c18 != null ? c18.e1() : null);
            boolean z17 = (f17 == null || !f17.f164647d || f17.f164648e || (f17.f164649f & 2) == 0) ? false : true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTranslatedPost", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentClick");
            if (z17) {
                com.tencent.mm.plugin.sns.model.s6.d(menu, true);
            } else {
                com.tencent.mm.plugin.sns.model.s6.c(menu, true);
            }
        }
        com.tencent.mm.plugin.sns.abtest.a.b(menu, c17.c1());
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        if (!su4.r2.l()) {
            menu.add(0, 27, 0, context.getString(com.tencent.mm.R.string.f491241cg4));
            java.lang.String str = c17.h1().ContentDesc;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            tg0.v1 v1Var = (tg0.v1) i95.n0.c(tg0.v1.class);
            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
            java.lang.String l17 = o13.n.l(77);
            java.lang.String a17 = c17.a1();
            long length = str.length();
            ((sg0.q3) v1Var).getClass();
            su4.k3.d(1, l17, 77, 0, "", "", a17, "", 3, "", 0L, length, 5, "", "", -1, 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentClick$descMenuListener$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public boolean b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentClick$descMenuListener$1");
        kotlin.jvm.internal.o.g(view, "view");
        uc4.x xVar = this.f426459d;
        xc4.p c17 = xVar.c();
        if (c17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentClick$descMenuListener$1");
            return false;
        }
        xVar.e().e(view, c17.W0(), c17.h1());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentClick$descMenuListener$1");
        return true;
    }
}
