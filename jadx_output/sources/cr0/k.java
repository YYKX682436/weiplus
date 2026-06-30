package cr0;

/* loaded from: classes12.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.AccNetworkStats f221663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.AccNetworkStats f221664e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.matrix.battery.AccNetworkStats accNetworkStats, com.tencent.mm.matrix.battery.AccNetworkStats accNetworkStats2) {
        super(0);
        this.f221663d = accNetworkStats;
        this.f221664e = accNetworkStats2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f221663d.merge(this.f221664e);
        return jz5.f0.f302826a;
    }
}
