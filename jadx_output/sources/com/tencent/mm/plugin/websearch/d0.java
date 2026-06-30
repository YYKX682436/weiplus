package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public class d0 implements l75.q0, su4.v0 {

    /* renamed from: d, reason: collision with root package name */
    public volatile java.util.HashMap f181480d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.util.HashMap f181481e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.util.HashMap f181482f;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.util.HashMap f181483g;

    /* renamed from: h, reason: collision with root package name */
    public volatile java.util.HashMap f181484h;

    /* renamed from: i, reason: collision with root package name */
    public volatile java.util.HashMap f181485i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f181486m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f181487n;

    public d0() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent>(a0Var) { // from class: com.tencent.mm.plugin.websearch.FTSWebViewImageLogic$1
            {
                this.__eventId = 1327212386;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent fTSEmojiDownloadedEvent) {
                com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent fTSEmojiDownloadedEvent2 = fTSEmojiDownloadedEvent;
                am.n9 n9Var = fTSEmojiDownloadedEvent2.f54231g;
                if (n9Var.f7406a == 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewImageLogic", "Emoji Download callback %s", n9Var.f7412g);
                    if (com.tencent.mm.plugin.websearch.d0.this.f181482f.containsKey(fTSEmojiDownloadedEvent2.f54231g.f7412g)) {
                        synchronized (com.tencent.mm.plugin.websearch.d0.this.f181482f) {
                            int intValue = ((java.lang.Integer) com.tencent.mm.plugin.websearch.d0.this.f181485i.get(fTSEmojiDownloadedEvent2.f54231g.f7412g)).intValue();
                            java.util.HashSet hashSet = (java.util.HashSet) com.tencent.mm.plugin.websearch.d0.this.f181482f.get(fTSEmojiDownloadedEvent2.f54231g.f7412g);
                            org.json.JSONArray jSONArray = new org.json.JSONArray();
                            java.util.Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                java.lang.String str = (java.lang.String) it.next();
                                java.lang.String str2 = "weixin://fts/emoji?path=" + fTSEmojiDownloadedEvent2.f54232h.f7518a;
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                try {
                                    jSONObject.put(dm.i4.COL_ID, str);
                                    jSONObject.put("src", str2);
                                } catch (org.json.JSONException unused) {
                                }
                                jSONArray.put(jSONObject);
                            }
                            ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Ui(intValue, 0, jSONArray.toString());
                            com.tencent.mm.plugin.websearch.d0.this.f181482f.remove(fTSEmojiDownloadedEvent2.f54231g.f7412g);
                            com.tencent.mm.plugin.websearch.d0.this.f181485i.remove(fTSEmojiDownloadedEvent2.f54231g.f7412g);
                        }
                    }
                }
                return false;
            }
        };
        this.f181486m = iListener;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsImageDownloadedEvent> iListener2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsImageDownloadedEvent>(a0Var) { // from class: com.tencent.mm.plugin.websearch.FTSWebViewImageLogic$2
            {
                this.__eventId = -1231290816;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsImageDownloadedEvent snsImageDownloadedEvent) {
                com.tencent.mm.autogen.events.SnsImageDownloadedEvent snsImageDownloadedEvent2 = snsImageDownloadedEvent;
                if (snsImageDownloadedEvent2 instanceof com.tencent.mm.autogen.events.SnsImageDownloadedEvent) {
                    am.yv yvVar = snsImageDownloadedEvent2.f54816g;
                    if (yvVar.f8481a == 2) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewImageLogic", "[%s][media:%s]Download callback", "[image-flow]", yvVar.f8483c);
                        if (com.tencent.mm.plugin.websearch.d0.this.f181481e.containsKey(snsImageDownloadedEvent2.f54816g.f8483c)) {
                            synchronized (com.tencent.mm.plugin.websearch.d0.this.f181481e) {
                                int intValue = ((java.lang.Integer) com.tencent.mm.plugin.websearch.d0.this.f181484h.get(snsImageDownloadedEvent2.f54816g.f8483c)).intValue();
                                java.util.HashSet hashSet = (java.util.HashSet) com.tencent.mm.plugin.websearch.d0.this.f181481e.get(snsImageDownloadedEvent2.f54816g.f8483c);
                                org.json.JSONArray jSONArray = new org.json.JSONArray();
                                java.util.Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    java.lang.String str = (java.lang.String) it.next();
                                    java.lang.String str2 = "weixin://fts/sns?path=" + com.tencent.mm.vfs.w6.i(snsImageDownloadedEvent2.f54816g.f8484d, false);
                                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                                    try {
                                        jSONObject.put(dm.i4.COL_ID, str);
                                        jSONObject.put("src", str2);
                                    } catch (org.json.JSONException unused) {
                                    }
                                    jSONArray.put(jSONObject);
                                }
                                ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Ui(intValue, 0, jSONArray.toString());
                                com.tencent.mm.plugin.websearch.d0.this.f181481e.remove(snsImageDownloadedEvent2.f54816g.f8483c);
                                com.tencent.mm.plugin.websearch.d0.this.f181484h.remove(snsImageDownloadedEvent2.f54816g.f8483c);
                            }
                        }
                    }
                }
                return false;
            }
        };
        this.f181487n = iListener2;
        this.f181480d = new java.util.HashMap();
        this.f181481e = new java.util.HashMap();
        this.f181483g = new java.util.HashMap();
        this.f181484h = new java.util.HashMap();
        this.f181482f = new java.util.HashMap();
        this.f181485i = new java.util.HashMap();
        iListener2.alive();
        iListener.alive();
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ni().add(this);
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (w0Var == null || w0Var.f316976d == null) {
            return;
        }
        synchronized (this.f181480d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewImageLogic", "event %s，eventData %s", str, w0Var.toString());
            java.lang.String obj = w0Var.f316976d.toString();
            if (this.f181480d.containsKey(obj) && this.f181483g.containsKey(obj)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewImageLogic", "notify avatar changed %s", obj);
                int intValue = ((java.lang.Integer) this.f181483g.get(obj)).intValue();
                java.util.HashSet hashSet = new java.util.HashSet((java.util.HashSet) this.f181480d.get(obj));
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    java.lang.String str3 = "weixin://fts/avatar?path=" + com.tencent.mm.modelavatar.d1.Ai().i(obj, false, false);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put(dm.i4.COL_ID, str2);
                        jSONObject.put("src", str3);
                    } catch (org.json.JSONException unused) {
                    }
                    jSONArray.put(jSONObject);
                }
                ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Ui(intValue, 0, jSONArray.toString());
                this.f181480d.remove(obj);
                this.f181483g.remove(obj);
            }
        }
    }
}
