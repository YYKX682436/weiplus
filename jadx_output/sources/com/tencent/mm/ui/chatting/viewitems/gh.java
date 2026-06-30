package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class gh implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f204042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e31.j f204043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204044f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f204045g;

    public gh(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, java.util.Map map, e31.j jVar, java.lang.String str) {
        this.f204045g = chattingItemDyeingTemplate;
        this.f204042d = map;
        this.f204043e = jVar;
        this.f204044f = str;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        java.lang.String str = this.f204044f;
        java.util.Map map = this.f204042d;
        e31.j jVar = this.f204043e;
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f204045g;
        if (itemId == 3) {
            chattingItemDyeingTemplate.getClass();
            chattingItemDyeingTemplate.k1(map, jVar, str, true, jVar.f247080f, false);
        } else {
            if (itemId != 4) {
                return;
            }
            chattingItemDyeingTemplate.getClass();
            chattingItemDyeingTemplate.k1(map, jVar, str, false, jVar.f247080f, false);
        }
    }
}
