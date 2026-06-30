package ek4;

/* loaded from: classes12.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f253666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.o f253667e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ek4.w f253668f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ek4.s sVar, dn.o oVar, ek4.w wVar) {
        super(0);
        this.f253666d = sVar;
        this.f253667e = oVar;
        this.f253668f = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ek4.s sVar = this.f253666d;
        java.util.HashMap hashMap = sVar.f253685a;
        dn.o oVar = this.f253667e;
        boolean containsKey = hashMap.containsKey(oVar.field_mediaId);
        ek4.w wVar = this.f253668f;
        if (!containsKey) {
            dn.c cVar = new dn.c();
            java.lang.String field_mediaId = oVar.field_mediaId;
            kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
            ek4.s.d(sVar, field_mediaId, cVar);
            oVar.field_startTime = c01.id.c();
            int b17 = oVar.Z == 8 ? ek4.s.b(sVar, oVar) : -1;
            if (wVar != null) {
                wVar.b(b17, oVar);
            }
        } else if (wVar != null) {
            wVar.b(-1, oVar);
        }
        return jz5.f0.f302826a;
    }
}
