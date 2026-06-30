package com.tencent.mm.ui.contact;

/* loaded from: classes12.dex */
public final class e3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI f206680d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI contactSayHiImagePreviewUI) {
        super(0);
        this.f206680d = contactSayHiImagePreviewUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI contactSayHiImagePreviewUI = this.f206680d;
        android.view.View findViewById = contactSayHiImagePreviewUI.findViewById(com.tencent.mm.R.id.sm8);
        findViewById.setOnClickListener(new com.tencent.mm.ui.contact.d3(contactSayHiImagePreviewUI));
        return findViewById;
    }
}
