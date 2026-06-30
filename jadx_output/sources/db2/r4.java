package db2;

/* loaded from: classes3.dex */
public abstract class r4 {
    public static r45.ru0 a(r45.ru0 ru0Var, java.lang.String str, java.lang.String str2, int i17, long j17, r45.u32 u32Var, java.lang.String str3, int i18, int i19, java.lang.String str4, java.lang.String str5, int i27, java.lang.String str6, java.util.LinkedList linkedList, java.lang.String str7, int i28, java.lang.Object obj) {
        java.lang.String str8 = (i28 & 1) != 0 ? null : str;
        java.lang.String str9 = (i28 & 2) != 0 ? null : str2;
        int i29 = (i28 & 4) != 0 ? 0 : i17;
        long j18 = (i28 & 8) != 0 ? 0L : j17;
        r45.u32 u32Var2 = (i28 & 16) != 0 ? null : u32Var;
        java.lang.String str10 = (i28 & 32) != 0 ? null : str3;
        int i37 = (i28 & 64) != 0 ? 0 : i18;
        int i38 = (i28 & 128) != 0 ? 0 : i19;
        java.lang.String str11 = (i28 & 256) != 0 ? null : str4;
        java.lang.String str12 = (i28 & 512) == 0 ? str5 : null;
        int i39 = (i28 & 1024) == 0 ? i27 : 0;
        java.lang.String qrcodeUrl = (i28 & 2048) != 0 ? "" : str6;
        java.util.LinkedList noticeTypeList = (i28 & 4096) != 0 ? new java.util.LinkedList() : linkedList;
        java.lang.String gmsg_id = (i28 & 8192) != 0 ? "" : str7;
        kotlin.jvm.internal.o.g(ru0Var, "<this>");
        kotlin.jvm.internal.o.g(qrcodeUrl, "qrcodeUrl");
        kotlin.jvm.internal.o.g(noticeTypeList, "noticeTypeList");
        kotlin.jvm.internal.o.g(gmsg_id, "gmsg_id");
        ru0Var.set(1, str8);
        ru0Var.set(2, str9);
        ru0Var.set(3, java.lang.Integer.valueOf(i29));
        ru0Var.set(4, java.lang.Long.valueOf(j18));
        ru0Var.set(5, u32Var2);
        ru0Var.set(6, str10);
        ru0Var.set(7, java.lang.Integer.valueOf(i37));
        ru0Var.set(8, java.lang.Integer.valueOf(i38));
        ru0Var.set(9, str11);
        ru0Var.set(10, str12);
        ru0Var.set(11, java.lang.Integer.valueOf(i39));
        ru0Var.set(12, qrcodeUrl);
        ru0Var.set(13, noticeTypeList);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ru0Var.set(15, xy2.c.e(context));
        ru0Var.set(16, db2.t4.f228171a.a(6276));
        ru0Var.set(17, gmsg_id);
        return ru0Var;
    }
}
