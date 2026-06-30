package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class uc extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f136122d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f136123e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f136122d = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.tc(activity));
        this.f136123e = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.sc(activity));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        jz5.g gVar = this.f136122d;
        if (((com.tencent.mm.plugin.finder.view.FinderLikeDrawer) ((jz5.n) gVar).getValue()) == null) {
            return false;
        }
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = (com.tencent.mm.plugin.finder.view.FinderLikeDrawer) ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.d(finderLikeDrawer);
        if (!finderLikeDrawer.q()) {
            return false;
        }
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer2 = (com.tencent.mm.plugin.finder.view.FinderLikeDrawer) ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.d(finderLikeDrawer2);
        finderLikeDrawer2.u();
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
    }
}
