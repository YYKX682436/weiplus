package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ub extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.viewmodel.component.ub f136120d = new com.tencent.mm.plugin.finder.viewmodel.component.ub();

    public ub() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        r45.u94 u94Var;
        java.util.LinkedList list;
        com.tencent.mm.plugin.finder.assist.i2 i2Var = com.tencent.mm.plugin.finder.assist.i2.f102246a;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 && ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127759ih).getValue()).r()).booleanValue()) {
            return com.tencent.mm.plugin.finder.assist.i2.f102248c;
        }
        r45.w11 w11Var = com.tencent.mm.plugin.finder.assist.i2.f102247b;
        if (w11Var == null || (u94Var = (r45.u94) w11Var.getCustom(0)) == null || (list = u94Var.getList(2)) == null) {
            return kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((java.lang.Integer) it.next()).intValue()));
        }
        return arrayList;
    }
}
