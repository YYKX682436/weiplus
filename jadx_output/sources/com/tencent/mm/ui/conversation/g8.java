package com.tencent.mm.ui.conversation;

/* loaded from: classes9.dex */
public final class g8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.l4 f207702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207704f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.n2 f207705g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f207706h;

    public g8(com.tencent.mm.storage.l4 l4Var, java.lang.String str, java.lang.String str2, com.tencent.mm.ui.conversation.n2 n2Var, int i17) {
        this.f207702d = l4Var;
        this.f207703e = str;
        this.f207704f = str2;
        this.f207705g = n2Var;
        this.f207706h = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            java.util.Map a17 = com.tencent.mm.ui.report.k0.a(this.f207703e, this.f207704f, this.f207702d.d1());
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.conversation.f8(this.f207705g, this.f207703e, this.f207706h, a17));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenImKefuConversationAdapter", "bindReportForListView ex %s", e17.getMessage());
        }
    }
}
