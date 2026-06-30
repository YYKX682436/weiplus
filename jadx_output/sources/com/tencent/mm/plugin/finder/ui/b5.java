package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class b5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ix0 f128935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.d5 f128936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ro4 f128937f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(r45.ix0 ix0Var, com.tencent.mm.plugin.finder.ui.d5 d5Var, r45.ro4 ro4Var) {
        super(0);
        this.f128935d = ix0Var;
        this.f128936e = d5Var;
        this.f128937f = ro4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.et2 et2Var;
        java.util.LinkedList list;
        java.lang.Object obj;
        g92.b bVar;
        m92.b j37;
        r45.dt2 dt2Var;
        java.util.LinkedList list2;
        java.lang.Object obj2;
        int integer = this.f128935d.getInteger(1);
        com.tencent.mm.plugin.finder.ui.d5 d5Var = this.f128936e;
        r45.ro4 ro4Var = this.f128937f;
        if (integer == 0) {
            com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) d5Var.f129052b).h("reference_" + ro4Var.getInteger(1));
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = h17 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h17 : null;
            if (checkBoxPreference != null) {
                boolean z17 = ro4Var.getInteger(0) == 1;
                checkBoxPreference.O(z17);
                ya2.b2 b17 = ya2.h.f460484a.b(d5Var.f129053c);
                int integer2 = ro4Var.getInteger(1);
                int integer3 = ro4Var.getInteger(0);
                if (b17 != null) {
                    r45.et2 et2Var2 = b17.field_reference_info;
                    if (et2Var2 == null || (list2 = et2Var2.getList(0)) == null) {
                        dt2Var = null;
                    } else {
                        java.util.Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (((r45.dt2) obj2).getInteger(0) == integer2) {
                                break;
                            }
                        }
                        dt2Var = (r45.dt2) obj2;
                    }
                    if (dt2Var != null) {
                        dt2Var.set(2, java.lang.Integer.valueOf(integer3));
                        ya2.h.f460484a.o(b17);
                    }
                }
                if (ro4Var.getInteger(1) == 2) {
                    if (b17 != null) {
                        long j17 = b17.field_additionalFlag;
                        b17.field_additionalFlag = z17 ? (-17) & j17 : 16 | j17;
                        ya2.h.f460484a.o(b17);
                    }
                } else if (ro4Var.getInteger(1) == 1 && (j37 = g92.a.j3((bVar = g92.b.f269769e), d5Var.f129053c, false, 2, null)) != null) {
                    java.lang.String username = d5Var.f129053c;
                    kotlin.jvm.internal.o.g(username, "username");
                    int i17 = j37.field_extFlag;
                    int i18 = z17 ? i17 & (-257) : i17 | 256;
                    m92.c cVar = new m92.c(username);
                    cVar.field_extFlag = i18;
                    bVar.C(cVar, m92.j.f324997o);
                }
            }
        } else {
            ya2.b2 b18 = ya2.h.f460484a.b(d5Var.f129053c);
            if (b18 != null && (et2Var = b18.field_reference_info) != null && (list = et2Var.getList(0)) != null) {
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it6.next();
                    if (((r45.dt2) obj).getInteger(0) == ro4Var.getInteger(1)) {
                        break;
                    }
                }
                r45.dt2 dt2Var2 = (r45.dt2) obj;
                if (dt2Var2 != null) {
                    com.tencent.mm.ui.base.preference.Preference h18 = ((com.tencent.mm.ui.base.preference.h0) d5Var.f129052b).h("reference_" + ro4Var.getInteger(1));
                    com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = h18 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h18 : null;
                    if (checkBoxPreference2 != null) {
                        checkBoxPreference2.O(dt2Var2.getInteger(2) == 1);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
