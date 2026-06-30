package com.tencent.mm.pluginsdk.model;

/* loaded from: classes10.dex */
public final class e3 implements t21.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f189288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c35.p f189289b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189290c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f189291d;

    public e3(kotlin.jvm.internal.c0 c0Var, c35.p pVar, java.lang.String str, java.lang.Object obj) {
        this.f189288a = c0Var;
        this.f189289b = pVar;
        this.f189290c = str;
        this.f189291d = obj;
    }

    @Override // t21.f0
    public void a(boolean z17, int i17) {
        this.f189288a.f310112d = z17;
        this.f189289b.f38258b = i17;
        f65.y0.f260019a.e(this.f189290c);
        java.lang.Object obj = this.f189291d;
        synchronized (obj) {
            try {
                obj.notifyAll();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ImportVideoTransfer", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
