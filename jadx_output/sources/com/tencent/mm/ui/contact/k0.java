package com.tencent.mm.ui.contact;

/* loaded from: classes5.dex */
public class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.BizContactEntranceView f206982d;

    public k0(com.tencent.mm.ui.contact.BizContactEntranceView bizContactEntranceView) {
        this.f206982d = bizContactEntranceView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/BizContactEntranceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!com.tencent.mm.sdk.platformtools.f9.ContactOa.k(view.getContext(), null)) {
            yj0.a.h(this, "com/tencent/mm/ui/contact/BizContactEntranceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean g07 = ((qk.s6) gm0.j1.s(qk.s6.class)).g0();
        com.tencent.mm.ui.contact.BizContactEntranceView bizContactEntranceView = this.f206982d;
        if (g07) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(bizContactEntranceView.f206321d);
            ((qk.s6) gm0.j1.s(qk.s6.class)).s2(8, "");
            yj0.a.h(this, "com/tencent/mm/ui/contact/BizContactEntranceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).q()) {
            int i17 = com.tencent.mm.ui.contact.BizContactEntranceView.f206320n;
            bizContactEntranceView.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("intent_service_type", bizContactEntranceView.f206327m);
            j45.l.j(view.getContext(), "brandservice", ".ui.BrandServiceIndexUI", intent, null);
        } else {
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).B(view.getContext(), new com.tencent.mm.ui.contact.j0(this, view));
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/BizContactEntranceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
