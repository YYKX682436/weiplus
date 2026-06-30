package xw3;

/* loaded from: classes.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(r45.dp5 repairerItem, boolean z17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(repairerItem, "repairerItem");
        str = "";
        if (repairerItem.getInteger(2) == 3) {
            int i17 = 0;
            java.lang.String string = repairerItem.getString(0);
            if (string != null) {
                java.lang.String str2 = (java.lang.String) r26.n0.f0(string, new java.lang.String[]{"_"}, false, 0, 6, null).get(r3.size() - 1);
                switch (str2.hashCode()) {
                    case -1808118735:
                        if (str2.equals("String")) {
                            bm5.o1 o1Var = bm5.o1.f22719a;
                            java.lang.String string2 = repairerItem.getString(0);
                            if (string2 == null) {
                                string2 = "";
                            }
                            java.lang.String string3 = repairerItem.getString(8);
                            str = o1Var.c(string2, string3 != null ? string3 : "").toString();
                            break;
                        }
                        break;
                    case 73679:
                        if (str2.equals("Int")) {
                            int P = com.tencent.mm.sdk.platformtools.t8.P(repairerItem.getString(8), 0);
                            bm5.o1 o1Var2 = bm5.o1.f22719a;
                            java.lang.String string4 = repairerItem.getString(0);
                            if (string4 == null) {
                                string4 = "";
                            }
                            java.lang.Object c17 = o1Var2.c(string4, java.lang.Integer.valueOf(P));
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append(c17);
                            java.util.LinkedList list = repairerItem.getList(6);
                            kotlin.jvm.internal.o.f(list, "getValueAlias(...)");
                            java.lang.Integer num = c17 instanceof java.lang.Integer ? (java.lang.Integer) c17 : null;
                            java.lang.String str3 = (java.lang.String) kz5.n0.a0(list, num != null ? num.intValue() : 0);
                            if (str3 != null) {
                                java.lang.String str4 = "(" + str3 + ')';
                                if (str4 != null) {
                                    str = str4;
                                }
                            }
                            sb6.append(str);
                            str = sb6.toString();
                            break;
                        }
                        break;
                    case 2374300:
                        if (str2.equals("Long")) {
                            long V = com.tencent.mm.sdk.platformtools.t8.V(repairerItem.getString(8), 0L);
                            bm5.o1 o1Var3 = bm5.o1.f22719a;
                            java.lang.String string5 = repairerItem.getString(0);
                            str = o1Var3.c(string5 != null ? string5 : "", java.lang.Long.valueOf(V)).toString();
                            break;
                        }
                        break;
                    case 67973692:
                        if (str2.equals("Float")) {
                            float L = com.tencent.mm.sdk.platformtools.t8.L(repairerItem.getString(8), 0.0f);
                            bm5.o1 o1Var4 = bm5.o1.f22719a;
                            java.lang.String string6 = repairerItem.getString(0);
                            str = o1Var4.c(string6 != null ? string6 : "", java.lang.Float.valueOf(L)).toString();
                            break;
                        }
                        break;
                }
            }
            if (z17) {
                java.util.LinkedList list2 = repairerItem.getList(3);
                kotlin.jvm.internal.o.f(list2, "getValues(...)");
                for (java.lang.Object obj : list2) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    if (kotlin.jvm.internal.o.b(str, (java.lang.String) obj)) {
                        java.lang.Object obj2 = repairerItem.getList(6).get(i17);
                        kotlin.jvm.internal.o.f(obj2, "get(...)");
                        return (java.lang.String) obj2;
                    }
                    i17 = i18;
                }
            }
        }
        return str;
    }
}
