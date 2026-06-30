package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.k f162283d;

    public j(com.tencent.mm.plugin.shake.ui.k kVar) {
        this.f162283d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.shake.ui.k kVar = this.f162283d;
        android.view.View view = kVar.f162286d;
        if (view != null) {
            view.clearAnimation();
            com.tencent.mm.plugin.shake.ui.ShakeEggAnimFrame shakeEggAnimFrame = kVar.f162288f;
            android.view.View view2 = kVar.f162286d;
            ((java.util.ArrayList) shakeEggAnimFrame.f162092d).remove(view2);
            shakeEggAnimFrame.removeView(view2);
        }
    }
}
