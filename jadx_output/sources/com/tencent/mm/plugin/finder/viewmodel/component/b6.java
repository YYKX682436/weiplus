package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class b6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f133839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC f133840e;

    public b6(android.widget.EditText editText, com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC) {
        this.f133839d = editText;
        this.f133840e = finderBulletUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.EditText editText = this.f133839d;
        editText.requestFocus();
        com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC = this.f133840e;
        if (finderBulletUIC.getActivity().hasWindowFocus()) {
            finderBulletUIC.k7();
        } else {
            editText.getViewTreeObserver().removeOnWindowFocusChangeListener(finderBulletUIC.f133512y);
            editText.getViewTreeObserver().addOnWindowFocusChangeListener(finderBulletUIC.f133512y);
        }
    }
}
