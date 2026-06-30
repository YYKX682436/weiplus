package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class gi implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f208701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f208702b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.SingleChatInfoUI f208703c;

    public gi(com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI, com.tencent.mm.ui.widget.dialog.z2 z2Var, android.widget.CheckBox checkBox) {
        this.f208703c = singleChatInfoUI;
        this.f208701a = z2Var;
        this.f208702b = checkBox;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        this.f208701a.B();
        com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI = this.f208703c;
        if (com.tencent.mm.storage.z3.W4(singleChatInfoUI.f197071e.d1())) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("if_meta_storage_clean", java.lang.Integer.valueOf(this.f208702b.isChecked() ? 1 : 0));
            singleChatInfoUI.W6("yuanbao_msg_clear_cancel", hashMap);
        }
    }
}
