package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class x extends com.tencent.mm.ui.component.UIComponent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void O6(android.content.Intent intent) {
        if ((intent != null ? intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0) : 0) == 6) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.finder.live.view.v1 P6 = ((com.tencent.mm.plugin.finder.live.viewmodel.u) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.live.viewmodel.u.class)).P6();
            android.os.Bundle bundle = new android.os.Bundle();
            boolean z17 = true;
            bundle.putBoolean("PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK", true);
            java.lang.Long valueOf = intent != null ? java.lang.Long.valueOf(intent.getLongExtra("KEY_SHOP_SHELF_TARGET_PRODUCT_ID", -1L)) : null;
            if (valueOf != null && valueOf.longValue() == -1) {
                z17 = false;
            }
            java.lang.Long l17 = z17 ? valueOf : null;
            if (l17 != null) {
                bundle.putLong("PARAM_FINDER_LIVE_AUTO_LOCATE_PRODUCTID", l17.longValue());
            }
            P6.statusChange(qo0.b.f365349f2, bundle);
            android.content.Intent intent2 = getContext().getIntent();
            if (intent2 != null) {
                intent2.putExtra("KEY_PARAMS_DO_ACTION", 0);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        O6(intent);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        O6(getContext().getIntent());
    }
}
