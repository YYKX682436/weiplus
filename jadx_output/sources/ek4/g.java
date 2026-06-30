package ek4;

/* loaded from: classes12.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f253642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253643e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dn.g f253644f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dn.h f253645g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253646h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ek4.s sVar, java.lang.String str, dn.g gVar, dn.h hVar, java.lang.String str2) {
        super(0);
        this.f253642d = sVar;
        this.f253643e = str;
        this.f253644f = gVar;
        this.f253645g = hVar;
        this.f253646h = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ek4.s sVar = this.f253642d;
        java.util.HashMap hashMap = sVar.f253685a;
        java.lang.String str = this.f253643e;
        dn.o oVar = (dn.o) hashMap.get(str);
        if (oVar != null) {
            java.lang.String str2 = this.f253646h;
            dn.n nVar = oVar.f241815c2;
            if (nVar != null) {
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = sVar.f253689e;
                dn.g gVar = this.f253644f;
                if (gVar != null) {
                    ek4.s.a(sVar);
                    com.tencent.mars.xlog.Log.i("MicroMsg.TP.CdnTaskController", "callback by CdnTaskController onProgress mediaId:" + str2 + " progressFinishLength:" + gVar.field_finishedLength);
                    nVar.f(str2, gVar.field_finishedLength, gVar.field_toltalLength);
                    java.lang.String field_mediaId = oVar.field_mediaId;
                    kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
                    ek4.t.b(copyOnWriteArrayList, field_mediaId, gVar.field_finishedLength, gVar.field_toltalLength);
                }
                dn.h hVar = this.f253645g;
                if (hVar != null) {
                    ek4.s.a(sVar);
                    com.tencent.mars.xlog.Log.i("MicroMsg.TP.CdnTaskController", "callback by CdnTaskController onFinish mediaId:" + str2 + " sceneResultRet:" + hVar.field_retCode);
                    sVar.f253685a.remove(str);
                    sVar.f253687c.put(str, oVar);
                    sVar.f253688d.put(str, hVar);
                    nVar.g(str2, hVar.field_retCode, hVar);
                    java.lang.String field_mediaId2 = oVar.field_mediaId;
                    kotlin.jvm.internal.o.f(field_mediaId2, "field_mediaId");
                    ek4.t.a(copyOnWriteArrayList, field_mediaId2, hVar.field_retCode, oVar, hVar);
                    if (oVar.f241813a2 && hVar.field_retCode == 0) {
                        r45.hv hvVar = new r45.hv();
                        hvVar.f376465d = oVar.field_fullpath;
                        hvVar.f376466e = hVar.field_fileLength;
                        ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Vi(6, oVar.field_mediaId, hvVar, new ek4.f(sVar));
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
