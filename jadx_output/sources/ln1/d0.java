package ln1;

/* loaded from: classes12.dex */
public class d0 implements sn1.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ln1.c0 f319747a;

    public d0(ln1.c0 c0Var) {
        this.f319747a = c0Var;
    }

    public void a(boolean z17, java.lang.String str, int i17, int i18) {
        long j17 = i17;
        this.f319747a.f319730a.f319811l += j17;
        sn1.i.f410019p.f410087d += j17;
        ln1.r rVar = ln1.s.f319797r;
        rVar.f319796k.addAndGet(-j17);
        rVar.f319791f.c();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupFlowQueue", "releaseCacheSize [%d]", java.lang.Long.valueOf(rVar.f319796k.get()));
    }
}
