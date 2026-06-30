package ju1;

/* loaded from: classes9.dex */
public final class h0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ju1.j0 f301723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ju1.o0 f301724b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ju1.a f301725c;

    public h0(ju1.j0 j0Var, ju1.o0 o0Var, ju1.a aVar) {
        this.f301723a = j0Var;
        this.f301724b = o0Var;
        this.f301725c = aVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String ret_msg;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.CouponAndGiftCardViewModel", "do delete card errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        ju1.j0 j0Var = this.f301723a;
        j0Var.f301753h.postValue(java.lang.Boolean.FALSE);
        int i17 = fVar.f70615a;
        androidx.lifecycle.j0 j0Var2 = j0Var.f301752g;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.id0 id0Var = (r45.id0) fVar.f70618d;
            com.tencent.mars.xlog.Log.i("MicroMsg.CouponAndGiftCardViewModel", "do delete card retCode: %s", java.lang.Integer.valueOf(id0Var.f376946d));
            if (id0Var.f376946d == 0) {
                j0Var2.postValue(this.f301724b);
                androidx.lifecycle.j0 j0Var3 = j0Var.f301751f;
                java.util.ArrayList arrayList = (java.util.ArrayList) j0Var3.getValue();
                ju1.a aVar = this.f301725c;
                boolean remove = arrayList != null ? arrayList.remove(aVar) : false;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remove card, is removed: ");
                sb6.append(remove);
                sb6.append(", data type: ");
                sb6.append(aVar.f301688a);
                sb6.append(", errMsg: ");
                r45.tt ttVar = aVar.f301690c;
                sb6.append(ttVar != null ? ttVar.f386765d : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.CouponAndGiftCardViewModel", sb6.toString());
                if (remove) {
                    int i18 = aVar.f301688a;
                    if (i18 == 1) {
                        java.util.ArrayList arrayList2 = j0Var.f301747q;
                        arrayList2.remove(aVar);
                        if (arrayList2.size() == 1) {
                            java.lang.Object remove2 = arrayList2.remove(0);
                            kotlin.jvm.internal.o.f(remove2, "removeAt(...)");
                            ju1.a aVar2 = (ju1.a) remove2;
                            if (arrayList != null) {
                                arrayList.remove(aVar2);
                            }
                        }
                    } else if (i18 == 2) {
                        java.util.ArrayList arrayList3 = j0Var.f301746p;
                        arrayList3.remove(aVar);
                        if (arrayList3.size() == 1) {
                            java.lang.Object remove3 = arrayList3.remove(0);
                            kotlin.jvm.internal.o.f(remove3, "removeAt(...)");
                            ju1.a aVar3 = (ju1.a) remove3;
                            if (arrayList != null) {
                                arrayList.remove(aVar3);
                            }
                        }
                    }
                }
                j0Var3.postValue(arrayList);
                return jz5.f0.f302826a;
            }
            ret_msg = ((r45.id0) fVar.f70618d).f376947e;
            kotlin.jvm.internal.o.f(ret_msg, "ret_msg");
        } else {
            ret_msg = "";
        }
        ju1.o0 o0Var = ju1.o0.f301780m;
        o0Var.f301782d = ret_msg;
        j0Var2.postValue(o0Var);
        return jz5.f0.f302826a;
    }
}
