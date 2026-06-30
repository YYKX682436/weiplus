package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ak implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f203367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f203368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f203369f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203370g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f203371h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f203372i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.bk f203373m;

    public ak(com.tencent.mm.ui.chatting.viewitems.bk bkVar, android.view.View view, com.tencent.mm.storage.f9 f9Var, java.util.Map map, java.lang.String str, boolean z17, boolean z18) {
        this.f203373m = bkVar;
        this.f203367d = view;
        this.f203368e = f9Var;
        this.f203369f = map;
        this.f203370g = str;
        this.f203371h = z17;
        this.f203372i = z18;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.ui.chatting.viewitems.as asVar;
        com.tencent.mm.ui.chatting.viewitems.as asVar2;
        menuItem.getItemId();
        int itemId = menuItem.getItemId();
        boolean z17 = this.f203371h;
        java.lang.String str = this.f203370g;
        java.util.Map map = this.f203369f;
        com.tencent.mm.ui.chatting.viewitems.bk bkVar = this.f203373m;
        if (itemId == 0) {
            if (!z17 || (asVar = bkVar.f203494d) == null) {
                return;
            }
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.m0(bkVar.f203495e, this.f203369f, true, this.f203372i, asVar, this.f203370g, false);
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.a(bkVar.f203495e, 8, map, str);
            return;
        }
        if (itemId == 1) {
            if (!z17 || (asVar2 = bkVar.f203494d) == null) {
                return;
            }
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.m0(bkVar.f203495e, this.f203369f, false, this.f203372i, asVar2, this.f203370g, false);
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.a(bkVar.f203495e, 9, map, str);
            return;
        }
        if (itemId == 2) {
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.k0(bkVar.f203495e, new java.lang.ref.WeakReference(bkVar.f203494d), this.f203367d, this.f203368e, this.f203369f, this.f203370g);
            return;
        }
        if (itemId == 8 || itemId == 9) {
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = bkVar.f203495e;
            java.lang.String str2 = com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.B1;
            if (chattingItemDyeingTemplate.v0(map)) {
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate2 = bkVar.f203495e;
                e31.j jVar = chattingItemDyeingTemplate2.G;
                if (jVar.f247076b) {
                    com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.o0(chattingItemDyeingTemplate2, map, jVar, str, 8 == menuItem.getItemId());
                } else {
                    com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.n0(chattingItemDyeingTemplate2, false, str, bkVar.f203494d);
                }
            }
        }
    }
}
