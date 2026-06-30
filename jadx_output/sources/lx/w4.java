package lx;

/* loaded from: classes.dex */
public final class w4 implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f321997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f321998b;

    public w4(boolean z17, java.lang.ref.WeakReference weakReference) {
        this.f321997a = z17;
        this.f321998b = weakReference;
    }

    @Override // l81.e1
    public void a() {
        com.tencent.pigeon.biz.BizPersonalCenterNativeToFlutterApi bizPersonalCenterNativeToFlutterApi;
        if (!this.f321997a || (bizPersonalCenterNativeToFlutterApi = (com.tencent.pigeon.biz.BizPersonalCenterNativeToFlutterApi) this.f321998b.get()) == null) {
            return;
        }
        bizPersonalCenterNativeToFlutterApi.requestAcct(true, lx.u4.f321972d);
    }

    @Override // l81.e1
    public void b() {
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
    }

    @Override // l81.e1
    public void e() {
    }

    @Override // l81.e1
    public void f(boolean z17) {
        com.tencent.pigeon.biz.BizPersonalCenterNativeToFlutterApi bizPersonalCenterNativeToFlutterApi;
        if (!this.f321997a || (bizPersonalCenterNativeToFlutterApi = (com.tencent.pigeon.biz.BizPersonalCenterNativeToFlutterApi) this.f321998b.get()) == null) {
            return;
        }
        bizPersonalCenterNativeToFlutterApi.requestAcct(true, lx.v4.f321987d);
    }
}
