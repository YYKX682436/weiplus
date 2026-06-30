package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class ci implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.SingleChatInfoUI f206291d;

    public ci(com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI) {
        this.f206291d = singleChatInfoUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI = this.f206291d;
        if (com.tencent.mm.storage.z3.H4(singleChatInfoUI.f197077n)) {
            ((ki4.x) ((bi4.w0) i95.n0.c(bi4.w0.class))).Ri(singleChatInfoUI.f197077n, 158);
        }
        com.tencent.mm.ui.SingleChatInfoUI.V6(singleChatInfoUI);
        de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
        java.lang.String str = singleChatInfoUI.f197077n;
        ((ce0.e) jVar).getClass();
        com.tencent.mm.modelsimple.g1.I(str, 16);
    }
}
