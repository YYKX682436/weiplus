package ik1;

/* loaded from: classes7.dex */
public abstract class w {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Float f291843b;

    /* renamed from: a, reason: collision with root package name */
    public static final android.util.DisplayMetrics f291842a = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f291844c = true;

    public static int a(java.lang.String str) {
        try {
            return l(str);
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    public static int b(org.json.JSONArray jSONArray) {
        nf.y yVar;
        if (jSONArray == null || jSONArray.length() < 3) {
            return 0;
        }
        int rgb = jSONArray.length() == 3 ? android.graphics.Color.rgb(jSONArray.optInt(0) & 255, jSONArray.optInt(1) & 255, jSONArray.optInt(2) & 255) : android.graphics.Color.argb(jSONArray.optInt(3) & 255, jSONArray.optInt(0) & 255, jSONArray.optInt(1) & 255, jSONArray.optInt(2) & 255);
        return (!f291844c || (yVar = nf.x.f336616b) == null) ? rgb : yVar.b(rgb);
    }

    public static int c(int i17) {
        return java.lang.Math.round(f() * i17);
    }

    public static int d(int i17) {
        return (int) (i17 / f());
    }

    public static int e(int i17) {
        return (int) java.lang.Math.ceil(i17 / f());
    }

    public static float f() {
        java.lang.Float f17 = f291843b;
        if (f17 != null) {
            return f17.floatValue();
        }
        android.util.DisplayMetrics displayMetrics = f291842a;
        if (displayMetrics == null) {
            return 1.0f;
        }
        return displayMetrics.density;
    }

    public static float g(org.json.JSONArray jSONArray, int i17) {
        if (jSONArray != null) {
            try {
            } catch (java.lang.Exception unused) {
                return 0.0f;
            }
        }
        return f() * ((float) jSONArray.getDouble(i17));
    }

    public static float h(org.json.JSONObject jSONObject, java.lang.String str, float f17) {
        if (jSONObject == null) {
            return f17;
        }
        try {
            return f() * ((float) jSONObject.optDouble(str, f17));
        } catch (java.lang.Exception unused) {
            return f17;
        }
    }

    public static int i(org.json.JSONArray jSONArray, int i17) {
        if (jSONArray != null) {
            try {
            } catch (java.lang.Exception unused) {
                return 0;
            }
        }
        return java.lang.Math.round(f() * ((float) jSONArray.getDouble(i17)));
    }

    public static int j(org.json.JSONObject jSONObject, java.lang.String str, int i17) {
        if (jSONObject == null) {
            return i17;
        }
        try {
            return java.lang.Math.round(f() * ((float) jSONObject.getDouble(str)));
        } catch (java.lang.Exception unused) {
            return i17;
        }
    }

    public static int k(org.json.JSONObject jSONObject, java.lang.String str) {
        return java.lang.Math.round(f() * ((float) jSONObject.getDouble(str)));
    }

    public static int l(java.lang.String str) {
        long parseLong;
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("colorString isEmpty");
        }
        java.util.Map map = ik1.u.f291841a;
        if (((java.util.HashMap) map).containsKey(str)) {
            return ((java.lang.Integer) ((java.util.HashMap) map).get(str)).intValue();
        }
        if (str.charAt(0) != '#') {
            return android.graphics.Color.parseColor(str);
        }
        if (str.length() == 4) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
            sb6.insert(2, str.charAt(1));
            sb6.insert(4, str.charAt(2));
            sb6.insert(6, str.charAt(3));
            str = sb6.toString();
        }
        if (str.length() == 7) {
            parseLong = java.lang.Long.parseLong(str.substring(1), 16) | (-16777216);
        } else {
            if (str.length() != 9) {
                com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.JsValueUtil", "hy: Unknown color, given string is %s", str);
                throw new java.lang.IllegalArgumentException("Unknown color");
            }
            parseLong = (java.lang.Long.parseLong(str.substring(7, 9), 16) << 24) | java.lang.Long.parseLong(str.substring(1, 7), 16);
        }
        return (int) parseLong;
    }
}
