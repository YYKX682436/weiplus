package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class td extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusNewLabelUI f174323d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td(com.tencent.mm.plugin.textstatus.ui.TextStatusNewLabelUI textStatusNewLabelUI) {
        super(0);
        this.f174323d = textStatusNewLabelUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.textstatus.ui.TextStatusNewLabelUI textStatusNewLabelUI = this.f174323d;
        int intExtra = textStatusNewLabelUI.getIntent().getIntExtra("k_last_range_visible_state", -1);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = textStatusNewLabelUI.getIntent().getStringArrayListExtra("k_last_range_label_list");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>();
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = textStatusNewLabelUI.getIntent().getStringArrayListExtra("k_last_range_user_list");
        if (stringArrayListExtra2 == null) {
            stringArrayListExtra2 = new java.util.ArrayList<>();
        }
        return new com.tencent.mm.plugin.textstatus.ui.q(intExtra, stringArrayListExtra, stringArrayListExtra2);
    }
}
