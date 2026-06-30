package y80;

/* loaded from: classes10.dex */
public final class h0 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y80.k0 f459854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f459855b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f459856c;

    public h0(y80.k0 k0Var, long j17, yz5.l lVar) {
        this.f459854a = k0Var;
        this.f459855b = j17;
        this.f459856c = lVar;
    }

    @Override // j35.b0
    public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        kotlin.jvm.internal.o.d(iArr);
        boolean z17 = ((iArr.length == 0) ^ true) && iArr[0] == 0;
        y80.k0 k0Var = this.f459854a;
        yz5.l lVar = this.f459856c;
        if (z17) {
            k0Var.wi(this.f459855b, lVar);
        } else {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
        com.tencent.mars.xlog.Log.i(k0Var.f459872d, "systemPermissionReqCallback: success=" + z17 + ", " + strArr.length + ", ");
    }
}
