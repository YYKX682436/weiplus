package tx2;

/* loaded from: classes3.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f422667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f422668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ov2 f422669f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(r45.h32 h32Var, tx2.i0 i0Var, r45.ov2 ov2Var) {
        super(3);
        this.f422667d = h32Var;
        this.f422668e = i0Var;
        this.f422669f = ov2Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        yz5.l lVar;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String errString = (java.lang.String) obj2;
        r45.q62 q62Var = (r45.q62) obj3;
        kotlin.jvm.internal.o.g(errString, "errString");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#runCgiFinderLiveReceiveCoupon isSuccess=");
        sb6.append(booleanValue);
        sb6.append(" errString=");
        sb6.append(errString);
        sb6.append(" wording=");
        sb6.append(q62Var != null ? q62Var.getString(2) : null);
        sb6.append(" coupon_status=");
        sb6.append(q62Var != null ? java.lang.Integer.valueOf(q62Var.getInteger(3)) : null);
        sb6.append(" style=");
        sb6.append(q62Var != null ? java.lang.Integer.valueOf(q62Var.getInteger(5)) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveNoticeBigCardWidget", sb6.toString());
        r45.h32 h32Var = this.f422667d;
        tx2.i0 i0Var = this.f422668e;
        if (q62Var != null) {
            zl2.t.c(h32Var, q62Var, booleanValue);
            i0Var.y();
        }
        if (booleanValue) {
            if (i0Var.f422582h != -1) {
                zl2.g gVar = zl2.g.f473770a;
                java.lang.String string = this.f422669f.getString(1);
                if (string == null) {
                    string = "";
                }
                java.lang.String string2 = h32Var.getString(4);
                gVar.b(string, string2 != null ? string2 : "", i0Var.f422582h);
            }
            r45.ov2 a17 = zl2.t.a(h32Var);
            if (a17 != null && (lVar = i0Var.F) != null) {
                lVar.invoke(a17);
            }
        }
        return jz5.f0.f302826a;
    }
}
