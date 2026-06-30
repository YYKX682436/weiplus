package mn0;

/* loaded from: classes10.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final mn0.e0 f329730d = new mn0.e0();

    public e0() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mn0.d0 scene = (mn0.d0) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        java.lang.String msg = (java.lang.String) obj3;
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct finderLiveErrorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct();
        finderLiveErrorReportStruct.f57145e = intValue;
        finderLiveErrorReportStruct.f57148h = scene.f329728d;
        finderLiveErrorReportStruct.p(msg);
        finderLiveErrorReportStruct.k();
        return jz5.f0.f302826a;
    }
}
