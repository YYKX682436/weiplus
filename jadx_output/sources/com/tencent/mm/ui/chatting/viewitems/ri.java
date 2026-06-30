package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ri implements e31.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f205453b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f205454c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rd5.d f205456e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f205457f;

    public ri(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, java.lang.String str, java.lang.ref.WeakReference weakReference, java.util.Map map, com.tencent.mm.storage.f9 f9Var, rd5.d dVar) {
        this.f205457f = chattingItemDyeingTemplate;
        this.f205452a = str;
        this.f205453b = weakReference;
        this.f205454c = map;
        this.f205455d = f9Var;
        this.f205456e = dVar;
    }

    @Override // e31.i
    public void a() {
        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "getSubscribeStatus onError");
    }

    @Override // e31.i
    public void b(java.lang.String str, e31.j jVar) {
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f205457f;
        if (str.equals(chattingItemDyeingTemplate.H)) {
            java.lang.ref.WeakReference weakReference = chattingItemDyeingTemplate.f203172l1;
            if (weakReference.get() != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "try2HandleAppBrandLogic, sync attr username %s, templateId: %s, isSubscribed: %b, isSwitchOpened: %b, isAcceptWithAudio: %b， isShowVoipSetting：%b", this.f205452a, str, java.lang.Boolean.valueOf(jVar.f247075a), java.lang.Boolean.valueOf(jVar.f247076b), java.lang.Boolean.valueOf(jVar.f247078d), java.lang.Boolean.valueOf(jVar.f247085k));
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
                java.lang.ref.WeakReference weakReference2 = this.f205453b;
                if (weakReference2.get() != null) {
                    this.f205457f.e1(this.f205454c, this.f205455d, ((com.tencent.mm.ui.chatting.viewitems.xq) weakReference2.get()).f206008d, true, chattingItemDyeingTemplate2.G, true);
                    com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.r0(chattingItemDyeingTemplate, (com.tencent.mm.ui.chatting.viewitems.xq) weakReference2.get(), this.f205454c, this.f205456e, this.f205452a);
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
