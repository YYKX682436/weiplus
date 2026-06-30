package ty0;

/* loaded from: classes14.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.MJMusicInfo f423008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f423009e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.maas.model.MJMusicInfo mJMusicInfo, yz5.a aVar) {
        super(2);
        this.f423008d = mJMusicInfo;
        this.f423009e = aVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj3 = n0.e1.f333492a;
        ty0.z0.j(this.f423008d, this.f423009e, oVar, 8);
        return jz5.f0.f302826a;
    }
}
