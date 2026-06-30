package hz4;

/* loaded from: classes12.dex */
public class z extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hz4.b0 f286479a;

    public z(hz4.b0 b0Var) {
        this.f286479a = b0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        hz4.b0 b0Var = this.f286479a;
        iz4.l lVar = b0Var.f286394m;
        if (lVar != null) {
            if (lVar.f296122z.booleanValue()) {
                b0Var.f286393l.G5();
                b0Var.f286394m.f296122z = java.lang.Boolean.FALSE;
            }
            iz4.l lVar2 = b0Var.f286394m;
            long j17 = b0Var.f286383b;
            long j18 = 0;
            if (j17 != 0) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                j18 = android.os.SystemClock.elapsedRealtime() - j17;
            }
            lVar2.f296160u = (int) c31.a.a(j18);
        }
        sendEmptyMessageDelayed(4096, 250L);
    }
}
