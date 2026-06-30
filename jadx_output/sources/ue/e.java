package ue;

/* loaded from: classes7.dex */
public final class e implements com.tencent.mm.plugin.appbrand.jsruntime.t, com.tencent.mm.plugin.appbrand.jsruntime.v, com.tencent.mm.plugin.appbrand.jsruntime.f0, com.tencent.mm.plugin.appbrand.jsruntime.y, com.tencent.mm.plugin.appbrand.jsruntime.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni f426768d;

    /* renamed from: e, reason: collision with root package name */
    public final int f426769e;

    /* renamed from: f, reason: collision with root package name */
    public final long f426770f;

    /* renamed from: g, reason: collision with root package name */
    public final long f426771g;

    /* renamed from: h, reason: collision with root package name */
    public final long f426772h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f426773i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f426774m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f426775n;

    public e(com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni commonBinding, int i17, long j17, long j18, long j19) {
        kotlin.jvm.internal.o.g(commonBinding, "commonBinding");
        this.f426768d = commonBinding;
        this.f426769e = i17;
        this.f426770f = j17;
        this.f426771g = j18;
        this.f426772h = j19;
        this.f426773i = new java.util.ArrayList();
        this.f426774m = new java.util.ArrayList();
        this.f426775n = new java.util.ArrayList();
        final ue.a aVar = new ue.a(this);
        commonBinding.postCleanupJobInWorker(i17, new java.lang.Runnable(aVar) { // from class: ue.d

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f426767d;

            {
                kotlin.jvm.internal.o.g(aVar, "function");
                this.f426767d = aVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f426767d.invoke();
            }
        });
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.v
    public void B(com.tencent.mm.plugin.appbrand.jsruntime.d1 d1Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.f0
    public void C(int i17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.l0
    public long G() {
        return this.f426771g;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.v
    public com.tencent.mm.plugin.appbrand.jsruntime.d1 H() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.v
    public int K() {
        return this.f426768d.generateBufferId(this.f426769e);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.l0
    public long L() {
        return this.f426770f;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void M(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String script, android.webkit.ValueCallback valueCallback) {
        kotlin.jvm.internal.o.g(script, "script");
        this.f426768d.evaluateScriptInWorker(script, this.f426769e, valueCallback);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.l0
    public void Q(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String script, cl.j1 j1Var) {
        kotlin.jvm.internal.o.g(script, "script");
        this.f426768d.evaluateScriptInWorker(script, this.f426769e, new ue.c(j1Var));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void R(java.net.URL url, java.lang.String script, android.webkit.ValueCallback valueCallback) {
        kotlin.jvm.internal.o.g(script, "script");
        this.f426768d.evaluateScriptInWorker(script, this.f426769e, valueCallback);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.v
    public void U(int i17, java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            this.f426768d.putJavaByteBuffer(this.f426769e, i17, byteBuffer);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.f0
    public java.lang.String a() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void addJavascriptInterface(java.lang.Object obj, java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.v
    public void bufferStoreBindTo(long j17, long j18) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.y
    public void d0(com.tencent.mm.plugin.appbrand.jsruntime.x l17) {
        kotlin.jvm.internal.o.g(l17, "l");
        this.f426775n.add(l17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void destroy() {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.c0
    public void evaluateJavascript(java.lang.String script, android.webkit.ValueCallback valueCallback) {
        kotlin.jvm.internal.o.g(script, "script");
        this.f426768d.evaluateScriptInWorker(script, this.f426769e, valueCallback);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.y
    public void f0(com.tencent.mm.plugin.appbrand.jsruntime.x xVar, boolean z17) {
        if (xVar == null) {
            return;
        }
        if (z17) {
            this.f426774m.add(xVar);
        } else {
            this.f426773i.add(xVar);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.f0
    public boolean g() {
        return this.f426768d.isJsThreadCurrent(this.f426769e);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.f0
    public void h(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public com.tencent.mm.plugin.appbrand.jsruntime.u h0(java.lang.Class addon) {
        kotlin.jvm.internal.o.g(addon, "addon");
        if (addon.isInstance(this)) {
            return this;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.v
    public java.nio.ByteBuffer j0(int i17, boolean z17) {
        return this.f426768d.getJSByteBufferAndRemove(this.f426769e, i17, z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.f0
    public void k(java.lang.Runnable r17, boolean z17) {
        kotlin.jvm.internal.o.g(r17, "r");
        this.f426768d.postToJsThreadInWorker(this.f426769e, r17, z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.l0
    public void l0(java.util.ArrayList scripts, java.lang.String str, cl.j1 j1Var) {
        kotlin.jvm.internal.o.g(scripts, "scripts");
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        java.util.Iterator it = scripts.iterator();
        while (it.hasNext()) {
            com.eclipsesource.mmv8.V8ScriptEvaluateRequest v8ScriptEvaluateRequest = (com.eclipsesource.mmv8.V8ScriptEvaluateRequest) it.next();
            if (v8ScriptEvaluateRequest.scriptType == 3) {
                this.f426768d.evaluateScriptInWorker(v8ScriptEvaluateRequest.scriptText, this.f426769e, new ue.b(f0Var, scripts, j1Var));
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.c0
    public boolean p() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.f0
    public void post(java.lang.Runnable r17) {
        kotlin.jvm.internal.o.g(r17, "r");
        this.f426768d.postToJsThreadInWorker(this.f426769e, r17, false);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.y
    public void r(com.tencent.mm.plugin.appbrand.jsruntime.x xVar) {
        f0(xVar, false);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.v
    public void releaseDirectByteBuffer(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            this.f426768d.releaseDirectBuffer(byteBuffer);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void setJsExceptionHandler(com.tencent.mm.plugin.appbrand.jsruntime.s sVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.v
    public boolean supportBufferStoreBindTo() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.l0
    public void v() {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.l0
    public long z() {
        return this.f426772h;
    }
}
