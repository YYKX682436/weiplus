package io;

/* loaded from: classes9.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jd5.c f293441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f293442e;

    public y(jd5.c cVar, android.content.Context context) {
        this.f293441d = cVar;
        this.f293442e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatting/viewfactory/ChattingVideoView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        jd5.c cVar = this.f293441d;
        long j17 = cVar.getLong(cVar.f43702d + 0);
        android.content.Context context = this.f293442e;
        if (j17 > 0) {
            intent.setClassName(context, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI");
            intent.putExtra("img_gallery_msg_id", cVar.getLong(cVar.f43702d + 0));
            intent.putExtra("img_gallery_talker", cVar.getString(cVar.f43702d + 1));
            intent.putExtra("img_gallery_chatroom_name", cVar.getString(cVar.f43702d + 1));
            intent.putExtra("img_preview_only", true);
        } else {
            intent.setClassName(context, "com.tencent.mm.ui.tools.ShowVideoUI");
            intent.putExtra("KEY_PATH", cVar.k());
            intent.putExtra("KEY_THUMB_PATH", cVar.getThumbPath());
            intent.putExtra("KEY_VIDEO_DURATION", cVar.getVideoDuration());
        }
        android.content.Context context2 = this.f293442e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/chatting/viewfactory/ChattingVideoView$onUpdateViewModel$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context2, "com/tencent/mm/chatting/viewfactory/ChattingVideoView$onUpdateViewModel$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        db5.f.j(context);
        yj0.a.h(this, "com/tencent/mm/chatting/viewfactory/ChattingVideoView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
