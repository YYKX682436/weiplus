package j34;

/* loaded from: classes9.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public java.util.LinkedList f297491a = new java.util.LinkedList();

    public static j34.f a(java.util.Map map, int i17, java.lang.String str) {
        j34.f fVar = new j34.f(i17);
        java.lang.String str2 = (java.lang.String) map.get(str + ".title");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        fVar.f297485b = str2;
        java.lang.String str3 = (java.lang.String) map.get(str + ".summary");
        if (str3 == null) {
            str3 = "";
        }
        fVar.f297486c = str3;
        java.lang.String str4 = str + ".thumburl";
        int i18 = 0;
        while (i18 < 100) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str4);
            sb6.append(i18 > 0 ? java.lang.Integer.valueOf(i18) : "");
            java.lang.String str5 = (java.lang.String) map.get(sb6.toString());
            if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                break;
            }
            ((java.util.ArrayList) fVar.f297488e).add(str5);
            i18++;
        }
        if (i17 == 3) {
            java.lang.String str6 = (java.lang.String) map.get(str + ".h5url.link");
            if (str6 == null) {
                str6 = "";
            }
            fVar.f297487d = str6;
            java.lang.String str7 = (java.lang.String) map.get(str + ".h5url.title");
            if (str7 == null) {
                str7 = "";
            }
            fVar.f297489f = str7;
            java.lang.String str8 = (java.lang.String) map.get(str + ".h5url.username");
            fVar.f297490g = str8 != null ? str8 : "";
        } else if (i17 == 4) {
            java.lang.String str9 = (java.lang.String) map.get(str + ".bizprofile.username");
            if (str9 == null) {
                str9 = "";
            }
            fVar.f297487d = str9;
            java.lang.String str10 = (java.lang.String) map.get(str + ".bizprofile.showchat");
            fVar.f297489f = str10 != null ? str10 : "";
        } else if (i17 == 5) {
            java.lang.String str11 = (java.lang.String) map.get(str + ".nativepay.wx_pay_url");
            fVar.f297487d = str11 != null ? str11 : "";
        } else if (i17 == 6) {
            java.lang.String str12 = (java.lang.String) map.get(str + ".product.product_id");
            fVar.f297487d = str12 != null ? str12 : "";
        }
        return fVar;
    }
}
