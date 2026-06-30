package vb1;

/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f434490a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f434491b;

    /* renamed from: c, reason: collision with root package name */
    public gb1.n f434492c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vb1.u f434493d;

    public q(vb1.u uVar, int i17) {
        this.f434493d = uVar;
        this.f434490a = i17;
    }

    public final void a() {
        if (!this.f434491b) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        gb1.n nVar = this.f434492c;
        kotlin.jvm.internal.o.d(nVar);
        vb1.u uVar = this.f434493d;
        nVar.a(uVar.o("ok"));
        java.util.HashMap hashMap = uVar.f434501g;
        int i17 = this.f434490a;
        hashMap.remove(java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i("JsApiInsertHTMLCanvasElement", "callback ok for canvasId [" + i17 + ']');
    }
}
