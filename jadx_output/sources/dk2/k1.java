package dk2;

/* loaded from: classes3.dex */
public final class k1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.r f233675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233676b;

    public k1(yz5.r rVar, dk2.r4 r4Var) {
        this.f233675a = rVar;
        this.f233676b = r4Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.x71 x71Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0 && (x71Var = (r45.x71) fVar.f70618d) != null) {
            dk2.r4 r4Var = this.f233676b;
            mm2.f5 f5Var = (mm2.f5) r4Var.m(mm2.f5.class);
            java.util.ArrayList arrayList = f5Var.f329024f;
            arrayList.clear();
            arrayList.addAll(x71Var.getList(1));
            java.util.ArrayList arrayList2 = f5Var.f329026h;
            arrayList2.clear();
            arrayList2.addAll(x71Var.getList(3));
            f5Var.f329027i = x71Var.getInteger(5);
            f5Var.f329028m = x71Var.getInteger(6);
            f5Var.f329025g = (r45.xn1) x71Var.getCustom(7);
            java.lang.String string = x71Var.getString(13);
            if (string == null) {
                string = "";
            }
            f5Var.f329029n = string;
            f5Var.f329030o = x71Var.getInteger(19);
            ((mm2.e1) r4Var.m(mm2.e1.class)).f328988r.set(1, java.lang.Integer.valueOf(x71Var.getInteger(5)));
            ((mm2.c1) r4Var.m(mm2.c1.class)).f328887t4 = x71Var.getInteger(9);
            ((mm2.c1) r4Var.m(mm2.c1.class)).f328893u4 = x71Var.getInteger(10);
            ((mm2.c1) r4Var.m(mm2.c1.class)).f328838l5.clear();
            ((mm2.c1) r4Var.m(mm2.c1.class)).f328838l5.addAll(x71Var.getList(11));
            if (!zl2.r4.f473950a.w1()) {
                mm2.f5 f5Var2 = (mm2.f5) r4Var.m(mm2.f5.class);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("online member enableComment:");
                r45.xn1 xn1Var = ((mm2.f5) f5Var2.business(mm2.f5.class)).f329025g;
                sb6.append(xn1Var != null ? java.lang.Integer.valueOf(xn1Var.getInteger(1)) : null);
                com.tencent.mars.xlog.Log.i("MMFinder.LiveOnlineMemberSlice", sb6.toString());
                r45.xn1 xn1Var2 = ((mm2.f5) f5Var2.business(mm2.f5.class)).f329025g;
                if (xn1Var2 != null) {
                    if (xn1Var2.getInteger(1) == 1) {
                        ((mm2.c1) f5Var2.business(mm2.c1.class)).f328896v = true;
                    } else if (xn1Var2.getInteger(1) == 0) {
                        ((mm2.c1) f5Var2.business(mm2.c1.class)).f328896v = false;
                    }
                }
            }
        }
        yz5.r rVar = this.f233675a;
        if (rVar == null) {
            return null;
        }
        rVar.C(java.lang.Integer.valueOf(fVar.f70616b), java.lang.Integer.valueOf(fVar.f70615a), fVar.f70617c, fVar.f70618d);
        return jz5.f0.f302826a;
    }
}
