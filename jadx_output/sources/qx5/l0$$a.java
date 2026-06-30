package qx5;

/* loaded from: classes13.dex */
public final /* synthetic */ class l0$$a implements android.webkit.ValueCallback {
    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (android.text.TextUtils.isEmpty(str)) {
            yu5.c.b(new qx5.l0$$e("Trace 录制失败"));
        } else if (!com.tencent.xweb.t0.f220594a.a()) {
            by5.c4.c("XWebTraceFileListPreference", "[XWEB_RECORD_TRACE] Need local debug permission");
        } else {
            yu5.b.f465914a.a(new qx5.l0$$b(str));
        }
    }
}
