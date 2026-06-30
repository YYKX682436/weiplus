package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public int f213962a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f213963b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f213964c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f213965d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f213966e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.wallet_core.model.o0 f213967f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f213968g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.wallet_core.model.r f213969h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f213970i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f213971j = true;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f213972k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f213973l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f213974m;

    public p0() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f213972k = new com.tencent.mm.wallet_core.model.JumpRemind$1(this, a0Var);
        this.f213973l = new com.tencent.mm.wallet_core.model.JumpRemind$2(this, a0Var);
        this.f213974m = false;
    }

    public static com.tencent.mm.wallet_core.model.p0 c(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                ((h45.q) i95.n0.c(h45.q.class)).ensureLibraryLoaded();
                com.tencent.mars.xlog.Log.i("MicroMsg.JumpRemind", "feed %s", com.tencent.kinda.gen.CppUtil.getFilterLog(jSONObject.toString()));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JumpRemind", e17, "error create", new java.lang.Object[0]);
                return null;
            }
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("bindquerynew_resp");
        if (optJSONObject != null) {
            jSONObject = optJSONObject;
        }
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("bindqueryresp");
        if (optJSONObject2 != null) {
            jSONObject = optJSONObject2;
        }
        org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("jumpRemind");
        if (optJSONObject3 == null) {
            optJSONObject3 = jSONObject.optJSONObject("jump_remind");
        }
        if (optJSONObject3 == null) {
            optJSONObject3 = jSONObject.optJSONObject("jump_remind_info");
        }
        if (optJSONObject3 == null) {
            return null;
        }
        com.tencent.mm.wallet_core.model.p0 p0Var = new com.tencent.mm.wallet_core.model.p0();
        p0Var.f213962a = optJSONObject3.optInt("jump_type");
        p0Var.f213963b = optJSONObject3.optBoolean("is_pop_up_windows");
        p0Var.f213964c = optJSONObject3.optString("wording");
        p0Var.f213965d = optJSONObject3.optString("left_button_wording");
        p0Var.f213966e = optJSONObject3.optString("right_button_wording");
        p0Var.f213968g = optJSONObject3.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        org.json.JSONObject optJSONObject4 = optJSONObject3.optJSONObject("url");
        com.tencent.mm.wallet_core.model.o0 o0Var = new com.tencent.mm.wallet_core.model.o0();
        p0Var.f213967f = o0Var;
        if (optJSONObject4 != null) {
            o0Var.f213955a = optJSONObject4.optInt("type");
            com.tencent.mm.wallet_core.model.o0 o0Var2 = p0Var.f213967f;
            optJSONObject4.optString("appid");
            o0Var2.getClass();
            com.tencent.mm.wallet_core.model.o0 o0Var3 = p0Var.f213967f;
            optJSONObject4.optString("app_version");
            o0Var3.getClass();
            p0Var.f213967f.f213956b = optJSONObject4.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            p0Var.f213967f.f213957c = optJSONObject4.optString("button_name");
        }
        return p0Var;
    }

    public static com.tencent.mm.wallet_core.model.p0 d(r45.q34 q34Var) {
        if (q34Var == null) {
            return null;
        }
        com.tencent.mm.wallet_core.model.p0 p0Var = new com.tencent.mm.wallet_core.model.p0();
        p0Var.f213963b = q34Var.f383625e;
        p0Var.f213962a = q34Var.f383624d;
        p0Var.f213964c = q34Var.f383626f;
        p0Var.f213965d = q34Var.f383627g;
        p0Var.f213966e = q34Var.f383628h;
        p0Var.f213968g = q34Var.f383630m;
        com.tencent.mm.wallet_core.model.o0 o0Var = new com.tencent.mm.wallet_core.model.o0();
        p0Var.f213967f = o0Var;
        r45.dn5 dn5Var = q34Var.f383629i;
        if (dn5Var != null) {
            o0Var.f213955a = dn5Var.f372598d;
            java.lang.String str = dn5Var.f372599e;
            com.tencent.mm.wallet_core.model.o0 o0Var2 = p0Var.f213967f;
            java.lang.String str2 = q34Var.f383629i.f372600f;
            o0Var2.getClass();
            com.tencent.mm.wallet_core.model.o0 o0Var3 = p0Var.f213967f;
            r45.dn5 dn5Var2 = q34Var.f383629i;
            o0Var3.f213956b = dn5Var2.f372601g;
            o0Var3.f213957c = dn5Var2.f372602h;
        }
        return p0Var;
    }

    public void a() {
        com.tencent.mm.wallet_core.model.o0 o0Var = this.f213967f;
        if (o0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(o0Var.f213956b)) {
            return;
        }
        if (this.f213967f.f213956b.contains("clientversion")) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JumpRemind", "url.path contain clientversion");
            return;
        }
        com.tencent.mm.wallet_core.model.o0 o0Var2 = this.f213967f;
        o0Var2.f213956b = com.tencent.mm.ui.tools.qd.a(o0Var2.f213956b, "clientversion=" + o45.wf.f343029g);
    }

    public boolean b() {
        return this.f213962a == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(android.content.Context context) {
        boolean z17 = context instanceof com.tencent.mm.wallet_core.model.s;
        com.tencent.mm.sdk.event.IListener iListener = this.f213973l;
        com.tencent.mm.sdk.event.IListener iListener2 = this.f213972k;
        if (z17) {
            ((com.tencent.mm.wallet_core.model.s) context).register(new com.tencent.mm.wallet_core.model.n0(this));
            iListener2.alive();
            iListener.alive();
            this.f213970i = false;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", this.f213967f.f213956b);
            intent.putExtra("showShare", false);
            this.f213969h.onEnter();
            com.tencent.mm.wallet_core.ui.r1.T(context, intent);
            return;
        }
        if (this.f213974m) {
            iListener2.alive();
            iListener.alive();
            this.f213970i = false;
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("rawUrl", this.f213967f.f213956b);
            intent2.putExtra("showShare", false);
            this.f213969h.onEnter();
            com.tencent.mm.wallet_core.ui.r1.T(context, intent2);
        }
    }

    public void f() {
        this.f213972k.dead();
        this.f213973l.dead();
    }

    public boolean g(android.app.Activity activity, com.tencent.mm.wallet_core.model.p pVar) {
        i(activity, new com.tencent.mm.wallet_core.model.k0(this, pVar, activity));
        return true;
    }

    public boolean h(android.app.Activity activity, com.tencent.mm.wallet_core.model.q qVar) {
        db5.e1.A(activity, this.f213964c, this.f213968g, this.f213966e, this.f213965d, new com.tencent.mm.wallet_core.model.l0(this, qVar), new com.tencent.mm.wallet_core.model.m0(this, qVar));
        return true;
    }

    public boolean i(android.app.Activity activity, com.tencent.mm.wallet_core.model.r rVar) {
        this.f213969h = rVar;
        if (this.f213963b) {
            db5.e1.K(activity, this.f213971j, this.f213964c, this.f213968g, this.f213966e, this.f213965d, new com.tencent.mm.wallet_core.model.i0(this, activity), new com.tencent.mm.wallet_core.model.j0(this, activity));
            return true;
        }
        e(activity);
        return true;
    }
}
