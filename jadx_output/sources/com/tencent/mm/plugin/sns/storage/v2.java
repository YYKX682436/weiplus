package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class v2 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f166151e = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.sns.storage.u2.f166149t, "SnsWsFoldGroup")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f166152d;

    public v2(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.sns.storage.q2.f166106t, "SnsWsFoldGroup", null);
        this.f166152d = k0Var;
    }

    public boolean y0(com.tencent.mm.plugin.sns.storage.u2 u2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertWsFoldGroup", "com.tencent.mm.plugin.sns.storage.SnsWsFoldGroupStorage");
        if (u2Var.field_size >= com.tencent.mm.plugin.sns.model.j4.h()) {
            u2Var.field_state = 1;
        }
        boolean z17 = this.f166152d.m("SnsWsFoldGroup", "bottom", u2Var.convertTo()) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertWsFoldGroup", "com.tencent.mm.plugin.sns.storage.SnsWsFoldGroupStorage");
        return z17;
    }
}
