package yy4;

/* loaded from: classes15.dex */
public class a extends dm.g7 {

    /* renamed from: t2, reason: collision with root package name */
    public static final l75.e0 f468480t2 = dm.g7.initAutoDBInfo(yy4.a.class);

    /* renamed from: u2, reason: collision with root package name */
    public static final java.util.List f468481u2 = java.util.Arrays.asList("_cn", "_hk", "_tw", "_en");

    /* renamed from: s2, reason: collision with root package name */
    public final java.util.Map f468482s2 = new java.util.HashMap();

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yy4.a) {
            return ((yy4.a) obj).field_LabsAppId.equals(this.field_LabsAppId);
        }
        return false;
    }

    @Override // dm.g7, l75.f0
    public l75.e0 getDBInfo() {
        return f468480t2;
    }

    public int hashCode() {
        return this.field_LabsAppId.hashCode();
    }

    public boolean isValid() {
        return (android.text.TextUtils.isEmpty(this.field_LabsAppId) || this.field_LabsAppId.equals("labs1de6f3")) ? false : true;
    }

    public final java.lang.String t0(java.lang.String str) {
        java.util.Map map = this.f468482s2;
        java.lang.reflect.Field field = (java.lang.reflect.Field) ((java.util.HashMap) map).get(str);
        if (field == null) {
            try {
                field = yy4.a.class.getField(str);
                ((java.util.HashMap) map).put(str, field);
            } catch (java.lang.NoSuchFieldException e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.w("LabAppInfo", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
        if (field == null) {
            return "";
        }
        try {
            return (java.lang.String) field.get(this);
        } catch (java.lang.IllegalAccessException e18) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.w("LabAppInfo", com.tencent.mm.sdk.platformtools.z3.c(e18));
            return "";
        }
    }

    public java.lang.String toString() {
        return "[appid " + this.field_LabsAppId + ",title " + this.field_Title_cn + ", exptId " + this.field_expId + "]";
    }

    public final java.lang.String u0(java.lang.String str) {
        java.lang.String t07 = t0(str + "Key_android");
        if (!android.text.TextUtils.isEmpty(t07)) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.sdk.platformtools.x2.f193075e.getIdentifier(t07, "string", com.tencent.mm.sdk.platformtools.x2.f193072b));
            if (!android.text.TextUtils.isEmpty(string)) {
                return string;
            }
        }
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        return com.tencent.mm.sdk.platformtools.m2.m() ? v0(str, "_cn") : "zh_HK".equals(f17) ? v0(str, "_hk") : "zh_TW".equals(f17) ? v0(str, "_tw") : v0(str, "_en");
    }

    public final java.lang.String v0(java.lang.String str, java.lang.String str2) {
        java.lang.String t07 = t0(str + str2);
        if (!android.text.TextUtils.isEmpty(t07)) {
            return t07;
        }
        java.util.Iterator it = f468481u2.iterator();
        while (it.hasNext()) {
            java.lang.String t08 = t0(str + ((java.lang.String) it.next()));
            if (!android.text.TextUtils.isEmpty(t08)) {
                return t08;
            }
        }
        return "";
    }

    public boolean w0() {
        return isValid() && java.lang.System.currentTimeMillis() / 1000 >= this.field_endtime;
    }

    public boolean y0() {
        int i17;
        return z0() && ((i17 = this.field_Switch) == 2 || i17 == 1);
    }

    public boolean z0() {
        return isValid() && java.lang.System.currentTimeMillis() / 1000 >= this.field_starttime && java.lang.System.currentTimeMillis() / 1000 < this.field_endtime;
    }
}
