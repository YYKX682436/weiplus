package g40;

/* loaded from: classes12.dex */
public final class a implements com.tencent.mm.modelcdntran.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g40.g f268660a;

    public a(g40.g gVar) {
        this.f268660a = gVar;
    }

    @Override // com.tencent.mm.modelcdntran.q0
    public void a(com.tencent.mm.modelcdntran.n1 event) {
        i40.b bVar;
        i40.b bVar2;
        i40.b bVar3;
        kotlin.jvm.internal.o.g(event, "event");
        if (event.f71103a == com.tencent.mm.modelcdntran.m1.f71085q) {
            g40.g gVar = this.f268660a;
            com.tencent.mars.xlog.Log.i("MicroMsg.FileMsgDownloadHelper", "onTask cancel mediaId:%s", gVar.f268680f);
            com.tencent.mm.storage.f9 f9Var = gVar.f268679e;
            if (f9Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FileMsgDownloadHelper", "onTask cancel MsgInfo is null");
                java.lang.ref.WeakReference weakReference = gVar.f268687m;
                if (weakReference == null || (bVar3 = (i40.b) weakReference.get()) == null) {
                    return;
                }
                bVar3.a(3, -2, "can not find msgInfo");
                return;
            }
            gVar.f268678d = ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).J0(f9Var.getMsgId(), f9Var.Q0());
            if (gVar.f268678d == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileMsgDownloadHelper", "pause get by msgid  %s null then get by mediaId %s", java.lang.Long.valueOf(f9Var.getMsgId()), gVar.f268677c);
                gVar.f268678d = ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).D0(gVar.f268677c);
            }
            com.tencent.mm.pluginsdk.model.app.d dVar = gVar.f268678d;
            if (dVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FileMsgDownloadHelper", "onTask cancel AppAttachInfo is null");
                java.lang.ref.WeakReference weakReference2 = gVar.f268687m;
                if (weakReference2 == null || (bVar2 = (i40.b) weakReference2.get()) == null) {
                    return;
                }
                bVar2.a(3, -2, "can not find appAttachInfo");
                return;
            }
            dVar.field_status = 102L;
            com.tencent.mars.xlog.Log.i("MicroMsg.FileMsgDownloadHelper", "pause done %s", java.lang.Boolean.valueOf(((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).update(dVar, new java.lang.String[0])));
            java.lang.ref.WeakReference weakReference3 = gVar.f268687m;
            if (weakReference3 != null && (bVar = (i40.b) weakReference3.get()) != null) {
                bVar.b();
            }
            gVar.f268686l = null;
        }
    }
}
