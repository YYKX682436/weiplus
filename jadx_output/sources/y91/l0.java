package y91;

/* loaded from: classes15.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final org.xmlpull.v1.XmlPullParser f460301a = android.util.Xml.newPullParser();

    public java.util.HashMap a(java.lang.String str) {
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(str.getBytes());
        org.xmlpull.v1.XmlPullParser xmlPullParser = this.f460301a;
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            xmlPullParser.setInput(byteArrayInputStream, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            xmlPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                java.lang.String name = xmlPullParser.getName();
                if (name == null) {
                    eventType = xmlPullParser.next();
                } else {
                    if (eventType == 2) {
                        aa1.a aVar = new aa1.a();
                        int attributeCount = xmlPullParser.getAttributeCount();
                        for (int i17 = 0; i17 < attributeCount; i17++) {
                            aVar.f2482b.b(xmlPullParser.getAttributeName(i17), xmlPullParser.getAttributeValue(i17));
                        }
                        int next = xmlPullParser.next();
                        if (next == 2) {
                            hashMap.put(name, aVar);
                            eventType = next;
                        } else if (next == 4) {
                            aVar.f2481a = xmlPullParser.getText().trim();
                            hashMap.put(name, aVar);
                        } else if (next == 3) {
                            hashMap.put(name, aVar);
                        }
                    }
                    eventType = xmlPullParser.next();
                }
            }
        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
        }
        return hashMap;
    }

    public x91.c b(java.io.InputStream inputStream) {
        x91.c cVar;
        synchronized (y91.l0.class) {
            x91.c cVar2 = null;
            try {
                this.f460301a.setInput(inputStream, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                int eventType = this.f460301a.getEventType();
                cVar = new x91.c();
                x91.l lVar = null;
                while (eventType != 1) {
                    if (eventType == 2) {
                        java.lang.String name = this.f460301a.getName();
                        if ("major".equalsIgnoreCase(name)) {
                            java.lang.String nextText = this.f460301a.nextText();
                            if (!android.text.TextUtils.isEmpty(nextText)) {
                                cVar.f452636d = java.lang.Integer.parseInt(nextText);
                            }
                        } else if ("minor".equalsIgnoreCase(name)) {
                            java.lang.String nextText2 = this.f460301a.nextText();
                            if (!android.text.TextUtils.isEmpty(nextText2)) {
                                cVar.f452637e = java.lang.Integer.parseInt(nextText2);
                            }
                        } else if ("deviceType".equalsIgnoreCase(name)) {
                            cVar.f452638f = this.f460301a.nextText();
                        } else if ("friendlyName".equalsIgnoreCase(name)) {
                            cVar.f452639g = this.f460301a.nextText();
                        } else if ("UDN".equalsIgnoreCase(name)) {
                            cVar.f452641i = this.f460301a.nextText();
                        } else if ("manufacturer".equalsIgnoreCase(name)) {
                            cVar.f452640h = this.f460301a.nextText();
                        } else if ("service".equalsIgnoreCase(name)) {
                            lVar = new x91.l();
                        } else if ("serviceType".equalsIgnoreCase(name)) {
                            if (lVar != null) {
                                lVar.f452664a = this.f460301a.nextText();
                            }
                        } else if ("serviceId".equalsIgnoreCase(name)) {
                            if (lVar != null) {
                                lVar.f452665b = this.f460301a.nextText();
                            }
                        } else if ("controlURL".equalsIgnoreCase(name)) {
                            if (lVar != null) {
                                lVar.f452667d = this.f460301a.nextText();
                            }
                        } else if ("eventSubURL".equalsIgnoreCase(name)) {
                            if (lVar != null) {
                                lVar.f452668e = this.f460301a.nextText();
                            }
                        } else if ("SCPDURL".equalsIgnoreCase(name) && lVar != null) {
                            lVar.f452666c = this.f460301a.nextText();
                        }
                    } else if (eventType != 3) {
                        continue;
                    } else {
                        try {
                            if ("service".equalsIgnoreCase(this.f460301a.getName()) && lVar != null) {
                                cVar.f452642j.add(lVar);
                                lVar = null;
                            }
                        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
                            cVar2 = cVar;
                            cVar = cVar2;
                            return cVar;
                        }
                    }
                    eventType = this.f460301a.next();
                }
            } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused2) {
            }
        }
        return cVar;
    }

    public aa1.b c(java.lang.String str) {
        aa1.b bVar = null;
        if (str == null) {
            return null;
        }
        if (str.startsWith("NOTIFY") || str.startsWith("HTTP")) {
            bVar = new aa1.b();
            java.lang.String[] split = str.split(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            if (split.length > 0) {
                java.lang.String[] split2 = split[0].split(" ");
                if (split2[0].startsWith("HTTP")) {
                    bVar.b("VERSION", split2[0]);
                    bVar.b("RESPONSE_CODE", split2[1]);
                    bVar.b("RESPONSE_DESCRIPTION", split2[2]);
                } else {
                    bVar.b("METHOD", split2[0]);
                    bVar.b("PATH", split2[1]);
                    bVar.b("VERSION", split2[2]);
                }
            }
            for (int i17 = 1; i17 < split.length; i17++) {
                java.lang.String str2 = split[i17];
                int indexOf = str2.indexOf(":");
                bVar.b(str2.substring(0, indexOf).toUpperCase(), str2.substring(indexOf + 1, str2.length()).trim());
            }
        }
        return bVar;
    }
}
