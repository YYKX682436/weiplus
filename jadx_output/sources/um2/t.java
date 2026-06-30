package um2;

/* loaded from: classes3.dex */
public final class t implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.SoftReference f428960d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f428961e;

    public t(java.lang.ref.SoftReference softReference, java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f428960d = softReference;
        this.f428961e = tag;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        um2.x5 x5Var;
        java.lang.String str;
        r45.ve2 ve2Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.ref.SoftReference softReference = this.f428960d;
        if (softReference != null && (x5Var = (um2.x5) softReference.get()) != null) {
            com.tencent.mars.xlog.Log.i(this.f428961e, "prepare shopping:" + booleanValue + ",list empty:" + ((mm2.f6) x5Var.c(mm2.f6.class)).f329039o.f364680a.isEmpty());
            if (booleanValue) {
                st2.f2.f412287a.a(x5Var.f19609a);
                gk2.e liveData = x5Var.f19609a;
                androidx.appcompat.app.AppCompatActivity context = x5Var.f19605b;
                kotlin.jvm.internal.o.g(context, "context");
                kotlin.jvm.internal.o.g(liveData, "liveData");
                if (((zy2.qa) i95.n0.c(zy2.qa.class)) != null) {
                    android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                    r45.dv1 dv1Var = ((mm2.f6) liveData.a(mm2.f6.class)).f329038n;
                    if (dv1Var == null || (ve2Var = (r45.ve2) dv1Var.getCustom(5)) == null || (str = ve2Var.getString(0)) == null) {
                        str = "";
                    }
                    boolean z17 = st2.f2.f412288b;
                    boolean z18 = st2.f2.f412289c;
                    java.lang.String liveid = java.lang.String.valueOf(((mm2.e1) liveData.a(mm2.e1.class)).f328988r.getLong(0));
                    java.lang.String finderid = xy2.c.e(context);
                    java.lang.String sessionid = java.lang.String.valueOf(((mm2.c1) liveData.a(mm2.c1.class)).f328861p2);
                    kotlin.jvm.internal.o.g(liveid, "liveid");
                    kotlin.jvm.internal.o.g(finderid, "finderid");
                    kotlin.jvm.internal.o.g(sessionid, "sessionid");
                    com.tencent.mm.autogen.mmdata.rpt.FinderLivePreWarmStartReportStruct finderLivePreWarmStartReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLivePreWarmStartReportStruct();
                    finderLivePreWarmStartReportStruct.f57316d = finderLivePreWarmStartReportStruct.b("appuin", "", true);
                    finderLivePreWarmStartReportStruct.f57317e = 0L;
                    finderLivePreWarmStartReportStruct.f57318f = 10;
                    finderLivePreWarmStartReportStruct.f57320h = finderLivePreWarmStartReportStruct.b("prewarmpath", str, true);
                    finderLivePreWarmStartReportStruct.f57321i = z17 ? 1 : 0;
                    finderLivePreWarmStartReportStruct.f57322j = z18 ? 1 : 0;
                    finderLivePreWarmStartReportStruct.f57323k = finderLivePreWarmStartReportStruct.b("liveid", liveid, true);
                    finderLivePreWarmStartReportStruct.f57324l = finderLivePreWarmStartReportStruct.b("finderid", finderid, true);
                    finderLivePreWarmStartReportStruct.f57325m = finderLivePreWarmStartReportStruct.b("shopwindowid", "", true);
                    finderLivePreWarmStartReportStruct.f57326n = finderLivePreWarmStartReportStruct.b("sessionid", sessionid, true);
                    finderLivePreWarmStartReportStruct.f57319g = finderLivePreWarmStartReportStruct.b("networktype", java.lang.String.valueOf(by5.y.a(context2)), true);
                    finderLivePreWarmStartReportStruct.f57327o = c01.id.c();
                    finderLivePreWarmStartReportStruct.k();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
