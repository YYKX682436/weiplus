package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class kj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f204342f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f204343g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204344h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204345i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f204346m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204347n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f204348o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f204349p;

    public kj(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, java.lang.String str, java.lang.String str2, int i17, java.util.Map map, java.lang.String str3, java.lang.String str4, int i18, com.tencent.mm.storage.f9 f9Var, int i19) {
        this.f204349p = chattingItemDyeingTemplate;
        this.f204340d = str;
        this.f204341e = str2;
        this.f204342f = i17;
        this.f204343g = map;
        this.f204344h = str3;
        this.f204345i = str4;
        this.f204346m = i18;
        this.f204347n = f9Var;
        this.f204348o = i19;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$59", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f204340d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            intent.putExtra("key_enable_teen_mode_check", true);
            intent.putExtra("key_enable_fts_quick", true);
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f204349p;
            com.tencent.mm.ui.chatting.viewitems.a0.h(intent, chattingItemDyeingTemplate.f203175s.x());
            j45.l.j(chattingItemDyeingTemplate.f203175s.g(), "webview", ".ui.tools.WebViewUI", intent, null);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.String str2 = chattingItemDyeingTemplate.H;
            java.lang.String str3 = this.f204341e;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f204342f);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(chattingItemDyeingTemplate.P);
            java.lang.String str4 = chattingItemDyeingTemplate.N;
            java.util.Map map = this.f204343g;
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.Y0(map));
            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(chattingItemDyeingTemplate.W0());
            j31.c cVar = chattingItemDyeingTemplate.X;
            java.lang.String str5 = cVar.f297374f;
            java.lang.Integer valueOf5 = java.lang.Integer.valueOf(chattingItemDyeingTemplate.F1(cVar.f297375g));
            j31.c cVar2 = chattingItemDyeingTemplate.X;
            g0Var.d(11608, str2, str3, valueOf, valueOf2, str4, valueOf3, valueOf4, str5, valueOf5, cVar2.f297376h, cVar2.f297380l, java.lang.Integer.valueOf(chattingItemDyeingTemplate.b1()));
            this.f204349p.p1(5, this.f204343g, this.f204344h, "", this.f204345i);
            if (this.f204346m == 1) {
                com.tencent.mm.ui.chatting.viewitems.ar.f203405a.a(this.f204347n, java.lang.Integer.valueOf(this.f204348o));
            }
            com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.e0(chattingItemDyeingTemplate, erVar, map);
            chattingItemDyeingTemplate.s1(3, chattingItemDyeingTemplate.f203175s.x(), erVar.f203906b);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$59", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
