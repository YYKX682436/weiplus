package q61;

/* loaded from: classes11.dex */
public final class f implements q61.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f360244a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f360245b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.z f360246c;

    public f(long j17, int i17, kotlinx.coroutines.z zVar) {
        this.f360244a = j17;
        this.f360245b = i17;
        this.f360246c = zVar;
    }

    @Override // q61.k
    public void a(boolean z17, r45.nf5 nf5Var) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f360244a;
        if (currentTimeMillis < this.f360245b) {
            q61.j.f360266f = true;
        } else {
            q61.j.f360266f = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PushLoginURLMainDeviceCGIPushLoginURLTAG3MainDeviceCGI", "cgi time " + currentTimeMillis);
        com.tencent.mars.xlog.Log.i("MicroMsg.PushLoginURLMainDeviceCGIPushLoginURLTAG3MainDeviceCGI", "cgi timeLimit " + this.f360245b);
        if (z17) {
            q61.j.f360263c = nf5Var;
            q61.j.f360262b = true;
        } else {
            q61.j.f360262b = false;
            q61.j.f360263c = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.PushLoginURLMainDeviceCGI", "TAGcheckLoginURLMainDevice fail block ");
        }
        com.tencent.mars.xlog.Log.i("PushLoginURLTAG3MainDeviceCGI", "checkDone");
        ((kotlinx.coroutines.a0) this.f360246c).U(java.lang.Boolean.valueOf(z17));
    }
}
