package wp4;

@j95.b
/* loaded from: classes4.dex */
public final class x extends i95.w implements n55.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f448453d = "MicroMsg.RemuxApiImpl";

    public void Ai(java.lang.String workTageId, long j17, long j18, int i17) {
        kotlin.jvm.internal.o.g(workTageId, "workTageId");
        com.tencent.mars.xlog.Log.i(this.f448453d, "reportTimeLineCheckToUpload >> workTagId: " + workTageId + ", muxResult: " + i17 + ", confirmRemuxTime: " + j17 + " muxFinishTime: " + j18);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportTimelineCheckUpload >> workTagId: ");
        sb6.append(workTageId);
        sb6.append(", muxResult: ");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FakeVideoTecReporter", sb6.toString());
        com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct snsFakeVideoLogStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct();
        snsFakeVideoLogStruct.f60551d = 12;
        snsFakeVideoLogStruct.p(workTageId);
        snsFakeVideoLogStruct.f60553f = i17;
        snsFakeVideoLogStruct.f60556i = j17;
        snsFakeVideoLogStruct.f60559l = j18;
        snsFakeVideoLogStruct.k();
    }

    public o55.a Bi(java.lang.String workTagId) {
        kotlin.jvm.internal.o.g(workTagId, "workTagId");
        dm.q0 d17 = zp4.e.f474954a.d(workTagId);
        java.lang.String str = this.f448453d;
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e(str, "getBackgroundVideoBasicInfo >> workTagId: " + workTagId + ", is not find");
            return null;
        }
        com.tencent.mars.xlog.Log.i(str, "getBackgroundVideoBasicInfo >> workTagId: " + workTagId + ", is find");
        int i17 = d17.field_work_type;
        java.lang.String field_work_id = d17.field_work_id;
        kotlin.jvm.internal.o.f(field_work_id, "field_work_id");
        long j17 = d17.field_confirm_remux_time_stamp;
        java.lang.String field_output_video_path = d17.field_output_video_path;
        kotlin.jvm.internal.o.f(field_output_video_path, "field_output_video_path");
        java.lang.String field_output_thumb_path = d17.field_output_thumb_path;
        kotlin.jvm.internal.o.f(field_output_thumb_path, "field_output_thumb_path");
        return new o55.a(i17, field_work_id, j17, field_output_video_path, field_output_thumb_path, 0, 0L, d17.field_export_video_duration_ms, null, com.tencent.mm.plugin.appbrand.jsapi.nfc.r.CTRL_INDEX, null);
    }

    public void Di(java.lang.String workTagId, int i17) {
        kotlin.jvm.internal.o.g(workTagId, "workTagId");
        com.tencent.mars.xlog.Log.i(this.f448453d, "updateWorkTypeByUploadAction >> workTagId: " + workTagId + ", action: " + i17);
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new wp4.w(workTagId, this, i17, null), 2, null);
    }

    public void wi(java.lang.String workTagId, n55.e callback) {
        kotlin.jvm.internal.o.g(workTagId, "workTagId");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new wp4.o(workTagId, this, callback, null), 2, null);
    }
}
