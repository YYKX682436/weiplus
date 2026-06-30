package cw2;

/* loaded from: classes15.dex */
public final class n5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.d6 f223883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f223884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f223885f;

    public n5(cw2.d6 d6Var, android.content.Context context, yz5.l lVar) {
        this.f223883d = d6Var;
        this.f223884e = context;
        this.f223885f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean init = this.f223883d.f223649c.init(com.tencent.mm.mmpostprocessing.MMPostProcessing.INSTANCE.loadShaderDescs(this.f223884e), false);
        yz5.l lVar = this.f223885f;
        if (init) {
            com.tencent.mars.xlog.Log.i("FinderThumbPlayerPostProcessor", "Init post processor. instance=" + cw2.d6.f223645g);
            lVar.invoke(java.lang.Boolean.TRUE);
            return;
        }
        com.tencent.mars.xlog.Log.e("FinderThumbPlayerPostProcessor", "Init post processor failed. instance=" + cw2.d6.f223645g);
        lVar.invoke(java.lang.Boolean.FALSE);
    }
}
