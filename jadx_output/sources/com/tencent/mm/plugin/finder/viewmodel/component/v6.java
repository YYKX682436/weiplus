package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class v6 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderLikeDrawer f136212d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final boolean O6() {
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = this.f136212d;
        if (!(finderLikeDrawer != null && finderLikeDrawer.q())) {
            return false;
        }
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer2 = this.f136212d;
        if (finderLikeDrawer2 == null) {
            return true;
        }
        finderLikeDrawer2.u();
        return true;
    }

    public final void P6() {
        com.tencent.mm.plugin.finder.view.vc vcVar = com.tencent.mm.plugin.finder.view.FinderLikeDrawer.D;
        android.app.Activity context = getContext();
        android.view.Window window = getActivity().getWindow();
        kotlin.jvm.internal.o.f(window, "getWindow(...)");
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer a17 = com.tencent.mm.plugin.finder.view.vc.a(vcVar, context, window, 3, false, false, 24, null);
        this.f136212d = a17;
        a17.setKeyboardHeightProvider(null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        return O6();
    }
}
