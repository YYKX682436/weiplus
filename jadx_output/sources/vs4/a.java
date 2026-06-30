package vs4;

/* loaded from: classes9.dex */
public final class a extends com.tencent.mm.modelbase.i {
    public a(java.lang.String str, java.lang.String str2) {
        r45.bn4 bn4Var = new r45.bn4();
        r45.cn4 cn4Var = new r45.cn4();
        bn4Var.f370892f = wo.w0.n();
        java.lang.String j17 = gm0.j1.b().j();
        kotlin.jvm.internal.o.f(j17, "getUinString(...)");
        bn4Var.f370891e = java.lang.Long.parseLong(j17);
        bn4Var.f370893g = java.lang.System.currentTimeMillis();
        bn4Var.f370895i = str;
        if (str2 != null) {
            if (str2.length() > 15360) {
                java.lang.String substring = str2.substring(0, 15360);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                bn4Var.f370894h = substring;
            } else {
                bn4Var.f370894h = str2;
            }
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = bn4Var;
        lVar.f70665b = cn4Var;
        lVar.f70666c = "/cgi-bin/mmpay-bin/sec/report_mmpaysecreport";
        lVar.f70667d = 28828;
        lVar.f70678o = 2;
        p(lVar.a());
    }
}
