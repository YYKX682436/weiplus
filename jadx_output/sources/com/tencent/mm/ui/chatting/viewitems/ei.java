package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ei implements e31.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f203882a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f203883b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f203884c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd5.d f203885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203886e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f203887f;

    public ei(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, java.util.Map map, com.tencent.mm.storage.f9 f9Var, java.lang.ref.WeakReference weakReference, rd5.d dVar, java.lang.String str) {
        this.f203887f = chattingItemDyeingTemplate;
        this.f203882a = map;
        this.f203883b = f9Var;
        this.f203884c = weakReference;
        this.f203885d = dVar;
        this.f203886e = str;
    }

    @Override // e31.i
    public void a() {
        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "getSubscribeStatus onError");
    }

    @Override // e31.i
    public void b(java.lang.String str, e31.j jVar) {
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f203887f;
        if (str.equals(chattingItemDyeingTemplate.H)) {
            java.lang.ref.WeakReference weakReference = chattingItemDyeingTemplate.f203172l1;
            if (weakReference.get() != null) {
                boolean z17 = jVar.f247075a;
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
                java.lang.ref.WeakReference weakReference2 = this.f203884c;
                com.tencent.mm.ui.chatting.viewitems.xq xqVar = (com.tencent.mm.ui.chatting.viewitems.xq) weakReference2.get();
                java.util.Map map = this.f203882a;
                if (xqVar == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplate", "tplHolder ref is not alive");
                } else {
                    com.tencent.mm.ui.chatting.viewitems.as asVar = xqVar.f206008d;
                    if (jVar.f247075a && jVar.f247076b) {
                        chattingItemDyeingTemplate.v1(asVar, 8, map);
                        asVar.T.setText(chattingItemDyeingTemplate.f203175s.s().getString(com.tencent.mm.R.string.hd_));
                    } else {
                        chattingItemDyeingTemplate.v1(asVar, 0, map);
                        asVar.T.setText(chattingItemDyeingTemplate.f203175s.s().getString(com.tencent.mm.R.string.hda));
                    }
                    asVar.S.setTag(com.tencent.mm.R.id.k7s, this.f203883b);
                }
                if (weakReference2.get() != null) {
                    com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.r0(chattingItemDyeingTemplate, (com.tencent.mm.ui.chatting.viewitems.xq) weakReference2.get(), map, this.f203885d, this.f203886e);
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
