package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes10.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.util.a0 f115437a = new com.tencent.mm.plugin.finder.live.util.a0();

    public java.lang.String a(java.util.List list) {
        java.lang.String str = "<this>";
        kotlin.jvm.internal.o.g(list, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" [ ");
        int i17 = 0;
        int i18 = 0;
        for (java.lang.Object obj : list) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.r22 r22Var = (r45.r22) obj;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(" teamIndex: ");
            sb7.append(i18);
            char c17 = ' ';
            sb7.append(' ');
            kotlin.jvm.internal.o.g(r22Var, str);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append("result: " + r22Var.getInteger(2) + ' ');
            sb8.append("count: " + r22Var.getLong(3) + ' ');
            sb8.append("reward_wecoin: " + r22Var.getLong(1) + ' ');
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("teamsMember: ");
            java.util.LinkedList list2 = r22Var.getList(i17);
            kotlin.jvm.internal.o.f(list2, "getMembers(...)");
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder(" [ ");
            int i27 = i17;
            for (java.lang.Object obj2 : list2) {
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.wk6 wk6Var = (r45.wk6) obj2;
                java.lang.StringBuilder sb11 = new java.lang.StringBuilder(" index: ");
                sb11.append(i27);
                sb11.append(c17);
                kotlin.jvm.internal.o.g(wk6Var, str);
                java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
                java.lang.StringBuilder sb13 = new java.lang.StringBuilder(" finder_username: ");
                java.lang.String str2 = str;
                sb13.append(wk6Var.getString(0));
                sb13.append(", ");
                sb12.append(sb13.toString());
                sb12.append(" sdk_user_id: " + wk6Var.getString(1));
                sb12.append(" seat_id: " + wk6Var.getInteger(2));
                java.lang.String sb14 = sb12.toString();
                kotlin.jvm.internal.o.f(sb14, "toString(...)");
                sb11.append(sb14);
                sb11.append(" , ");
                sb10.append(sb11.toString());
                i27 = i28;
                str = str2;
                c17 = ' ';
            }
            java.lang.String str3 = str;
            sb10.append(" ] ");
            java.lang.String sb15 = sb10.toString();
            kotlin.jvm.internal.o.f(sb15, "toString(...)");
            sb9.append(sb15);
            sb9.append(' ');
            sb8.append(sb9.toString());
            java.lang.String sb16 = sb8.toString();
            kotlin.jvm.internal.o.f(sb16, "toString(...)");
            sb7.append(sb16);
            sb7.append(" ; ");
            sb6.append(sb7.toString());
            i18 = i19;
            str = str3;
            i17 = 0;
        }
        sb6.append(" ] ");
        java.lang.String sb17 = sb6.toString();
        kotlin.jvm.internal.o.f(sb17, "toString(...)");
        return sb17;
    }
}
