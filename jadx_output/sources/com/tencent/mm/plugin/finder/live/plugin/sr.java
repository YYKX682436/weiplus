package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes5.dex */
public final class sr implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f114302a;

    public sr(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        this.f114302a = etVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f114302a;
        com.tencent.mm.ui.widget.MMEditText mMEditText = etVar.f112461y;
        if (mMEditText != null) {
            if (com.tencent.mm.ui.tools.v4.e(((java.lang.Object) mMEditText.getText()) + str, com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2) <= etVar.f112454t) {
                mMEditText.n(str);
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        android.view.inputmethod.InputConnection inputConnection;
        android.view.inputmethod.InputConnection inputConnection2;
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f114302a;
        com.tencent.mm.ui.widget.MMEditText mMEditText = etVar.f112461y;
        if (mMEditText != null && (inputConnection2 = mMEditText.getInputConnection()) != null) {
            inputConnection2.sendKeyEvent(new android.view.KeyEvent(0, 67));
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = etVar.f112461y;
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
    }
}
