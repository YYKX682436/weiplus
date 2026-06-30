package com.tencent.mm.ui.tools;

/* loaded from: classes14.dex */
public class d5 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.f5 f210352d;

    public d5(com.tencent.mm.ui.tools.f5 f5Var) {
        this.f210352d = f5Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.ui.tools.f5 f5Var = this.f210352d;
        if (f5Var.f210402g != null) {
            com.tencent.mm.ui.tools.f5.c(f5Var);
        }
    }
}
