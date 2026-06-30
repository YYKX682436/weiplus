package j72;

/* loaded from: classes9.dex */
public final class e extends com.tencent.mm.modelbase.i {
    public e(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        r45.rl5 rl5Var = new r45.rl5();
        rl5Var.f384981e = num != null ? num.intValue() : 0;
        rl5Var.f384982f = str == null ? "" : str;
        rl5Var.f384983g = str2 == null ? "" : str2;
        rl5Var.f384984h = str3 == null ? "" : str3;
        rl5Var.f384985i = str4 == null ? "" : str4;
        rl5Var.f384986m = str5 == null ? "" : str5;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRecordExtraVideo", "[param] scene: " + rl5Var.f384981e + ", package_name: " + rl5Var.f384982f + ", package_sign: " + rl5Var.f384983g + ", serial_id: " + rl5Var.f384984h + ", video_id: " + rl5Var.f384985i + ", aes_key: " + rl5Var.f384986m);
        r45.sl5 sl5Var = new r45.sl5();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = rl5Var;
        lVar.f70665b = sl5Var;
        lVar.f70666c = "/cgi-bin/mmpay-bin/sec/recordextravideo";
        lVar.f70667d = 26256;
        lVar.f70678o = 2;
        p(lVar.a());
    }
}
