package dn;

/* loaded from: classes15.dex */
public abstract class e {
    public static dn.o a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        dn.o oVar = new dn.o();
        oVar.field_mediaId = str;
        oVar.field_fileId = str3;
        oVar.field_aesKey = str4;
        oVar.field_fullpath = str5;
        oVar.M1 = str2;
        oVar.f241811z = str2;
        oVar.f241791l1 = true;
        oVar.f241789h = 8;
        oVar.field_appType = 8;
        oVar.field_fileType = 5;
        bw5.ei0 ei0Var = new bw5.ei0();
        ei0Var.f26929h = bw5.fi0.VIDEO;
        boolean[] zArr = ei0Var.f26930i;
        zArr[5] = true;
        ei0Var.f26925d = str6;
        zArr[1] = true;
        ei0Var.f26926e = "index.m3u8";
        zArr[2] = true;
        try {
            oVar.P = ei0Var.toByteArray();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("TaskInfoCreator", "buildRequestTask failed. %s", e17.getMessage());
        }
        return oVar;
    }

    public static dn.o b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        dn.o oVar = new dn.o();
        oVar.field_mediaId = str;
        oVar.field_fileId = str2;
        oVar.field_aesKey = str3;
        oVar.field_fullpath = str4;
        oVar.M1 = "master.m3u8";
        oVar.f241811z = "master.m3u8";
        oVar.f241789h = 8;
        oVar.field_appType = 8;
        oVar.field_fileType = 5;
        bw5.ei0 ei0Var = new bw5.ei0();
        ei0Var.f26929h = bw5.fi0.VIDEO;
        boolean[] zArr = ei0Var.f26930i;
        zArr[5] = true;
        ei0Var.f26925d = str5;
        zArr[1] = true;
        ei0Var.f26926e = "index.m3u8";
        zArr[2] = true;
        try {
            oVar.P = ei0Var.toByteArray();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("TaskInfoCreator", "buildRequestTask failed. %s", e17.getMessage());
        }
        return oVar;
    }
}
