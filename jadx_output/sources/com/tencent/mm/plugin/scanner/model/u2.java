package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes15.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.scanner.model.t2 f159074a = new com.tencent.mm.plugin.scanner.model.t2();

    public void a(java.lang.String str) {
        java.lang.String text;
        org.xmlpull.v1.XmlPullParserFactory newInstance = org.xmlpull.v1.XmlPullParserFactory.newInstance();
        newInstance.setNamespaceAware(true);
        org.xmlpull.v1.XmlPullParser newPullParser = newInstance.newPullParser();
        newPullParser.setInput(new java.io.StringReader(str));
        int eventType = newPullParser.getEventType();
        java.lang.String str2 = "";
        while (true) {
            com.tencent.mm.plugin.scanner.model.t2 t2Var = this.f159074a;
            if (eventType == 1) {
                com.tencent.mm.plugin.scanner.model.t2.f159049v = t2Var;
                return;
            }
            if (eventType == 1) {
                com.tencent.mm.plugin.scanner.model.t2.f159049v = t2Var;
            } else if (eventType == 2) {
                java.lang.String name = newPullParser.getName();
                if (name.equals(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME)) {
                    t2Var.f159050a = new com.tencent.mm.plugin.scanner.model.r2(newPullParser.getAttributeValue(null, "firstName"), newPullParser.getAttributeValue(null, "middleName"), newPullParser.getAttributeValue(null, "lastName"));
                } else if (name.equals("address")) {
                    t2Var.f159055f = b(newPullParser);
                } else if (name.equals("deliveryAddress")) {
                    t2Var.f159056g = b(newPullParser);
                } else if (name.equals("homeAddress")) {
                    t2Var.f159057h = b(newPullParser);
                } else if (name.equals("workAddress")) {
                    t2Var.f159058i = b(newPullParser);
                } else if (name.equals("photo")) {
                    c(newPullParser);
                    t2Var.getClass();
                } else if (name.equals("logo")) {
                    t2Var.f159053d = c(newPullParser);
                } else if (name.equals("sound")) {
                    c(newPullParser);
                    t2Var.getClass();
                }
                str2 = name;
            } else if (eventType == 4 && (text = newPullParser.getText()) != null && text.trim().length() > 0) {
                java.lang.String trim = text.trim();
                if (str2.equals("nickName")) {
                    t2Var.f159051b = trim;
                } else if (str2.equals("photoUrl")) {
                    t2Var.f159052c = trim;
                } else if (str2.equals("birthday")) {
                    t2Var.f159054e = trim;
                } else if (str2.equals("mobilePhoneNumber")) {
                    if (t2Var.f159059j == null) {
                        t2Var.f159059j = new java.util.ArrayList();
                    }
                    if (trim != null && !((java.util.ArrayList) t2Var.f159059j).contains(trim)) {
                        ((java.util.ArrayList) t2Var.f159059j).add(trim);
                    }
                } else if (str2.equals("homePhoneNumber")) {
                    if (t2Var.f159060k == null) {
                        t2Var.f159060k = new java.util.ArrayList();
                    }
                    if (trim != null && !((java.util.ArrayList) t2Var.f159060k).contains(trim)) {
                        ((java.util.ArrayList) t2Var.f159060k).add(trim);
                    }
                } else if (str2.equals("workPhoneNumber")) {
                    if (t2Var.f159061l == null) {
                        t2Var.f159061l = new java.util.ArrayList();
                    }
                    if (trim != null && !((java.util.ArrayList) t2Var.f159061l).contains(trim)) {
                        ((java.util.ArrayList) t2Var.f159061l).add(trim);
                    }
                } else if (str2.equals("telAVPhoneNumber")) {
                    if (t2Var.f159062m == null) {
                        t2Var.f159062m = new java.util.ArrayList();
                    }
                    if (trim != null && !((java.util.ArrayList) t2Var.f159062m).contains(trim)) {
                        ((java.util.ArrayList) t2Var.f159062m).add(trim);
                    }
                } else if (str2.equals("phoneNumber")) {
                    if (t2Var.f159063n == null) {
                        t2Var.f159063n = new java.util.ArrayList();
                    }
                    if (trim != null && !((java.util.ArrayList) t2Var.f159063n).contains(trim)) {
                        ((java.util.ArrayList) t2Var.f159063n).add(trim);
                    }
                } else if (str2.equals(com.google.android.gms.common.Scopes.EMAIL)) {
                    t2Var.f159064o = trim;
                } else if (str2.equals(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
                    t2Var.f159065p = trim;
                } else if (str2.equals("role")) {
                    t2Var.f159066q = trim;
                } else if (str2.equals("agent")) {
                    t2Var.f159067r = trim;
                } else if (str2.equals("note")) {
                    t2Var.f159068s = trim;
                } else if (str2.equals("url")) {
                    t2Var.f159069t = trim;
                } else if (str2.equals("organization")) {
                    t2Var.f159070u = trim;
                }
            }
            eventType = newPullParser.next();
        }
    }

    public final com.tencent.mm.plugin.scanner.model.q2 b(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        return new com.tencent.mm.plugin.scanner.model.q2(xmlPullParser.getAttributeValue(null, "postOfficeBox"), xmlPullParser.getAttributeValue(null, "extendedAddress"), xmlPullParser.getAttributeValue(null, "street"), xmlPullParser.getAttributeValue(null, com.tencent.map.geolocation.sapp.internal.TencentExtraKeys.LOCATION_KEY_LOCALITY), xmlPullParser.getAttributeValue(null, "region"), xmlPullParser.getAttributeValue(null, "postalCode"), xmlPullParser.getAttributeValue(null, "country"));
    }

    public final com.tencent.mm.plugin.scanner.model.s2 c(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        return new com.tencent.mm.plugin.scanner.model.s2(xmlPullParser.getAttributeValue(null, "type"), xmlPullParser.getAttributeValue(null, "buffer"));
    }
}
