package lx;

/* loaded from: classes.dex */
public final class q1 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lx.r1 f321919b;

    public q1(yz5.l lVar, lx.r1 r1Var) {
        this.f321918a = lVar;
        this.f321919b = r1Var;
    }

    @Override // j35.b0
    public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        kotlin.jvm.internal.o.d(iArr);
        boolean z17 = ((iArr.length == 0) ^ true) && iArr[0] == 0;
        yz5.l lVar = this.f321918a;
        lx.r1 r1Var = this.f321919b;
        if (z17) {
            r1Var.d(new lx.p1(lVar));
            return;
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
        r1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizLocationPlugin", "requestLocationWithSystemAuth system permission denied");
    }
}
