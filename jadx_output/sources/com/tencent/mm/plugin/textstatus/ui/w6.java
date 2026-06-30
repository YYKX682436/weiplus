package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class w6 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f174403d;

    public w6(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f174403d = textStatusDoWhatActivityV2;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        java.lang.String str;
        android.text.Editable text;
        java.lang.String obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "initCustomStatusView: actionId:%s", java.lang.Integer.valueOf(i17));
        if (i17 == 6) {
            com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f174403d;
            com.tencent.mm.ui.widget.MMEditText mMEditText = textStatusDoWhatActivityV2.C;
            if (mMEditText == null || (text = mMEditText.getText()) == null || (obj = text.toString()) == null || (str = r26.n0.u0(obj).toString()) == null) {
                str = "";
            }
            if (str.length() > 0) {
                textStatusDoWhatActivityV2.getClass();
                textStatusDoWhatActivityV2.f173541i = str;
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV22 = this.f174403d;
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2.X6(textStatusDoWhatActivityV22, textStatusDoWhatActivityV22.N, false, false, 6, null);
            }
        }
        return false;
    }
}
