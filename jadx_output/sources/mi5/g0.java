package mi5;

/* loaded from: classes.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f326841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f326842e;

    public g0(android.content.Context context, com.tencent.mm.storage.f9 f9Var) {
        this.f326841d = context;
        this.f326842e = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingMediaGroupView$createMediaGroupItemOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.f326841d;
        intent.setClassName(context, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI");
        com.tencent.mm.storage.f9 f9Var = this.f326842e;
        intent.putExtra("img_gallery_msg_id", f9Var.getMsgId());
        intent.putExtra("img_gallery_talker", f9Var.Q0());
        intent.putExtra("img_gallery_chatroom_name", f9Var.Q0());
        intent.putExtra("img_preview_only", true);
        android.content.Context context2 = this.f326841d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/ui/msgviewfactory/view/ChattingMediaGroupView$createMediaGroupItemOnClickListener$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context2, "com/tencent/mm/ui/msgviewfactory/view/ChattingMediaGroupView$createMediaGroupItemOnClickListener$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        db5.f.j(context);
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingMediaGroupView$createMediaGroupItemOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
