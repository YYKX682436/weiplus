package ws3;

/* loaded from: classes9.dex */
public class o extends android.text.method.NumberKeyListener {
    public o(com.tencent.mm.plugin.recharge.ui.form.MallFormView mallFormView) {
    }

    @Override // android.text.method.NumberKeyListener
    public char[] getAcceptedChars() {
        return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return 18;
    }
}
