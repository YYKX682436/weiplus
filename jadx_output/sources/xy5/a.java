package xy5;

/* loaded from: classes5.dex */
public abstract class a {
    public static java.lang.Object a(java.lang.Object obj) {
        java.lang.StringBuilder sb6;
        if (obj == null) {
            return null;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    java.lang.Object a17 = a(it.next());
                    if (a17 != null) {
                        jSONArray.put(a17);
                    }
                }
                return jSONArray;
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu.DataReportUtils", "[genJSONObject] object : " + obj + ", throw Exception : " + e17.getMessage());
            }
        } else {
            if (obj instanceof java.util.Map) {
                java.util.Map map = (java.util.Map) obj;
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    for (java.lang.Object obj2 : map.keySet()) {
                        java.lang.Object obj3 = map.get(obj2);
                        if (obj3 != null && (obj2 instanceof java.lang.String) && (!(obj3 instanceof java.lang.String) || !android.text.TextUtils.isEmpty((java.lang.String) obj3))) {
                            java.lang.String str = (java.lang.String) obj2;
                            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
                            if (!android.text.TextUtils.equals(lowerCase, str)) {
                                if (a.b.c().f44a) {
                                    xy5.b.a("enricwu.DataReportUtils", "[genJSONObject] key contain upperCase, key : " + obj2);
                                } else {
                                    java.util.Objects.toString(obj2);
                                    mk.a aVar = xy5.b.f458162a;
                                }
                            }
                            java.lang.Object a18 = a(map.get(obj2));
                            if (a18 != null) {
                                jSONObject.put(lowerCase, a18);
                            }
                        }
                    }
                    return jSONObject;
                } catch (java.lang.Exception e18) {
                    e = e18;
                    sb6 = new java.lang.StringBuilder("[genJSONObject] object : ");
                }
            } else {
                if (!(obj instanceof java.util.Set)) {
                    if (!(obj instanceof java.lang.String) && !(obj instanceof java.lang.StringBuilder) && !(obj instanceof java.lang.StringBuffer)) {
                        if ((obj instanceof java.lang.Number) || (obj instanceof org.json.JSONObject) || (obj instanceof org.json.JSONArray)) {
                            return obj;
                        }
                        xy5.b.a("enricwu.DataReportUtils", "[genJSONObject] type is error, object : " + obj + ", type : " + obj.getClass());
                        return obj.toString();
                    }
                    java.lang.String obj4 = obj.toString();
                    try {
                        if (obj4.contains(",")) {
                            if (obj4.contains("|")) {
                                xy5.b.a("enricwu.DataReportUtils", "[genJSONObject] str contain '|' , str : ".concat(obj4));
                            }
                            return obj4.replace(",", "|");
                        }
                    } catch (java.lang.Exception e19) {
                        xy5.b.a("enricwu.DataReportUtils", "[genJSONObject] object : " + obj + ", throw Exception : " + e19.getMessage());
                    }
                    return obj4;
                }
                java.util.Set set = (java.util.Set) obj;
                try {
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    java.util.Iterator it6 = set.iterator();
                    while (it6.hasNext()) {
                        java.lang.Object a19 = a(it6.next());
                        if (a19 != null) {
                            jSONArray2.put(a19);
                        }
                    }
                    return jSONArray2;
                } catch (java.lang.Exception e27) {
                    e = e27;
                    sb6 = new java.lang.StringBuilder("[genJSONObject] object : ");
                }
            }
            sb6.append(obj);
            sb6.append(", throw Exception : ");
            sb6.append(e.getMessage());
            xy5.b.a("enricwu.DataReportUtils", sb6.toString());
        }
        return null;
    }
}
