package ij4;

/* loaded from: classes11.dex */
public final class k implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f291735d;

    public k(kotlin.jvm.internal.h0 h0Var) {
        this.f291735d = h0Var;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        ai4.e eVar = (ai4.e) obj;
        ai4.e eVar2 = (ai4.e) obj2;
        kotlin.jvm.internal.h0 h0Var = this.f291735d;
        if (r26.i0.q((java.lang.String) h0Var.f310123d, eVar.f5134a, false, 2, null)) {
            if (eVar.f5135b.size() <= 1) {
                return kotlin.jvm.internal.o.i(((mj4.k) ((mj4.h) eVar2.f5135b.get(0))).f327067b.field_CreateTime, ((mj4.k) ((mj4.h) eVar.f5135b.get(0))).f327067b.field_CreateTime);
            }
            int i17 = ((mj4.k) ((mj4.h) eVar.f5135b.get(1))).f327067b.field_CreateTime;
            int i18 = ((mj4.k) ((mj4.h) eVar.f5135b.get(0))).f327067b.field_CreateTime;
            if (i17 < i18) {
                i17 = i18;
            }
            return kotlin.jvm.internal.o.i(((mj4.k) ((mj4.h) eVar2.f5135b.get(0))).f327067b.field_CreateTime, i17);
        }
        if (r26.i0.q((java.lang.String) h0Var.f310123d, eVar2.f5134a, false, 2, null) && eVar2.f5135b.size() > 1) {
            int i19 = ((mj4.k) ((mj4.h) eVar2.f5135b.get(1))).f327067b.field_CreateTime;
            int i27 = ((mj4.k) ((mj4.h) eVar2.f5135b.get(0))).f327067b.field_CreateTime;
            if (i19 < i27) {
                i19 = i27;
            }
            return kotlin.jvm.internal.o.i(i19, ((mj4.k) ((mj4.h) eVar.f5135b.get(0))).f327067b.field_CreateTime);
        }
        return kotlin.jvm.internal.o.i(((mj4.k) ((mj4.h) eVar2.f5135b.get(0))).f327067b.field_CreateTime, ((mj4.k) ((mj4.h) eVar.f5135b.get(0))).f327067b.field_CreateTime);
    }
}
