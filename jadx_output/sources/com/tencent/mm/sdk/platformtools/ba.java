package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public abstract class ba {
    public static final java.util.HashMap a(java.io.InputStream inputStream) {
        org.xmlpull.v1.XmlPullParser newPullParser = android.util.Xml.newPullParser();
        newPullParser.setInput(inputStream, null);
        java.lang.String[] strArr = new java.lang.String[1];
        int eventType = newPullParser.getEventType();
        while (eventType != 2) {
            if (eventType == 3) {
                throw new org.xmlpull.v1.XmlPullParserException("Unexpected end tag at: " + newPullParser.getName());
            }
            if (eventType == 4) {
                throw new org.xmlpull.v1.XmlPullParserException("Unexpected text: " + newPullParser.getText());
            }
            eventType = newPullParser.next();
            if (eventType == 1) {
                throw new org.xmlpull.v1.XmlPullParserException("Unexpected end of document");
            }
        }
        return (java.util.HashMap) b(newPullParser, strArr);
    }

    public static final java.lang.Object b(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String[] strArr) {
        int next;
        java.lang.Object obj = null;
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        java.lang.String name = xmlPullParser.getName();
        if (!name.equals("null")) {
            if (name.equals("string")) {
                java.lang.String str = "";
                while (true) {
                    int next2 = xmlPullParser.next();
                    if (next2 == 1) {
                        throw new org.xmlpull.v1.XmlPullParserException("Unexpected end of document in <string>");
                    }
                    if (next2 == 3) {
                        if (xmlPullParser.getName().equals("string")) {
                            strArr[0] = attributeValue;
                            return str;
                        }
                        throw new org.xmlpull.v1.XmlPullParserException("Unexpected end tag in <string>: " + xmlPullParser.getName());
                    }
                    if (next2 == 4) {
                        str = str + xmlPullParser.getText();
                    } else if (next2 == 2) {
                        throw new org.xmlpull.v1.XmlPullParserException("Unexpected start tag in <string>: " + xmlPullParser.getName());
                    }
                }
            } else if (name.equals("int")) {
                obj = java.lang.Integer.valueOf(java.lang.Integer.parseInt(xmlPullParser.getAttributeValue(null, "value")));
            } else if (name.equals("long")) {
                obj = java.lang.Long.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("float")) {
                obj = java.lang.Float.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("double")) {
                obj = java.lang.Double.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else {
                if (!name.equals(com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_BOOLEAN)) {
                    if (name.equals("int-array")) {
                        xmlPullParser.next();
                        try {
                            int[] iArr = new int[java.lang.Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"))];
                            int eventType = xmlPullParser.getEventType();
                            int i17 = 0;
                            do {
                                if (eventType == 2) {
                                    if (!xmlPullParser.getName().equals("item")) {
                                        throw new org.xmlpull.v1.XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                                    }
                                    try {
                                        iArr[i17] = java.lang.Integer.parseInt(xmlPullParser.getAttributeValue(null, "value"));
                                    } catch (java.lang.NullPointerException unused) {
                                        throw new org.xmlpull.v1.XmlPullParserException("Need value attribute in item");
                                    } catch (java.lang.NumberFormatException unused2) {
                                        throw new org.xmlpull.v1.XmlPullParserException("Not a number in value attribute in item");
                                    }
                                } else if (eventType == 3) {
                                    if (xmlPullParser.getName().equals("int-array")) {
                                        strArr[0] = attributeValue;
                                        return iArr;
                                    }
                                    if (!xmlPullParser.getName().equals("item")) {
                                        throw new org.xmlpull.v1.XmlPullParserException("Expected int-array end tag at: " + xmlPullParser.getName());
                                    }
                                    i17++;
                                }
                                eventType = xmlPullParser.next();
                            } while (eventType != 1);
                            throw new org.xmlpull.v1.XmlPullParserException("Document ended before int-array end tag");
                        } catch (java.lang.NullPointerException unused3) {
                            throw new org.xmlpull.v1.XmlPullParserException("Need num attribute in byte-array");
                        } catch (java.lang.NumberFormatException unused4) {
                            throw new org.xmlpull.v1.XmlPullParserException("Not a number in num attribute in byte-array");
                        }
                    }
                    if (name.equals("map")) {
                        xmlPullParser.next();
                        java.util.HashMap hashMap = new java.util.HashMap();
                        int eventType2 = xmlPullParser.getEventType();
                        do {
                            if (eventType2 == 2) {
                                java.lang.Object b17 = b(xmlPullParser, strArr);
                                java.lang.String str2 = strArr[0];
                                if (str2 == null) {
                                    throw new org.xmlpull.v1.XmlPullParserException("Map value without name attribute: " + xmlPullParser.getName());
                                }
                                hashMap.put(str2, b17);
                            } else if (eventType2 == 3) {
                                if (xmlPullParser.getName().equals("map")) {
                                    strArr[0] = attributeValue;
                                    return hashMap;
                                }
                                throw new org.xmlpull.v1.XmlPullParserException("Expected map end tag at: " + xmlPullParser.getName());
                            }
                            eventType2 = xmlPullParser.next();
                        } while (eventType2 != 1);
                        throw new org.xmlpull.v1.XmlPullParserException("Document ended before map end tag");
                    }
                    if (name.equals("list")) {
                        xmlPullParser.next();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        int eventType3 = xmlPullParser.getEventType();
                        do {
                            if (eventType3 == 2) {
                                arrayList.add(b(xmlPullParser, strArr));
                            } else if (eventType3 == 3) {
                                if (xmlPullParser.getName().equals("list")) {
                                    strArr[0] = attributeValue;
                                    return arrayList;
                                }
                                throw new org.xmlpull.v1.XmlPullParserException("Expected list end tag at: " + xmlPullParser.getName());
                            }
                            eventType3 = xmlPullParser.next();
                        } while (eventType3 != 1);
                        throw new org.xmlpull.v1.XmlPullParserException("Document ended before list end tag");
                    }
                    if (!name.equals("set")) {
                        throw new org.xmlpull.v1.XmlPullParserException("Unknown tag: ".concat(name));
                    }
                    xmlPullParser.next();
                    java.util.HashSet hashSet = new java.util.HashSet();
                    int eventType4 = xmlPullParser.getEventType();
                    do {
                        if (eventType4 == 2) {
                            hashSet.add(b(xmlPullParser, strArr));
                        } else if (eventType4 == 3) {
                            if (xmlPullParser.getName().equals("set")) {
                                strArr[0] = attributeValue;
                                return hashSet;
                            }
                            throw new org.xmlpull.v1.XmlPullParserException("Expected set end tag at: " + xmlPullParser.getName());
                        }
                        eventType4 = xmlPullParser.next();
                    } while (eventType4 != 1);
                    throw new org.xmlpull.v1.XmlPullParserException("Document ended before set end tag");
                }
                obj = java.lang.Boolean.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            }
        }
        do {
            next = xmlPullParser.next();
            if (next == 1) {
                throw new org.xmlpull.v1.XmlPullParserException("Unexpected end of document in <" + name + ">");
            }
            if (next == 3) {
                if (xmlPullParser.getName().equals(name)) {
                    strArr[0] = attributeValue;
                    return obj;
                }
                throw new org.xmlpull.v1.XmlPullParserException("Unexpected end tag in <" + name + ">: " + xmlPullParser.getName());
            }
            if (next == 4) {
                throw new org.xmlpull.v1.XmlPullParserException("Unexpected text in <" + name + ">: " + xmlPullParser.getName());
            }
        } while (next != 2);
        throw new org.xmlpull.v1.XmlPullParserException("Unexpected start tag in <" + name + ">: " + xmlPullParser.getName());
    }

    public static final void c(java.util.Map map, java.io.OutputStream outputStream) {
        org.xmlpull.v1.XmlSerializer newSerializer = android.util.Xml.newSerializer();
        newSerializer.setOutput(outputStream, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        newSerializer.startDocument(null, java.lang.Boolean.TRUE);
        newSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        d(map, null, newSerializer);
        newSerializer.endDocument();
    }

    public static final void d(java.util.Map map, java.lang.String str, org.xmlpull.v1.XmlSerializer xmlSerializer) {
        if (map == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "map");
        if (str != null) {
            xmlSerializer.attribute(null, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str);
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            e(entry.getValue(), (java.lang.String) entry.getKey(), xmlSerializer);
        }
        xmlSerializer.endTag(null, "map");
    }

    public static final void e(java.lang.Object obj, java.lang.String str, org.xmlpull.v1.XmlSerializer xmlSerializer) {
        java.lang.String str2;
        if (obj == null) {
            xmlSerializer.startTag(null, "null");
            if (str != null) {
                xmlSerializer.attribute(null, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str);
            }
            xmlSerializer.endTag(null, "null");
            return;
        }
        if (obj instanceof java.lang.String) {
            xmlSerializer.startTag(null, "string");
            if (str != null) {
                xmlSerializer.attribute(null, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str);
            }
            xmlSerializer.text(obj.toString());
            xmlSerializer.endTag(null, "string");
            return;
        }
        if (obj instanceof java.lang.Integer) {
            str2 = "int";
        } else if (obj instanceof java.lang.Long) {
            str2 = "long";
        } else if (obj instanceof java.lang.Float) {
            str2 = "float";
        } else if (obj instanceof java.lang.Double) {
            str2 = "double";
        } else {
            if (!(obj instanceof java.lang.Boolean)) {
                int i17 = 0;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    xmlSerializer.startTag(null, "byte-array");
                    if (str != null) {
                        xmlSerializer.attribute(null, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str);
                    }
                    int length = bArr.length;
                    xmlSerializer.attribute(null, "num", java.lang.Integer.toString(length));
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(bArr.length * 2);
                    while (i17 < length) {
                        byte b17 = bArr[i17];
                        int i18 = b17 >> 4;
                        sb6.append(i18 >= 10 ? (i18 + 97) - 10 : i18 + 48);
                        int i19 = b17 & 255;
                        sb6.append(i19 >= 10 ? (i19 + 97) - 10 : i19 + 48);
                        i17++;
                    }
                    xmlSerializer.text(sb6.toString());
                    xmlSerializer.endTag(null, "byte-array");
                    return;
                }
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    xmlSerializer.startTag(null, "int-array");
                    if (str != null) {
                        xmlSerializer.attribute(null, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str);
                    }
                    int length2 = iArr.length;
                    xmlSerializer.attribute(null, "num", java.lang.Integer.toString(length2));
                    while (i17 < length2) {
                        xmlSerializer.startTag(null, "item");
                        xmlSerializer.attribute(null, "value", java.lang.Integer.toString(iArr[i17]));
                        xmlSerializer.endTag(null, "item");
                        i17++;
                    }
                    xmlSerializer.endTag(null, "int-array");
                    return;
                }
                if (obj instanceof java.util.Map) {
                    d((java.util.Map) obj, str, xmlSerializer);
                    return;
                }
                if (obj instanceof java.util.List) {
                    java.util.List list = (java.util.List) obj;
                    xmlSerializer.startTag(null, "list");
                    if (str != null) {
                        xmlSerializer.attribute(null, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str);
                    }
                    int size = list.size();
                    while (i17 < size) {
                        e(list.get(i17), null, xmlSerializer);
                        i17++;
                    }
                    xmlSerializer.endTag(null, "list");
                    return;
                }
                if (obj instanceof java.util.Set) {
                    java.util.Set set = (java.util.Set) obj;
                    xmlSerializer.startTag(null, "set");
                    if (str != null) {
                        xmlSerializer.attribute(null, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str);
                    }
                    java.util.Iterator it = set.iterator();
                    while (it.hasNext()) {
                        e(it.next(), null, xmlSerializer);
                    }
                    xmlSerializer.endTag(null, "set");
                    return;
                }
                if (!(obj instanceof java.lang.CharSequence)) {
                    throw new java.lang.RuntimeException("writeValueXml: unable to write value " + obj);
                }
                xmlSerializer.startTag(null, "string");
                if (str != null) {
                    xmlSerializer.attribute(null, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str);
                }
                xmlSerializer.text(obj.toString());
                xmlSerializer.endTag(null, "string");
                return;
            }
            str2 = com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_BOOLEAN;
        }
        xmlSerializer.startTag(null, str2);
        if (str != null) {
            xmlSerializer.attribute(null, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str);
        }
        xmlSerializer.attribute(null, "value", obj.toString());
        xmlSerializer.endTag(null, str2);
    }
}
