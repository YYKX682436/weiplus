package dz0;

/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f244791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244792e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244793f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dz0.e0 f244794g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(yz5.p pVar, java.lang.String str, com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, dz0.e0 e0Var) {
        super(3);
        this.f244791d = pVar;
        this.f244792e = str;
        this.f244793f = maasSdkUIC;
        this.f244794g = e0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.maas.instamovie.MJMovieSession mJMovieSession;
        com.tencent.maas.model.MJTemplateInfo currentTemplateInfo;
        com.tencent.maas.instamovie.base.MJError mJError = (com.tencent.maas.instamovie.base.MJError) obj;
        com.tencent.maas.model.MJMusicInfo[] mJMusicInfoArr = (com.tencent.maas.model.MJMusicInfo[]) obj2;
        long longValue = ((java.lang.Number) obj3).longValue();
        yz5.p pVar = this.f244791d;
        if (pVar != null) {
            pVar.invoke(mJError, mJMusicInfoArr);
        }
        java.util.List C0 = mJMusicInfoArr != null ? kz5.z.C0(mJMusicInfoArr) : null;
        java.lang.String templateId = this.f244792e;
        if (C0 != null) {
            if ((C0.isEmpty() ^ true ? C0 : null) != null) {
                this.f244794g.f244825h.put(templateId, C0);
            }
        }
        com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC = this.f244793f;
        az0.n7 n7Var = maasSdkUIC.f69783d;
        boolean b17 = kotlin.jvm.internal.o.b(templateId, (n7Var == null || (mJMovieSession = n7Var.f15742a) == null || (currentTemplateInfo = mJMovieSession.getCurrentTemplateInfo()) == null) ? null : currentTemplateInfo.getTemplateID());
        if (b17) {
            maasSdkUIC.f69789m.b(maasSdkUIC.V6());
        }
        bz0.j jVar = bz0.j.f36750a;
        java.lang.String requestId = java.lang.String.valueOf(longValue);
        kotlin.jvm.internal.o.g(templateId, "templateId");
        kotlin.jvm.internal.o.g(requestId, "requestId");
        bz0.j.f36760k.put(templateId, requestId);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRecommendMusicComplete: templateId:");
        sb6.append(templateId);
        sb6.append(", templateIdMatch:");
        sb6.append(b17);
        sb6.append(", err:");
        sb6.append(mJError != null ? mJError.message : null);
        sb6.append(" recommend size:");
        sb6.append(mJMusicInfoArr != null ? java.lang.Integer.valueOf(mJMusicInfoArr.length) : null);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", sb6.toString());
        return jz5.f0.f302826a;
    }
}
