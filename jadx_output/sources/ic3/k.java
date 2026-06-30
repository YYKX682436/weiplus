package ic3;

/* loaded from: classes12.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity f290407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xj.i f290408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290409f;

    public k(com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity, xj.i iVar, java.lang.String str) {
        this.f290407d = magicAdServiceDemoActivity;
        this.f290408e = iVar;
        this.f290409f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity = this.f290407d;
        java.lang.String str = magicAdServiceDemoActivity.f147850d;
        wj.w0 w0Var = wj.w0.f446542e;
        xj.i iVar = this.f290408e;
        ((wj.j0) iVar).mj(this.f290409f, w0Var, null);
        new android.os.Handler(magicAdServiceDemoActivity.getMainLooper()).postDelayed(new ic3.j(magicAdServiceDemoActivity, iVar), 1000L);
    }
}
