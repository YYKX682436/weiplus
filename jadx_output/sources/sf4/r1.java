package sf4;

/* loaded from: classes4.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407575d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(java.lang.String str) {
        super(0);
        this.f407575d = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        java.lang.Long l17;
        sf4.u1 u1Var = sf4.u1.f407583a;
        java.lang.String str = this.f407575d;
        java.util.Iterator it = sf4.u1.f407591i.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(str, ((sf4.q1) obj).f407573c)) {
                break;
            }
        }
        sf4.q1 q1Var = (sf4.q1) obj;
        if (q1Var != null) {
            sf4.u1.f407591i.remove(q1Var);
        }
        boolean z17 = true;
        if (sf4.u1.f407585c == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", "upgrades mediaId " + str + " runningMediaId " + sf4.u1.f407595m + " selectMediaId " + sf4.u1.f407596n);
            java.lang.Long l18 = sf4.u1.f407595m;
            long j17 = sf4.u1.f407596n;
            if (l18 == null || l18.longValue() != j17 || ((l17 = sf4.u1.f407595m) != null && l17.longValue() == 0)) {
                z17 = false;
            }
            u1Var.m(z17);
        }
        sf4.u1.f407584b.getClass();
        return jz5.f0.f302826a;
    }
}
