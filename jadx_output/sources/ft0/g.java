package ft0;

/* loaded from: classes14.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ms0.c f266469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ft0.h f266470e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ms0.c cVar, ft0.h hVar) {
        super(1);
        this.f266469d = cVar;
        this.f266470e = hVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.SurfaceTexture it = (android.graphics.SurfaceTexture) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ms0.c cVar = this.f266469d;
        is0.c j17 = cVar.j();
        int i17 = j17 != null ? j17.f294395e : -1;
        cVar.f330957m = i17;
        os0.a aVar = cVar.f330951g;
        if (aVar != null) {
            aVar.r(i17);
        }
        this.f266470e.f266460a.requestRender();
        return jz5.f0.f302826a;
    }
}
