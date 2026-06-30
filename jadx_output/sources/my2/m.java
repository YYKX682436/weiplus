package my2;

/* loaded from: classes3.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my2.u f332755d;

    public m(my2.u uVar) {
        this.f332755d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qo0.c.a(this.f332755d.f332764e, qo0.b.f365419u2, null, 2, null);
        r45.me2 me2Var = ((mm2.c1) this.f332755d.f332763d.a(mm2.c1.class)).f328784b6;
        int integer = me2Var != null ? me2Var.getInteger(9) : 0;
        ((ku5.t0) ku5.t0.f312615d).A(this.f332755d.f332767h);
        ku5.u0 u0Var = ku5.t0.f312615d;
        my2.u uVar = this.f332755d;
        ((ku5.t0) u0Var).l(uVar.f332768i, integer * 1000, uVar.f332767h);
        com.tencent.mars.xlog.Log.i(this.f332755d.f332765f, "force show voteInfo clear task execute");
    }
}
