package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class y4 extends com.tencent.mm.plugin.finder.report.d5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(com.tencent.mm.ui.MMFragmentActivity activity, r45.qt2 contextObj) {
        super(activity, contextObj);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f125289p = false;
    }

    @Override // com.tencent.mm.plugin.finder.report.d5, com.tencent.mm.plugin.finder.report.r0, fc2.d
    public void G0(fc2.a event) {
        kotlin.jvm.internal.o.g(event, "event");
        super.G0(event);
    }

    @Override // com.tencent.mm.plugin.finder.report.d5, com.tencent.mm.plugin.finder.report.r0, fc2.d
    public void H0() {
        super.H0();
        com.tencent.mars.xlog.Log.i("FinderTemplateTwoFeedFlowReporter", "onRelease");
    }

    @Override // com.tencent.mm.plugin.finder.report.d5, com.tencent.mm.plugin.finder.report.r0
    public void O0() {
        if (this.f125289p) {
            super.O0();
        } else {
            com.tencent.mars.xlog.Log.i("FinderTemplateTwoFeedFlowReporter", "onInvisible");
        }
    }

    @Override // com.tencent.mm.plugin.finder.report.d5
    public com.tencent.mm.plugin.finder.report.f5 S0(fc2.y event, fc2.r data) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(data, "data");
        so2.j5 j5Var = data.f260977a;
        return j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? super.S0(event, data) : new com.tencent.mm.plugin.finder.report.f5(j5Var.getItemId(), event.f260935b, data.f260977a);
    }

    @Override // com.tencent.mm.plugin.finder.report.d5
    public org.json.JSONObject T0(com.tencent.mm.plugin.finder.report.f5 record) {
        java.lang.String username;
        r45.rz6 rz6Var;
        kotlin.jvm.internal.o.g(record, "record");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        so2.j5 j5Var = record.f125026d;
        if (j5Var instanceof so2.d5) {
            try {
                jSONObject.put("page_type", "profile_mj_template");
                r45.r23 r23Var = (r45.r23) ((so2.d5) j5Var).f410314d.getCustom(23);
                java.lang.String str = (r23Var == null || (rz6Var = (r45.rz6) r23Var.getCustom(1)) == null) ? null : rz6Var.f385320d;
                java.lang.String str2 = "";
                if (str == null) {
                    str = "";
                }
                jSONObject.put("templateid", str);
                com.tencent.mm.ui.MMFragmentActivity activity = this.f125283g;
                kotlin.jvm.internal.o.g(activity, "activity");
                com.tencent.mm.plugin.finder.profile.uic.p2 p2Var = (com.tencent.mm.plugin.finder.profile.uic.p2) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.profile.uic.p2.class);
                if (p2Var != null && (username = p2Var.getUsername()) != null) {
                    str2 = username;
                }
                jSONObject.put("finderusername", str2);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("FinderTemplateTwoFeedFlowReporter", e17.getMessage());
            }
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
