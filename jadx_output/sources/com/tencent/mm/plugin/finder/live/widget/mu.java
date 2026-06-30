package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class mu implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.pu f119121d;

    public mu(com.tencent.mm.plugin.finder.live.widget.pu puVar) {
        this.f119121d = puVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.live.widget.pu puVar = this.f119121d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context context = puVar.f118381d;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            ((ub0.r) oVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.c((android.app.Activity) context, 10019, 1, 28, 1, false, null);
            return;
        }
        vb0.o oVar2 = (vb0.o) i95.n0.c(vb0.o.class);
        android.content.Context context2 = puVar.f118381d;
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        java.lang.String str = com.tencent.mm.plugin.finder.assist.e9.f102143l;
        java.lang.String str2 = "microMsg." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
        ((ub0.r) oVar2).getClass();
        com.tencent.mm.pluginsdk.ui.tools.l7.l((android.app.Activity) context2, str, str2, 10020);
    }
}
