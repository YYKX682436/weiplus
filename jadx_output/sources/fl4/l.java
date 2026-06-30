package fl4;

/* loaded from: classes11.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.media.TingMediaBrowserService f263938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tl4.e f263939e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.ting.media.TingMediaBrowserService tingMediaBrowserService, tl4.e eVar) {
        super(0);
        this.f263938d = tingMediaBrowserService;
        this.f263939e = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.support.v4.media.session.f0 f0Var = this.f263938d.f174692o;
        if (f0Var != null) {
            f0Var.f(this.f263939e, null);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("mSession");
        throw null;
    }
}
