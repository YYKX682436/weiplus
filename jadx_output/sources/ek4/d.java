package ek4;

/* loaded from: classes12.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f253636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253637e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dn.h f253638f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253639g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ek4.s sVar, java.lang.String str, dn.h hVar, java.lang.String str2) {
        super(0);
        this.f253636d = sVar;
        this.f253637e = str;
        this.f253638f = hVar;
        this.f253639g = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dn.h hVar;
        ek4.s sVar = this.f253636d;
        java.util.HashMap hashMap = sVar.f253686b;
        java.lang.String str = this.f253637e;
        dn.o oVar = (dn.o) hashMap.get(str);
        if (oVar != null) {
            sVar.f253686b.remove(str);
            dn.l lVar = oVar.f241796p0;
            if (lVar != null && (hVar = this.f253638f) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TP.CdnTaskController", "callback by CdnTaskController onPreloadCompleted mediaId:" + this.f253639g + " retCode:" + hVar.field_retCode);
                lVar.x(str, hVar);
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = sVar.f253689e;
                java.lang.String field_mediaId = oVar.field_mediaId;
                kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
                ek4.t.a(copyOnWriteArrayList, field_mediaId, 0, oVar, hVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
