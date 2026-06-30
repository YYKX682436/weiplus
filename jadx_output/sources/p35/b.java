package p35;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f351707a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f351708b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f351709c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f351710d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f351711e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f351712f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f351713g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f351714h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.Map f351715i;

    public b(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18) {
        this.f351707a = str;
        this.f351708b = str2;
        this.f351709c = str3;
        this.f351710d = z17;
        this.f351711e = z18;
    }

    public static void a() {
        c01.d9.b().p().w(8193, "");
        c01.d9.b().p().w(8449, 0L);
    }

    public static java.lang.String b(java.lang.String str) {
        int indexOf = str.indexOf("tips/");
        p35.a aVar = p35.a.DOWNLOAD;
        p35.a aVar2 = p35.a.ASSET;
        p35.a aVar3 = indexOf == 0 ? aVar2 : str.indexOf("weixin://") == 0 ? aVar : p35.a.ERROR;
        if (aVar3 == aVar2) {
            return str;
        }
        if (aVar3 != aVar) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf("/");
        java.lang.String substring = (lastIndexOf < 0 || lastIndexOf >= str.length() + (-1)) ? null : str.substring(lastIndexOf + 1);
        if (substring == null) {
            return null;
        }
        return g83.a.a() + substring;
    }

    public static java.util.ArrayList c(android.content.Context context, java.lang.String str) {
        java.util.HashSet hashSet;
        java.util.Map d17;
        if (str != null && str.length() >= 0) {
            java.lang.String g17 = com.tencent.mm.sdk.platformtools.j.g(context);
            if (g17 == null) {
                hashSet = null;
            } else {
                hashSet = new java.util.HashSet();
                hashSet.add(g17);
                java.lang.String f17 = com.tencent.mm.sdk.platformtools.j.f(context);
                if (f17 != null) {
                    java.lang.String[] split = f17.split("_");
                    java.lang.String str2 = (split == null || split.length < 2) ? null : split[0];
                    hashSet.add(str2 + "_L");
                    hashSet.add(str2 + "_P");
                }
            }
            if (hashSet == null || hashSet.size() <= 0 || (d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "tips", null)) == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i17 = 0;
            while (true) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".tips.tip");
                sb6.append(i17 > 0 ? java.lang.Integer.valueOf(i17) : "");
                java.lang.String sb7 = sb6.toString();
                if (d17.get(sb7) == null) {
                    break;
                }
                java.lang.String str3 = (java.lang.String) d17.get(sb7 + ".$id");
                java.lang.String str4 = (java.lang.String) d17.get(sb7 + ".$platform");
                if (str4.equals(com.eclipsesource.mmv8.Platform.ANDROID)) {
                    p35.b bVar = new p35.b(str3, str4, (java.lang.String) d17.get(sb7 + ".$device"), com.tencent.mm.sdk.platformtools.t8.t1(java.lang.Boolean.valueOf((java.lang.String) d17.get(sb7 + ".$enableclose"))), com.tencent.mm.sdk.platformtools.t8.t1(java.lang.Boolean.valueOf((java.lang.String) d17.get(sb7 + ".$transparentclose"))));
                    int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(sb7 + ".title.$x"), 0);
                    int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(sb7 + ".title.$y"), 0);
                    int P3 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(sb7 + ".title.$width"), 0);
                    int P4 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(sb7 + ".title.$font"), 0);
                    com.tencent.mm.sdk.platformtools.t8.M((java.lang.String) d17.get(sb7 + ".title.$color"), 0);
                    new android.graphics.Rect(P, P2, P3 + P, P4 + P2);
                    int P5 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(sb7 + ".description.$x"), 0);
                    int P6 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(sb7 + ".description.$y"), 0);
                    int P7 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(sb7 + ".description.$width"), 0);
                    int P8 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(sb7 + ".description.$font"), 0);
                    com.tencent.mm.sdk.platformtools.t8.M((java.lang.String) d17.get(sb7 + ".description.$color"), 0);
                    new android.graphics.Rect(P5, P6, P7 + P5, P8 + P6);
                    bVar.f351714h = (java.lang.String) d17.get(sb7 + ".url");
                    bVar.f351712f = (java.lang.String) d17.get(sb7 + ".time.start");
                    bVar.f351713g = (java.lang.String) d17.get(sb7 + ".time.end");
                    java.util.HashMap hashMap = new java.util.HashMap();
                    int i18 = 0;
                    while (true) {
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        sb8.append(sb7);
                        sb8.append(".images.image");
                        sb8.append(i18 > 0 ? java.lang.Integer.valueOf(i18) : "");
                        java.lang.String sb9 = sb8.toString();
                        java.lang.String str5 = (java.lang.String) d17.get(sb9);
                        if (str5 == null) {
                            break;
                        }
                        java.lang.String str6 = (java.lang.String) d17.get(sb9 + ".$type");
                        if (hashSet.contains(str6)) {
                            hashMap.put(str6, str5);
                        }
                        i18++;
                    }
                    if (hashMap.size() > 0) {
                        bVar.f351715i = hashMap;
                    }
                    arrayList.add(bVar);
                }
                i17++;
            }
            arrayList.size();
            if (arrayList.size() > 0) {
                return arrayList;
            }
        }
        return null;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ad.id=");
        sb6.append(this.f351707a);
        sb6.append(", platform=");
        sb6.append(this.f351708b);
        sb6.append(", device=");
        sb6.append(this.f351709c);
        sb6.append(this.f351710d ? ", closable" : "");
        sb6.append(this.f351711e ? ", trans-closable" : "");
        return sb6.toString();
    }
}
