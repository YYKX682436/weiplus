package r36;

/* loaded from: classes16.dex */
public final class r extends m36.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r36.z f369457e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(r36.z zVar) {
        super("OkHttp %s ping", zVar.f369474g);
        this.f369457e = zVar;
    }

    @Override // m36.b
    public void a() {
        r36.z zVar;
        boolean z17;
        synchronized (this.f369457e) {
            zVar = this.f369457e;
            long j17 = zVar.f369482r;
            long j18 = zVar.f369481q;
            if (j17 < j18) {
                z17 = true;
            } else {
                zVar.f369481q = j18 + 1;
                z17 = false;
            }
        }
        if (z17) {
            zVar.b();
            return;
        }
        try {
            zVar.A.j(false, 1, 0);
        } catch (java.io.IOException unused) {
            zVar.b();
        }
    }
}
