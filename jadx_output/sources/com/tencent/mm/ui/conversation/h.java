package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class h implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI f207710d;

    public h(com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI appBrandServiceConversationFmUI) {
        this.f207710d = appBrandServiceConversationFmUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.conversation.o2 o2Var;
        com.tencent.mm.storage.l4 l4Var;
        java.lang.String str;
        int i18;
        com.tencent.mm.ui.conversation.o2 o2Var2;
        com.tencent.mm.ui.conversation.o2 o2Var3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$7", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI appBrandServiceConversationFmUI = this.f207710d;
        o2Var = appBrandServiceConversationFmUI.adapter;
        appBrandServiceConversationFmUI.conversation = (com.tencent.mm.storage.l4) o2Var.getItem(i17);
        l4Var = appBrandServiceConversationFmUI.conversation;
        if (l4Var == null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            o2Var2 = appBrandServiceConversationFmUI.adapter;
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandServiceConversationFmUI", "user should not be null. position:%d, size:%d", valueOf, java.lang.Integer.valueOf(o2Var2.getCount()));
            o2Var3 = appBrandServiceConversationFmUI.adapter;
            o2Var3.notifyDataSetChanged();
            yj0.a.h(this, "com/tencent/mm/ui/conversation/AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$7", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        appBrandServiceConversationFmUI.talker = l4Var.h1();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("finish_direct", false);
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean a17 = z65.c.a();
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        if (e0Var != null) {
            a17 = ((h62.d) e0Var).fj(e42.d0.clicfg_android_appbrand_contact_support_send_video, a17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandContactABTests", "isSupportSendVideo#get, " + a17);
        if (!a17) {
            bundle.putBoolean("key_need_send_video", false);
        }
        str = appBrandServiceConversationFmUI.mSceneId;
        bundle.putString("key_scene_id", str);
        i18 = appBrandServiceConversationFmUI.fromScene;
        bundle.putInt("app_brand_chatting_from_scene", i18);
        bundle.putInt("app_brand_chatting_from_scene_new", 3);
        appBrandServiceConversationFmUI.f207287ui.startChatting(l4Var.h1(), bundle, true);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$7", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
