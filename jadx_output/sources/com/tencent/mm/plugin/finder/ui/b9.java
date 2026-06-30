package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class b9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI f128941d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI) {
        super(0);
        this.f128941d = finderLivePostHelperUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.assist.a9 a9Var = com.tencent.mm.plugin.finder.assist.d9.f102093f;
        com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI = this.f128941d;
        androidx.appcompat.app.AppCompatActivity context = finderLivePostHelperUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return com.tencent.mm.plugin.finder.assist.a9.a(a9Var, context, finderLivePostHelperUI.getContext().getResources().getString(com.tencent.mm.R.string.f9y), 500L, null, 8, null);
    }
}
