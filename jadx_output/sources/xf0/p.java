package xf0;

/* loaded from: classes12.dex */
public final class p implements com.tencent.mm.modelcdntran.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xf0.i f454208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xf0.s f454209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dn.o f454210c;

    public p(xf0.i iVar, xf0.s sVar, dn.o oVar) {
        this.f454208a = iVar;
        this.f454209b = sVar;
        this.f454210c = oVar;
    }

    @Override // com.tencent.mm.modelcdntran.v2
    public void a(com.tencent.mm.modelcdntran.n1 n1Var) {
        dn.h hVar;
        t21.v2 v2Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadMsgVideo[");
        xf0.i iVar = this.f454208a;
        sb6.append(iVar.f454182j);
        sb6.append("] onEnd: ");
        sb6.append(n1Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.Receive.MsgVideoSyncDownloadFSC", sb6.toString());
        if (n1Var == null || (hVar = n1Var.f71108f) == null) {
            return;
        }
        if (hVar.field_retCode == 0) {
            iVar.f454184l.put("actual_video_format", java.lang.Integer.valueOf(hVar.field_videoFormat));
        }
        if (!iVar.f454180h || (v2Var = iVar.f454179g) == null) {
            return;
        }
        if (hVar.field_retCode != 0) {
            if (iVar.f454190r) {
                return;
            }
            v2Var.f415011i = nd1.d1.CTRL_INDEX;
            v2Var.U = 256;
            vf0.m3.k(v2Var);
            return;
        }
        v2Var.f415011i = 199;
        long k17 = com.tencent.mm.vfs.w6.k(this.f454210c.field_fullpath);
        int i17 = (int) k17;
        v2Var.f415007e = i17;
        v2Var.f415008f = i17;
        v2Var.U = v2Var.U | 256 | 16 | 32;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.Receive.MsgVideoSyncDownloadFSC", "update video info totalLen=" + k17);
        vf0.m3.k(v2Var);
    }

    @Override // com.tencent.mm.modelcdntran.v2
    public void b(com.tencent.mm.modelcdntran.n1 n1Var) {
        dn.g gVar;
        dn.g gVar2;
        xf0.i iVar = this.f454208a;
        java.lang.String str = iVar.f454182j;
        java.util.Objects.toString(n1Var);
        long j17 = (n1Var == null || (gVar2 = n1Var.f71107e) == null) ? 0L : gVar2.field_finishedLength;
        long j18 = (n1Var == null || (gVar = n1Var.f71107e) == null) ? 0L : gVar.field_toltalLength;
        float e17 = j18 > 0 ? e06.p.e(((float) j17) / ((float) j18), 0.0f, 1.0f) : 0.0f;
        xf0.g gVar3 = new xf0.g(iVar, xf0.h.f454170e);
        gVar3.f454168c = e17;
        this.f454209b.W6(gVar3);
    }

    @Override // com.tencent.mm.modelcdntran.v2
    public void c(com.tencent.mm.modelcdntran.n1 n1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadMsgVideo[");
        xf0.i iVar = this.f454208a;
        sb6.append(iVar.f454182j);
        sb6.append("] onStart: ");
        sb6.append(n1Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.Receive.MsgVideoSyncDownloadFSC", sb6.toString());
        this.f454209b.W6(new xf0.g(iVar, xf0.h.f454169d));
    }
}
