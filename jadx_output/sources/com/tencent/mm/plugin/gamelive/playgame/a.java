package com.tencent.mm.plugin.gamelive.playgame;

/* loaded from: classes8.dex */
public class a implements com.tencent.mm.plugin.gamelive.playgame.e {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f142072a = null;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f142073b;

    /* renamed from: c, reason: collision with root package name */
    public org.json.JSONObject f142074c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f142075d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f142076e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f142077f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f142078g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f142079h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f142080i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f142081j;

    /* renamed from: k, reason: collision with root package name */
    public org.json.JSONArray f142082k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LivePlayGamePayLoad f142083l;

    /* renamed from: m, reason: collision with root package name */
    public int f142084m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.gamelive.playgame.c f142085n;

    /* renamed from: o, reason: collision with root package name */
    public h63.k1 f142086o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f142087p;

    public a(android.content.Context context, org.json.JSONObject jSONObject, java.lang.String str, int i17, h63.k1 k1Var) {
        new org.json.JSONObject();
        this.f142075d = false;
        this.f142076e = "";
        this.f142077f = "";
        this.f142078g = "";
        this.f142083l = new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LivePlayGamePayLoad(0, null, null, null, null, null, 0, null, 0, 0);
        this.f142084m = 6;
        this.f142085n = new com.tencent.mm.plugin.gamelive.playgame.c(this);
        this.f142087p = false;
        this.f142073b = context;
        this.f142074c = jSONObject;
        this.f142086o = k1Var;
        a(str, i17);
        b();
    }

    public final void a(java.lang.String str, int i17) {
        if (!this.f142074c.optBoolean("canJoin", false)) {
            this.f142075d = false;
            return;
        }
        this.f142075d = true;
        this.f142076e = this.f142074c.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        this.f142077f = this.f142074c.optString("subTitle", "");
        this.f142078g = this.f142074c.optString("statusWording", "");
        this.f142082k = this.f142074c.optJSONArray("condition");
        this.f142084m = this.f142074c.optInt("defaultConditionIndex");
        java.lang.String str2 = this.f142076e;
        com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LivePlayGamePayLoad gameLiveAppbrandEventService$LivePlayGamePayLoad = this.f142083l;
        gameLiveAppbrandEventService$LivePlayGamePayLoad.f142030e = str2;
        gameLiveAppbrandEventService$LivePlayGamePayLoad.f142031f = this.f142077f;
        gameLiveAppbrandEventService$LivePlayGamePayLoad.f142032g = this.f142078g;
        gameLiveAppbrandEventService$LivePlayGamePayLoad.f142033h = this.f142074c.optString("teamupExtraData", "");
        gameLiveAppbrandEventService$LivePlayGamePayLoad.f142034i = str;
        gameLiveAppbrandEventService$LivePlayGamePayLoad.f142035m = i17;
        gameLiveAppbrandEventService$LivePlayGamePayLoad.f142029d = this.f142084m;
        gameLiveAppbrandEventService$LivePlayGamePayLoad.f142036n = this.f142074c.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
        gameLiveAppbrandEventService$LivePlayGamePayLoad.f142037o = this.f142074c.optInt("sourceType");
    }

