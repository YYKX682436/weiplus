package cs5;

/* loaded from: classes13.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f222131a = java.util.regex.Pattern.compile("(.*),(.*)\\|(.*)");

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f222132b = java.util.regex.Pattern.compile("(.*)\\.:(.*),(.*)\\|(.*)");

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.regex.Pattern f222133c = java.util.regex.Pattern.compile("(.*),(.*)-(.*),(.*)\\|(.*)");

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.regex.Pattern f222134d = java.util.regex.Pattern.compile("(.*)\\.:(.*),(.*)-(.*),(.*)\\|(.*)");

    public static int a(int i17, int i18, java.lang.String[] strArr, java.lang.String[] strArr2) {
        return (strArr2.length == 1 && "0".equals(strArr2[0])) ? i17 : (strArr.length == 1 && "0".equals(strArr[0])) ? i18 : java.lang.Math.min(i17, i18);
    }

    public static cs5.a b(int i17, java.lang.String str) {
        cs5.a aVar;
        if (android.text.TextUtils.isEmpty(str)) {
            return cs5.a.f222126d;
        }
        java.lang.String[] split = str.split("\n");
        java.lang.String str2 = "";
        int i18 = 2;
        int i19 = 4;
        int i27 = 1;
        if (i17 != 3) {
            java.util.HashMap hashMap = new java.util.HashMap();
            if (split.length <= 1) {
                java.util.regex.Matcher matcher = f222131a.matcher(str);
                if (!matcher.matches() || 3 != matcher.groupCount()) {
                    return cs5.a.f222126d;
                }
                try {
                    java.lang.String group = matcher.group(3);
                    java.lang.String[] split2 = matcher.group(1).split(";");
                    hashMap.put("onehost", java.lang.Integer.valueOf(java.lang.Integer.parseInt(matcher.group(2))));
                    return new cs5.a(i17, group, split2, hashMap);
                } catch (java.lang.Exception e17) {
                    or5.b.c(5, e17, "Parse external response failed", new java.lang.Object[0]);
                    return cs5.a.f222126d;
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String str3 = "";
            for (java.lang.String str4 : split) {
                java.util.regex.Matcher matcher2 = f222132b.matcher(str4);
                if (matcher2.matches() && 4 == matcher2.groupCount()) {
                    try {
                        java.lang.String group2 = matcher2.group(1);
                        java.lang.String str5 = matcher2.group(4) + ",";
                        c(arrayList, group2, matcher2.group(2).split(";"));
                        hashMap.put(group2, java.lang.Integer.valueOf(java.lang.Integer.parseInt(matcher2.group(3))));
                        str3 = str5;
                    } catch (java.lang.Exception e18) {
                        or5.b.c(5, e18, "Parse external response failed", new java.lang.Object[0]);
                        return cs5.a.f222126d;
                    }
                }
            }
            return arrayList.size() == 0 ? cs5.a.f222126d : new cs5.a(i17, str3, (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]), hashMap);
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (split.length <= 1) {
            try {
                java.util.regex.Matcher matcher3 = f222133c.matcher(split[0]);
                if (matcher3.matches() && 5 == matcher3.groupCount()) {
                    java.lang.String group3 = matcher3.group(5);
                    java.lang.String[] split3 = matcher3.group(1).split(";");
                    java.lang.String[] split4 = matcher3.group(3).split(";");
                    hashMap2.put("onehost", java.lang.Integer.valueOf(a(java.lang.Integer.parseInt(matcher3.group(2)), java.lang.Integer.parseInt(matcher3.group(4)), split3, split4)));
                    aVar = new cs5.a(group3, split3, split4, hashMap2);
                    return aVar;
                }
                aVar = cs5.a.f222126d;
                return aVar;
            } catch (java.lang.Exception unused) {
                return cs5.a.f222126d;
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int length = split.length;
        int i28 = 0;
        while (i28 < length) {
            java.util.regex.Matcher matcher4 = f222134d.matcher(split[i28]);
            if (matcher4.matches() && 6 == matcher4.groupCount()) {
                try {
                    java.lang.String group4 = matcher4.group(i27);
                    java.lang.String str6 = matcher4.group(6) + ",";
                    java.lang.String[] split5 = matcher4.group(i18).split(";");
                    java.lang.String[] split6 = matcher4.group(i19).split(";");
                    hashMap2.put(group4, java.lang.Integer.valueOf(a(java.lang.Integer.parseInt(matcher4.group(3)), java.lang.Integer.parseInt(matcher4.group(5)), split5, split6)));
                    c(arrayList2, group4, split5);
                    c(arrayList3, group4, split6);
                    str2 = str6;
                } catch (java.lang.Exception e19) {
                    or5.b.c(5, e19, "Parse external response failed", new java.lang.Object[0]);
                    return cs5.a.f222126d;
                }
            }
            i28++;
            i18 = 2;
            i19 = 4;
            i27 = 1;
        }
        return (arrayList2.size() == 0 && arrayList3.size() == 0) ? cs5.a.f222126d : new cs5.a(str2, (java.lang.String[]) arrayList2.toArray(new java.lang.String[arrayList2.size()]), (java.lang.String[]) arrayList3.toArray(new java.lang.String[arrayList3.size()]), hashMap2);
    }

    public static void c(java.util.ArrayList arrayList, java.lang.String str, java.lang.String[] strArr) {
        for (java.lang.String str2 : strArr) {
            arrayList.add(str + ":" + str2);
        }
    }
}
