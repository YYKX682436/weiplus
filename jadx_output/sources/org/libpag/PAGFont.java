package org.libpag;

/* loaded from: classes13.dex */
public class PAGFont {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String[] f347765a = {"/system/fonts/NotoSansCJK-Regular.ttc", "/system/fonts/NotoSansSC-Regular.otf", "/system/fonts/DroidSansFallback.ttf"};

    /* renamed from: b, reason: collision with root package name */
    private static final java.util.regex.Pattern f347766b = java.util.regex.Pattern.compile("^[ \\n\\r\\t]+|[ \\n\\r\\t]+$");

    /* renamed from: c, reason: collision with root package name */
    private static boolean f347767c = false;
    public java.lang.String fontFamily;
    public java.lang.String fontStyle;

    /* loaded from: classes13.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        java.lang.String f347768a;

        /* renamed from: b, reason: collision with root package name */
        java.lang.String f347769b;

        /* renamed from: c, reason: collision with root package name */
        int f347770c;

        /* renamed from: d, reason: collision with root package name */
        int f347771d;

        private b() {
            this.f347768a = "";
            this.f347769b = "";
            this.f347770c = 0;
            this.f347771d = 400;
        }
    }

    static {
        b56.a.a("pag");
    }

    public PAGFont() {
        this.fontFamily = "";
        this.fontStyle = "";
    }

    private static void RegisterFallbackFonts() {
        if (f347767c) {
            return;
        }
        f347767c = true;
        int i17 = 0;
        org.libpag.PAGFont.b[] bVarArr = new org.libpag.PAGFont.b[0];
        try {
            bVarArr = new java.io.File("/system/etc/fonts.xml").exists() ? b() : a();
        } catch (java.lang.Exception unused) {
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        org.libpag.PAGFont.b a17 = a(bVarArr, "zh-Hans");
        if (a17 != null) {
            a(a17, arrayList, arrayList2);
        }
        for (java.lang.String str : f347765a) {
            org.libpag.PAGFont.b bVar = new org.libpag.PAGFont.b();
            bVar.f347769b = str;
            a(bVar, arrayList, arrayList2);
        }
        for (org.libpag.PAGFont.b bVar2 : bVarArr) {
            a(bVar2, arrayList, arrayList2);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        java.lang.String[] strArr = new java.lang.String[arrayList.size()];
        arrayList.toArray(strArr);
        int[] iArr = new int[arrayList2.size()];
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            iArr[i17] = ((java.lang.Integer) it.next()).intValue();
            i17++;
        }
        SetFallbackFontPaths(strArr, iArr);
    }

    public static native org.libpag.PAGFont RegisterFont(android.content.res.AssetManager assetManager, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3);

    public static org.libpag.PAGFont RegisterFont(java.lang.String str) {
        return RegisterFont(str, 0);
    }

    public static native org.libpag.PAGFont RegisterFont(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3);

    public static org.libpag.PAGFont RegisterFontBytes(byte[] bArr, int i17, int i18) {
        return RegisterFontBytes(bArr, i17, i18, "", "");
    }

    private static native org.libpag.PAGFont RegisterFontBytes(byte[] bArr, int i17, int i18, java.lang.String str, java.lang.String str2);

    private static native void SetFallbackFontPaths(java.lang.String[] strArr, int[] iArr);

    private static native void UnregisterFont(java.lang.String str, java.lang.String str2);

    public static void UnregisterFont(org.libpag.PAGFont pAGFont) {
        UnregisterFont(pAGFont.fontFamily, pAGFont.fontStyle);
    }

    private static org.libpag.PAGFont.b[] a(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        xmlPullParser.require(2, null, "familyset");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("family")) {
                    a(xmlPullParser, arrayList);
                } else {
                    d(xmlPullParser);
                }
            }
        }
        org.libpag.PAGFont.b[] bVarArr = new org.libpag.PAGFont.b[arrayList.size()];
        arrayList.toArray(bVarArr);
        return bVarArr;
    }

    private static org.libpag.PAGFont.b[] b() {
        org.libpag.PAGFont.b[] bVarArr = new org.libpag.PAGFont.b[0];
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream("/system/etc/fonts.xml");
            try {
                org.xmlpull.v1.XmlPullParser newPullParser = android.util.Xml.newPullParser();
                newPullParser.setInput(fileInputStream, null);
                newPullParser.nextTag();
                return a(newPullParser);
            } finally {
                fileInputStream.close();
            }
        } catch (java.io.IOException unused) {
            return bVarArr;
        }
    }

    private static org.libpag.PAGFont.b c(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        org.libpag.PAGFont.b bVar = new org.libpag.PAGFont.b();
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, ya.b.INDEX);
        bVar.f347770c = attributeValue == null ? 0 : java.lang.Integer.parseInt(attributeValue);
        java.lang.String attributeValue2 = xmlPullParser.getAttributeValue(null, "weight");
        bVar.f347771d = attributeValue2 == null ? 400 : java.lang.Integer.parseInt(attributeValue2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 4) {
                sb6.append(xmlPullParser.getText());
            }
            if (xmlPullParser.getEventType() == 2) {
                d(xmlPullParser);
            }
        }
        bVar.f347769b = "/system/fonts/" + f347766b.matcher(sb6).replaceAll("");
        return bVar;
    }

    private static void d(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        int i17 = 1;
        while (i17 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i17++;
            } else if (next == 3) {
                i17--;
            }
        }
    }

    public static org.libpag.PAGFont RegisterFont(android.content.res.AssetManager assetManager, java.lang.String str) {
        return RegisterFont(assetManager, str, 0);
    }

    public static org.libpag.PAGFont RegisterFont(android.content.res.AssetManager assetManager, java.lang.String str, int i17) {
        return RegisterFont(assetManager, str, i17, "", "");
    }

    public PAGFont(java.lang.String str, java.lang.String str2) {
        this.fontFamily = str;
        this.fontStyle = str2;
    }

    public static org.libpag.PAGFont RegisterFont(java.lang.String str, int i17) {
        return RegisterFont(str, i17, "", "");
    }

    private static org.libpag.PAGFont.b[] b(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        xmlPullParser.require(2, null, "familyset");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("family")) {
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if (xmlPullParser.getName().equals("fileset")) {
                                b(xmlPullParser, arrayList);
                            } else {
                                d(xmlPullParser);
                            }
                        }
                    }
                } else {
                    d(xmlPullParser);
                }
            }
        }
        org.libpag.PAGFont.b[] bVarArr = new org.libpag.PAGFont.b[arrayList.size()];
        arrayList.toArray(bVarArr);
        return bVarArr;
    }

    private static void a(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.ArrayList arrayList) {
        org.libpag.PAGFont.b bVar = null;
        xmlPullParser.getAttributeValue(null, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "lang");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList2.add(c(xmlPullParser));
                } else {
                    d(xmlPullParser);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        java.util.Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            org.libpag.PAGFont.b bVar2 = (org.libpag.PAGFont.b) it.next();
            if (bVar2.f347771d == 400) {
                bVar = bVar2;
                break;
            }
        }
        if (bVar == null) {
            bVar = (org.libpag.PAGFont.b) arrayList2.get(0);
        }
        if (bVar.f347769b.isEmpty()) {
            return;
        }
        if (attributeValue == null) {
            attributeValue = "";
        }
        bVar.f347768a = attributeValue;
        arrayList.add(bVar);
    }

    private static void b(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.ArrayList arrayList) {
        org.libpag.PAGFont.b bVar;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("file")) {
                    arrayList2.add(c(xmlPullParser));
                } else {
                    d(xmlPullParser);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        java.util.Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            } else {
                bVar = (org.libpag.PAGFont.b) it.next();
                if (bVar.f347771d == 400) {
                    break;
                }
            }
        }
        if (bVar == null) {
            bVar = (org.libpag.PAGFont.b) arrayList2.get(0);
        }
        if (bVar.f347769b.isEmpty()) {
            return;
        }
        arrayList.add(bVar);
    }

    private static org.libpag.PAGFont.b[] a() {
        org.libpag.PAGFont.b[] bVarArr = new org.libpag.PAGFont.b[0];
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream("/system/etc/fallback_fonts.xml");
            try {
                org.xmlpull.v1.XmlPullParser newPullParser = android.util.Xml.newPullParser();
                newPullParser.setInput(fileInputStream, null);
                newPullParser.nextTag();
                return b(newPullParser);
            } finally {
                fileInputStream.close();
            }
        } catch (java.io.IOException unused) {
            return bVarArr;
        }
    }

    private static org.libpag.PAGFont.b a(org.libpag.PAGFont.b[] bVarArr, java.lang.String str) {
        java.lang.String lowerCase = str.toLowerCase();
        for (org.libpag.PAGFont.b bVar : bVarArr) {
            if (bVar.f347768a.toLowerCase().equals(lowerCase)) {
                return bVar;
            }
        }
        return null;
    }

    private static void a(org.libpag.PAGFont.b bVar, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (!arrayList.contains(bVar.f347769b) && new java.io.File(bVar.f347769b).exists()) {
            arrayList.add(bVar.f347769b);
            arrayList2.add(java.lang.Integer.valueOf(bVar.f347770c));
        }
    }
}
