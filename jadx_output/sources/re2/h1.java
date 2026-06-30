package re2;

/* loaded from: classes3.dex */
public final class h1 extends re2.e0 {

    /* renamed from: r, reason: collision with root package name */
    public final int f394426r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f394427s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(int i17, java.lang.String initiatorFinderUsername) {
        super(initiatorFinderUsername);
        kotlin.jvm.internal.o.g(initiatorFinderUsername, "initiatorFinderUsername");
        this.f394426r = i17;
        this.f394427s = "Finder.CoLiveTask";
    }

    @Override // re2.e0
    public java.lang.String c() {
        return this.f394427s;
    }

    public final void k(yz5.a aVar, yz5.p pVar) {
        re2.a0 a0Var = this.f394389b;
        re2.a0 a0Var2 = re2.a0.f394355d;
        java.lang.String str = this.f394427s;
        if (a0Var != a0Var2) {
            com.tencent.mars.xlog.Log.w(str, "create: invalid phase=" + this.f394389b);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("create: settlementMode=");
        int i17 = this.f394426r;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        re2.f1 f1Var = new re2.f1(this, aVar);
        re2.g1 g1Var = new re2.g1(this, pVar);
        com.tencent.mars.xlog.Log.i("Finder.CoLiveRequestHelper", "createInvitation: settlementMode=" + i17);
        new ek2.o(i17, new re2.a1(f1Var, g1Var)).l();
    }
}
