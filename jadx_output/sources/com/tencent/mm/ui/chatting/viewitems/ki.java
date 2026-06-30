package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ki implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.li f204339d;

    public ki(com.tencent.mm.ui.chatting.viewitems.li liVar) {
        this.f204339d = liVar;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.ui.chatting.viewitems.li liVar = this.f204339d;
        if (i17 == 100 && intent != null) {
            com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData = (com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData) intent.getParcelableExtra("key_biz_data");
            if (subscribeMsgSettingData != null) {
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = liVar.f204484f;
                java.lang.String str = com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.B1;
                chattingItemDyeingTemplate.getClass();
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.viewitems.ni(chattingItemDyeingTemplate));
                o31.m.f342681a.b(liVar.f204482d, subscribeMsgSettingData, new com.tencent.mm.ui.chatting.viewitems.ii(this));
                return;
            }
            return;
        }
        if (i17 != 101 || intent == null) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("key_need_update", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "back from SubscribeMsgManagerUI needUpdate: %b", java.lang.Boolean.valueOf(booleanExtra));
        if (booleanExtra) {
            com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper iSubscribeMsgService$Companion$SubscribeMsgListWrapper = (com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper) intent.getParcelableExtra("key_biz_data");
            e31.k a17 = e31.n.f247087a.a("name_biz");
            if (iSubscribeMsgService$Companion$SubscribeMsgListWrapper == null || a17 == null) {
                return;
            }
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate2 = liVar.f204484f;
            java.lang.String str2 = com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.B1;
            chattingItemDyeingTemplate2.getClass();
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.viewitems.ni(chattingItemDyeingTemplate2));
            e31.o oVar = new e31.o();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str3 = liVar.f204482d;
            if (str3 == null) {
                str3 = "";
            }
            oVar.f247089a = str3;
            ((java.util.ArrayList) oVar.f247091c).addAll(iSubscribeMsgService$Companion$SubscribeMsgListWrapper.f71832d);
            oVar.f247092d = iSubscribeMsgService$Companion$SubscribeMsgListWrapper.f71833e;
            oVar.f247097i = new com.tencent.mm.ui.chatting.viewitems.ji(this);
            ((g31.l) a17).x(oVar);
        }
    }
}
