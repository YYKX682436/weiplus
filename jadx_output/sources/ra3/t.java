package ra3;

/* loaded from: classes9.dex */
public final class t {
    public t(kotlin.jvm.internal.i iVar) {
    }

    public final ra3.u a(org.json.JSONObject json) {
        kotlin.jvm.internal.o.g(json, "json");
        java.lang.String string = json.getString("fileId");
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = json.getString("aesKey");
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.String string3 = json.getString(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        java.lang.String string4 = json.getString("fileExt");
        kotlin.jvm.internal.o.f(string4, "getString(...)");
        java.lang.String string5 = json.getString("md5");
        kotlin.jvm.internal.o.f(string5, "getString(...)");
        java.lang.String string6 = json.getString("fileSize");
        kotlin.jvm.internal.o.f(string6, "getString(...)");
        return new ra3.u(string, string2, string3, string4, string5, java.lang.Long.parseLong(string6));
    }
}
