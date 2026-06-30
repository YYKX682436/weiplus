package com.tencent.mm.pluginsdk.forward;

/* loaded from: classes3.dex */
public final class i implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.forward.m f188712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f188713b;

    public i(com.tencent.mm.pluginsdk.forward.m mVar, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f188712a = mVar;
        this.f188713b = k0Var;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
        this.f188712a.bj(this.f188713b, (db5.h4) menuItem);
    }
}