    public void b() {
        com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LivePlayGamePayLoad gameLiveAppbrandEventService$LivePlayGamePayLoad;
        org.json.JSONObject jSONObject;
        boolean z17 = this.f142075d;
        android.content.Context context = this.f142073b;
        if (!z17) {
            com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(context, 0, false, false);
            this.f142072a = y1Var;
            y1Var.f212037s = new com.tencent.mm.ui.widget.dialog.h2() { // from class: com.tencent.mm.plugin.gamelive.playgame.a$$a
                @Override // com.tencent.mm.ui.widget.dialog.h2
                public final void onDismiss() {
                    h63.k1 k1Var = com.tencent.mm.plugin.gamelive.playgame.a.this.f142086o;
                    if (k1Var != null) {
                        ((mc1.l$$b) k1Var).a(0, 0, true);
                    }
                }
            };
            y1Var.f212033o = true;
            y1Var.j(com.tencent.mm.R.layout.f488039f4);
            ((android.view.ViewGroup) this.f142072a.f212027f.findViewById(com.tencent.mm.R.id.gpy)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.gamelive.playgame.a$$b
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.tencent.mm.plugin.gamelive.playgame.a aVar = com.tencent.mm.plugin.gamelive.playgame.a.this;
                    aVar.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view);
                    java.lang.Object[] array2 = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array2);
                    aVar.f142072a.q();
                    yj0.a.h(aVar, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    yj0.a.h(aVar, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            this.f142072a.s();
            return;
        }
        if (this.f142072a == null) {
            this.f142072a = new com.tencent.mm.ui.widget.dialog.y1(context, 0, true, false);
            com.tencent.mm.ui.widget.dialog.y1 y1Var2 = new com.tencent.mm.ui.widget.dialog.y1(context, 0, false, false);
            this.f142072a = y1Var2;
            y1Var2.f212037s = new com.tencent.mm.ui.widget.dialog.h2() { // from class: com.tencent.mm.plugin.gamelive.playgame.a$$c
                @Override // com.tencent.mm.ui.widget.dialog.h2
                public final void onDismiss() {
                    com.tencent.mm.plugin.gamelive.playgame.a aVar = com.tencent.mm.plugin.gamelive.playgame.a.this;
                    h63.k1 k1Var = aVar.f142086o;
                    if (k1Var == null || aVar.f142087p) {
                        return;
                    }
                    ((mc1.l$$b) k1Var).a(0, 0, true);
                    com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LivePlayGamePayLoad gameLiveAppbrandEventService$LivePlayGamePayLoad2 = aVar.f142083l;
                    gameLiveAppbrandEventService$LivePlayGamePayLoad2.f142038p = 3;
                    com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352186y, null, 0, gameLiveAppbrandEventService$LivePlayGamePayLoad2), p60.q.class, null);
                }
            };
            y1Var2.f212033o = true;
            y1Var2.j(com.tencent.mm.R.layout.f488043f8);
            android.view.View view = this.f142072a.f212027f;
            view.findViewById(com.tencent.mm.R.id.gpx).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.gamelive.playgame.a$$d
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    final com.tencent.mm.plugin.gamelive.playgame.a aVar = com.tencent.mm.plugin.gamelive.playgame.a.this;
                    aVar.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view2);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view2);
                    java.lang.Object[] array2 = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array2);
                    aVar.f142087p = true;
                    aVar.f142072a.q();
                    com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352185x, null, 0, aVar.f142083l), p60.q.class, new com.tencent.mm.ipcinvoker.r() { // from class: com.tencent.mm.plugin.gamelive.playgame.a$$g
                        @Override // com.tencent.mm.ipcinvoker.r
                        public final void a(java.lang.Object obj) {
                            com.tencent.mm.plugin.gamelive.playgame.a aVar2 = com.tencent.mm.plugin.gamelive.playgame.a.this;
                            aVar2.getClass();
                            com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveIntPayload gameLiveAppbrandEventService$LiveIntPayload = (com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveIntPayload) ((com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData) obj).f67111g;
                            if (aVar2.f142086o != null && aVar2.f142087p) {
                                com.tencent.mars.xlog.Log.i("GameLivePlayGameAnchorInviteWidget", "zbqzbq callback");
                                ((mc1.l$$b) aVar2.f142086o).a(aVar2.f142084m, gameLiveAppbrandEventService$LiveIntPayload.f142023d, false);
                                aVar2.f142087p = false;
                            }
                            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.gamelive.playgame.b(aVar2, gameLiveAppbrandEventService$LiveIntPayload));
                        }
                    });
                    yj0.a.h(aVar, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    yj0.a.h(aVar, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            ((android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.gpy)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.gamelive.playgame.a$$e
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.tencent.mm.plugin.gamelive.playgame.a aVar = com.tencent.mm.plugin.gamelive.playgame.a.this;
                    aVar.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view2);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view2);
                    java.lang.Object[] array2 = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array2);
                    aVar.f142072a.q();
                    yj0.a.h(aVar, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    yj0.a.h(aVar, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            this.f142079h = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gpz);
            this.f142080i = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f485143gq0);
            this.f142081j = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f485144gq1);
            ((android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.f485145gq2)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.gamelive.playgame.a$$f
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.tencent.mm.plugin.gamelive.playgame.a aVar = com.tencent.mm.plugin.gamelive.playgame.a.this;
                    aVar.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view2);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view2);
                    java.lang.Object[] array2 = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array2);
                    org.json.JSONArray jSONArray = aVar.f142082k;
                    int i17 = aVar.f142084m;
                    com.tencent.mm.plugin.gamelive.playgame.c cVar = aVar.f142085n;
                    java.util.ArrayList arrayList3 = cVar.f142099g;
                    try {
                        arrayList3.clear();
                        for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                            org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i18);
                            arrayList3.add(new com.tencent.mm.plugin.gamelive.playgame.f(cVar, jSONObject2.optInt("conditionId"), jSONObject2.optString("wording")));
                        }
                        com.tencent.mars.xlog.Log.i("GameLivePlayGameConditionChoosePage", "condition size:%d", java.lang.Integer.valueOf(arrayList3.size()));
                    } catch (org.json.JSONException unused) {
                    }
                    cVar.f142100h = i17;
                    aVar.f142072a.h(cVar);
                    yj0.a.h(aVar, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    yj0.a.h(aVar, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
        this.f142079h.setText(this.f142076e);
        this.f142080i.setText(this.f142077f);
        this.f142081j.setText(this.f142078g);
        android.widget.TextView textView = (android.widget.TextView) this.f142072a.f212027f.findViewById(com.tencent.mm.R.id.krq);
        int i17 = 0;
        while (true) {
            int length = this.f142082k.length();
            gameLiveAppbrandEventService$LivePlayGamePayLoad = this.f142083l;
            if (i17 >= length) {
                break;
            }
            try {
                jSONObject = this.f142082k.getJSONObject(i17);
            } catch (java.lang.Exception e17) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("GameLivePlayGameAnchorInviteWidget", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
            if (jSONObject.optInt("conditionId") == this.f142084m) {
                textView.setText(jSONObject.optString("wording"));
                break;
            }
            if (i17 == this.f142082k.length() - 1) {
                int optInt = jSONObject.optInt("conditionId");
                this.f142084m = optInt;
                gameLiveAppbrandEventService$LivePlayGamePayLoad.f142029d = optInt;
                textView.setText(jSONObject.optString("wording"));
            }
            i17++;
        }
        this.f142072a.s();
        gameLiveAppbrandEventService$LivePlayGamePayLoad.f142038p = 1;
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352186y, null, 0, gameLiveAppbrandEventService$LivePlayGamePayLoad), p60.q.class, null);
    }
}
