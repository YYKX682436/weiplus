package db2;

/* loaded from: classes2.dex */
public final class b5 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(android.content.Context context, com.tencent.mm.protobuf.g gVar) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(context, "context");
        pf5.u uVar = pf5.u.f353936a;
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) uVar.b(context).c(zy2.ra.class))).V6();
        jz5.l P6 = ((ey2.k0) uVar.e(c61.l7.class).a(ey2.k0.class)).P6();
        float floatValue = ((java.lang.Number) P6.f302833d).floatValue();
        float floatValue2 = ((java.lang.Number) P6.f302834e).floatValue();
        bw5.gg ggVar = new bw5.gg();
        bw5.sc scVar = new bw5.sc();
        scVar.parseFrom(db2.t4.f228171a.b(14246, V6).toByteArray());
        ggVar.f27834d = scVar;
        boolean[] zArr = ggVar.f27839i;
        zArr[2] = true;
        ggVar.f27835e = V6.getString(18);
        zArr[3] = true;
        ggVar.f27836f = floatValue;
        zArr[4] = true;
        ggVar.f27837g = floatValue2;
        zArr[5] = true;
        ggVar.f27838h = gVar;
        zArr[6] = true;
        bw5.ig igVar = new bw5.ig();
        igVar.BaseResponse = new r45.ie();
        igVar.f28576i[1] = true;
        r45.ie baseResponse = igVar.getBaseResponse();
        if (baseResponse != null) {
            baseResponse.f376960e = new r45.du5();
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ggVar;
        lVar.f70665b = igVar;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetoftenreadauthor";
        lVar.f70667d = 14246;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.GetOftenReadAuthorReqCgi", "[init] request=" + com.tencent.mm.plugin.finder.viewmodel.component.i00.a(ggVar) + " thread=" + java.lang.Thread.currentThread());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        bw5.ig resp = (bw5.ig) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.GetOftenReadAuthorReqCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ", resp=" + com.tencent.mm.plugin.finder.viewmodel.component.i00.a(resp));
    }
}
