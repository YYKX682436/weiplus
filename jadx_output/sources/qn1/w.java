package qn1;

/* loaded from: classes12.dex */
public class w implements sn1.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qn1.x f365025a;

    public w(qn1.x xVar) {
        this.f365025a = xVar;
    }

    public void a(boolean z17) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify resendSceneMap finish");
            sn1.o0 o0Var = sn1.i.f410021r;
            if (o0Var != null) {
                o0Var.f410063b = 0;
                return;
            }
            return;
        }
        qn1.c0 c0Var = this.f365025a.f365026a;
        kn1.g e17 = qn1.c.i().e();
        e17.getClass();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        c0Var.g(e17.f309609a);
    }
}
