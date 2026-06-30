package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class i9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.n9 f190400d;

    public i9(com.tencent.mm.pluginsdk.ui.chat.n9 n9Var) {
        this.f190400d = n9Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.pluginsdk.ui.chat.h8 h8Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/RecentImageBubble$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.chat.n9 n9Var = this.f190400d;
        com.tencent.mm.pluginsdk.ui.chat.m9 m9Var = n9Var.f190524m;
        if (m9Var != null && (h8Var = n9Var.f190514c) != null) {
            com.tencent.mm.pluginsdk.ui.chat.k1 k1Var = (com.tencent.mm.pluginsdk.ui.chat.k1) m9Var;
            k1Var.getClass();
            java.lang.String str = h8Var.f190352b;
            android.content.Intent intent = new android.content.Intent();
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>(1);
            arrayList2.add(str);
            java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>(1);
            arrayList3.add(java.lang.String.valueOf(h8Var.f190351a));
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = k1Var.f190441b;
            java.lang.String str2 = chatFooter.f190011k3;
            if (str2 != null) {
                intent.putExtra("GalleryUI_FromUser", str2);
            }
            java.lang.String str3 = chatFooter.f190017l3;
            if (str3 != null) {
                intent.putExtra("GalleryUI_ToUser", str3);
            }
            intent.putExtra("query_source_type", 3);
            intent.putExtra("preview_image", true);
            intent.putStringArrayListExtra("preview_image_list", arrayList2);
            boolean z17 = false;
            boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.chatting.RepairerConfigC2CLiveImageSend()) == 1;
            if (z18) {
                intent.putStringArrayListExtra("preview_image_media_id_list", arrayList3);
            }
            if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.chatting.RepairerConfigC2CLiveAlbumAutoEnableConfig()) == 1) && z18) {
                z17 = true;
            }
            intent.putExtra("Gallery_LivePhoto_Auto_Enable", z17);
            intent.putExtra("key_from_c2c_recently_quickly_send", true);
            intent.putExtra("max_select_count", 1);
            intent.addFlags(67108864);
            com.tencent.mm.ui.MMFragment mMFragment = chatFooter.Y2;
            if (mMFragment != null) {
                j45.l.p(mMFragment, "gallery", ".ui.GalleryEntryUI", intent, 217);
            } else {
                j45.l.n(k1Var.f190440a, "gallery", ".ui.GalleryEntryUI", intent, 217);
            }
        }
        n9Var.f190519h.dismiss();
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/RecentImageBubble$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
