package cw2;

/* loaded from: classes15.dex */
public final class s5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f223992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223994f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cw2.z5 f223995g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f223996h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ cw2.d6 f223997i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f223998m;

    public s5(int i17, java.lang.String str, java.lang.String str2, cw2.z5 z5Var, yz5.l lVar, cw2.d6 d6Var, yz5.a aVar) {
        this.f223992d = i17;
        this.f223993e = str;
        this.f223994f = str2;
        this.f223995g = z5Var;
        this.f223996h = lVar;
        this.f223997i = d6Var;
        this.f223998m = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cw2.c6 c6Var;
        cw2.z5 z5Var = this.f223995g;
        java.util.Objects.toString(z5Var);
        boolean z17 = z5Var.f224133a;
        yz5.l lVar = this.f223996h;
        if (z17) {
            lVar.invoke(java.lang.Boolean.TRUE);
            return;
        }
        z5Var.f224133a = true;
        cw2.d6 d6Var = this.f223997i;
        java.util.HashMap hashMap = d6Var.f223650d;
        int i17 = this.f223992d;
        java.util.Stack stack = (java.util.Stack) hashMap.get(java.lang.Integer.valueOf(i17));
        cw2.b6 b6Var = null;
        if (stack == null || stack.empty()) {
            lz5.m mVar = new lz5.m();
            java.lang.String str = this.f223993e;
            if (str != null) {
                mVar.put("modelPath", str);
            }
            java.lang.String str2 = this.f223994f;
            if (str2 != null) {
                mVar.put("modelCachePath", str2);
            }
            long createPostProcessor = d6Var.f223649c.createPostProcessor(i17, kz5.b1.b(mVar));
            if (createPostProcessor == 0) {
                com.tencent.mars.xlog.Log.e("FinderThumbPlayerPostProcessor", "Failed to create strategy post processor");
                c6Var = null;
            } else {
                c6Var = new cw2.c6(i17, createPostProcessor);
            }
        } else {
            java.lang.Object pop = stack.pop();
            kotlin.jvm.internal.o.f(pop, "pop(...)");
            c6Var = new cw2.c6(i17, ((java.lang.Number) pop).longValue());
        }
        z5Var.f224134b = c6Var;
        if (z5Var.f224134b == null) {
            com.tencent.mars.xlog.Log.e("FinderThumbPlayerPostProcessor", "Failed to create strategy post processor. strategy=" + i17);
            lVar.invoke(java.lang.Boolean.FALSE);
            return;
        }
        java.util.Stack stack2 = d6Var.f223651e;
        if (stack2.empty()) {
            com.tencent.mm.mmpostprocessing.MMPostProcessing mMPostProcessing = d6Var.f223649c;
            long createInputTexture = mMPostProcessing.createInputTexture();
            if (createInputTexture == 0) {
                com.tencent.mars.xlog.Log.e("FinderThumbPlayerPostProcessor", "Failed to create input texture");
            } else {
                b6Var = new cw2.b6(createInputTexture, mMPostProcessing.getInputTextureId(createInputTexture), d6Var.f223648b);
            }
        } else {
            b6Var = (cw2.b6) stack2.pop();
        }
        if (b6Var == null) {
            com.tencent.mars.xlog.Log.e("FinderThumbPlayerPostProcessor", "Failed to create input texture");
            lVar.invoke(java.lang.Boolean.FALSE);
            return;
        }
        b6Var.f223598d = z5Var.f224142j;
        z5Var.f224137e.set(b6Var.f223597c);
        z5Var.f224135c = b6Var;
        z5Var.f224140h = this.f223998m;
        java.util.Objects.toString(z5Var);
        lVar.invoke(java.lang.Boolean.TRUE);
    }
}
