package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class u2 extends com.tencent.mm.plugin.finder.report.d5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(com.tencent.mm.ui.MMFragmentActivity activity, r45.qt2 contextObj) {
        super(activity, contextObj);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
    }

    @Override // com.tencent.mm.plugin.finder.report.d5
    public org.json.JSONObject T0(com.tencent.mm.plugin.finder.report.f5 record) {
        kotlin.jvm.internal.o.g(record, "record");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.tencent.mm.ui.MMFragmentActivity activity = this.f125283g;
        kotlin.jvm.internal.o.g(activity, "activity");
        int i17 = 1;
        if (activity.getIntent().getIntExtra("key_click_avatar_type", 0) != 1 && activity.getIntent().getIntExtra("key_enter_profile_type", 0) != 11) {
            i17 = activity.getIntent().getBooleanExtra("key_is_from_slide", false) ? 2 : 3;
        }
        jSONObject.put("enter_profile_method", i17);
        return jSONObject;
    }
}
