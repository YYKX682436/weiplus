package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.a1 f117105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.m01 f117106e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var, r45.m01 m01Var) {
        super(1);
        this.f117105d = a1Var;
        this.f117106e = m01Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var = this.f117105d;
        if (booleanValue) {
            androidx.appcompat.app.AppCompatActivity activity = a1Var.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            gk2.e eVar = ((com.tencent.mm.plugin.finder.live.viewmodel.u) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.live.viewmodel.u.class)).f117430e;
            if (kz5.z.G(new java.lang.Integer[]{1, 5}, java.lang.Integer.valueOf(this.f117106e.getInteger(0)))) {
                ((mm2.c1) eVar.a(mm2.c1.class)).D5 = true;
            }
            a1Var.a7();
        } else {
            android.app.Activity context = a1Var.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.live.viewmodel.b8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.live.viewmodel.b8.class)).a7();
        }
        return jz5.f0.f302826a;
    }
}
