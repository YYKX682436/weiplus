package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ej implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.as f203888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203889b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f203890c;

    public ej(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, com.tencent.mm.ui.chatting.viewitems.as asVar, java.lang.String str) {
        this.f203890c = chattingItemDyeingTemplate;
        this.f203888a = asVar;
        this.f203889b = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public void a(k91.v5 v5Var) {
        if (v5Var == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.viewitems.dj(this, v5Var.field_brandIconURL, v5Var.field_nickname));
    }
}
