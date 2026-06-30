package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class r6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f174242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f174243e;

    public r6(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2, java.lang.String str) {
        this.f174242d = textStatusDoWhatActivityV2;
        this.f174243e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f174242d;
        textStatusDoWhatActivityV2.d7().f473346h.f363914d.add(this.f174243e);
        android.widget.ImageView imageView = textStatusDoWhatActivityV2.F;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        bk4.f.V(textStatusDoWhatActivityV2.c7(), textStatusDoWhatActivityV2.F, textStatusDoWhatActivityV2.N, null, null, null, false, false, 124, null);
        textStatusDoWhatActivityV2.g7();
        com.tencent.mm.ui.widget.MMEditText mMEditText = textStatusDoWhatActivityV2.C;
        if (mMEditText != null) {
            mMEditText.requestFocus();
        }
        textStatusDoWhatActivityV2.showVKB();
    }
}
