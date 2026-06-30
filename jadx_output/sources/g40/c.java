package g40;

/* loaded from: classes12.dex */
public final class c implements com.tencent.mm.modelcdntran.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g40.g f268669a;

    public c(g40.g gVar) {
        this.f268669a = gVar;
    }

    @Override // com.tencent.mm.modelcdntran.v2
    public void b(com.tencent.mm.modelcdntran.n1 n1Var) {
        if ((n1Var != null ? n1Var.f71107e : null) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileMsgDownloadHelper", "onProgress: event is null");
            return;
        }
        g40.g gVar = this.f268669a;
        com.tencent.mm.storage.f9 f9Var = gVar.f268679e;
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileMsgDownloadHelper", "onProgress: MsgInfo is null");
            return;
        }
        com.tencent.mm.pluginsdk.model.app.d a17 = bt3.c.a(gVar.f268677c, f9Var.getMsgId(), f9Var.Q0());
        if (a17 == null) {
            gVar.c(null);
            return;
        }
        gVar.f268678d = a17;
        dn.g gVar2 = n1Var.f71107e;
        if (gVar2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileMsgDownloadHelper", "onProgress: progressInfo is null");
            return;
        }
        a17.field_offset = gVar2.field_finishedLength;
        a17.field_totalLen = gVar2.field_toltalLength;
        com.tencent.mars.xlog.Log.i("MicroMsg.FileMsgDownloadHelper", "FileMsgDownloadHelper progress " + gVar2.field_finishedLength + '/' + gVar2.field_toltalLength + " offset:" + a17.field_offset);
        com.tencent.mm.pluginsdk.model.app.d dVar = gVar.f268678d;
        if (dVar != null) {
            if (dVar.field_offset != dVar.field_totalLen && dVar.field_status == 102) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FileMsgDownloadHelper", "cancel download, status:" + dVar.field_status);
                ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ai(gVar.f268680f);
            } else if (dVar.field_status == 199) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FileMsgDownloadHelper", "cancel download, status:" + dVar.field_status);
                dVar.field_offset = dVar.field_totalLen;
                ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ai(gVar.f268680f);
            }
            ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).update(dVar, new java.lang.String[0]);
            gVar.h(dVar.field_offset, dVar.field_totalLen);
        }
    }

    @Override // com.tencent.mm.modelcdntran.v2
    public void c(com.tencent.mm.modelcdntran.n1 n1Var) {
    }
}
