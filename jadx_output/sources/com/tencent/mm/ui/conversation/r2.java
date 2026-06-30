package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class r2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f208031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f208032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.p2 f208033f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f208034g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f208035h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.l4 f208036i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(android.app.Activity activity, android.content.Intent intent, com.tencent.mm.ui.conversation.p2 p2Var, android.view.View view, int i17, com.tencent.mm.storage.l4 l4Var) {
        super(1);
        this.f208031d = activity;
        this.f208032e = intent;
        this.f208033f = p2Var;
        this.f208034g = view;
        this.f208035h = i17;
        this.f208036i = l4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        kotlin.jvm.internal.o.d(bool);
        if (bool.booleanValue()) {
            ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Ri(this.f208031d, this.f208032e);
            com.tencent.mm.ui.conversation.p2 p2Var = this.f208033f;
            if (p2Var != null) {
                java.lang.String h17 = this.f208036i.h1();
                kotlin.jvm.internal.o.f(h17, "getKey(...)");
                p2Var.b(this.f208034g, this.f208035h, h17);
            }
        }
        return jz5.f0.f302826a;
    }
}
