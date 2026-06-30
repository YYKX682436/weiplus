package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class b extends android.text.method.NumberKeyListener {
    public b(com.tencent.mm.wallet_core.ui.EditHintView editHintView) {
    }

    @Override // android.text.method.NumberKeyListener
    public char[] getAcceptedChars() {
        return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return 3;
    }
}
