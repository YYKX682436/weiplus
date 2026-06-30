package gf0;

/* loaded from: classes15.dex */
public final class l implements gf0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gf0.r f271221a;

    public l(gf0.r rVar) {
        this.f271221a = rVar;
    }

    public void a(int i17, java.lang.String recordFilePath) {
        kotlin.jvm.internal.o.g(recordFilePath, "recordFilePath");
        gf0.r rVar = this.f271221a;
        gf0.u uVar = rVar.f271232e;
        gf0.u uVar2 = gf0.u.f271246f;
        if (uVar == uVar2) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioRecorderService", "Finish Record");
        rVar.f271232e = uVar2;
        d75.b.g(new gf0.m(rVar, i17, recordFilePath));
    }
}
