package d3;

/* loaded from: classes13.dex */
public abstract class j {
    public static d3.f a(org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        }
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            android.content.res.TypedArray obtainAttributes = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlPullParser), y2.a.f458983b);
            java.lang.String string = obtainAttributes.getString(0);
            java.lang.String string2 = obtainAttributes.getString(4);
            java.lang.String string3 = obtainAttributes.getString(5);
            int resourceId = obtainAttributes.getResourceId(1, 0);
            int integer = obtainAttributes.getInteger(2, 1);
            int integer2 = obtainAttributes.getInteger(3, 500);
            java.lang.String string4 = obtainAttributes.getString(6);
            obtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlPullParser.next() != 3) {
                    c(xmlPullParser);
                }
                return new d3.i(new k3.f(string, string2, string3, b(resources, resourceId)), integer, integer2, string4);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        android.content.res.TypedArray obtainAttributes2 = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlPullParser), y2.a.f458984c);
                        int i17 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z17 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i18 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        java.lang.String string5 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i19 = obtainAttributes2.getInt(i18, 0);
                        int i27 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i27, 0);
                        java.lang.String string6 = obtainAttributes2.getString(i27);
                        obtainAttributes2.recycle();
                        while (xmlPullParser.next() != 3) {
                            c(xmlPullParser);
                        }
                        arrayList.add(new d3.h(string6, i17, z17, string5, i19, resourceId2));
                    } else {
                        c(xmlPullParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new d3.g((d3.h[]) arrayList.toArray(new d3.h[0]));
            }
        } else {
            c(xmlPullParser);
        }
        return null;
    }

    public static java.util.List b(android.content.res.Resources resources, int i17) {
        if (i17 == 0) {
            return java.util.Collections.emptyList();
        }
        android.content.res.TypedArray obtainTypedArray = resources.obtainTypedArray(i17);
        try {
            if (obtainTypedArray.length() == 0) {
                return java.util.Collections.emptyList();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (d3.e.a(obtainTypedArray, 0) == 1) {
                for (int i18 = 0; i18 < obtainTypedArray.length(); i18++) {
                    int resourceId = obtainTypedArray.getResourceId(i18, 0);
                    if (resourceId != 0) {
                        java.lang.String[] stringArray = resources.getStringArray(resourceId);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.String str : stringArray) {
                            arrayList2.add(android.util.Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                java.lang.String[] stringArray2 = resources.getStringArray(i17);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.String str2 : stringArray2) {
                    arrayList3.add(android.util.Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void c(org.xmlpull.v1.XmlPullParser xmlPullParser) {
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
}
