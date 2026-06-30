package zl0;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f473556a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f473557b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f473558c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473559d;

    public java.lang.String a() {
        return this.f473558c + "_" + this.f473559d + "_" + this.f473557b;
    }

    public java.lang.String b() {
        if (android.text.TextUtils.isEmpty(c())) {
            return "";
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(c());
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            return "";
        }
        java.lang.String str2 = a17.f213279f;
        int lastIndexOf = str2.lastIndexOf("/");
        return lastIndexOf < 0 ? str2 : str2.substring(lastIndexOf + 1);
    }

    public java.lang.String c() {
        return zl0.g.f473565b + "/" + a();
    }

    public boolean d() {
        if (android.text.TextUtils.isEmpty(this.f473559d)) {
            return false;
        }
        return (android.text.TextUtils.isEmpty(this.f473558c) || android.text.TextUtils.isEmpty(this.f473557b) || !((java.lang.Long.parseLong(com.tencent.mm.sdk.platformtools.z.f193111g.replace("0x", ""), 16) > java.lang.Long.parseLong(this.f473559d.replace("0x", ""), 16) ? 1 : (java.lang.Long.parseLong(com.tencent.mm.sdk.platformtools.z.f193111g.replace("0x", ""), 16) == java.lang.Long.parseLong(this.f473559d.replace("0x", ""), 16) ? 0 : -1)) >= 0)) ? false : true;
    }

    public java.lang.String toString() {
        return "BaseModel{url='" + this.f473556a + "', md5='" + this.f473557b + "', moduleName='" + this.f473558c + "', minVersion='" + this.f473559d + "'}";
    }
}
