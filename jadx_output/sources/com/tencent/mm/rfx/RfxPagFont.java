package com.tencent.mm.rfx;

/* loaded from: classes13.dex */
public class RfxPagFont {
    private static final java.lang.String DefaultLanguage = "zh-Hans";
    private static final java.lang.String SystemFontConfigPath_JellyBean = "/system/etc/fallback_fonts.xml";
    private static final java.lang.String SystemFontConfigPath_Lollipop = "/system/etc/fonts.xml";
    private static final java.lang.String SystemFontPath = "/system/fonts/";
    public java.lang.String fontFamily;
    public java.lang.String fontStyle;
    private static final java.lang.String[] FallbackFontFileNames = {"/system/fonts/NotoSansCJK-Regular.ttc", "/system/fonts/NotoSansSC-Regular.otf", "/system/fonts/DroidSansFallback.ttf"};
    private static final java.util.regex.Pattern FILENAME_WHITESPACE_PATTERN = java.util.regex.Pattern.compile("^[ \\n\\r\\t]+|[ \\n\\r\\t]+$");
    private static boolean systemFontLoaded = false;

    static {
        tq5.k.a("xlabeffect");
    }

    public RfxPagFont() {
        this.fontFamily = "";
        this.fontStyle = "";
    }

    private static void RegisterFallbackFonts() {
        if (systemFontLoaded) {
            return;
        }
        systemFontLoaded = true;
        int i17 = 0;
        com.tencent.mm.rfx.c[] cVarArr = new com.tencent.mm.rfx.c[0];
        try {
            cVarArr = new java.io.File(SystemFontConfigPath_Lollipop).exists() ? parseLollipop() : parseJellyBean();
        } catch (java.lang.Exception unused) {
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.tencent.mm.rfx.c fontByLanguage = getFontByLanguage(cVarArr, DefaultLanguage);
        if (fontByLanguage != null) {
            addFont(fontByLanguage, arrayList, arrayList2);
        }
        for (java.lang.String str : FallbackFontFileNames) {
            com.tencent.mm.rfx.c cVar = new com.tencent.mm.rfx.c(null);
            cVar.f192222b = str;
            addFont(cVar, arrayList, arrayList2);
        }
        for (com.tencent.mm.rfx.c cVar2 : cVarArr) {
            addFont(cVar2, arrayList, arrayList2);
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

    public static native com.tencent.mm.rfx.RfxPagFont RegisterFont(android.content.res.AssetManager assetManager, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3);

    public static com.tencent.mm.rfx.RfxPagFont RegisterFont(java.lang.String str) {
        return RegisterFont(str, 0);
    }

    public static native com.tencent.mm.rfx.RfxPagFont RegisterFont(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3);

    public static com.tencent.mm.rfx.RfxPagFont RegisterFontBytes(byte[] bArr, int i17, int i18) {
        return RegisterFontBytes(bArr, i17, i18, "", "");
    }

    private static native com.tencent.mm.rfx.RfxPagFont RegisterFontBytes(byte[] bArr, int i17, int i18, java.lang.String str, java.lang.String str2);

    private static native void SetFallbackFontPaths(java.lang.String[] strArr, int[] iArr);

    public static void UnregisterFont(com.tencent.mm.rfx.RfxPagFont rfxPagFont) {
        UnregisterFont(rfxPagFont.fontFamily, rfxPagFont.fontStyle);
    }

    private static native void UnregisterFont(java.lang.String str, java.lang.String str2);

    private static void addFont(com.tencent.mm.rfx.c cVar, java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.Integer> arrayList2) {
        if (!arrayList.contains(cVar.f192222b) && new java.io.File(cVar.f192222b).exists()) {
            arrayList.add(cVar.f192222b);
            arrayList2.add(java.lang.Integer.valueOf(cVar.f192223c));
        }
    }

    private static com.tencent.mm.rfx.c getFontByLanguage(com.tencent.mm.rfx.c[] cVarArr, java.lang.String str) {
        java.lang.String lowerCase = str.toLowerCase();
        for (com.tencent.mm.rfx.c cVar : cVarArr) {
            if (cVar.f192221a.toLowerCase().equals(lowerCase)) {
                return cVar;
            }
        }
        return null;
    }

    private static com.tencent.mm.rfx.c[] parseJellyBean() {
        com.tencent.mm.rfx.c[] cVarArr = new com.tencent.mm.rfx.c[0];
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(SystemFontConfigPath_JellyBean);
            try {
                org.xmlpull.v1.XmlPullParser newPullParser = android.util.Xml.newPullParser();
                newPullParser.setInput(fileInputStream, null);
                newPullParser.nextTag();
                return readFamiliesJellyBean(newPullParser);
            } finally {
                fileInputStream.close();
            }
        } catch (java.io.IOException unused) {
            return cVarArr;
        }
    }

    private static com.tencent.mm.rfx.c[] parseLollipop() {
        com.tencent.mm.rfx.c[] cVarArr = new com.tencent.mm.rfx.c[0];
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(SystemFontConfigPath_Lollipop);
            try {
                org.xmlpull.v1.XmlPullParser newPullParser = android.util.Xml.newPullParser();
                newPullParser.setInput(fileInputStream, null);
                newPullParser.nextTag();
                return readFamilies(newPullParser);
            } finally {
                fileInputStream.close();
            }
        } catch (java.io.IOException unused) {
            return cVarArr;
        }
    }

    private static com.tencent.mm.rfx.c[] readFamilies(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        xmlPullParser.require(2, null, "familyset");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("family")) {
                    readFamily(xmlPullParser, arrayList);
                } else {
                    skip(xmlPullParser);
                }
            }
        }
        com.tencent.mm.rfx.c[] cVarArr = new com.tencent.mm.rfx.c[arrayList.size()];
        arrayList.toArray(cVarArr);
        return cVarArr;
    }

    private static com.tencent.mm.rfx.c[] readFamiliesJellyBean(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        xmlPullParser.require(2, null, "familyset");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("family")) {
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if (xmlPullParser.getName().equals("fileset")) {
                                readFileset(xmlPullParser, arrayList);
                            } else {
                                skip(xmlPullParser);
                            }
                        }
                    }
                } else {
                    skip(xmlPullParser);
                }
            }
        }
        com.tencent.mm.rfx.c[] cVarArr = new com.tencent.mm.rfx.c[arrayList.size()];
        arrayList.toArray(cVarArr);
        return cVarArr;
    }

    private static void readFamily(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.ArrayList<com.tencent.mm.rfx.c> arrayList) {
        com.tencent.mm.rfx.c cVar = null;
        xmlPullParser.getAttributeValue(null, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "lang");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList2.add(readFont(xmlPullParser));
                } else {
                    skip(xmlPullParser);
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
            com.tencent.mm.rfx.c cVar2 = (com.tencent.mm.rfx.c) it.next();
            if (cVar2.f192224d == 400) {
                cVar = cVar2;
                break;
            }
        }
        if (cVar == null) {
            cVar = (com.tencent.mm.rfx.c) arrayList2.get(0);
        }
        if (cVar.f192222b.isEmpty()) {
            return;
        }
        if (attributeValue == null) {
            attributeValue = "";
        }
        cVar.f192221a = attributeValue;
        arrayList.add(cVar);
    }

    private static void readFileset(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.ArrayList<com.tencent.mm.rfx.c> arrayList) {
        com.tencent.mm.rfx.c cVar;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("file")) {
                    arrayList2.add(readFont(xmlPullParser));
                } else {
                    skip(xmlPullParser);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        java.util.Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                cVar = null;
                break;
            } else {
                cVar = (com.tencent.mm.rfx.c) it.next();
                if (cVar.f192224d == 400) {
                    break;
                }
            }
        }
        if (cVar == null) {
            cVar = (com.tencent.mm.rfx.c) arrayList2.get(0);
        }
        if (cVar.f192222b.isEmpty()) {
            return;
        }
        arrayList.add(cVar);
    }

    private static com.tencent.mm.rfx.c readFont(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        com.tencent.mm.rfx.c cVar = new com.tencent.mm.rfx.c(null);
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, ya.b.INDEX);
        cVar.f192223c = attributeValue == null ? 0 : java.lang.Integer.parseInt(attributeValue);
        java.lang.String attributeValue2 = xmlPullParser.getAttributeValue(null, "weight");
        cVar.f192224d = attributeValue2 == null ? 400 : java.lang.Integer.parseInt(attributeValue2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 4) {
                sb6.append(xmlPullParser.getText());
            }
            if (xmlPullParser.getEventType() == 2) {
                skip(xmlPullParser);
            }
        }
        cVar.f192222b = SystemFontPath + FILENAME_WHITESPACE_PATTERN.matcher(sb6).replaceAll("");
        return cVar;
    }

    private static void skip(org.xmlpull.v1.XmlPullParser xmlPullParser) {
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

    public static com.tencent.mm.rfx.RfxPagFont RegisterFont(android.content.res.AssetManager assetManager, java.lang.String str) {
        return RegisterFont(assetManager, str, 0);
    }

    public static com.tencent.mm.rfx.RfxPagFont RegisterFont(android.content.res.AssetManager assetManager, java.lang.String str, int i17) {
        return RegisterFont(assetManager, str, i17, "", "");
    }

    public RfxPagFont(java.lang.String str, java.lang.String str2) {
        this.fontFamily = str;
        this.fontStyle = str2;
    }

    public static com.tencent.mm.rfx.RfxPagFont RegisterFont(java.lang.String str, int i17) {
        return RegisterFont(str, i17, "", "");
    }
}
