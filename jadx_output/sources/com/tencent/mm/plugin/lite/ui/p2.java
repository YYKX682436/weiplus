package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes15.dex */
public class p2 implements io.flutter.plugin.editing.WxKeyboardAction {
    public p2(com.tencent.mm.plugin.lite.ui.WxaLiteAppTransparentLiteUI wxaLiteAppTransparentLiteUI) {
    }

    @Override // io.flutter.plugin.editing.WxKeyboardAction
    public boolean hideKeyboard() {
        aa3.h0.f2526a.b();
        return false;
    }

    @Override // io.flutter.plugin.editing.WxKeyboardAction
    public boolean showKeyboard(android.view.View view, io.flutter.embedding.engine.systemchannels.TextInputChannel.WxInputConfiguration wxInputConfiguration) {
        boolean e17 = aa3.h0.f2526a.e(view, wxInputConfiguration);
        if (wxInputConfiguration == null) {
            return true;
        }
        return e17;
    }
}
