package com.tencent.mm.ui.contact;

/* loaded from: classes10.dex */
public class h7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.OnlyChatContactMgrUI f206755d;

    public h7(com.tencent.mm.ui.contact.OnlyChatContactMgrUI onlyChatContactMgrUI) {
        this.f206755d = onlyChatContactMgrUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/OnlyChatContactMgrUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.autogen.mmdata.rpt.BatchSocialBlackLogStruct batchSocialBlackLogStruct = new com.tencent.mm.autogen.mmdata.rpt.BatchSocialBlackLogStruct();
        com.tencent.mm.ui.contact.OnlyChatContactMgrUI onlyChatContactMgrUI = this.f206755d;
        onlyChatContactMgrUI.f206515t = batchSocialBlackLogStruct;
        android.content.Intent intent = new android.content.Intent(onlyChatContactMgrUI, (java.lang.Class<?>) com.tencent.mm.ui.contact.SelectContactsFromRangeUI.class);
        intent.putExtra("intent_status_mgr", true);
        intent.putExtra("list_type", 16);
        intent.putExtra("filter_type", "@social.black.android");
        onlyChatContactMgrUI.startActivityForResult(intent, 2);
        com.tencent.mm.autogen.mmdata.rpt.BatchSocialBlackLogStruct batchSocialBlackLogStruct2 = onlyChatContactMgrUI.f206515t;
        batchSocialBlackLogStruct2.f55372d = 5L;
        batchSocialBlackLogStruct2.f55381m = java.lang.System.currentTimeMillis();
        yj0.a.h(this, "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
