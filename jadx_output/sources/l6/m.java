package l6;

/* loaded from: classes16.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static int f316739a;

    /* renamed from: b, reason: collision with root package name */
    public static int f316740b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f316741c;

    public static java.lang.String a(java.lang.String str) {
        n6.a aVar;
        java.util.ArrayList arrayList;
        try {
            aVar = e(str);
        } catch (java.lang.Exception unused) {
            aVar = null;
        }
        if (aVar == null || (arrayList = aVar.f335169b) == null || arrayList.size() == 0) {
            return "";
        }
        o6.a aVar2 = new o6.a();
        aVar2.f343173a = new o6.b();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        aVar2.f343174b = arrayList2;
        o6.c cVar = new o6.c();
        cVar.f343176b = aVar.f335169b;
        cVar.f343175a = 0;
        arrayList2.add(cVar);
        return b(aVar2);
    }

    public static java.lang.String b(o6.a aVar) {
        try {
            org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
            jSONStringer.object();
            org.json.JSONStringer key = jSONStringer.key("Metadata").object().key("Created");
            aVar.f343173a.getClass();
            org.json.JSONStringer key2 = key.value("2021-01-01").key("Description");
            aVar.f343173a.getClass();
            org.json.JSONStringer key3 = key2.value("game haptic").key("Version");
            aVar.f343173a.getClass();
            key3.value(2).endObject();
            jSONStringer.key("PatternList").array();
            java.util.Iterator it = aVar.f343174b.iterator();
            while (it.hasNext()) {
                o6.c cVar = (o6.c) it.next();
                jSONStringer.object().key("AbsoluteTime").value(cVar.f343175a).key("Pattern").array();
                java.util.Iterator it6 = cVar.f343176b.iterator();
                while (it6.hasNext()) {
                    m6.e eVar = (m6.e) it6.next();
                    jSONStringer.object();
                    jSONStringer.key("Event").object().key("Index").value(eVar.f324349a.f324344d).key("RelativeTime").value(eVar.f324349a.f324342b).key("Type").value(eVar.f324349a.f324341a);
                    if ("continuous".equals(eVar.f324349a.f324341a)) {
                        jSONStringer.key("Duration").value(eVar.f324349a.f324343c);
                    }
                    jSONStringer.key("Parameters").object().key("Frequency").value(eVar.f324349a.f324345e.f324347b).key("Intensity").value(eVar.f324349a.f324345e.f324346a);
                    if ("continuous".equals(eVar.f324349a.f324341a)) {
                        jSONStringer.key("Curve").array();
                        java.util.Iterator it7 = eVar.f324349a.f324345e.f324348c.iterator();
                        while (it7.hasNext()) {
                            jSONStringer.object().key("Frequency").value(r6.f324340c).key("Intensity").value(((m6.a) it7.next()).f324339b).key("Time").value(r6.f324338a).endObject();
                        }
                        jSONStringer.endArray();
                    }
                    jSONStringer.endObject().endObject().endObject();
                }
                jSONStringer.endArray().endObject();
            }
            jSONStringer.endArray().endObject();
            return jSONStringer.toString();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.String c(java.lang.String str, int i17) {
        n6.a aVar;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        int i18;
        int i19 = i(str);
        int i27 = -1;
        o6.a aVar2 = null;
        java.lang.String str2 = null;
        if (i19 != 1) {
            if (i19 != 2) {
                return "";
            }
            try {
                aVar2 = f(str);
            } catch (java.lang.Exception unused) {
            }
            if (aVar2 == null || (arrayList2 = aVar2.f343174b) == null || arrayList2.size() == 0) {
                return "";
            }
            java.util.Iterator it = aVar2.f343174b.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                }
                o6.c cVar = (o6.c) it.next();
                java.util.ArrayList arrayList3 = cVar.f343176b;
                if (arrayList3 != null) {
                    java.util.Iterator it6 = arrayList3.iterator();
                    while (it6.hasNext()) {
                        m6.e eVar = (m6.e) it6.next();
                        m6.b bVar = eVar.f324349a;
                        if (bVar != null && bVar.f324342b + cVar.f343175a >= i17) {
                            int indexOf = cVar.f343176b.indexOf(eVar);
                            i27 = aVar2.f343174b.indexOf(cVar);
                            i18 = indexOf;
                            break loop0;
                        }
                    }
                }
            }
            if (i27 < 0 || i18 < 0) {
                return "";
            }
            aVar2.f343174b.subList(0, i27).clear();
            ((o6.c) aVar2.f343174b.get(0)).f343176b.subList(0, i18).clear();
            java.util.Iterator it7 = aVar2.f343174b.iterator();
            while (it7.hasNext()) {
                o6.c cVar2 = (o6.c) it7.next();
                java.util.ArrayList arrayList4 = cVar2.f343176b;
                if (arrayList4 != null) {
                    int i28 = cVar2.f343175a;
                    if (i28 < i17) {
                        java.util.Iterator it8 = arrayList4.iterator();
                        while (it8.hasNext()) {
                            m6.b bVar2 = ((m6.e) it8.next()).f324349a;
                            if (bVar2 != null) {
                                bVar2.f324342b = (bVar2.f324342b + cVar2.f343175a) - i17;
                            }
                        }
                        cVar2.f343175a = 0;
                    } else {
                        cVar2.f343175a = i28 - i17;
                    }
                }
            }
            return b(aVar2);
        }
        try {
            aVar = e(str);
        } catch (java.lang.Exception unused2) {
            aVar = null;
        }
        if (aVar == null || (arrayList = aVar.f335169b) == null || arrayList.size() == 0) {
            return "";
        }
        java.util.Iterator it9 = aVar.f335169b.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            m6.e eVar2 = (m6.e) it9.next();
            m6.b bVar3 = eVar2.f324349a;
            if (bVar3 != null && bVar3.f324342b >= i17) {
                i27 = aVar.f335169b.indexOf(eVar2);
                break;
            }
        }
        if (i27 < 0) {
            return "";
        }
        aVar.f335169b.subList(0, i27).clear();
        java.util.Iterator it10 = aVar.f335169b.iterator();
        while (it10.hasNext()) {
            m6.b bVar4 = ((m6.e) it10.next()).f324349a;
            if (bVar4 != null) {
                bVar4.f324342b -= i17;
            }
        }
        try {
            org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
            jSONStringer.object();
            org.json.JSONStringer key = jSONStringer.key("Metadata").object().key("Created");
            aVar.f335168a.getClass();
            org.json.JSONStringer key2 = key.value("2021-01-01").key("Description");
            aVar.f335168a.getClass();
            org.json.JSONStringer key3 = key2.value("game haptic").key("Version");
            aVar.f335168a.getClass();
            key3.value(1).endObject();
            jSONStringer.key("Pattern").array();
            java.util.Iterator it11 = aVar.f335169b.iterator();
            while (it11.hasNext()) {
                m6.e eVar3 = (m6.e) it11.next();
                jSONStringer.object();
                jSONStringer.key("Event").object().key("Type").value(eVar3.f324349a.f324341a).key("RelativeTime").value(eVar3.f324349a.f324342b);
                if ("continuous".equals(eVar3.f324349a.f324341a)) {
                    jSONStringer.key("Duration").value(eVar3.f324349a.f324343c);
                }
                jSONStringer.key("Parameters").object().key("Frequency").value(eVar3.f324349a.f324345e.f324347b).key("Intensity").value(eVar3.f324349a.f324345e.f324346a);
                if ("continuous".equals(eVar3.f324349a.f324341a)) {
                    jSONStringer.key("Curve").array();
                    java.util.Iterator it12 = eVar3.f324349a.f324345e.f324348c.iterator();
                    while (it12.hasNext()) {
                        jSONStringer.object().key("Frequency").value(r5.f324340c).key("Intensity").value(((m6.a) it12.next()).f324339b).key("Time").value(r5.f324338a).endObject();
                    }
                    jSONStringer.endArray();
                }
                jSONStringer.endObject().endObject().endObject();
            }
            jSONStringer.endArray().endObject();
            str2 = jSONStringer.toString();
        } catch (java.lang.Exception unused3) {
        }
        return str2;
    }

    public static int d(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        m6.c g17 = g(str);
        if (p6.a.a(g17)) {
            return g17.getDuration();
        }
        return 0;
    }

    public static n6.a e(java.lang.String str) {
        if (1 != i(str)) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            n6.a aVar = new n6.a();
            aVar.f335168a = new n6.b();
            aVar.f335169b = new java.util.ArrayList();
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("Pattern");
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                org.json.JSONObject jSONObject2 = (org.json.JSONObject) jSONArray.get(i17);
                m6.e eVar = new m6.e();
                eVar.f324349a = new m6.b();
                org.json.JSONObject jSONObject3 = jSONObject2.getJSONObject("Event");
                eVar.f324349a.f324341a = jSONObject3.getString("Type");
                if ("continuous".equals(eVar.f324349a.f324341a)) {
                    eVar.f324349a.f324343c = jSONObject3.getInt("Duration");
                }
                eVar.f324349a.f324342b = jSONObject3.getInt("RelativeTime");
                org.json.JSONObject jSONObject4 = jSONObject3.getJSONObject("Parameters");
                m6.b bVar = eVar.f324349a;
                m6.d dVar = new m6.d();
                bVar.f324345e = dVar;
                dVar.f324347b = jSONObject4.getInt("Frequency");
                eVar.f324349a.f324345e.f324346a = jSONObject4.getInt("Intensity");
                eVar.f324349a.f324345e.f324348c = new java.util.ArrayList();
                if ("continuous".equals(eVar.f324349a.f324341a)) {
                    org.json.JSONArray jSONArray2 = jSONObject4.getJSONArray("Curve");
                    for (int i18 = 0; i18 < jSONArray2.length(); i18++) {
                        org.json.JSONObject jSONObject5 = (org.json.JSONObject) jSONArray2.get(i18);
                        m6.a aVar2 = new m6.a();
                        aVar2.f324340c = jSONObject5.getInt("Frequency");
                        aVar2.f324339b = jSONObject5.getDouble("Intensity");
                        aVar2.f324338a = jSONObject5.getInt("Time");
                        eVar.f324349a.f324345e.f324348c.add(aVar2);
                    }
                }
                aVar.f335169b.add(eVar);
            }
            return aVar;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static o6.a f(java.lang.String str) {
        o6.a aVar = null;
        if (2 != i(str)) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            o6.a aVar2 = new o6.a();
            aVar2.f343173a = new o6.b();
            aVar2.f343174b = new java.util.ArrayList();
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("PatternList");
            int i17 = 0;
            while (i17 < jSONArray.length()) {
                org.json.JSONObject jSONObject2 = (org.json.JSONObject) jSONArray.get(i17);
                o6.c cVar = new o6.c();
                cVar.f343175a = jSONObject2.getInt("AbsoluteTime");
                cVar.f343176b = new java.util.ArrayList();
                org.json.JSONArray jSONArray2 = jSONObject2.getJSONArray("Pattern");
                for (int i18 = 0; i18 < jSONArray2.length(); i18++) {
                    org.json.JSONObject jSONObject3 = (org.json.JSONObject) jSONArray2.get(i18);
                    m6.e eVar = new m6.e();
                    eVar.f324349a = new m6.b();
                    org.json.JSONObject jSONObject4 = jSONObject3.getJSONObject("Event");
                    eVar.f324349a.f324341a = jSONObject4.getString("Type");
                    if ("continuous".equals(eVar.f324349a.f324341a)) {
                        eVar.f324349a.f324343c = jSONObject4.getInt("Duration");
                    }
                    eVar.f324349a.f324342b = jSONObject4.getInt("RelativeTime");
                    eVar.f324349a.f324344d = jSONObject4.getInt("Index");
                    org.json.JSONObject jSONObject5 = jSONObject4.getJSONObject("Parameters");
                    m6.b bVar = eVar.f324349a;
                    m6.d dVar = new m6.d();
                    bVar.f324345e = dVar;
                    dVar.f324347b = jSONObject5.getInt("Frequency");
                    eVar.f324349a.f324345e.f324346a = jSONObject5.getInt("Intensity");
                    eVar.f324349a.f324345e.f324348c = new java.util.ArrayList();
                    if ("continuous".equals(eVar.f324349a.f324341a)) {
                        org.json.JSONArray jSONArray3 = jSONObject5.getJSONArray("Curve");
                        for (int i19 = 0; i19 < jSONArray3.length(); i19++) {
                            org.json.JSONObject jSONObject6 = (org.json.JSONObject) jSONArray3.get(i19);
                            m6.a aVar3 = new m6.a();
                            aVar3.f324340c = jSONObject6.getInt("Frequency");
                            try {
                                aVar3.f324339b = jSONObject6.getDouble("Intensity");
                                aVar3.f324338a = jSONObject6.getInt("Time");
                                eVar.f324349a.f324345e.f324348c.add(aVar3);
                            } catch (java.lang.Exception unused) {
                                return null;
                            }
                        }
                    }
                    cVar.f343176b.add(eVar);
                }
                aVar2.f343174b.add(cVar);
                i17++;
                aVar = null;
            }
            return aVar2;
        } catch (java.lang.Exception unused2) {
            return aVar;
        }
    }

    public static m6.c g(java.lang.String str) {
        int i17 = i(str);
        if (i17 == 1) {
            try {
                return e(str);
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        if (i17 != 2) {
            return null;
        }
        try {
            return f(str);
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    public static java.lang.String h(java.io.File file) {
        if (file == null || !file.exists()) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.io.BufferedReader bufferedReader = null;
        try {
            try {
                java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file)));
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb6.append(readLine);
                    } catch (java.lang.Exception unused) {
                        bufferedReader = bufferedReader2;
                        bufferedReader.close();
                        return sb6.toString();
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        bufferedReader = bufferedReader2;
                        try {
                            bufferedReader.close();
                        } catch (java.lang.Exception unused2) {
                        }
                        throw th;
                    }
                }
                bufferedReader2.close();
            } catch (java.lang.Exception unused3) {
            }
        } catch (java.lang.Exception unused4) {
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
        return sb6.toString();
    }

    public static int i(java.lang.String str) {
        try {
            return new org.json.JSONObject(str).getJSONObject("Metadata").getInt("Version");
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    public static java.lang.String j(java.lang.String str) {
        o6.a aVar;
        o6.a aVar2;
        try {
            aVar = f(str);
        } catch (java.lang.Exception unused) {
            aVar = null;
        }
        if (!p6.a.a(aVar)) {
            return "";
        }
        java.util.Iterator it = aVar.f343174b.iterator();
        while (it.hasNext()) {
            java.util.Iterator it6 = ((o6.c) it.next()).f343176b.iterator();
            while (it6.hasNext()) {
                m6.e eVar = (m6.e) it6.next();
                m6.d dVar = eVar.f324349a.f324345e;
                java.util.ArrayList arrayList = dVar.f324348c;
                if (arrayList == null || arrayList.size() == 0) {
                    aVar2 = aVar;
                    arrayList = null;
                } else {
                    int size = arrayList.size();
                    if (size <= 0 || size > 4) {
                        m6.a aVar3 = new m6.a();
                        int i17 = size - 2;
                        int i18 = i17 / 2;
                        int i19 = 1;
                        while (i19 <= i18) {
                            aVar3.f324338a += ((m6.a) arrayList.get(i19)).f324338a;
                            aVar3.f324339b += ((m6.a) arrayList.get(i19)).f324339b;
                            aVar3.f324340c += ((m6.a) arrayList.get(i19)).f324340c;
                            i19++;
                            aVar = aVar;
                        }
                        aVar2 = aVar;
                        aVar3.f324338a /= i18;
                        aVar3.f324339b = aVar3.f324339b / i18;
                        aVar3.f324339b = java.lang.Math.round(r0 * 10.0d) / 10.0d;
                        aVar3.f324340c /= i18;
                        m6.a aVar4 = new m6.a();
                        for (int i27 = i18 + 1; i27 <= i17; i27++) {
                            aVar4.f324338a += ((m6.a) arrayList.get(i27)).f324338a;
                            aVar4.f324339b += ((m6.a) arrayList.get(i27)).f324339b;
                            aVar4.f324340c += ((m6.a) arrayList.get(i27)).f324340c;
                        }
                        int i28 = i17 - i18;
                        aVar4.f324338a /= i28;
                        aVar4.f324339b = aVar4.f324339b / i28;
                        aVar4.f324339b = java.lang.Math.round(r10 * 10.0d) / 10.0d;
                        aVar4.f324340c /= i28;
                        arrayList.subList(1, size - 1).clear();
                        arrayList.add(1, aVar3);
                        arrayList.add(2, aVar4);
                    } else {
                        aVar2 = aVar;
                    }
                }
                dVar.f324348c = arrayList;
                if (eVar.f324349a.f324341a.equals("transient")) {
                    m6.d dVar2 = eVar.f324349a.f324345e;
                    int i29 = dVar2.f324347b;
                    if (i29 < 0) {
                        dVar2.f324347b = 0;
                    } else if (i29 > 100) {
                        dVar2.f324347b = 100;
                    }
                }
                aVar = aVar2;
            }
        }
        return b(aVar);
    }

    public static java.lang.String k(java.lang.String str) {
        int i17;
        if (2 != i(str)) {
            return null;
        }
        o6.a f17 = f(str);
        if (!p6.a.a(f17)) {
            return null;
        }
        for (int i18 = 0; i18 <= 2; i18++) {
            java.util.Iterator it = f17.f343174b.iterator();
            while (it.hasNext()) {
                o6.c cVar = (o6.c) it.next();
                if (cVar.f343176b.size() > 1) {
                    int i19 = 0;
                    for (int i27 = 0; i27 < cVar.f343176b.size(); i27++) {
                        m6.b bVar = ((m6.e) cVar.f343176b.get(i27)).f324349a;
                        if (bVar != null && bVar.f324344d == i18) {
                            int i28 = bVar.f324342b;
                            int i29 = bVar.f324341a.equals("continuous") ? bVar.f324343c + i28 : i28 + 22;
                            if (i28 < i19) {
                                ((m6.e) cVar.f343176b.get(i27)).f324349a.f324342b = -1;
                            } else {
                                i19 = i29;
                            }
                        }
                    }
                    java.util.Iterator it6 = cVar.f343176b.iterator();
                    while (it6.hasNext()) {
                        if (((m6.e) it6.next()).f324349a.f324342b < 0) {
                            it6.remove();
                        }
                    }
                }
            }
        }
        for (int i37 = 1; i37 <= 2; i37++) {
            java.util.Iterator it7 = f17.f343174b.iterator();
            while (it7.hasNext()) {
                o6.c cVar2 = (o6.c) it7.next();
                if (cVar2.f343176b.size() > 1) {
                    int i38 = 0;
                    for (int i39 = 0; i39 < cVar2.f343176b.size(); i39++) {
                        m6.b bVar2 = ((m6.e) cVar2.f343176b.get(i39)).f324349a;
                        if (bVar2 != null && ((i17 = bVar2.f324344d) == i37 || i17 == 0)) {
                            int i47 = bVar2.f324342b;
                            int i48 = bVar2.f324341a.equals("continuous") ? bVar2.f324343c + i47 : i47 + 22;
                            if (i47 < i38) {
                                ((m6.e) cVar2.f343176b.get(i39)).f324349a.f324342b = -1;
                            } else {
                                i38 = i48;
                            }
                        }
                    }
                    java.util.Iterator it8 = cVar2.f343176b.iterator();
                    while (it8.hasNext()) {
                        if (((m6.e) it8.next()).f324349a.f324342b < 0) {
                            it8.remove();
                        }
                    }
                }
            }
        }
        return b(f17);
    }
}
