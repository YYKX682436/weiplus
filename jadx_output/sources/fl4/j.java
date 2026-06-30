package fl4;

/* loaded from: classes11.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.media.TingMediaBrowserService f263936d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.ting.media.TingMediaBrowserService tingMediaBrowserService) {
        super(0);
        this.f263936d = tingMediaBrowserService;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new fl4.g(new java.lang.ref.WeakReference((java.lang.Runnable) ((jz5.n) this.f263936d.G).getValue()));
    }
}
