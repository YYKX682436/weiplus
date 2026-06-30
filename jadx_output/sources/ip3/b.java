package ip3;

/* loaded from: classes5.dex */
public final class b extends com.tencent.mm.modelbase.i {
    public b(java.lang.String str, java.lang.Integer num, java.lang.String str2, java.lang.String str3, java.lang.Integer num2, java.lang.Integer num3) {
        r45.p10 p10Var = new r45.p10();
        r45.r10 r10Var = new r45.r10();
        r45.q10 q10Var = new r45.q10();
        q10Var.set(0, str == null ? "" : str);
        q10Var.set(1, java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
        q10Var.set(2, str2 == null ? "" : str2);
        q10Var.set(3, wo.w0.n());
        q10Var.set(4, 1);
        q10Var.set(5, str3 != null ? str3 : "");
        q10Var.set(6, java.lang.Integer.valueOf(num2 != null ? num2.intValue() : 1));
        q10Var.set(7, java.lang.Integer.valueOf(num3 != null ? num3.intValue() : 4));
        p10Var.set(1, q10Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[param] sessionId: ");
        sb6.append(str);
        sb6.append(", palmCaptureMode: ");
        sb6.append(num);
        sb6.append(", sdkVersion: ");
        sb6.append(str2);
        sb6.append(", phoneUuid: ");
        r45.q10 q10Var2 = (r45.q10) p10Var.getCustom(1);
        sb6.append(q10Var2 != null ? q10Var2.getString(3) : null);
        sb6.append(", appVersion: ");
        sb6.append(str3);
        sb6.append(", palmSideLimit: ");
        sb6.append(num2);
        sb6.append(", languageType:");
        sb6.append(num3);
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiOpenPalmServiceAuth", sb6.toString());
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = p10Var;
        lVar.f70665b = r10Var;
        lVar.f70666c = "/cgi-bin/mmpay-bin/industry/checkonlineopenpalmserviceauth";
        lVar.f70667d = 5090;
        lVar.f70678o = 2;
        p(lVar.a());
    }
}
