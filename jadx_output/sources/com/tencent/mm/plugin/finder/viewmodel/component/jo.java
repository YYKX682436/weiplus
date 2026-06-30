package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes3.dex */
public final class jo extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f134873d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f134874e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f134875f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134873d = "FinderLivePurchaseMicListUIC";
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dsf;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f134874e = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.che);
        android.view.View oj6 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).oj(getContext(), false, false, null);
        this.f134875f = oj6;
        ((com.tencent.liteapp.ui.WxaLiteAppBaseView) oj6).f46058y = true;
        com.tencent.mars.xlog.Log.i(this.f134873d, "createLiteAppView: add lite app view:" + this.f134875f);
        android.widget.FrameLayout frameLayout = this.f134874e;
        if (frameLayout != null) {
            frameLayout.addView(this.f134875f, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f134873d = "FinderLivePurchaseMicListUIC";
    }
}
