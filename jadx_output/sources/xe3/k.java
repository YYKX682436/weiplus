package xe3;

/* loaded from: classes15.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f453953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ve3.o f453954e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j17, ve3.o oVar) {
        super(1);
        this.f453953d = j17;
        this.f453954e = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xe3.f it = (xe3.f) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ve3.o callback = this.f453954e;
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_item", "seek " + it);
        it.f453944d.seekTo(this.f453953d);
        return jz5.f0.f302826a;
    }
}
