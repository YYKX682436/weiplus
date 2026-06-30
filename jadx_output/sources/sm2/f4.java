package sm2;

/* loaded from: classes3.dex */
public final class f4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f409454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.q f409455e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(boolean z17, km2.q qVar) {
        super(1);
        this.f409454d = z17;
        this.f409455e = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean D0;
        km2.q micUser = (km2.q) obj;
        kotlin.jvm.internal.o.g(micUser, "micUser");
        boolean z17 = this.f409454d;
        km2.q qVar = this.f409455e;
        if (z17) {
            D0 = com.tencent.mm.sdk.platformtools.t8.D0(micUser.f309175f, qVar.f309175f);
        } else {
            D0 = com.tencent.mm.sdk.platformtools.t8.D0(micUser.f309170a, qVar.f309170a);
        }
        return java.lang.Boolean.valueOf(D0);
    }
}
