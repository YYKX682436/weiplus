package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class fi implements e31.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f203972a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f203973b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f203974c;

    public fi(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, java.util.Map map, java.lang.ref.WeakReference weakReference) {
        this.f203974c = chattingItemDyeingTemplate;
        this.f203972a = map;
        this.f203973b = weakReference;
    }

    @Override // e31.i
    public void a() {
        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "try2HandleOtherTypeBizMsgLogic onError");
    }

    @Override // e31.i
    public void b(java.lang.String str, e31.j jVar) {
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f203974c;
        if (str.equals(chattingItemDyeingTemplate.H)) {
            java.util.Map map = this.f203972a;
            if (chattingItemDyeingTemplate.g1(map)) {
                java.lang.ref.WeakReference weakReference = chattingItemDyeingTemplate.f203172l1;
                if (weakReference.get() != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "try2HandleOtherTypeBizMsgLogic onUpdated templateId: %s, isSubscribed: %b, switchOpen: %b, isShowVoipSetting:%b", str, java.lang.Boolean.valueOf(jVar.f247075a), java.lang.Boolean.valueOf(jVar.f247076b), java.lang.Boolean.valueOf(jVar.f247085k));
                    com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate2 = (com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate) weakReference.get();
                    e31.j jVar2 = new e31.j(jVar.f247075a, jVar.f247076b);
                    chattingItemDyeingTemplate2.G = jVar2;
                    jVar2.f247078d = jVar.f247078d;
                    jVar2.f247077c = jVar.f247077c;
                    jVar2.f247079e = jVar.f247079e;
                    jVar2.f247080f = jVar.f247080f;
                    jVar2.f247081g = jVar.f247081g;
                    jVar2.f247082h = jVar.f247082h;
                    jVar2.f247085k = jVar.f247085k;
                    java.lang.ref.WeakReference weakReference2 = this.f203973b;
                    if (weakReference2.get() != null) {
                        chattingItemDyeingTemplate.v1((com.tencent.mm.ui.chatting.viewitems.as) weakReference2.get(), (jVar.f247075a && jVar.f247076b) ? 8 : 0, map);
                    }
                    com.tencent.mm.ui.widget.dialog.k0 k0Var = chattingItemDyeingTemplate2.f203181x0;
                    if (k0Var != null && k0Var.i()) {
                        chattingItemDyeingTemplate2.f203181x0.v();
                    }
                    sb5.g0 g0Var = (sb5.g0) chattingItemDyeingTemplate2.f203175s.f460708c.a(sb5.g0.class);
                    ((java.util.HashMap) ((com.tencent.mm.ui.chatting.component.n7) g0Var).f199556o).put(chattingItemDyeingTemplate.H, java.lang.Boolean.valueOf((jVar.f247075a && jVar.f247076b) ? false : true));
                }
            }
        }
    }
}
