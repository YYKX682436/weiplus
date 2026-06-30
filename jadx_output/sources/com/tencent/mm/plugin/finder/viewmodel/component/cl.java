package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes11.dex */
public final class cl extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public ob0.s2 f134024d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        e42.c0 c0Var = e42.c0.clicfg_matrix_biz_memory_stat_report_sample_rate;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        this.f134024d = ((com.tencent.mm.feature.performance.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).Ai("finder_home", ih.a.c(c0Var, z65.c.a() ? 1L : -1L));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f134024d = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FinderHomeMemoryStatUIC] onStart ");
        ob0.s2 s2Var = this.f134024d;
        sb6.append(s2Var != null ? s2Var.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("FinderHomeMemoryStatUIC", sb6.toString());
        ob0.s2 s2Var2 = this.f134024d;
        if (s2Var2 != null) {
            ((com.tencent.mm.plugin.performance.watchdogs.i) s2Var2).a();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FinderHomeMemoryStatUIC] onStop ");
        ob0.s2 s2Var = this.f134024d;
        sb6.append(s2Var != null ? s2Var.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("FinderHomeMemoryStatUIC", sb6.toString());
        ob0.s2 s2Var2 = this.f134024d;
        if (s2Var2 != null) {
            ((com.tencent.mm.plugin.performance.watchdogs.i) s2Var2).b();
        }
    }
}
