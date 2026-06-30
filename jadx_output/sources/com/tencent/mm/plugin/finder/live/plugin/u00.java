package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class u00 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.w00 f114504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f114505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f114506f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u00(com.tencent.mm.plugin.finder.live.plugin.w00 w00Var, yz5.l lVar, r45.xn1 xn1Var) {
        super(0);
        this.f114504d = w00Var;
        this.f114505e = lVar;
        this.f114506f = xn1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar;
        com.tencent.mm.plugin.finder.live.plugin.w00 w00Var = this.f114504d;
        com.tencent.mm.plugin.finder.live.widget.hp hpVar = w00Var.E;
        android.view.View view = hpVar.W1;
        if (view != null && (lVar = hpVar.M) != null) {
            lVar.invoke(view);
        }
        w00Var.w1();
        this.f114505e.invoke(this.f114506f);
        w00Var.E.getClass();
        return jz5.f0.f302826a;
    }
}
