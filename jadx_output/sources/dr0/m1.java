package dr0;

/* loaded from: classes.dex */
public final class m1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f242469d;

    public m1(long j17) {
        this.f242469d = j17;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.Manager", "pullUpProc, costMs=" + (((com.tencent.mm.ipcinvoker.type.IPCLong) obj).f68405d - this.f242469d));
    }
}
