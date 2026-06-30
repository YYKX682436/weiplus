package ek4;

/* loaded from: classes12.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f253631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253632e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dn.g f253633f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253634g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dn.h f253635h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ek4.s sVar, java.lang.String str, dn.g gVar, java.lang.String str2, dn.h hVar) {
        super(0);
        this.f253631d = sVar;
        this.f253632e = str;
        this.f253633f = gVar;
        this.f253634g = str2;
        this.f253635h = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dn.g gVar;
        ek4.s sVar = this.f253631d;
        dn.o oVar = (dn.o) sVar.f253686b.get(this.f253632e);
        if (oVar != null) {
            java.lang.String str = this.f253634g;
            dn.h hVar = this.f253635h;
            dn.k kVar = oVar.f241787f;
            if (kVar != null && (gVar = this.f253633f) != null) {
                ek4.s.a(sVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.TP.CdnTaskController", "callback by CdnTaskController onProgress mediaId:" + str + " progressFinishLength:" + gVar.field_finishedLength);
                kVar.r4(str, 0, gVar, hVar, oVar.field_onlycheckexist);
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = sVar.f253689e;
                java.lang.String field_mediaId = oVar.field_mediaId;
                kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
                ek4.t.b(copyOnWriteArrayList, field_mediaId, gVar.field_finishedLength, gVar.field_toltalLength);
            }
        }
        return jz5.f0.f302826a;
    }
}
