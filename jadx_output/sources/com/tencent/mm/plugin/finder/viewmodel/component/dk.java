package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class dk implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f134146d;

    public dk(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar) {
        this.f134146d = blVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.f03 f03Var;
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = this.f134146d;
        com.tencent.mm.plugin.finder.viewmodel.component.gi X6 = blVar.X6(4);
        if (X6 != null) {
            boolean z17 = blVar.getIntent().getIntExtra("FROM_SCENE_KEY", 2) == 6;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[registerRedDot] TAB_TYPE_MACHINE isShow=");
            sb6.append(z9Var != null ? java.lang.Boolean.valueOf(z9Var.f105327a) : null);
            sb6.append(" isFromShareToTimeline=");
            sb6.append(z17);
            com.tencent.mars.xlog.Log.i("Finder.HomeActionBarUIC", sb6.toString());
            boolean z18 = z9Var != null && z9Var.f105327a;
            android.widget.ImageView imageView = X6.f134530g;
            if (!z18 || z17) {
                blVar.f133900p = "";
                if (imageView == null) {
                    return;
                }
                imageView.setVisibility(4);
                return;
            }
            r45.f03 f03Var2 = z9Var.f105328b;
            if (f03Var2 != null && f03Var2.f373887d == 6) {
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
            } else if (imageView != null) {
                imageView.setVisibility(0);
            }
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = z9Var.f105329c;
            java.lang.String str = jbVar != null ? jbVar.field_tipsId : null;
            java.lang.String str2 = str != null ? str : "";
            if (kotlin.jvm.internal.o.b(blVar.f133900p, str2) || !blVar.f133897m) {
                return;
            }
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            androidx.appcompat.app.AppCompatActivity context = blVar.getActivity();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            androidx.appcompat.app.AppCompatActivity activity = blVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f353948a;
            com.tencent.mm.plugin.finder.report.o3.uj(o3Var, "2", 3, 1, 1, 2, 0, str2, null, 0L, V6, ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).S6(), 0, 2432, null);
            blVar.f133900p = str2;
            if (jbVar == null || (f03Var = z9Var.f105328b) == null) {
                return;
            }
            com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
            androidx.appcompat.app.AppCompatActivity context2 = blVar.getActivity();
            kotlin.jvm.internal.o.g(context2, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V62 = nyVar2 != null ? nyVar2.V6() : null;
            androidx.appcompat.app.AppCompatActivity activity2 = blVar.getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            com.tencent.mm.plugin.finder.report.x2.i(x2Var, "2", jbVar, f03Var, 1, V62, 0, null, ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) zVar.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).S6(), 0, com.tencent.mm.plugin.appbrand.jsapi.nfc.r.CTRL_INDEX, null);
        }
    }
}
