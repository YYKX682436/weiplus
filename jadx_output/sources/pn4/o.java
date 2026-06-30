package pn4;

/* loaded from: classes5.dex */
public final class o implements y21.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f357156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f357157b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f357158c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn4.n f357159d;

    public o(java.lang.CharSequence charSequence, kotlin.jvm.internal.f0 f0Var, long j17, pn4.n nVar) {
        this.f357156a = charSequence;
        this.f357157b = f0Var;
        this.f357158c = j17;
        this.f357159d = nVar;
    }

    @Override // y21.a
    public void a() {
    }

    @Override // y21.a
    public void onComplete() {
    }

    @Override // y21.a
    public void onProgress(float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechHelper", "onProgress " + f17);
        int ceil = (int) java.lang.Math.ceil((this.f357156a != null ? r0.length() : 0) * f17);
        kotlin.jvm.internal.f0 f0Var = this.f357157b;
        if (ceil != f0Var.f310116d) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(ceil);
            long j17 = this.f357158c;
            com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechHelper", "notify speechIndex:%s, msgId:%s", valueOf, java.lang.Long.valueOf(j17));
            pn4.n nVar = this.f357159d;
            if (nVar != null) {
                nVar.a(ceil, java.lang.Long.valueOf(j17));
            }
            f0Var.f310116d = ceil;
        }
    }
}
