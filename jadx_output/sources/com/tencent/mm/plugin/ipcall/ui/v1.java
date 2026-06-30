package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes14.dex */
public class v1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f143039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.f2 f143040e;

    public v1(com.tencent.mm.plugin.ipcall.ui.f2 f2Var, android.view.View view) {
        this.f143040e = f2Var;
        this.f143039d = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f143039d;
        view.getWindowVisibleDisplayFrame(rect);
        if (view.getRootView().getHeight() - (rect.bottom - rect.top) > 100) {
            com.tencent.mm.plugin.ipcall.ui.f2 f2Var = this.f143040e;
            f2Var.f142810i.postDelayed(new com.tencent.mm.plugin.ipcall.ui.w1(f2Var), 100L);
        }
    }
}
