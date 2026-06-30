package pk1;

/* loaded from: classes7.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f355436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mk1.b0 f355437e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.os.Handler handler, mk1.b0 b0Var) {
        super(0);
        this.f355436d = handler;
        this.f355437e = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandThumbExoCompositeMediaPlayerProvider", "provide, AppBrandThumbMediaPlayer");
        pk1.f fVar = pk1.q.O;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pk1.q b17 = pk1.f.b(fVar, context, this.f355436d.getLooper(), false, this.f355437e, 4, null);
        if (b17 != null) {
            return b17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandThumbExoCompositeMediaPlayerProvider", "provide, SystemMediaPlayer");
        return new ye1.e0();
    }
}
