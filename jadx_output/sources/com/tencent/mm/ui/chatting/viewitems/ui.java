package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ui implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.as f205693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f205694f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f205695g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205696h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f205697i;

    public ui(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.as asVar, boolean z17, java.util.Map map, java.lang.String str) {
        this.f205697i = chattingItemDyeingTemplate;
        this.f205692d = f9Var;
        this.f205693e = asVar;
        this.f205694f = z17;
        this.f205695g = map;
        this.f205696h = str;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        c01.d9.e().q(1176, this);
        com.tencent.mm.ui.chatting.viewitems.as asVar = this.f205693e;
        java.lang.Object tag = asVar.S.getTag(com.tencent.mm.R.id.k7s);
        com.tencent.mm.storage.f9 f9Var = this.f205692d;
        if (f9Var != tag) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemDyeingTemplate", "item msg(%s) has changed.", java.lang.Long.valueOf(f9Var.getMsgId()));
            return;
        }
        java.lang.String str2 = this.f205696h;
        boolean z17 = this.f205694f;
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f205697i;
        if (i17 == 0 && i18 == 0) {
            e31.k kVar = chattingItemDyeingTemplate.M;
            if (kVar != null) {
                kVar.f(str2, !z17);
                return;
            }
            return;
        }
        chattingItemDyeingTemplate.v1(asVar, z17 ? 8 : 0, this.f205695g);
        db5.t7.makeText(chattingItemDyeingTemplate.f203175s.g(), com.tencent.mm.R.string.f492652hd0, 0).show();
        com.tencent.mm.autogen.events.UpdateWxaOptionsEvent updateWxaOptionsEvent = new com.tencent.mm.autogen.events.UpdateWxaOptionsEvent();
        am.g00 g00Var = updateWxaOptionsEvent.f54927g;
        g00Var.f6724a = str2;
        g00Var.f6725b = z17 ? 2 : 1;
        g00Var.f6726c = 1;
        updateWxaOptionsEvent.e();
        yb5.d dVar = chattingItemDyeingTemplate.f203175s;
        if (dVar != null) {
            dVar.J();
        }
    }
}
