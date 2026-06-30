package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class gd extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.k0 f132154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView f132155e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.kd f132156f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.dd f132157g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd(cm2.k0 k0Var, com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView, com.tencent.mm.plugin.finder.view.kd kdVar, com.tencent.mm.plugin.finder.view.dd ddVar) {
        super(3);
        this.f132154d = k0Var;
        this.f132155e = finderLiveShoppingCouponView;
        this.f132156f = kdVar;
        this.f132157g = ddVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
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
        com.tencent.mars.xlog.Log.i("FinderLiveNoticeSuccessView", sb6.toString());
        if (booleanValue) {
            java.lang.String string = q62Var != null ? q62Var.getString(2) : null;
            int integer = q62Var != null ? q62Var.getInteger(3) : 0;
            java.lang.Integer valueOf = q62Var != null ? java.lang.Integer.valueOf(q62Var.getInteger(4)) : null;
            int integer2 = q62Var != null ? q62Var.getInteger(5) : 0;
            cm2.k0 k0Var = this.f132154d;
            k0Var.j(string, integer, valueOf, integer2);
            this.f132155e.c(k0Var, false, false);
            yz5.l lVar = this.f132156f.f132497s;
            if (lVar != null) {
                lVar.invoke(this.f132157g);
            }
        }
        return jz5.f0.f302826a;
    }
}
