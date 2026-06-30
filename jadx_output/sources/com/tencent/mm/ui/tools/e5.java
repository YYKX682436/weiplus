package com.tencent.mm.ui.tools;

/* loaded from: classes14.dex */
public class e5 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.f5 f210374d;

    public e5(com.tencent.mm.ui.tools.f5 f5Var) {
        this.f210374d = f5Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.ui.tools.f5 f5Var = this.f210374d;
        if (f5Var.f210402g != null) {
            int i17 = f5Var.f210404i.bottom;
            f5Var.f210405m.getWindowVisibleDisplayFrame(this.f210374d.f210404i);
            if (this.f210374d.f210404i.bottom != i17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.KeyboardHeightProvider", "onGlobalLayout: %s, %s", java.lang.Integer.valueOf(i17), this.f210374d.f210404i.toShortString());
                com.tencent.mm.ui.tools.f5.c(this.f210374d);
            }
        }
    }
}
