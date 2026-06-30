package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class u00 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f119923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f119924e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f119925f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.xq1 f119926g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119927h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u00(com.tencent.mm.plugin.finder.live.widget.m10 m10Var, int i17, r45.fr1 fr1Var, r45.xq1 xq1Var, java.lang.String str) {
        super(2);
        this.f119923d = m10Var;
        this.f119924e = i17;
        this.f119925f = fr1Var;
        this.f119926g = xq1Var;
        this.f119927h = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f119923d;
        if (booleanValue) {
            m10Var.o(this.f119924e, this.f119925f, this.f119926g, this.f119927h);
        } else {
            android.content.Context context = m10Var.f118999a.getContext();
            if (str == null) {
                str = "";
            }
            if (str.length() == 0) {
                str = m10Var.f118999a.getContext().getString(com.tencent.mm.R.string.dgq);
                kotlin.jvm.internal.o.f(str, "getString(...)");
            }
            db5.t7.g(context, str);
        }
        return jz5.f0.f302826a;
    }
}
