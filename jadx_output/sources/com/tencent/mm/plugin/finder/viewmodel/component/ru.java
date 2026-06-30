package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ru extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f135835d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_HAS_SHOWN_GET_POST_QUALITY_TIPS_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((java.lang.Boolean) m17).booleanValue();
        c0Var.f310112d = booleanValue;
        if (booleanValue) {
            return;
        }
        com.tencent.mm.plugin.finder.extension.reddot.aa aaVar = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
        pm0.v.y(com.tencent.mm.plugin.finder.extension.reddot.aa.f105361e, getActivity(), new com.tencent.mm.plugin.finder.viewmodel.component.pu(c0Var, this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (this.f135835d != null) {
            com.tencent.mars.xlog.Log.i("Finder.PostQualityUIC", "showBottomSheet onResume");
            java.lang.Runnable runnable = this.f135835d;
            kotlin.jvm.internal.o.d(runnable);
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            com.tencent.mm.sdk.platformtools.u3.i(runnable, 0L);
        }
    }
}
