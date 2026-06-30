package s50;

@j95.b
/* loaded from: classes12.dex */
public final class l1 extends i95.w implements su4.c1 {

    /* renamed from: d, reason: collision with root package name */
    public z21.e f403080d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f403081e;

    /* renamed from: h, reason: collision with root package name */
    public long f403084h;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f403088o;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f403082f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f403083g = new java.util.LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public s50.x0 f403085i = s50.x0.f403137d;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f403086m = "";

    /* renamed from: n, reason: collision with root package name */
    public final su4.b1 f403087n = new su4.b1();

    /* renamed from: p, reason: collision with root package name */
    public final s50.e1 f403089p = new s50.e1(this, android.os.Looper.getMainLooper());

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f403090q = new java.util.LinkedHashMap();

    public static final void Ai(s50.l1 l1Var, java.lang.ref.WeakReference weakReference, int i17) {
        l1Var.getClass();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputViewCompletion, bottomHeight=" + i17);
            l1Var.f403085i = s50.x0.f403144n;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("status", "onVoiceInputViewCompletion");
            jSONObject.put("from", "bottom");
            jSONObject.put("bottomHeight", i17);
            l1Var.cj(weakReference, jSONObject);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputViewCompletion, error: " + e17);
        }
    }

    public static final void wi(s50.l1 l1Var, java.lang.ref.WeakReference weakReference, java.lang.String str, boolean z17, java.lang.String str2) {
        l1Var.getClass();
        try {
            l1Var.f403085i = s50.x0.f403144n;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, str);
            int i17 = 1;
            if (str2.length() > 0) {
                jSONObject.put("voiceid", str2);
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("status", "onsearch");
            jSONObject2.put("extinfo", jSONObject);
            if (!z17) {
                i17 = 2;
            }
            jSONObject2.put("sceneFrom", i17);
            long g17 = o13.n.g(3);
            o13.p.f342251d = g17;
            jSONObject2.put("searchid", g17);
            l1Var.bj(weakReference, jSONObject2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputData, error: " + e17);
        }
    }

    public final void Bi() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "doCancel, currVoiceStatus: " + this.f403085i);
        s50.e1 e1Var = this.f403089p;
        e1Var.removeMessages(101);
        e1Var.removeMessages(102);
        if (this.f403085i == s50.x0.f403140g) {
            this.f403085i = s50.x0.f403141h;
            java.lang.ref.WeakReference weakReference = this.f403081e;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("status", "onstop");
                bj(weakReference, jSONObject);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputStop, error: " + e17);
            }
        }
        if (this.f403085i == s50.x0.f403142i) {
            this.f403085i = s50.x0.f403143m;
            Vi(this.f403081e);
        }
        z21.e eVar = this.f403080d;
        if (eVar != null) {
            eVar.cancel(false);
        }
        this.f403080d = null;
        this.f403085i = s50.x0.f403137d;
        this.f403086m = "";
    }

    public final void Di(int i17, float f17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "doStartAfterPermissionGranted");
        Bi();
        this.f403085i = s50.x0.f403138e;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            ((x90.o) ((y90.i) i95.n0.c(y90.i.class))).getClass();
            this.f403080d = new z21.w();
        } else {
            ((x90.o) ((y90.i) i95.n0.c(y90.i.class))).getClass();
            this.f403080d = com.tencent.mm.modelvoiceaddr.SceneVoiceInputAddrProxy.getInstance();
        }
        z21.e eVar = this.f403080d;
        if (eVar != null) {
            eVar.init((z17 && com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a).equals("en")) ? 4 : 1, i17, new s50.d1(this));
        }
        this.f403084h = java.lang.System.currentTimeMillis();
        this.f403085i = s50.x0.f403139f;
        z21.e eVar2 = this.f403080d;
        if (eVar2 != null) {
            eVar2.setVadSAndNRation(f17);
        }
        z21.e eVar3 = this.f403080d;
        if (eVar3 != null) {
            eVar3.start();
        }
        aj(this.f403081e);
    }

    public final android.view.ViewGroup Ni(java.lang.ref.WeakReference weakReference) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView = (com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView) weakReference.get();
        if (baseWebSearchWebView == null) {
            return null;
        }
        for (android.view.ViewParent parent = baseWebSearchWebView.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                if (viewGroup.getId() == com.tencent.mm.R.id.che) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "findContainerForWebView: found half screen drag_layout, using it directly");
                    return viewGroup;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "findContainerForWebView: not in half screen, return null");
        return null;
    }

    public final k23.v0 Ri(int i17) {
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.LinkedHashMap) this.f403082f).get(java.lang.Integer.valueOf(i17));
        if (weakReference != null) {
            return (k23.v0) weakReference.get();
        }
        return null;
    }

    public final k23.v0 Ui(int i17) {
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.LinkedHashMap) this.f403090q).get(java.lang.Integer.valueOf(i17));
        if (weakReference != null) {
            return (k23.v0) weakReference.get();
        }
        return null;
    }

    public final void Vi(java.lang.ref.WeakReference weakReference) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("status", "oncancel");
            bj(weakReference, jSONObject);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputCancel, error: " + e17);
        }
    }

    public final void Zi(java.lang.ref.WeakReference weakReference, s50.w0 w0Var, java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("retCode", w0Var.f403134d);
            jSONObject.put("errMsg", str);
            jSONObject.put("status", "onerror");
            bj(weakReference, jSONObject);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputError, error: " + e17);
        }
    }

    public final void aj(java.lang.ref.WeakReference weakReference) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("status", "onstart");
            bj(weakReference, jSONObject);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputStart, error: " + e17);
        }
    }

    public final void bj(java.lang.ref.WeakReference weakReference, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputStatus, event->" + jSONObject + ", status->" + this.f403085i);
            if (this.f403085i == s50.x0.f403137d || weakReference == null || (baseWebSearchWebView = (com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView) weakReference.get()) == null) {
                return;
            }
            if (!jSONObject.has("retCode")) {
                s50.w0 w0Var = s50.w0.f403129e;
                jSONObject.put("retCode", 0);
                jSONObject.put("errMsg", "ok");
            }
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("extinfo");
            if (optJSONObject == null) {
                optJSONObject = new org.json.JSONObject();
                jSONObject.put("extinfo", optJSONObject);
            }
            optJSONObject.put("inputId", this.f403084h);
            java.lang.String str = this.f403088o;
            if (str != null) {
                jSONObject.put("thirdExtInfo", str);
            }
            av4.y0.f14350a.c(baseWebSearchWebView, "onStreamVoiceInputStatus", jSONObject);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputStatus, error: " + e17);
        }
    }

    public final void cj(java.lang.ref.WeakReference weakReference, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputStatusDirect, event->" + jSONObject);
            if (weakReference == null || (baseWebSearchWebView = (com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView) weakReference.get()) == null) {
                return;
            }
            if (!jSONObject.has("retCode")) {
                s50.w0 w0Var = s50.w0.f403129e;
                jSONObject.put("retCode", 0);
                jSONObject.put("errMsg", "ok");
            }
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("extinfo");
            if (optJSONObject == null) {
                optJSONObject = new org.json.JSONObject();
                jSONObject.put("extinfo", optJSONObject);
            }
            optJSONObject.put("inputId", this.f403084h);
            java.lang.String str = this.f403088o;
            if (str != null) {
                jSONObject.put("thirdExtInfo", str);
            }
            av4.y0.f14350a.c(baseWebSearchWebView, "onStreamVoiceInputStatus", jSONObject);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputStatusDirect, error: " + e17);
        }
    }

    public final void fj(com.tencent.mm.ui.MMActivity mMActivity, java.lang.ref.WeakReference weakReference, k23.v0 v0Var) {
        android.app.Application application = mMActivity.getApplication();
        if (application == null) {
            return;
        }
        int identityHashCode = java.lang.System.identityHashCode(mMActivity);
        java.util.Map map = this.f403083g;
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (android.app.Application.ActivityLifecycleCallbacks) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(identityHashCode));
        if (activityLifecycleCallbacks != null) {
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        s50.f1 f1Var = new s50.f1(mMActivity, this, weakReference, v0Var, identityHashCode, application);
        map.put(java.lang.Integer.valueOf(identityHashCode), f1Var);
        application.registerActivityLifecycleCallbacks(f1Var);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "onAccountInitialized}");
        super.onAccountInitialized(context);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "onAccountInitialized");
        super.onAccountReleased(context);
        Bi();
        this.f403081e = null;
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "onCreate");
        super.onCreate(context);
    }
}
