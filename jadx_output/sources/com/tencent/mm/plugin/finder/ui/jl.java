package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class jl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.MMFinderUI f129404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f129405e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI, boolean z17) {
        super(0);
        this.f129404d = mMFinderUI;
        this.f129405e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = this.f129404d;
        if (mMFinderUI.isFragmentMode() || this.f129405e) {
            com.tencent.mm.plugin.finder.report.j0 j0Var = com.tencent.mm.plugin.finder.report.j0.f125083a;
            int i17 = com.tencent.mm.plugin.finder.ui.MMFinderUI.f128804s;
            android.view.View contentView = mMFinderUI.getContentView();
            kotlin.jvm.internal.o.f(contentView, "access$getContentView(...)");
            j0Var.g(contentView, mMFinderUI);
        } else {
            com.tencent.mm.plugin.finder.report.j0 j0Var2 = com.tencent.mm.plugin.finder.report.j0.f125083a;
            android.view.View decorView = mMFinderUI.getWindow().getDecorView();
            kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
            j0Var2.g(decorView, mMFinderUI);
        }
        return jz5.f0.f302826a;
    }
}
