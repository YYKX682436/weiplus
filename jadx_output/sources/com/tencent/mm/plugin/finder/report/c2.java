package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class c2 extends com.tencent.mm.plugin.finder.report.d5 {

    /* renamed from: w, reason: collision with root package name */
    public int f124977w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(com.tencent.mm.ui.MMFragmentActivity activity, r45.qt2 contextObj) {
        super(activity, contextObj);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f124977w = -1;
        this.f125289p = false;
    }

    @Override // com.tencent.mm.plugin.finder.report.d5, com.tencent.mm.plugin.finder.report.r0, fc2.d
    public void H0() {
        super.H0();
        com.tencent.mars.xlog.Log.i("FinderMusicTopicTwoFeedFlowReporter", "onRelease");
    }

    @Override // com.tencent.mm.plugin.finder.report.d5, com.tencent.mm.plugin.finder.report.r0
    public void O0() {
        if (this.f125289p) {
            super.O0();
        } else {
            com.tencent.mars.xlog.Log.i("FinderMusicTopicTwoFeedFlowReporter", "onInvisible");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b A[Catch: JSONException -> 0x0133, TryCatch #0 {JSONException -> 0x0133, blocks: (B:12:0x0035, B:14:0x0053, B:15:0x0059, B:19:0x007d, B:21:0x0083, B:23:0x0089, B:25:0x0090, B:29:0x009b, B:30:0x012a, B:35:0x00aa, B:37:0x00b0, B:39:0x00b6, B:41:0x00be, B:42:0x00cb, B:44:0x00d0, B:46:0x00d6, B:48:0x00dc, B:49:0x00e0, B:51:0x00ec, B:53:0x00fa, B:55:0x0100, B:57:0x0106, B:59:0x010c, B:61:0x0110, B:67:0x011f), top: B:11:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011f A[Catch: JSONException -> 0x0133, TryCatch #0 {JSONException -> 0x0133, blocks: (B:12:0x0035, B:14:0x0053, B:15:0x0059, B:19:0x007d, B:21:0x0083, B:23:0x0089, B:25:0x0090, B:29:0x009b, B:30:0x012a, B:35:0x00aa, B:37:0x00b0, B:39:0x00b6, B:41:0x00be, B:42:0x00cb, B:44:0x00d0, B:46:0x00d6, B:48:0x00dc, B:49:0x00e0, B:51:0x00ec, B:53:0x00fa, B:55:0x0100, B:57:0x0106, B:59:0x010c, B:61:0x0110, B:67:0x011f), top: B:11:0x0035 }] */
    @Override // com.tencent.mm.plugin.finder.report.d5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject T0(com.tencent.mm.plugin.finder.report.f5 r14) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.c2.T0(com.tencent.mm.plugin.finder.report.f5):org.json.JSONObject");
    }

    @Override // com.tencent.mm.plugin.finder.report.d5
    public void U0(java.lang.String invokeSource) {
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        if (kotlin.jvm.internal.o.b(invokeSource, "onRelease")) {
            return;
        }
        super.U0(invokeSource);
    }
}
