package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class g00 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.w00 f112619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g00(com.tencent.mm.plugin.finder.live.plugin.w00 w00Var) {
        super(2);
        this.f112619d = w00Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.content.res.Resources resources;
        int i17;
        android.content.res.Resources resources2;
        int i18;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        com.tencent.mm.plugin.finder.live.plugin.w00 w00Var = this.f112619d;
        if (booleanValue) {
            if (w00Var.M) {
                qo0.c.a(w00Var.f114842p, qo0.b.f365339d2, null, 2, null);
            }
            android.view.ViewGroup viewGroup = w00Var.f365323d;
            if (booleanValue2) {
                resources2 = viewGroup.getContext().getResources();
                i18 = com.tencent.mm.R.string.e7p;
            } else {
                resources2 = viewGroup.getContext().getResources();
                i18 = com.tencent.mm.R.string.e7n;
            }
            java.lang.String string = resources2.getString(i18);
            kotlin.jvm.internal.o.d(string);
            db5.t7.h(viewGroup.getContext(), string);
        } else {
            java.lang.String string2 = w00Var.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.e7a);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            android.view.ViewGroup viewGroup2 = w00Var.f365323d;
            if (booleanValue2) {
                resources = viewGroup2.getContext().getResources();
                i17 = com.tencent.mm.R.string.e7i;
            } else {
                resources = viewGroup2.getContext().getResources();
                i17 = com.tencent.mm.R.string.e7o;
            }
            java.lang.String string3 = resources.getString(i17);
            kotlin.jvm.internal.o.d(string3);
            db5.t7.g(viewGroup2.getContext(), string2.concat(string3));
        }
        return jz5.f0.f302826a;
    }
}
