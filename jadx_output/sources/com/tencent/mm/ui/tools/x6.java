package com.tencent.mm.ui.tools;

/* loaded from: classes9.dex */
public class x6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.MMTextInputUI f210905d;

    public x6(com.tencent.mm.ui.tools.MMTextInputUI mMTextInputUI) {
        this.f210905d = mMTextInputUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.tools.MMTextInputUI mMTextInputUI = this.f210905d;
        mMTextInputUI.hideVKB();
        mMTextInputUI.setResult(0);
        mMTextInputUI.finish();
    }
}
