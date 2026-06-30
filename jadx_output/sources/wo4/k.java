package wo4;

/* loaded from: classes8.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.l f448270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f448271e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(wo4.l lVar, yz5.p pVar) {
        super(1);
        this.f448270d = lVar;
        this.f448271e = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.nio.IntBuffer it = (java.nio.IntBuffer) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogDecoder", "on Snapshot callback, frameCount:" + this.f448270d.f448276e);
        yz5.p pVar = this.f448271e;
        if (pVar != null) {
            pVar.invoke(it, java.lang.Integer.valueOf(this.f448270d.f448276e));
        }
        return jz5.f0.f302826a;
    }
}
