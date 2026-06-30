package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f153413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f153414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.e0 f153415f;

    public d1(com.tencent.mm.plugin.profile.e0 e0Var, android.content.Context context, long j17) {
        this.f153415f = e0Var;
        this.f153413d = context;
        this.f153414e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.f153413d;
        if (context instanceof android.app.Activity) {
            intent = ((android.app.Activity) context).getIntent();
        }
        if (!intent.hasExtra("Contact_Conversation_IsFromNewFriendToProfile")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "doReportClick , is no from new friend add.");
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.NewFriendAssistActionStruct newFriendAssistActionStruct = new com.tencent.mm.autogen.mmdata.rpt.NewFriendAssistActionStruct();
        long j17 = this.f153414e;
        newFriendAssistActionStruct.f59678h = j17;
        newFriendAssistActionStruct.f59674d = intent.getBooleanExtra("Contact_Conversation_IsSelfSendAdd", false) ? 1L : 2L;
        newFriendAssistActionStruct.f59676f = intent.getBooleanExtra("Contact_Conversation_Isexpired", false) ? 2L : 1L;
        newFriendAssistActionStruct.f59677g = intent.getIntExtra("Contact_Scene", 0);
        newFriendAssistActionStruct.f59675e = intent.getBooleanExtra("Contact_Conversation_IsContact", false) ? 1L : 2L;
        newFriendAssistActionStruct.f59679i = newFriendAssistActionStruct.b(dm.i4.COL_USERNAME, this.f153415f.f153421e.d1(), true);
        newFriendAssistActionStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "24723 type_ = " + newFriendAssistActionStruct.f59674d + ",status_ = " + newFriendAssistActionStruct.f59675e + ",is_expired_ = " + newFriendAssistActionStruct.f59676f + ",source_ = " + newFriendAssistActionStruct.f59677g + ",action = " + j17);
    }
}
