package j11;

/* loaded from: classes11.dex */
public class l implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f297130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j11.h f297131e;

    public l(j11.h hVar, java.lang.String str) {
        this.f297131e = hVar;
        this.f297130d = str;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() != 881) {
            return 0;
        }
        j11.h hVar = this.f297131e;
        hVar.f297112a = false;
        java.lang.String str2 = this.f297130d;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GetContactService", "tryStartNetscene onSceneEnd openImUser errType: %s  errCode: %s username %s will retry/del ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
            if (i17 == 4) {
                j11.q.Ai().m0(str2);
            }
            hVar.f297119h.c(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            hVar.l(str2, false);
            return 0;
        }
        if (!((java.util.ArrayList) hVar.f297115d).isEmpty() && hVar.f297119h.e()) {
            hVar.f297119h.c(500L, 500L);
        }
        l41.j0.b((r45.ck3) oVar.f70711b.f70700a);
        com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "getopenimcontact onResult %s %s", java.lang.Boolean.valueOf(j11.q.Ai().m0(str2)), str2);
        hVar.l(str2, true);
        return 0;
    }
}
