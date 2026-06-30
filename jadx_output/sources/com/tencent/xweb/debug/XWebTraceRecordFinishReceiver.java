package com.tencent.xweb.debug;

/* loaded from: classes13.dex */
public class XWebTraceRecordFinishReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent.hasExtra("record_file_name")) {
            java.lang.String stringExtra = intent.getStringExtra("record_file_name");
            by5.c4.f("XWebTraceRecordFinishRe", "[XWEB_RECORD_TRACE] OnReceiveRecordFinish: " + stringExtra);
            if (android.text.TextUtils.isEmpty(stringExtra)) {
                yu5.c.b(new qx5.l0$$e("Trace 录制失败"));
            } else if (!com.tencent.xweb.t0.f220594a.a()) {
                by5.c4.c("XWebTraceFileListPreference", "[XWEB_RECORD_TRACE] Need local debug permission");
            } else {
                yu5.b.f465914a.a(new qx5.l0$$b(stringExtra));
            }
        }
    }
}
