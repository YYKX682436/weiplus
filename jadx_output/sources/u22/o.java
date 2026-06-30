package u22;

/* loaded from: classes9.dex */
public final class o implements x85.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u22.r f424002a;

    public o(u22.r rVar) {
        this.f424002a = rVar;
    }

    @Override // x85.j
    public void a(int i17, int i18, r45.xh3 xh3Var) {
        u22.r rVar = this.f424002a;
        boolean z17 = false;
        rVar.f424018f = false;
        if (i17 == 4 && i18 == rVar.f424015c && xh3Var != null) {
            com.tencent.mm.protobuf.g gVar = xh3Var.f390106d;
            byte[] bArr = gVar != null ? gVar.f192156a : null;
            rVar.f424016d = bArr;
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    z17 = true;
                }
            }
            rVar.f424017e = z17;
            java.util.LinkedList LensList = xh3Var.f390107e;
            kotlin.jvm.internal.o.f(LensList, "LensList");
            pm0.v.X(new u22.p(rVar, LensList));
        } else if (i17 == 0 && i18 == 0 && xh3Var != null) {
            rVar.f424017e = false;
            com.tencent.mm.protobuf.g gVar2 = xh3Var.f390106d;
            rVar.f424016d = gVar2 != null ? gVar2.f192156a : null;
            java.util.LinkedList LensList2 = xh3Var.f390107e;
            kotlin.jvm.internal.o.f(LensList2, "LensList");
            pm0.v.X(new u22.p(rVar, LensList2));
        } else {
            pm0.v.X(new u22.p(rVar, kz5.p0.f313996d));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StickerPanelData", "getLensList onResult: " + rVar.f424018f + ", " + rVar.f424017e);
    }
}
