package zh5;

@j95.b
/* loaded from: classes11.dex */
public final class l0 extends i95.w implements e60.d1 {
    public java.lang.String wi(e60.v0 fileInfo) {
        kotlin.jvm.internal.o.g(fileInfo, "fileInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("cdn://" + fileInfo.f249745a);
        sb6.append("?");
        e60.s0 s0Var = fileInfo.f249748d;
        if (s0Var != null) {
            sb6.append("field_totalLen=" + s0Var.f249725a + '&');
            sb6.append("field_aesKey=" + s0Var.f249727c + '&');
            sb6.append("field_fileId=" + s0Var.f249726b + '&');
            sb6.append("field_authKey=" + s0Var.f249727c + '&');
            sb6.append("download_url=" + s0Var.f249729e + '&');
            sb6.append("field_filemd5=" + s0Var.f249730f + '&');
        }
        sb6.append("thumb_path=" + fileInfo.f249746b + '&');
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("duration_ms=");
        sb7.append(fileInfo.f249747c * 1000);
        sb6.append(sb7.toString());
        return sb6.toString();
    }
}
