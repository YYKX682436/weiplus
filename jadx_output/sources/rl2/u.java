package rl2;

/* loaded from: classes8.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l75.a1 f397211e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.String str, l75.a1 a1Var) {
        super(0);
        this.f397210d = str;
        this.f397211e = a1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rl2.n nVar = rl2.v.f397212e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyConversationChanged ");
        java.lang.String str = this.f397210d;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveTipsBarStorage", sb6.toString());
        l75.a1 a1Var = this.f397211e;
        a1Var.b(3, a1Var, str);
        return jz5.f0.f302826a;
    }
}
