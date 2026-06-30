package ip3;

/* loaded from: classes5.dex */
public final class c extends com.tencent.mm.modelbase.i {
    public c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, r45.t45 reportInfo, java.lang.String str5) {
        kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
        r45.pu6 pu6Var = new r45.pu6();
        r45.ru6 ru6Var = new r45.ru6();
        r45.xy4 xy4Var = new r45.xy4();
        xy4Var.set(0, str4);
        xy4Var.set(1, str2 == null ? "" : str2);
        xy4Var.set(2, str3 == null ? "" : str3);
        xy4Var.set(3, "");
        xy4Var.set(4, "");
        xy4Var.set(5, str5);
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiUploadOnlineOpenResource", "[param] palm_file_id:" + xy4Var.getString(0) + ", palm_video_md5:" + xy4Var.getString(5));
        r45.qu6 qu6Var = new r45.qu6();
        qu6Var.set(3, str == null ? "" : str);
        qu6Var.set(4, reportInfo);
        qu6Var.set(5, 3);
        qu6Var.set(6, xy4Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiUploadOnlineOpenResource", "[param] session_id:" + qu6Var.getString(3) + ", cdn_data_format:" + qu6Var.getInteger(5));
        pu6Var.set(1, qu6Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = pu6Var;
        lVar.f70665b = ru6Var;
        lVar.f70666c = "/cgi-bin/mmpay-bin/industry/uploadonlineopenresource";
        lVar.f70667d = 29081;
        lVar.f70678o = 2;
        p(lVar.a());
    }
}
