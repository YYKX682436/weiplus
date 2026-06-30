package g83;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f269536a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f269537b;

    /* renamed from: c, reason: collision with root package name */
    public int f269538c;

    /* renamed from: d, reason: collision with root package name */
    public int f269539d;

    /* renamed from: e, reason: collision with root package name */
    public int f269540e;

    /* renamed from: f, reason: collision with root package name */
    public int f269541f;

    /* renamed from: g, reason: collision with root package name */
    public int f269542g;

    /* renamed from: h, reason: collision with root package name */
    public int f269543h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f269544i;

    public java.lang.String a(java.lang.String str) {
        return com.tencent.mm.sdk.platformtools.t8.K0(str) ? "" : str.replace(",", ";");
    }

    public int b(java.lang.String str) {
        java.lang.String str2;
        int i17 = 0;
        try {
            android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(str);
            if (n07 != null && (str2 = n07.outMimeType) != null) {
                java.lang.String lowerCase = str2.toLowerCase();
                if (lowerCase.indexOf("png") >= 0) {
                    i17 = 1;
                } else {
                    if (lowerCase.indexOf("jpg") < 0 && lowerCase.indexOf("jpeg") < 0) {
                        if (lowerCase.indexOf("wxam") >= 0) {
                            i17 = 4;
                        }
                    }
                    i17 = 2;
                }
            }
        } catch (java.lang.Exception unused) {
        }
        if (str.indexOf("png") >= 0) {
            return 1;
        }
        if (str.indexOf("jpg") >= 0 || str.indexOf("jpeg") >= 0) {
            return 2;
        }
        if (str.indexOf("mp4") >= 0) {
            return 3;
        }
        if (str.indexOf("wxam") >= 0) {
            return 4;
        }
        return i17;
    }
}
