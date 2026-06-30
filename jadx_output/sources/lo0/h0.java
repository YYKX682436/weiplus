package lo0;

/* loaded from: classes14.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f319997a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f319998b;

    /* renamed from: c, reason: collision with root package name */
    public final int f319999c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f320000d;

    /* renamed from: e, reason: collision with root package name */
    public final int f320001e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f320002f;

    /* renamed from: g, reason: collision with root package name */
    public final double f320003g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f320004h;

    /* renamed from: i, reason: collision with root package name */
    public final lo0.b f320005i;

    /* renamed from: j, reason: collision with root package name */
    public double f320006j;

    /* renamed from: k, reason: collision with root package name */
    public final int f320007k;

    public h0(org.json.JSONObject itemJson, java.lang.String parentItemResourcePath, java.util.Map badges, lo0.r0 functionalVersion) {
        java.lang.String optString;
        kotlin.jvm.internal.o.g(itemJson, "itemJson");
        kotlin.jvm.internal.o.g(parentItemResourcePath, "parentItemResourcePath");
        kotlin.jvm.internal.o.g(badges, "badges");
        kotlin.jvm.internal.o.g(functionalVersion, "functionalVersion");
        java.lang.String optString2 = itemJson.optString(dm.i4.COL_ID);
        kotlin.jvm.internal.o.d(optString2);
        if (!(optString2.length() == 0)) {
            java.lang.String optString3 = itemJson.optString("displayName");
            kotlin.jvm.internal.o.d(optString3);
            if (!(optString3.length() == 0)) {
                if (functionalVersion.f320072a != 1 || java.lang.Integer.compare(functionalVersion.f320073b ^ Integer.MIN_VALUE, -2147483645) >= 0) {
                    optString = itemJson.optString("uiBackgroundColor");
                    kotlin.jvm.internal.o.f(optString, "optString(...)");
                    if (!(optString.length() == 0)) {
                        itemJson.optBoolean("applyBlurring");
                    } else {
                        throw new lo0.u("Makeup detail item background color is empty. ".concat(optString2));
                    }
                } else {
                    optString = "#80999999";
                }
                try {
                    int parseColor = android.graphics.Color.parseColor(optString);
                    int optInt = itemJson.optInt("order");
                    java.lang.String optString4 = itemJson.optString("badgeId");
                    java.lang.String optString5 = itemJson.optString("resourcePath");
                    kotlin.jvm.internal.o.d(optString5);
                    if (!(optString5.length() == 0)) {
                        lo0.n nVar = lo0.o.f320055a;
                        java.lang.String a17 = nVar.a(optString5, parentItemResourcePath);
                        if (!(a17 == null || a17.length() == 0)) {
                            org.json.JSONObject optJSONObject = itemJson.optJSONObject("attributes");
                            if (!(optJSONObject == null)) {
                                int optInt2 = optJSONObject.optInt("objectType", -1);
                                if (optInt2 != -1) {
                                    double optDouble = optJSONObject.optDouble("defaultValue");
                                    java.lang.String a18 = nVar.a("icon.png", a17);
                                    if (!(a18 == null || a18.length() == 0)) {
                                        this.f319997a = optString2;
                                        this.f319998b = optString3;
                                        this.f319999c = parseColor;
                                        this.f320000d = a17;
                                        this.f320001e = optInt2;
                                        this.f320002f = optInt2 == 63;
                                        this.f320003g = optDouble;
                                        this.f320004h = a18;
                                        this.f320005i = (lo0.b) badges.get(optString4);
                                        this.f320006j = optDouble;
                                        this.f320007k = optInt;
                                        return;
                                    }
                                    throw new lo0.u("Failed normalizing makeup detail item icon path. ".concat(optString2));
                                }
                                throw new lo0.u("Makeup detail item object type invalid. " + optString2 + ", " + optInt2);
                            }
                            throw new lo0.u("Makeup detail item attributes not found. ".concat(optString2));
                        }
                        throw new lo0.u("Failed normalizing makeup detail item resource path. ".concat(optString2));
                    }
                    throw new lo0.u("Makeup detail item resource path empty. ".concat(optString2));
                } catch (java.lang.IllegalArgumentException unused) {
                    throw new lo0.u("Makeup detail item background color is invalid. " + optString2 + ", " + optString);
                }
            }
            throw new lo0.u("Makeup detail item display name is empty. ".concat(optString2));
        }
        throw new lo0.u("Makeup detail item ID is empty.");
    }

    public h0(lo0.h0 h0Var, java.util.Map map) {
        this.f319997a = h0Var.f319997a;
        this.f319998b = h0Var.f319998b;
        this.f319999c = h0Var.f319999c;
        this.f320000d = h0Var.f320000d;
        this.f320001e = h0Var.f320001e;
        this.f320002f = h0Var.f320002f;
        double d17 = h0Var.f320003g;
        this.f320003g = d17;
        this.f320004h = h0Var.f320004h;
        lo0.b bVar = h0Var.f320005i;
        this.f320005i = bVar != null ? (lo0.b) map.get(bVar.f319960a) : null;
        this.f320006j = d17;
        this.f320007k = h0Var.f320007k;
    }
}
