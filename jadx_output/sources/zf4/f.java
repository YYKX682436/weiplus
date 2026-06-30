package zf4;

/* loaded from: classes13.dex */
public class f implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zf4.g f472655d;

    public f(zf4.g gVar) {
        this.f472655d = gVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        zf4.g gVar = this.f472655d;
        zf4.q c17 = zf4.r.c(gVar.f472658f);
        java.lang.String str = gVar.f472658f;
        if (c17 != null) {
            int i17 = c17.field_status;
            if ((i17 > 1 && i17 <= 3) || i17 == 8) {
                if (3 != i17 && 8 != i17) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    if ((currentTimeMillis / 1000) - c17.field_lastmodifytime > 30) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoiceRemind", "Error ModifyTime in Read file:" + str);
                        gVar.f472660h = fp.k.a() + 10000;
                        gVar.f472656d.onSceneEnd(3, -1, "doScene failed", gVar);
                        return false;
                    }
                    if (currentTimeMillis - gVar.f472659g < 2000 || zf4.r.d(str).b(c17.field_offset, 6000).f472666b < 2000) {
                        return true;
                    }
                }
                if (gVar.doScene(gVar.dispatcher(), gVar.f472656d) == -1) {
                    gVar.f472660h = fp.k.a() + 10000;
                    gVar.f472656d.onSceneEnd(3, -1, "doScene failed", gVar);
                }
                return false;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoiceRemind", "Get info Failed file:" + str);
        gVar.f472660h = fp.k.a() + 10000;
        gVar.f472656d.onSceneEnd(3, -1, "doScene failed", gVar);
        return false;
    }
}
