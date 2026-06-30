package yn1;

/* loaded from: classes11.dex */
public final class b0 extends oz5.a implements kotlinx.coroutines.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.c0 f463614d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(kotlinx.coroutines.q0 q0Var, yn1.c0 c0Var) {
        super(q0Var);
        this.f463614d = c0Var;
    }

    @Override // kotlinx.coroutines.r0
    public void handleException(oz5.l lVar, java.lang.Throwable th6) {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.printErrStackTrace(this.f463614d.f463622f, th6, th6.getMessage(), new java.lang.Object[0]);
        int i18 = rl.b.f397143a;
        throw th6;
    }
}
