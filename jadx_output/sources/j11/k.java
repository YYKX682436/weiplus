package j11;

/* loaded from: classes11.dex */
public class k implements o65.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f297128a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j11.h f297129b;

    public k(j11.h hVar, java.lang.String str) {
        this.f297129b = hVar;
        this.f297128a = str;
    }

    @Override // o65.c, o65.b
    /* renamed from: b */
    public void a(int i17, int i18, java.lang.String str, o65.c cVar) {
        j11.h hVar = this.f297129b;
        hVar.f297112a = false;
        java.lang.String str2 = this.f297128a;
        if (i17 == 0 && i18 == 0) {
            if (!((java.util.ArrayList) hVar.f297115d).isEmpty() && hVar.f297119h.e()) {
                hVar.f297119h.c(500L, 500L);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ActionCallbackFunc", "getChatRoomInfoDetail onResult %s %s", java.lang.Boolean.valueOf(j11.q.Ai().m0(str2)), str2);
            hVar.l(str2, true);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ActionCallbackFunc", "tryStartNetscene onSceneEnd openRoom errType:" + i17 + " errCode:" + i18 + " will retry");
        hVar.f297119h.c(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        hVar.l(str2, false);
    }
}
