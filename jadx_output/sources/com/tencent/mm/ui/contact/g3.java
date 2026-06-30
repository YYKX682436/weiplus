package com.tencent.mm.ui.contact;

/* loaded from: classes12.dex */
public final class g3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI f206718d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI contactSayHiImagePreviewUI) {
        super(0);
        this.f206718d = contactSayHiImagePreviewUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI contactSayHiImagePreviewUI = this.f206718d;
        android.view.View findViewById = contactSayHiImagePreviewUI.findViewById(com.tencent.mm.R.id.sma);
        findViewById.setOnClickListener(new com.tencent.mm.ui.contact.f3(contactSayHiImagePreviewUI));
        return findViewById;
    }
}
