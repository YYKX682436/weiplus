package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class o00 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.w00 f113691d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(com.tencent.mm.plugin.finder.live.plugin.w00 w00Var) {
        super(2);
        this.f113691d = w00Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        com.tencent.mm.plugin.finder.live.plugin.w00 w00Var = this.f113691d;
        if (booleanValue) {
            if (w00Var.M) {
                qo0.c.a(w00Var.f114842p, qo0.b.f365339d2, null, 2, null);
            }
            android.view.ViewGroup viewGroup = w00Var.f365323d;
            java.lang.String string = booleanValue2 ? viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.ecr) : viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.ecq);
            kotlin.jvm.internal.o.d(string);
            db5.t7.h(viewGroup.getContext(), string);
        } else {
            java.lang.String string2 = w00Var.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.ecp);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            db5.t7.g(w00Var.f365323d.getContext(), string2);
        }
        return jz5.f0.f302826a;
    }
}
