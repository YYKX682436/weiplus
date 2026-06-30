package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class x5 extends com.tencent.mm.pluginsdk.ui.tools.s4 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ModRemarkNameUI f207247e;

    public x5(com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI) {
        this.f207247e = modRemarkNameUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.s4, android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        super.onTextChanged(charSequence, i17, i18, i19);
        int f17 = com.tencent.mm.ui.tools.v4.f(charSequence.toString());
        com.tencent.mars.xlog.Log.i("MiroMsg.ModRemarkName", "afterTextChanged() MAX_REMARK_NAME_LENGTH:%s curLength:%s", 64, java.lang.Integer.valueOf(f17));
        com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI = this.f207247e;
        if (f17 >= 64) {
            modRemarkNameUI.S.setVisibility(8);
        }
        int i27 = com.tencent.mm.ui.contact.ModRemarkNameUI.f206466y1;
        modRemarkNameUI.X6();
    }
}
