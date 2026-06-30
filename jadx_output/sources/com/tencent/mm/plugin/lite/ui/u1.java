package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes15.dex */
public class u1 implements io.flutter.plugin.editing.WxKeyboardAction {
    public u1(com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI wxaLiteAppLiteUI) {
    }

    @Override // io.flutter.plugin.editing.WxKeyboardAction
    public boolean hideKeyboard() {
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        aa3.h0.f2526a.b();
        return false;
    }

    @Override // io.flutter.plugin.editing.WxKeyboardAction
    public boolean showKeyboard(android.view.View view, io.flutter.embedding.engine.systemchannels.TextInputChannel.WxInputConfiguration wxInputConfiguration) {
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        boolean e17 = aa3.h0.f2526a.e(view, wxInputConfiguration);
        if (wxInputConfiguration == null) {
            return true;
        }
        return e17;
    }
}
