package ty0;

/* loaded from: classes5.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.MJMusicInfo f423024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ty0.a1 f423025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f423026f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f423027g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.tencent.maas.model.MJMusicInfo mJMusicInfo, ty0.a1 a1Var, yz5.a aVar, int i17) {
        super(2);
        this.f423024d = mJMusicInfo;
        this.f423025e = a1Var;
        this.f423026f = aVar;
        this.f423027g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f423027g | 1;
        ty0.a1 a1Var = this.f423025e;
        yz5.a aVar = this.f423026f;
        ty0.z0.f(this.f423024d, a1Var, aVar, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
