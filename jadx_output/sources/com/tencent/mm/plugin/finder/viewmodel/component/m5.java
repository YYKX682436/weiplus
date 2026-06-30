package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes5.dex */
public final class m5 implements android.view.ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC f135122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f135123b;

    public m5(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f135122a = finderBulletUIC;
        this.f135123b = appCompatActivity;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public void onWindowFocusChanged(boolean z17) {
        if (z17) {
            this.f135122a.k7();
        } else {
            com.tencent.mars.xlog.Log.i("FinderBulletUIC", "bulletBtnClick onWindowFocusChanged " + z17);
        }
        this.f135123b.getWindow().getDecorView().getViewTreeObserver().removeOnWindowFocusChangeListener(this);
    }
}
