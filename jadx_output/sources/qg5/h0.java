package qg5;

/* loaded from: classes12.dex */
public final class h0 implements wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qg5.l0 f363007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.z f363008f;

    public h0(java.lang.String str, qg5.l0 l0Var, kotlinx.coroutines.z zVar) {
        this.f363006d = str;
        this.f363007e = l0Var;
        this.f363008f = zVar;
    }

    @Override // wf0.u1
    public final void h(wf0.r1 r1Var) {
        java.lang.String str = r1Var.f445529a;
        java.lang.String str2 = this.f363006d;
        if (kotlin.jvm.internal.o.b(str, str2)) {
            if (r1Var.f445531c == wf0.t1.DOWNLOAD) {
                ((vf0.y1) ((wf0.x1) ((jz5.n) this.f363007e.f363053o).getValue())).getClass();
                if (t21.d3.h(str2).f415011i == 198) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ChatRecordsStagingFeatureService", "[tryDownloadFile] video download failed " + str2);
                    ((kotlinx.coroutines.a0) this.f363008f).U(java.lang.Boolean.FALSE);
                }
            }
        }
    }
}
