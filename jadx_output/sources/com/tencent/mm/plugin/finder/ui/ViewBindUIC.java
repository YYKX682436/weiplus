package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class ViewBindUIC extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f128830d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f128831e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerAdapter f128832f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewBindUIC(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f128830d = jz5.h.b(new com.tencent.mm.plugin.finder.ui.um(this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f128831e = arrayList;
        this.f128832f = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.ui.ViewBindUIC$adapter$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type != 0) {
                    return new com.tencent.mm.plugin.finder.ui.dm();
                }
                androidx.fragment.app.Fragment fragment2 = com.tencent.mm.plugin.finder.ui.ViewBindUIC.this.getFragment();
                kotlin.jvm.internal.o.e(fragment2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.SettingFragment");
                return new com.tencent.mm.plugin.finder.ui.cm((com.tencent.mm.plugin.finder.ui.SettingFragment) fragment2);
            }
        }, arrayList, false);
    }

    public final void O6(java.util.List data) {
        kotlin.jvm.internal.o.g(data, "data");
        pf5.e.launchUI$default(this, null, null, new com.tencent.mm.plugin.finder.ui.vm(this, data, null), 3, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488790ag0;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = ((vb2.i) ((jz5.n) this.f128830d).getValue()).f434625b;
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        wxRecyclerView.setAdapter(this.f128832f);
    }
}
