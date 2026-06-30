package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class n7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.m1 f201218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201219e;

    public n7(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, ot0.m1 m1Var) {
        this.f201219e = imageGalleryUI;
        this.f201218d = m1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$67", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ot0.m1 m1Var = this.f201218d;
        if (m1Var == null || com.tencent.mm.sdk.platformtools.t8.K0(m1Var.f373348p)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryUI", "srcUserName is null");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$67", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", m1Var.f373348p);
        intent.putExtra("Contact_Scene", 163);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201219e;
        j45.l.j(imageGalleryUI.f200611g.f201092g, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18589, 1, java.lang.Integer.valueOf(imageGalleryUI.Y7()));
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$67", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
