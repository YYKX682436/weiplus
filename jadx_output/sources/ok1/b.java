package ok1;

/* loaded from: classes7.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f345962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mk1.b0 f345963e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.os.Handler handler, mk1.b0 b0Var) {
        super(0);
        this.f345962d = handler;
        this.f345963e = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSysExoCompositeMediaPlayerProvider", "provide, AppBrandThumbMediaPlayer");
        pk1.f fVar = pk1.q.O;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pk1.q b17 = pk1.f.b(fVar, context, this.f345962d.getLooper(), false, this.f345963e, 4, null);
        if (b17 != null) {
            return b17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSysExoCompositeMediaPlayerProvider", "provide, SystemMediaPlayer");
        return new ye1.e0();
    }
}
