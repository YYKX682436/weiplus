package ty0;

/* loaded from: classes14.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.MJMusicInfo f423034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f423035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f423036f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.maas.model.MJMusicInfo mJMusicInfo, yz5.a aVar, int i17) {
        super(2);
        this.f423034d = mJMusicInfo;
        this.f423035e = aVar;
        this.f423036f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f423036f | 1;
        ty0.z0.j(this.f423034d, this.f423035e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
