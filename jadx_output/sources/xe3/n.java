package xe3;

/* loaded from: classes15.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ve3.o f453959d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ve3.o oVar) {
        super(1);
        this.f453959d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xe3.f it = (xe3.f) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ve3.o callback = this.f453959d;
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_item", "stopPlay " + it);
        rh3.r rVar = it.f453944d;
        if (!rVar.isPlaying()) {
            com.tencent.mars.xlog.Log.e("MB_External_surface_video_item", "stopPlay already stopped " + it);
            ((xd3.c) callback).b(-1, "not playing");
        }
        rVar.stop();
        return jz5.f0.f302826a;
    }
}
