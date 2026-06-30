package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class b5 extends com.tencent.mm.plugin.finder.report.d5 {

    /* renamed from: w, reason: collision with root package name */
    public long f124967w;

    /* renamed from: x, reason: collision with root package name */
    public int f124968x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(com.tencent.mm.ui.MMFragmentActivity activity, r45.qt2 contextObj) {
        super(activity, contextObj);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f124968x = -1;
        this.f125289p = false;
    }

    @Override // com.tencent.mm.plugin.finder.report.d5, com.tencent.mm.plugin.finder.report.r0, fc2.d
    public void H0() {
        super.H0();
        com.tencent.mars.xlog.Log.i("FinderTopicTwoFeedFlowReporter", "onRelease");
    }

    @Override // com.tencent.mm.plugin.finder.report.d5, com.tencent.mm.plugin.finder.report.r0
    public void O0() {
        if (this.f125289p) {
            super.O0();
        } else {
            com.tencent.mars.xlog.Log.i("FinderTopicTwoFeedFlowReporter", "onInvisible");
        }
    }

    @Override // com.tencent.mm.plugin.finder.report.d5
    public org.json.JSONObject T0(com.tencent.mm.plugin.finder.report.f5 record) {
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f125283g;
        kotlin.jvm.internal.o.g(record, "record");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            this.f124967w = mMFragmentActivity.getIntent().getLongExtra("KEY_TOPIC_ID", 0L);
            java.lang.String stringExtra = mMFragmentActivity.getIntent().getStringExtra("key_topic_title");
            if (stringExtra == null) {
                stringExtra = "";
            }
            jSONObject.put("topicid", pm0.v.u(this.f124967w));
            jSONObject.put("topictab", this.f124968x);
            jSONObject.put("topictag", stringExtra);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("FinderTopicTwoFeedFlowReporter", e17.getMessage());
        }
        return jSONObject;
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
