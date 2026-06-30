package kj1;

/* loaded from: classes9.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj1.m f308292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f308293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher$WxaShortLinkLaunchParams f308294f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f308295g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kj1.m mVar, android.app.Activity activity, com.tencent.mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher$WxaShortLinkLaunchParams absWxaShortLinkLauncher$WxaShortLinkLaunchParams, yz5.l lVar) {
        super(1);
        this.f308292d = mVar;
        this.f308293e = activity;
        this.f308294f = absWxaShortLinkLauncher$WxaShortLinkLaunchParams;
        this.f308295g = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f308292d.c(this.f308293e, this.f308294f.f88869h, booleanValue);
        yz5.l lVar = this.f308295g;
        if (lVar != null) {
            lVar.invoke(booleanValue ? kj1.g0.f308326d : kj1.g0.f308332m);
        }
        return jz5.f0.f302826a;
    }
}
