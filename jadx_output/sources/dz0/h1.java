package dz0;

/* loaded from: classes5.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f244869e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f244868d = maasSdkUIC;
        this.f244869e = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz0.h1(this.f244868d, this.f244869e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        dz0.h1 h1Var = (dz0.h1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ig.n f17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        az0.n7 n7Var = this.f244868d.f69783d;
        if (n7Var != null && (f17 = n7Var.f()) != null) {
            bz0.j jVar = bz0.j.f36750a;
            java.util.List<com.tencent.maas.model.MJTemplateInfo> list = this.f244869e;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (com.tencent.maas.model.MJTemplateInfo mJTemplateInfo : list) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("tid", mJTemplateInfo.getTemplateID());
                if (f17.getFixedTemplateIdsList().contains(mJTemplateInfo.getTemplateID())) {
                    jSONObject.put("src", 1);
                } else {
                    jSONObject.put("src", 2);
                }
                arrayList.add(jSONObject);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MaasReport25621", "markRecommendListJson: size=" + arrayList.size());
            java.util.ArrayList arrayList2 = (java.util.ArrayList) bz0.j.f36756g;
            arrayList2.addAll(bz0.j.f36755f);
            arrayList2.addAll(arrayList);
        }
        return jz5.f0.f302826a;
    }
}
