package xe3;

/* loaded from: classes15.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ve3.o f453952d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ve3.o oVar) {
        super(1);
        this.f453952d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xe3.f it = (xe3.f) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ve3.o callback = this.f453952d;
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_item", "resumePlay " + it);
        it.f453944d.start();
        return jz5.f0.f302826a;
    }
}
