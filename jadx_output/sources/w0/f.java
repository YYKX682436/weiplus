package w0;

/* loaded from: classes14.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0.s f441835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441836e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f441837f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f441838g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(w0.s sVar, java.lang.String str, n0.v2 v2Var, java.lang.Object obj) {
        super(1);
        this.f441835d = sVar;
        this.f441836e = str;
        this.f441837f = v2Var;
        this.f441838g = obj;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        n0.v2 v2Var = this.f441837f;
        java.lang.Object obj2 = this.f441838g;
        w0.s sVar = this.f441835d;
        w0.e eVar = new w0.e(v2Var, obj2, sVar);
        java.lang.Object invoke = eVar.invoke();
        if (invoke == null || sVar.b(invoke)) {
            return new w0.c(sVar.d(this.f441836e, eVar));
        }
        if (invoke instanceof x0.e0) {
            n0.q4 q4Var = (n0.q4) ((x0.e0) invoke);
            n0.w2 w2Var = n0.w2.f333739a;
            n0.r4 r4Var = q4Var.f333688d;
            if (r4Var == w2Var || r4Var == n0.h5.f333529a || r4Var == n0.c4.f333474a) {
                str = "MutableState containing " + q4Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            str = invoke + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
        }
        throw new java.lang.IllegalArgumentException(str);
    }
}
