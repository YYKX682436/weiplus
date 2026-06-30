package rk2;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk2.q f396468d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(rk2.q qVar) {
        super(2);
        this.f396468d = qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.tencent.mm.plugin.finder.live.plugin.zz zzVar = (com.tencent.mm.plugin.finder.live.plugin.zz) this.f396468d.f396470a;
        zzVar.getClass();
        if (!((mm2.c1) zzVar.P0(mm2.c1.class)).N1 && !((mm2.c1) zzVar.P0(mm2.c1.class)).T) {
            if (!(((mm2.n0) zzVar.P0(mm2.n0.class)).f329273r)) {
                df2.bh bhVar = (df2.bh) zzVar.U0(df2.bh.class);
                if (bhVar != null) {
                    bhVar.Z6(intValue, intValue2);
                }
                return jz5.f0.f302826a;
            }
        }
        zzVar.x1(0);
        return jz5.f0.f302826a;
    }
}
