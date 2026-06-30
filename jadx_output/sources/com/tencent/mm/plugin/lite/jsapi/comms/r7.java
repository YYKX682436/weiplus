package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public class r7 extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f143769g = "";

    /* renamed from: h, reason: collision with root package name */
    public final w65.o f143770h = new com.tencent.mm.plugin.lite.jsapi.comms.q7(this);

    public static void A(com.tencent.mm.plugin.lite.jsapi.comms.r7 r7Var) {
        synchronized (r7Var) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StartDownloadChatFile", "removeWeTaskListener");
            w65.n nVar = (w65.n) i95.n0.c(w65.n.class);
            w65.o taskListener = r7Var.f143770h;
            lm.r rVar = (lm.r) nVar;
            rVar.getClass();
            kotlin.jvm.internal.o.g(taskListener, "taskListener");
            v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) rVar.f319329m).getValue(), null, new lm.h(rVar, taskListener, null), 1, null);
        }
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.StartDownloadChatFile", "invoke %s.", this.f299023d);
        java.lang.String optString = jSONObject.optString("messageSvrId");
        java.lang.String optString2 = jSONObject.optString("chatName");
        java.lang.String optString3 = jSONObject.optString("extInfo");
        if (optString.isEmpty() || optString2.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StartDownloadChatFile", "invalid param %s", jSONObject.toString());
            this.f143442e.b("invalid param");
            return;
        }
        h40.f fVar = new h40.f(optString2, java.lang.Long.parseLong(optString));
        fVar.f278744e = new h40.a(optString3);
        fVar.f278745f = h40.b.f278723h;
        java.lang.String fj6 = ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).fj(fVar);
        this.f143769g = fj6;
        com.tencent.mars.xlog.Log.i("MicroMsg.StartDownloadChatFile", "get mediaId: %s", fj6);
        int i17 = 1;
        boolean z18 = false;
        if (!this.f299023d.equals("queryChatFileStatus")) {
            if (!this.f299023d.equals("startDownloadChatFile")) {
                com.tencent.mars.xlog.Log.e("MicroMsg.StartDownloadChatFile", "unknown jsapi name %s", this.f299023d);
                this.f143442e.b("invoke jsapi error.");
                return;
            }
            ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).aj(fVar);
            ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).Ai(pt0.f0.V9(optString2, com.tencent.mm.sdk.platformtools.b8.c(optString)));
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("complete", false);
                this.f143442e.f(jSONObject2, true);
                synchronized (this) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.StartDownloadChatFile", "addWeTaskListener");
                    w65.n nVar = (w65.n) i95.n0.c(w65.n.class);
                    w65.o taskListener = this.f143770h;
                    lm.r rVar = (lm.r) nVar;
                    rVar.getClass();
                    kotlin.jvm.internal.o.g(taskListener, "taskListener");
                    v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) rVar.f319329m).getValue(), null, new lm.f(rVar, taskListener, null), 1, null);
                }
                return;
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.StartDownloadChatFile", "%s json exception: %s", this.f299023d, e17.toString());
                this.f143442e.b("start download json exception");
                return;
            }
        }
        h40.g bj6 = ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).bj(fVar);
        long j17 = bj6.f278750c;
        int i18 = j17 != 0 ? (int) ((bj6.f278749b / j17) * 100.0d) : 0;
        int i19 = bj6.f278748a;
        if (i19 == 102) {
            i17 = 0;
        } else {
            ((com.tencent.mm.pluginsdk.model.app.d3) ((ct.w2) i95.n0.c(ct.w2.class))).wi(false);
            if (i19 == 101) {
                synchronized (this) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.StartDownloadChatFile", "addWeTaskListener");
                    w65.n nVar2 = (w65.n) i95.n0.c(w65.n.class);
                    w65.o taskListener2 = this.f143770h;
                    lm.r rVar2 = (lm.r) nVar2;
                    rVar2.getClass();
                    kotlin.jvm.internal.o.g(taskListener2, "taskListener");
                    v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) rVar2.f319329m).getValue(), null, new lm.f(rVar2, taskListener2, null), 1, null);
                }
                z18 = true;
            } else {
                i17 = i19 == 199 ? 2 : -1;
            }
        }
        try {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("status", i17);
            jSONObject3.put("progress", i18);
            this.f143442e.f(jSONObject3, z18);
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StartDownloadChatFile", "%s json exception: %s", this.f299023d, e18.toString());
            this.f143442e.b("file status json exception");
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
