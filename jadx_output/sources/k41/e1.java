package k41;

/* loaded from: classes8.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j41.h0 f303984d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(j41.h0 h0Var) {
        super(0);
        this.f303984d = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getContactFromRemote url: ");
        j41.h0 h0Var = this.f303984d;
        sb6.append(h0Var.f297632b);
        sb6.append(", username: ");
        sb6.append(h0Var.f297633c);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuGetContactService", sb6.toString());
        k41.h1 h1Var = k41.h1.f304007d;
        gm0.j1.d().g(new l41.y(h0Var));
        return jz5.f0.f302826a;
    }
}
