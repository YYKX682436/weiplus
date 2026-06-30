package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class e7 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.q7 f151118d;

    public e7(com.tencent.mm.plugin.mv.ui.uic.q7 q7Var) {
        this.f151118d = q7Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        com.tencent.mm.plugin.mv.ui.uic.g8 g8Var;
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.plugin.mv.ui.uic.q7 q7Var = this.f151118d;
        if (q7Var.f151389e || (g8Var = q7Var.f151388d) == null) {
            return;
        }
        g8Var.a(java.lang.System.currentTimeMillis(), 1, "2", 10, null);
    }
}
