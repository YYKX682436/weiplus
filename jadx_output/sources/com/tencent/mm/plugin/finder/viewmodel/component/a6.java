package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes5.dex */
public final class a6 implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC f133736a;

    public a6(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC) {
        this.f133736a = finderBulletUIC;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) ((jz5.n) this.f133736a.f133502o).getValue();
        if (mMEditText != null) {
            mMEditText.n(str);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        android.view.inputmethod.InputConnection inputConnection;
        android.view.inputmethod.InputConnection inputConnection2;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC = this.f133736a;
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) ((jz5.n) finderBulletUIC.f133502o).getValue();
        if (mMEditText != null && (inputConnection2 = mMEditText.getInputConnection()) != null) {
            inputConnection2.sendKeyEvent(new android.view.KeyEvent(0, 67));
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = (com.tencent.mm.ui.widget.MMEditText) ((jz5.n) finderBulletUIC.f133502o).getValue();
        if (mMEditText2 == null || (inputConnection = mMEditText2.getInputConnection()) == null) {
            return;
        }
        inputConnection.sendKeyEvent(new android.view.KeyEvent(1, 67));
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
        yz5.a aVar = this.f133736a.f133495e;
        if (aVar != null) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.s5) aVar).invoke();
        }
    }
}
