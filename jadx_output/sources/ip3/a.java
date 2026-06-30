package ip3;

/* loaded from: classes5.dex */
public final class a extends com.tencent.mm.modelbase.i {
    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, r45.t45 reportInfo, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
        r45.t10 t10Var = new r45.t10();
        r45.v10 v10Var = new r45.v10();
        r45.xy4 xy4Var = new r45.xy4();
        xy4Var.set(0, str4);
        xy4Var.set(1, str2 == null ? "" : str2);
        xy4Var.set(2, str3 == null ? "" : str3);
        xy4Var.set(3, str5);
        xy4Var.set(4, str6);
        xy4Var.set(5, str7);
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiOpenPalmOpenResource", "[param] palm_file_id:" + xy4Var.getString(0) + ", palm_image_md5:" + xy4Var.getString(3) + ", palm_liveness_image_md5:" + xy4Var.getString(4) + ", palm_video_md5:" + xy4Var.getString(5));
        r45.u10 u10Var = new r45.u10();
        u10Var.set(0, str == null ? "" : str);
        u10Var.set(4, reportInfo);
        u10Var.set(5, 3);
        u10Var.set(6, xy4Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiOpenPalmOpenResource", "[param] sid:" + u10Var.getString(0) + ", cdn_data_format:" + u10Var.getInteger(5));
        t10Var.set(1, u10Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = t10Var;
        lVar.f70665b = v10Var;
        lVar.f70666c = "/cgi-bin/mmpay-bin/industry/checkpalmuseronlineopenresource";
        lVar.f70667d = 5086;
        lVar.f70678o = 2;
        p(lVar.a());
    }
}
