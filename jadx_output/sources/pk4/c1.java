package pk4;

/* loaded from: classes15.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.c f356468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView f356469e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(kk4.c cVar, com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView) {
        super(0);
        this.f356468d = cVar;
        this.f356469e = thumbPlayerVideoView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f356468d.release();
        com.tencent.mars.xlog.Log.i(this.f356469e.f174596h, "Player instance has been released");
        return jz5.f0.f302826a;
    }
}
