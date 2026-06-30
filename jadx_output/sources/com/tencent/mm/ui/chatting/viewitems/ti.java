package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ti implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f205604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205605b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.as f205606c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.xq f205607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rd5.d f205608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205609f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f205610g;

    public ti(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, java.util.Map map, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.as asVar, com.tencent.mm.ui.chatting.viewitems.xq xqVar, rd5.d dVar, java.lang.String str) {
        this.f205610g = chattingItemDyeingTemplate;
        this.f205604a = map;
        this.f205605b = f9Var;
        this.f205606c = asVar;
        this.f205607d = xqVar;
        this.f205608e = dVar;
        this.f205609f = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public void a(k91.v5 v5Var) {
        if (v5Var == null) {
            return;
        }
        java.lang.String str = v5Var.field_appId;
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f205610g;
        chattingItemDyeingTemplate.I = str;
        chattingItemDyeingTemplate.G.f247075a = !((v5Var.field_appOpt & 1) > 0);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.viewitems.si(this));
    }
}
