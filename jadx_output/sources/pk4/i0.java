package pk4;

/* loaded from: classes15.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.c f356493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView f356494e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(kk4.c cVar, com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView thumbPlayerSurfaceView) {
        super(0);
        this.f356493d = cVar;
        this.f356494e = thumbPlayerSurfaceView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f356493d.release();
        com.tencent.mars.xlog.Log.i(this.f356494e.f174575d, "Player instance has been released");
        return jz5.f0.f302826a;
    }
}
