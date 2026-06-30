package u20;

/* loaded from: classes9.dex */
public final class r implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u20.y f423934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f423935b;

    public r(u20.y yVar, android.content.Context context) {
        this.f423934a = yVar;
        this.f423935b = context;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("EcsShareToContactLogicWAAPPMsg", "handle get bulk buy share info, errType:" + i17 + " errCode:" + i18);
        u20.y yVar = this.f423934a;
        if (i18 == 0 && i17 == 0) {
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.wechat.aff.proto.MmecGetBulkBuyShareInfoResp");
            bw5.xe0 xe0Var = (bw5.xe0) fVar;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handle get bulk buy share info, title:");
            sb6.append(xe0Var.f35081n[2] ? xe0Var.f35074d : "");
            sb6.append(", desc:");
            boolean[] zArr = xe0Var.f35081n;
            sb6.append(zArr[3] ? xe0Var.f35075e : "");
            sb6.append(", ecmsgSignature:");
            sb6.append(zArr[6] ? xe0Var.f35078h : "");
            sb6.append(", path:");
            sb6.append(zArr[4] ? xe0Var.f35076f : "");
            sb6.append(", imageUrl:");
            sb6.append(zArr[5] ? xe0Var.f35077g : "");
            sb6.append(", ecsJumpInfoBase64:");
            sb6.append(zArr[7] ? xe0Var.f35079i : "");
            sb6.append(", shopName:");
            sb6.append(xe0Var.b());
            sb6.append(", shopName:");
            sb6.append(xe0Var.b());
            com.tencent.mars.xlog.Log.i("EcsShareToContactLogicWAAPPMsg", sb6.toString());
            if (!com.tencent.mm.sdk.platformtools.t8.K0(zArr[2] ? xe0Var.f35074d : "")) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(zArr[6] ? xe0Var.f35078h : "")) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(zArr[4] ? xe0Var.f35076f : "")) {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(zArr[7] ? xe0Var.f35079i : "") && !com.tencent.mm.sdk.platformtools.t8.K0(xe0Var.b())) {
                            u20.q qVar = yVar.f423953d;
                            qVar.f423925g = zArr[2] ? xe0Var.f35074d : "";
                            qVar.f423926h = zArr[3] ? xe0Var.f35075e : "";
                            qVar.f423928j = zArr[4] ? xe0Var.f35076f : "";
                            qVar.f423927i = zArr[5] ? xe0Var.f35077g : "";
                            qVar.f423931m = xe0Var.b();
                            u20.q qVar2 = yVar.f423953d;
                            w05.h hVar = qVar2.f423933o;
                            if (hVar != null) {
                                java.lang.String str2 = zArr[6] ? xe0Var.f35078h : "";
                                kotlin.jvm.internal.o.f(str2, "getEcmsgSignature(...)");
                                hVar.J(str2);
                            }
                            w05.h hVar2 = qVar2.f423933o;
                            if (hVar2 != null) {
                                java.lang.String str3 = zArr[7] ? xe0Var.f35079i : "";
                                kotlin.jvm.internal.o.f(str3, "getEcsJumpInfoBase64(...)");
                                hVar2.K(str3);
                            }
                        }
                    }
                }
            }
            com.tencent.mars.xlog.Log.e("EcsShareToContactLogicWAAPPMsg", "get bulk buy share info but check resp fail");
        } else {
            com.tencent.mars.xlog.Log.e("EcsShareToContactLogicWAAPPMsg", "get bulk buy share info fail, errType:" + i17 + " errCode:" + i18);
        }
        yVar.f(this.f423935b);
    }
}
