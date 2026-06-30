package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class hi implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f208883a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f208884b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.SingleChatInfoUI f208885c;

    public hi(com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI, android.widget.CheckBox checkBox, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f208885c = singleChatInfoUI;
        this.f208883a = checkBox;
        this.f208884b = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI = this.f208885c;
        boolean W4 = com.tencent.mm.storage.z3.W4(singleChatInfoUI.f197071e.d1());
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f208884b;
        if (!W4) {
            com.tencent.mm.ui.SingleChatInfoUI.V6(singleChatInfoUI);
            de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
            java.lang.String str = singleChatInfoUI.f197077n;
            ((ce0.e) jVar).getClass();
            com.tencent.mm.modelsimple.g1.I(str, 16);
            z2Var.B();
            return;
        }
        android.widget.CheckBox checkBox = this.f208883a;
        if (checkBox.isChecked()) {
            ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ni(singleChatInfoUI.f197077n);
            singleChatInfoUI.W6("yuanbao_msg_clear_meta_storage_open", null);
        } else {
            singleChatInfoUI.W6("yuanbao_msg_clear_meta_storage_close", null);
        }
        if (com.tencent.mm.storage.z3.H4(singleChatInfoUI.f197077n)) {
            ((ki4.x) ((bi4.w0) i95.n0.c(bi4.w0.class))).Ri(singleChatInfoUI.f197077n, 158);
        }
        com.tencent.mm.ui.SingleChatInfoUI.V6(singleChatInfoUI);
        de0.j jVar2 = (de0.j) i95.n0.c(de0.j.class);
        java.lang.String str2 = singleChatInfoUI.f197077n;
        ((ce0.e) jVar2).getClass();
        com.tencent.mm.modelsimple.g1.I(str2, 16);
        z2Var.B();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("if_meta_storage_clean", java.lang.Integer.valueOf(checkBox.isChecked() ? 1 : 0));
        singleChatInfoUI.W6("yuanbao_msg_clear_suc", hashMap);
    }
}
