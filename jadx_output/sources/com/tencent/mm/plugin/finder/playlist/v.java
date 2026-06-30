package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class v implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f122476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f122477b;

    public v(o25.y1 y1Var, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f122476a = y1Var;
        this.f122477b = k0Var;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
        ((com.tencent.mm.pluginsdk.forward.m) this.f122476a).bj(this.f122477b, (db5.h4) menuItem);
    }
}
