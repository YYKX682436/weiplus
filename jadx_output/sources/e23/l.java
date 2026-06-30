package e23;

/* loaded from: classes11.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f246887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.m f246888e;

    public l(e23.m mVar, android.content.Context context) {
        this.f246888e = mVar;
        this.f246887d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/item/FTSConvMessageHeaderDataItem$FTSSTalkerMessageHeaderViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        e23.m mVar = this.f246888e;
        boolean equals = mVar.f246893b.f246917v.equals("opencustomerservicemsg");
        android.content.Context context = this.f246887d;
        if (equals) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", "opencustomerservicemsg");
            intent.putExtra("open_im_kefu_conversation_list_ui_from_scene", 3);
            intent.addFlags(67108864);
            j45.l.u(context, ".ui.conversation.OpenImKefuServiceConversationUI", intent, null);
        } else if (com.tencent.mm.storage.z3.C3(mVar.f246893b.f246917v)) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Contact_User", mVar.f246893b.f246917v);
            intent2.putExtra("app_brand_conversation_from_scene", 1);
            intent2.addFlags(67108864);
            j45.l.u(context, ".ui.conversation.AppBrandServiceConversationUI", intent2, null);
        } else {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("Chat_User", mVar.f246893b.f246917v);
            intent3.putExtra("finish_direct", true);
            j45.l.u(context, ".ui.chatting.ChattingUI", intent3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/item/FTSConvMessageHeaderDataItem$FTSSTalkerMessageHeaderViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
