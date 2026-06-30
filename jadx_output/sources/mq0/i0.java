package mq0;

@j95.b
/* loaded from: classes7.dex */
public final class i0 extends i95.w implements mq0.c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final mq0.h0 f330568d = new mq0.h0(null);

    public static void wi(mq0.i0 i0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 128) != 0) {
            str8 = null;
        }
        if ((i17 & 256) != 0) {
            map = null;
        }
        i0Var.getClass();
        com.tencent.mm.autogen.mmdata.rpt.MBADFullLinkReporterStruct mBADFullLinkReporterStruct = new com.tencent.mm.autogen.mmdata.rpt.MBADFullLinkReporterStruct();
        mBADFullLinkReporterStruct.f58706d = mBADFullLinkReporterStruct.b("BizName", str2, true);
        mBADFullLinkReporterStruct.f58707e = mBADFullLinkReporterStruct.b("BizScene", str3, true);
        mBADFullLinkReporterStruct.f58711i = mBADFullLinkReporterStruct.b("Action", str, true);
        mBADFullLinkReporterStruct.f58708f = mBADFullLinkReporterStruct.b("TraceId", str4, true);
        mBADFullLinkReporterStruct.f58709g = mBADFullLinkReporterStruct.b("FrameSetName", str5, true);
        mBADFullLinkReporterStruct.f58714l = mBADFullLinkReporterStruct.b("ImplType", str6, true);
        mBADFullLinkReporterStruct.f58710h = mBADFullLinkReporterStruct.b("ReportSource", str7, true);
        mBADFullLinkReporterStruct.f58712j = java.lang.System.currentTimeMillis();
        if (map == null || !(!map.isEmpty())) {
            if (!(str8 == null || str8.length() == 0)) {
                mBADFullLinkReporterStruct.f58713k = mBADFullLinkReporterStruct.b("ExtraJson", r26.i0.t(str8, ",", ";", false), true);
            }
        } else {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                pm0.b0.f(map, jSONObject);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                mBADFullLinkReporterStruct.f58713k = mBADFullLinkReporterStruct.b("ExtraJson", r26.i0.t(jSONObject2, ",", ";", false), true);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MBADFullLinkReporter", "extMap to JSON failed", e17);
            }
        }
        mBADFullLinkReporterStruct.l();
    }

    public void Ai(mq0.z action, java.lang.String bizName, java.lang.String bizScene, java.lang.String traceId, java.lang.String frameSetName, java.lang.String implType, mq0.b0 reportSource, java.util.Map extMap) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(bizScene, "bizScene");
        kotlin.jvm.internal.o.g(traceId, "traceId");
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        kotlin.jvm.internal.o.g(implType, "implType");
        kotlin.jvm.internal.o.g(reportSource, "reportSource");
        kotlin.jvm.internal.o.g(extMap, "extMap");
        java.lang.String a17 = mq0.h0.a(f330568d, action.f330651d, bizName, bizScene, traceId, frameSetName, implType, reportSource.f330539d, "extMap=" + extMap);
        if (r26.n0.N(implType)) {
            com.tencent.mars.xlog.Log.i("MBADFullLinkReporter", "reportConversion: implType is blank, skip (non-target scenario), " + a17);
        } else {
            if (r26.n0.N(action.f330651d)) {
                com.tencent.mars.xlog.Log.w("MBADFullLinkReporter", "reportConversion: action value is blank, skip, " + a17);
                return;
            }
            try {
                wi(this, action.f330651d, bizName, bizScene, traceId, frameSetName, implType, reportSource.f330539d, null, extMap, 128, null);
                com.tencent.mars.xlog.Log.i("MBADFullLinkReporter", "reportConversion " + a17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MBADFullLinkReporter", "reportConversion failed, " + a17, e17);
            }
        }
    }

    public void Bi(java.lang.String action, java.lang.String bizName, java.lang.String bizScene, java.lang.String traceId, java.lang.String frameSetName, java.lang.String implType, java.lang.String reportSource, java.lang.String extraJson) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(bizScene, "bizScene");
        kotlin.jvm.internal.o.g(traceId, "traceId");
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        kotlin.jvm.internal.o.g(implType, "implType");
        kotlin.jvm.internal.o.g(reportSource, "reportSource");
        kotlin.jvm.internal.o.g(extraJson, "extraJson");
        java.lang.String a17 = mq0.h0.a(f330568d, action, bizName, bizScene, traceId, frameSetName, implType, reportSource, "extraJson=".concat(extraJson));
        if (r26.n0.N(action)) {
            com.tencent.mars.xlog.Log.w("MBADFullLinkReporter", "reportFromFe: action is blank, skip, " + a17);
            return;
        }
        try {
            wi(this, action, bizName, bizScene, traceId, frameSetName, implType, reportSource, extraJson, null, 256, null);
            com.tencent.mars.xlog.Log.i("MBADFullLinkReporter", "reportFromFe " + a17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MBADFullLinkReporter", "reportFromFe failed, " + a17, e17);
        }
    }
}
