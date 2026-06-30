package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class w6 {

    /* renamed from: a, reason: collision with root package name */
    public final wa4.v f164739a;

    /* renamed from: b, reason: collision with root package name */
    public wa4.w f164740b;

    /* renamed from: c, reason: collision with root package name */
    public long f164741c;

    /* renamed from: d, reason: collision with root package name */
    public wa4.w f164742d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f164743e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f164744f;

    public w6() {
        new java.util.HashMap();
        new java.util.ArrayList();
        this.f164739a = new wa4.v();
        this.f164740b = null;
        this.f164741c = 0L;
        this.f164742d = null;
        new java.util.ArrayList();
        this.f164743e = new java.util.LinkedList();
        this.f164744f = new com.tencent.mm.plugin.sns.model.t6(this);
    }

    public static /* synthetic */ java.util.LinkedList a(com.tencent.mm.plugin.sns.model.w6 w6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        java.util.LinkedList linkedList = w6Var.f164743e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        return linkedList;
    }
}
