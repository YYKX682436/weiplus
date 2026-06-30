package com.tencent.mm.ui.chatting.adapter;

/* loaded from: classes12.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.adapter.z f198453d;

    public x(com.tencent.mm.ui.chatting.adapter.z zVar, com.tencent.mm.ui.chatting.adapter.a0 a0Var) {
        this.f198453d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof java.lang.Integer)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaHistoryGalleryAdapter", "getTag is %s", view.getTag());
            yj0.a.h(this, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.ui.chatting.adapter.z zVar = this.f198453d;
        com.tencent.mm.ui.chatting.adapter.w x17 = zVar.f198462n.x(((java.lang.Integer) view.getTag()).intValue());
        if (x17 == null) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.ui.chatting.adapter.a0 a0Var = zVar.f198462n;
        a0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_biz_chat_id", a0Var.f198391n);
        intent.putExtra("key_is_biz_chat", a0Var.f198390m);
        intent.putExtra("KOpenArticleSceneFromScene", 140);
        if (x17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaHistoryGalleryAdapter", "[enterGallery] item == null");
        } else {
            com.tencent.mm.storage.f9 f9Var = x17.f198447b;
            if (f9Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaHistoryGalleryAdapter", "[enterGallery] msg == null");
            } else {
                if (!((fo.e) ((le5.e) i95.n0.c(le5.e.class))).bj(view.getContext(), f9Var.G, null)) {
                    android.content.Context context = a0Var.f198384d;
                    int i17 = context.getResources().getConfiguration().orientation;
                    int[] iArr = new int[2];
                    int width = view.getWidth();
                    int height = view.getHeight();
                    view.getLocationInWindow(iArr);
                    intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
                    intent.putExtra("img_gallery_msg_id", f9Var.getMsgId()).putExtra("img_gallery_msg_svr_id", f9Var.I0()).putExtra("img_gallery_talker", f9Var.Q0()).putExtra("img_gallery_chatroom_name", f9Var.Q0()).putExtra("img_gallery_orientation", i17);
                    intent.putExtra("img_gallery_width", width).putExtra("img_gallery_height", height).putExtra("img_gallery_left", iArr[0]).putExtra("img_gallery_top", iArr[1]).putExtra("img_gallery_enter_from_grid", true);
                    if (c01.ia.M(f9Var)) {
                        intent.putExtra("msg_type", 2);
                    }
                    intent.putExtra("key_enter_scene", 3);
                    j45.l.u(context, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", intent, null);
                    ((android.app.Activity) context).overridePendingTransition(0, 0);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
