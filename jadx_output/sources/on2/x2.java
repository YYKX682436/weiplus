package on2;

/* loaded from: classes3.dex */
public final class x2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km2.z f347070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on2.z2 f347071e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(km2.z zVar, on2.z2 z2Var) {
        super(0);
        this.f347070d = zVar;
        this.f347071e = z2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.cz1 cz1Var;
        r45.cz1 cz1Var2;
        r45.cz1 cz1Var3;
        r45.cz1 cz1Var4;
        km2.z zVar = this.f347070d;
        java.lang.String string = (zVar == null || (cz1Var4 = zVar.f309232d) == null) ? null : cz1Var4.getString(0);
        int integer = (zVar == null || (cz1Var3 = zVar.f309232d) == null) ? 0 : cz1Var3.getInteger(7);
        on2.z2 z2Var = this.f347071e;
        km2.z zVar2 = z2Var.f347092m;
        java.lang.String string2 = (zVar2 == null || (cz1Var2 = zVar2.f309232d) == null) ? null : cz1Var2.getString(0);
        km2.z zVar3 = z2Var.f347092m;
        int integer2 = (zVar3 == null || (cz1Var = zVar3.f309232d) == null) ? 0 : cz1Var.getInteger(7);
        if (!(string == null || string.length() == 0) && kotlin.jvm.internal.o.b(string2, string)) {
            km2.z zVar4 = z2Var.f347092m;
            if (zVar4 != null) {
                zVar4.f309232d = zVar.f309232d;
            }
            if (zVar4 != null) {
                zVar4.f309233e = zVar.f309233e;
            }
            if (integer < integer2) {
                r45.cz1 cz1Var5 = zVar4 != null ? zVar4.f309232d : null;
                if (cz1Var5 != null) {
                    cz1Var5.set(7, java.lang.Integer.valueOf(integer2));
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLotterySlice", "updateLocalLotteryInfo:" + z2Var.f347092m + ",remoteParticipateCount:" + integer + ",curParticipateCount:" + integer2);
        return jz5.f0.f302826a;
    }
}
