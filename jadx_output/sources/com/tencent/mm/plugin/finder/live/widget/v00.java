package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class v00 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f120017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f120018e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v00(com.tencent.mm.plugin.finder.live.widget.m10 m10Var, r45.fr1 fr1Var) {
        super(2);
        this.f120017d = m10Var;
        this.f120018e = fr1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f120017d;
        if (booleanValue) {
            m10Var.p(this.f120018e);
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
