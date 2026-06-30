package com.tencent.mm.ui.conversation;

/* loaded from: classes9.dex */
public final class v8 implements ab5.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208194b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208195c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f208197e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuChattingUIFragment f208198f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f208199g;

    public v8(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuChattingUIFragment openImKefuChattingUIFragment, org.json.JSONObject jSONObject) {
        this.f208193a = str;
        this.f208194b = str2;
        this.f208195c = str3;
        this.f208196d = str4;
        this.f208197e = i17;
        this.f208198f = openImKefuChattingUIFragment;
        this.f208199g = jSONObject;
    }

    @Override // ab5.h0
    public final void a() {
        c00.u3 u3Var = (c00.u3) i95.n0.c(c00.u3.class);
        java.lang.String str = this.f208194b;
        java.lang.String str2 = this.f208195c;
        java.lang.String str3 = this.f208196d;
        int i17 = this.f208197e;
        b00.a0 a0Var = (b00.a0) u3Var;
        a0Var.getClass();
        java.lang.String type = this.f208193a;
        kotlin.jvm.internal.o.g(type, "type");
        a0Var.bj("ecs_kf_quick_send_card", "view_clk", a0Var.Ui(type, str, str2, str3, i17));
        com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuChattingUIFragment openImKefuChattingUIFragment = this.f208198f;
        openImKefuChattingUIFragment.hideVKB();
        com.tencent.mm.ui.conversation.k8 k8Var = com.tencent.mm.ui.conversation.k8.f207814a;
        yb5.d dVar = openImKefuChattingUIFragment.f198152f;
        kotlin.jvm.internal.o.f(dVar, "getChattingContext(...)");
        k8Var.a(new com.tencent.mm.ui.conversation.e8(dVar, openImKefuChattingUIFragment.Q, openImKefuChattingUIFragment.R), this.f208199g);
    }
}
