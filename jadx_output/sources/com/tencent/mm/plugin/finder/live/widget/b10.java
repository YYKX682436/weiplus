package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class b10 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f117807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f117808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f117809f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.xq1 f117810g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b10(com.tencent.mm.plugin.finder.live.widget.m10 m10Var, int i17, r45.fr1 fr1Var, r45.xq1 xq1Var) {
        super(2);
        this.f117807d = m10Var;
        this.f117808e = i17;
        this.f117809f = fr1Var;
        this.f117810g = xq1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f117807d;
        if (booleanValue) {
            m10Var.C = -1;
            m10Var.o(this.f117808e, this.f117809f, this.f117810g, null);
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
        com.tencent.mm.ui.widget.dialog.y1 y1Var = m10Var.f119013o;
        if (y1Var != null) {
            y1Var.q();
        }
        return jz5.f0.f302826a;
    }
}
