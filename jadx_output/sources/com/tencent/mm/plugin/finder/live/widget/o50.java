package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class o50 implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f119258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f119259b;

    public o50(kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.q qVar) {
        this.f119258a = c0Var;
        this.f119259b = qVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public final void onDismiss() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[showPublicConfirmDialog] isConfirmClick = ");
        kotlin.jvm.internal.c0 c0Var = this.f119258a;
        sb6.append(c0Var.f310112d);
        com.tencent.mars.xlog.Log.i("FinderLivingWhiteListPanel", sb6.toString());
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f119259b.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(c0Var.f310112d)));
    }
}
