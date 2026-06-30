package vc3;

/* loaded from: classes7.dex */
public final class k implements vc3.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni f435268d;

    /* renamed from: e, reason: collision with root package name */
    public final int f435269e;

    /* renamed from: f, reason: collision with root package name */
    public final long f435270f;

    /* renamed from: g, reason: collision with root package name */
    public final long f435271g;

    /* renamed from: h, reason: collision with root package name */
    public final long f435272h;

    public k(com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni commonBinding, int i17, long j17, long j18, long j19) {
        kotlin.jvm.internal.o.g(commonBinding, "commonBinding");
        this.f435268d = commonBinding;
        this.f435269e = i17;
        this.f435270f = j17;
        this.f435271g = j18;
        this.f435272h = j19;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.v
    public void B(com.tencent.mm.plugin.appbrand.jsruntime.d1 d1Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.f0
    public void C(int i17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.l0
    public long G() {
        return this.f435271g;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.v
    public com.tencent.mm.plugin.appbrand.jsruntime.d1 H() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.v
    public int K() {
        return this.f435268d.generateBufferId(this.f435269e);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.l0
    public long L() {
        return this.f435270f;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void M(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String script, android.webkit.ValueCallback valueCallback) {
        kotlin.jvm.internal.o.g(script, "script");
        this.f435268d.evaluateScriptInWorker(script, this.f435269e, valueCallback);
    }

    @Override // vc3.a
    public void O(yz5.a r17) {
        kotlin.jvm.internal.o.g(r17, "r");
        this.f435268d.postCleanupJobInWorker(this.f435269e, new vc3.j(r17));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.l0
    public void Q(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String script, cl.j1 j1Var) {
        kotlin.jvm.internal.o.g(script, "script");
        this.f435268d.evaluateScriptInWorker(script, this.f435269e, new vc3.i(j1Var));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void R(java.net.URL url, java.lang.String script, android.webkit.ValueCallback valueCallback) {
        kotlin.jvm.internal.o.g(script, "script");
        this.f435268d.evaluateScriptInWorker(script, this.f435269e, valueCallback);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.v
    public void U(int i17, java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            this.f435268d.putJavaByteBuffer(this.f435269e, i17, byteBuffer);
        }
    }

    @Override // vc3.a
    public void Z(yz5.a r17) {
        kotlin.jvm.internal.o.g(r17, "r");
        this.f435268d.postToJsThreadInWorker(this.f435269e, new vc3.j(r17), true);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.f0
    public java.lang.String a() {
        return "MB.Worker-" + this.f435269e;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void addJavascriptInterface(java.lang.Object obj, java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.v
    public void bufferStoreBindTo(long j17, long j18) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void destroy() {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.c0
    public void evaluateJavascript(java.lang.String script, android.webkit.ValueCallback valueCallback) {
        kotlin.jvm.internal.o.g(script, "script");
        this.f435268d.evaluateScriptInWorker(script, this.f435269e, valueCallback);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.f0
    public boolean g() {
        return this.f435268d.isJsThreadCurrent(this.f435269e);
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
        return this.f435268d.getJSByteBufferAndRemove(this.f435269e, i17, z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.f0
    public void k(java.lang.Runnable r17, boolean z17) {
        kotlin.jvm.internal.o.g(r17, "r");
        this.f435268d.postToJsThreadInWorker(this.f435269e, r17, z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.l0
    public void l0(java.util.ArrayList scripts, java.lang.String str, cl.j1 j1Var) {
        kotlin.jvm.internal.o.g(scripts, "scripts");
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        java.util.Iterator it = scripts.iterator();
        while (it.hasNext()) {
            com.eclipsesource.mmv8.V8ScriptEvaluateRequest v8ScriptEvaluateRequest = (com.eclipsesource.mmv8.V8ScriptEvaluateRequest) it.next();
            if (v8ScriptEvaluateRequest.scriptType == 3) {
                this.f435268d.evaluateScriptInWorker(v8ScriptEvaluateRequest.scriptText, this.f435269e, new vc3.h(f0Var, scripts, j1Var));
            }
        }
    }

    @Override // vc3.a
    public void pause() {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.f0
    public void post(java.lang.Runnable r17) {
        kotlin.jvm.internal.o.g(r17, "r");
        this.f435268d.postToJsThreadInWorker(this.f435269e, r17, false);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.v
    public void releaseDirectByteBuffer(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            this.f435268d.releaseDirectBuffer(byteBuffer);
        }
    }

    @Override // vc3.a
    public void resume() {
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
        return this.f435272h;
    }
}
