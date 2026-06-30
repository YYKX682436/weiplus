package di1;

/* loaded from: classes8.dex */
public abstract class g {
    public static final di1.f a(long j17, bi1.g scene, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
        kotlin.jvm.internal.o.g(scene, "scene");
        di1.f fVar = new di1.f(j17, scene, appBrandOpenMaterialCollection, null, 8, null);
        com.tencent.mars.xlog.Log.i(fVar.f232641m, "onBottomSheetShow");
        com.tencent.mm.autogen.mmdata.rpt.WeChat_use_weapp_openStruct c17 = fVar.c();
        c17.p(fVar.f232640l);
        long j18 = fVar.f232629a;
        c17.f62904k = j18;
        c17.f62898e = 1L;
        c17.f62899f = fVar.a();
        c17.f62900g = fVar.b();
        c17.f62901h = 0L;
        c17.k();
        if (bi1.g.ATTACH == fVar.f232630b && j18 == 2) {
            com.tencent.mm.autogen.mmdata.rpt.WeChat_use_weapp_openStruct c18 = fVar.c();
            c18.p(fVar.f232640l);
            c18.f62898e = 5L;
            c18.f62899f = fVar.a();
            c18.f62900g = fVar.b();
            c18.f62901h = 0L;
            c18.k();
        }
        return fVar;
    }
}
