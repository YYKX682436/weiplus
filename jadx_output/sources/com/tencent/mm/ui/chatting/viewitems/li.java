package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class li implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f204483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f204484f;

    public li(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, java.lang.String str, boolean z17) {
        this.f204484f = chattingItemDyeingTemplate;
        this.f204482d = str;
        this.f204483e = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f204484f;
        android.content.Intent intent = new android.content.Intent(chattingItemDyeingTemplate.f203175s.g(), (java.lang.Class<?>) com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI.class);
        java.lang.String str = this.f204482d;
        intent.putExtra("key_biz_username", str);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        intent.putExtra("key_biz_nickname", c01.a2.e(str));
        boolean z17 = this.f204483e;
        if (z17) {
            intent.putExtra("key_biz_presenter_class", i31.i.class.getName());
        } else {
            intent.putExtra("key_biz_presenter_class", com.tencent.mm.modelbiz.subscribemsg.BizSubscribeMsgSettingPagePresenter.class.getName());
            intent.putExtra("key_need_update", false);
            intent.putExtra("key_need_load_from_remote", true);
        }
        intent.putExtra("key_enter_scene", 2);
        j45.l.x((com.tencent.mm.ui.MMFragmentActivity) chattingItemDyeingTemplate.f203175s.g(), "com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI", intent, z17 ? 100 : 101, new com.tencent.mm.ui.chatting.viewitems.ki(this));
    }
}
