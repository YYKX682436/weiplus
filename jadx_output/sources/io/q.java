package io;

/* loaded from: classes.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jd5.a f293423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f293424e;

    public q(jd5.a aVar, android.content.Context context) {
        this.f293423d = aVar;
        this.f293424e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatting/viewfactory/ChattingImgView$onUpdateViewModel$1$imgModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        jd5.a aVar = this.f293423d;
        long j17 = aVar.getLong(aVar.f43702d + 0);
        android.content.Context context = this.f293424e;
        if (j17 > 0) {
            intent.setClassName(context, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI");
            intent.putExtra("img_gallery_msg_id", aVar.getLong(aVar.f43702d + 0));
            intent.putExtra("img_gallery_talker", aVar.getString(aVar.f43702d + 1));
            intent.putExtra("img_gallery_chatroom_name", aVar.getString(aVar.f43702d + 1));
            intent.putExtra("img_preview_only", true);
            android.content.Context context2 = this.f293424e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/chatting/viewfactory/ChattingImgView$onUpdateViewModel$1$imgModel$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context2, "com/tencent/mm/chatting/viewfactory/ChattingImgView$onUpdateViewModel$1$imgModel$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            db5.f.j(context);
        } else {
            intent.setClassName(context, "com.tencent.mm.ui.tools.ShowImageUI");
            intent.putExtra("key_image_path", aVar.k());
            intent.putExtra("show_menu", false);
            intent.putExtra("click_exist", true);
            android.content.Context context3 = this.f293424e;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(context3, arrayList3.toArray(), "com/tencent/mm/chatting/viewfactory/ChattingImgView$onUpdateViewModel$1$imgModel$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(context3, "com/tencent/mm/chatting/viewfactory/ChattingImgView$onUpdateViewModel$1$imgModel$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            db5.f.j(context);
        }
        yj0.a.h(this, "com/tencent/mm/chatting/viewfactory/ChattingImgView$onUpdateViewModel$1$imgModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
