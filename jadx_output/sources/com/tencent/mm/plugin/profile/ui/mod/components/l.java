package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.j0 f153946d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var) {
        super(1);
        this.f153946d = j0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        mr3.l it = (mr3.l) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.profile.ui.mod.components.j0.A;
        com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var = this.f153946d;
        com.tencent.mm.storage.z3 U6 = j0Var.U6();
        if (U6 != null) {
            java.util.List list = j0Var.f153931s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
            while (it6.hasNext()) {
                java.lang.String str = ((mr3.l) it6.next()).f330879h;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
            int indexOf = arrayList2.indexOf(it.f330879h);
            if (indexOf >= 0 && !arrayList2.isEmpty()) {
                if (arrayList2.size() <= indexOf) {
                    indexOf = arrayList2.size() - 1;
                }
                androidx.appcompat.app.AppCompatActivity context = j0Var.getActivity();
                boolean Y6 = j0Var.Y6();
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", "Contact remark image: " + U6.f236591z1 + ", path: " + kz5.n0.g0(arrayList2, ", ", null, null, 0, null, com.tencent.mm.plugin.profile.j2.f153507d, 30, null));
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI.class);
                intent.putExtra("Contact_User", U6.d1());
                intent.putExtra("remark_image_path", arrayList2);
                intent.putExtra("selected_item", indexOf);
                intent.putExtra("view_only", Y6);
                android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.media.MediaGalleryContainerUI.class);
                android.os.Bundle extras = intent.getExtras();
                if (extras != null) {
                    intent2.putExtras(extras);
                }
                pf5.j0.a(intent2, fi5.h.class);
                if (Y6) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(intent2);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(context, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ProfileUtilsKt", "jumpToImageGallery", "(Lcom/tencent/mm/storage/Contact;Landroid/content/Context;ILjava/util/ArrayList;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList3.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/profile/ProfileUtilsKt", "jumpToImageGallery", "(Lcom/tencent/mm/storage/Contact;Landroid/content/Context;ILjava/util/ArrayList;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList4.add(400);
                    arrayList4.add(intent2);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.k(context, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ProfileUtilsKt", "jumpToImageGallery", "(Lcom/tencent/mm/storage/Contact;Landroid/content/Context;ILjava/util/ArrayList;Z)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
