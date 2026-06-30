package com.tencent.mm.ui.chatting.history.groups;

/* loaded from: classes10.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f201775a = 0;

    public static final void a(java.util.List list, java.util.Map map, int i17) {
        if (map == null || i17 <= 1) {
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = list.iterator();
        java.lang.String str = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            uc5.l0 l0Var = (uc5.l0) it.next();
            if (l0Var instanceof uc5.k0) {
                str = ((uc5.k0) l0Var).f426518e;
            } else if ((l0Var instanceof uc5.h0) && str != null) {
                java.lang.Integer num = (java.lang.Integer) linkedHashMap.get(str);
                linkedHashMap.put(str, java.lang.Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            }
        }
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i18 = size - 1;
            uc5.l0 l0Var2 = (uc5.l0) list.get(size);
            if (l0Var2 instanceof uc5.k0) {
                uc5.k0 k0Var = (uc5.k0) l0Var2;
                java.lang.Integer num2 = (java.lang.Integer) map.get(k0Var.f426518e);
                if (num2 != null) {
                    int intValue = num2.intValue();
                    java.lang.String str2 = k0Var.f426518e;
                    java.lang.Integer num3 = (java.lang.Integer) linkedHashMap.get(str2);
                    int intValue2 = intValue - (num3 != null ? num3.intValue() : 0);
                    if (intValue2 < 0) {
                        intValue2 = 0;
                    }
                    int i19 = intValue2 % i17;
                    if (i19 != 0) {
                        e06.k m17 = e06.p.m(0, i19);
                        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
                        java.util.Iterator it6 = m17.iterator();
                        while (((e06.j) it6).hasNext()) {
                            arrayList.add(new uc5.j0(str2, ((kz5.x0) it6).b(), k0Var.f426520g));
                        }
                        list.addAll(size + 1, arrayList);
                    }
                }
            }
            if (i18 < 0) {
                return;
            } else {
                size = i18;
            }
        }
    }
}
