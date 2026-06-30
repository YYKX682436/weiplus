package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class q2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f207993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f207994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.p2 f207995f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f207996g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f207997h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.l4 f207998i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(android.app.Activity activity, android.content.Intent intent, com.tencent.mm.ui.conversation.p2 p2Var, android.view.View view, int i17, com.tencent.mm.storage.l4 l4Var) {
        super(1);
        this.f207993d = activity;
        this.f207994e = intent;
        this.f207995f = p2Var;
        this.f207996g = view;
        this.f207997h = i17;
        this.f207998i = l4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        kotlin.jvm.internal.o.d(bool);
        if (bool.booleanValue()) {
            com.tencent.mm.ui.conversation.u2.f208092a.a(this.f207993d, this.f207994e);
            o25.q.f342574a.d().clear();
            com.tencent.mars.xlog.Log.i("MicroMsg.BizImagePreloadStrategy", "do clearQueue");
            com.tencent.mm.ui.conversation.p2 p2Var = this.f207995f;
            if (p2Var != null) {
                java.lang.String h17 = this.f207998i.h1();
                kotlin.jvm.internal.o.f(h17, "getKey(...)");
                p2Var.b(this.f207996g, this.f207997h, h17);
            }
        }
        return jz5.f0.f302826a;
    }
}
