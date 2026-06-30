package yf0;

/* loaded from: classes12.dex */
public final class j implements com.tencent.mm.modelcdntran.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yf0.m f461566a;

    public j(yf0.m mVar) {
        this.f461566a = mVar;
    }

    @Override // com.tencent.mm.modelcdntran.v2
    public void b(com.tencent.mm.modelcdntran.n1 n1Var) {
        yf0.m mVar = this.f461566a;
        zf0.v0 v0Var = mVar.f461586a;
        oi3.h hVar = v0Var.f472563i.f436178e;
        if (hVar == null || n1Var == null || n1Var.f71103a != com.tencent.mm.modelcdntran.m1.f71080i) {
            return;
        }
        java.lang.Integer e17 = qi3.c.e(v0Var, false, 1, null);
        if (e17 != null) {
            e17.intValue();
            dn.m mVar2 = n1Var.f71106d;
            java.lang.String str = mVar2 != null ? mVar2.field_mediaId : null;
            if (str == null) {
                str = "";
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.VideoCdnSendApi", mVar.f461586a.id() + " uploading compress video and found cancel,cancel cdn mediaid :" + str + ' ');
            ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Bi(str);
            return;
        }
        if (mVar.f461586a.f363677f == qi3.g0.f363709h) {
            dn.g gVar = n1Var.f71107e;
            long j17 = gVar != null ? gVar.field_finishedLength : 0L;
            long j18 = gVar != null ? gVar.field_toltalLength : 0L;
            t21.v2 e18 = vf0.m3.e(hVar);
            if (e18 != null) {
                vf0.m3.m(e18, j17);
            }
            zf0.v0 v0Var2 = mVar.f461586a;
            v0Var2.f472570s = j17;
            v0Var2.f472571t = j18;
            v0Var2.J();
        }
    }

    @Override // com.tencent.mm.modelcdntran.v2
    public void c(com.tencent.mm.modelcdntran.n1 n1Var) {
        if (n1Var != null) {
            java.lang.Integer e17 = qi3.c.e(this.f461566a.f461586a, false, 1, null);
            if (e17 != null) {
                e17.intValue();
                sx.b0 b0Var = (sx.b0) i95.n0.c(sx.b0.class);
                dn.m mVar = n1Var.f71106d;
                java.lang.String str = mVar != null ? mVar.field_mediaId : null;
                if (str == null) {
                    str = "";
                }
                ((rx.f) b0Var).Bi(str);
            }
        }
    }
}
