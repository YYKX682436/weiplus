package th5;

/* loaded from: classes12.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final th5.v0 f419470a = new th5.v0();

    public final void a(com.tencent.mm.feature.gallery.api.BizData data, int i17, long j17, th5.a element, th5.e optype) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(element, "element");
        kotlin.jvm.internal.o.g(optype, "optype");
        com.tencent.mm.autogen.mmdata.rpt.MMBizOriginViewerStruct mMBizOriginViewerStruct = new com.tencent.mm.autogen.mmdata.rpt.MMBizOriginViewerStruct();
        mMBizOriginViewerStruct.f58802f = data.f67086d;
        mMBizOriginViewerStruct.f58803g = data.f67087e;
        mMBizOriginViewerStruct.f58804h = data.f67088f;
        mMBizOriginViewerStruct.f58805i = i17 + 1;
        mMBizOriginViewerStruct.f58806j = j17;
        mMBizOriginViewerStruct.f58801e = element.f419338d;
        mMBizOriginViewerStruct.f58800d = optype.f419369d;
        mMBizOriginViewerStruct.k();
        com.tencent.mars.xlog.Log.i("BizPhotoReportUtil", "report: " + mMBizOriginViewerStruct.n());
    }
}
