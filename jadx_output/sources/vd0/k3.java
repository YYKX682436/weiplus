package vd0;

/* loaded from: classes8.dex */
public final class k3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vd0.l3 f435456e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435457f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(java.lang.String str, vd0.l3 l3Var, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f435455d = str;
        this.f435456e = l3Var;
        this.f435457f = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vd0.k3(this.f435455d, this.f435456e, this.f435457f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vd0.k3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        wd0.w1 aj6;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String obj2 = r26.n0.u0(this.f435455d).toString();
        if (obj2.length() == 0) {
            return kz5.p0.f313996d;
        }
        vd0.l3 l3Var = this.f435456e;
        java.lang.Object obj3 = l3Var.f435460d;
        java.lang.String str = this.f435457f;
        synchronized (obj3) {
            l3Var.Zi();
            vd0.y2 Ni = l3Var.Ni(str);
            vd0.c3 c3Var = Ni != null ? Ni.f435542b : null;
            if (c3Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SettingSearchFeatureService", "searchSetting skip: no available index, activityTag=".concat(str));
                return null;
            }
            java.lang.String lowerCase = obj2.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (vd0.z2 z2Var : c3Var.f435381a) {
                java.lang.Boolean bool = (java.lang.Boolean) c3Var.f435384d.get(z2Var.f435545a);
                if ((bool != null ? bool.booleanValue() : false) && (aj6 = l3Var.aj(z2Var, lowerCase)) != null) {
                    arrayList.add(new vd0.a3(z2Var, aj6));
                }
            }
            java.util.List<vd0.a3> F0 = kz5.n0.F0(arrayList, mz5.a.a(vd0.h3.f435430d, vd0.i3.f435439d, vd0.j3.f435443d));
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(F0, 10));
            for (vd0.a3 a3Var : F0) {
                vd0.z2 z2Var2 = a3Var.f435367a;
                wd0.w1 w1Var = a3Var.f435368b;
                java.lang.Boolean bool2 = (java.lang.Boolean) c3Var.f435384d.get(z2Var2.f435545a);
                arrayList2.add(l3Var.bj(z2Var2, w1Var, bool2 != null ? bool2.booleanValue() : false));
            }
            return arrayList2;
        }
    }
}
