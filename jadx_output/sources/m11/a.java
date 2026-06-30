package m11;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f322621a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f322622b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f322623c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f322624d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f322625e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f322626f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f322627g;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f322621a = str;
        this.f322622b = str2;
        this.f322624d = str3;
        this.f322623c = str4;
    }

    public static java.lang.String a(m11.a aVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (aVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(aVar.f322621a)) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            java.lang.String str = aVar.f322621a;
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            java.lang.String str2 = aVar.f322622b;
            if (str2 == null) {
                str2 = "";
            }
            objArr[1] = str2;
            java.lang.String str3 = aVar.f322624d;
            if (str3 == null) {
                str3 = "";
            }
            objArr[2] = str3;
            java.lang.String str4 = aVar.f322623c;
            objArr[3] = str4 != null ? str4 : "";
            sb6.append(java.lang.String.format("<appinfo><appid>%s</appid><mediatagname>%s</mediatagname><messageext>%s</messageext><messageaction>%s</messageaction></appinfo>", objArr));
            java.lang.String str5 = aVar.f322627g;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                sb6.append(str5);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.f322626f) && !com.tencent.mm.sdk.platformtools.t8.K0(aVar.f322625e)) {
                sb6.append("<platform_signature>");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.p(aVar.f322626f));
                sb6.append("</platform_signature><imgdatahash>");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.p(aVar.f322625e));
                sb6.append("</imgdatahash>");
            }
        }
        return sb6.toString();
    }

    public static java.lang.String b(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        return "<msg>" + str + "</msg>";
    }

    public static m11.a c(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        int indexOf = str.indexOf(60);
        if (indexOf > 0) {
            str = str.substring(indexOf);
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "msg", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgAppInfo", "parseImg failed");
            return null;
        }
        m11.a aVar = new m11.a();
        aVar.f322621a = (java.lang.String) d17.get(".msg.appinfo.appid");
        aVar.f322622b = (java.lang.String) d17.get(".msg.appinfo.mediatagname");
        aVar.f322624d = (java.lang.String) d17.get(".msg.appinfo.messageext");
        aVar.f322623c = (java.lang.String) d17.get(".msg.appinfo.messageaction");
        aVar.f322626f = (java.lang.String) d17.get(".msg.platform_signature");
        aVar.f322625e = (java.lang.String) d17.get(".msg.imgdatahash");
        return aVar;
    }

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f322621a = str;
        this.f322622b = str2;
        this.f322624d = str3;
        this.f322623c = str4;
        this.f322627g = str5;
    }
}
