package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class t5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ModRemarkNameUI f207193d;

    public t5(com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI) {
        this.f207193d = modRemarkNameUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI = this.f207193d;
        modRemarkNameUI.H.clear();
        modRemarkNameUI.H.addAll(modRemarkNameUI.G);
        modRemarkNameUI.Z6();
        modRemarkNameUI.finish();
        modRemarkNameUI.a7(2L);
    }
}
