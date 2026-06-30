package com.tencent.mm.ui.contact;

/* loaded from: classes5.dex */
public class j0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f206952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.k0 f206953e;

    public j0(com.tencent.mm.ui.contact.k0 k0Var, android.view.View view) {
        this.f206953e = k0Var;
        this.f206952d = view;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mm.ui.contact.BizContactEntranceView bizContactEntranceView = this.f206953e.f206982d;
            int i17 = com.tencent.mm.ui.contact.BizContactEntranceView.f206320n;
            bizContactEntranceView.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("intent_service_type", bizContactEntranceView.f206327m);
            j45.l.j(this.f206952d.getContext(), "brandservice", ".ui.BrandServiceIndexUI", intent, null);
        }
        return null;
    }
}
