package xe3;

/* loaded from: classes15.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f453957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ve3.o f453958e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z17, ve3.o oVar) {
        super(1);
        this.f453957d = z17;
        this.f453958e = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xe3.f it = (xe3.f) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ve3.o callback = this.f453958e;
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_item", "setMute " + it);
        it.f453944d.setOutputMute(this.f453957d);
        return jz5.f0.f302826a;
    }
}
