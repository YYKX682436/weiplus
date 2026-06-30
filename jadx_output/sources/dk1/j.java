package dk1;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final dk1.j f233151a = new dk1.j();

    public static java.lang.Object a(dk1.j jVar, java.lang.String str, int i17, int i18, kotlin.coroutines.Continuation continuation, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            i17 = Integer.MAX_VALUE;
        }
        if ((i19 & 4) != 0) {
            i18 = 32;
        }
        jVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiWxaAppGetPrivacyUseRecord", "doFetch, appUsername: " + str + ", updateTime: " + i17 + ", maxFetchCount: " + i18);
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(rVar);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp_getwxauseuserinforecordlist";
        lVar.f70667d = 2690;
        r45.kc7 kc7Var = new r45.kc7();
        kc7Var.f378591d = str;
        kc7Var.f378592e = i17;
        kc7Var.f378593f = i18;
        lVar.f70664a = kc7Var;
        lVar.f70665b = new r45.lc7();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        final dk1.h hVar = new dk1.h(weakReference);
        rVar.m(new dk1.g(com.tencent.mm.modelbase.z2.e(a17, new com.tencent.mm.modelbase.e3(hVar) { // from class: dk1.i

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.s f233150d;

            {
                kotlin.jvm.internal.o.g(hVar, "function");
                this.f233150d = hVar;
            }

            @Override // com.tencent.mm.modelbase.e3
            public final /* synthetic */ int callback(int i27, int i28, java.lang.String str2, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
                return ((java.lang.Number) this.f233150d.v(java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), str2, oVar, m1Var)).intValue();
            }
        }, false, null)));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }
}
