package com.tencent.mm.sdk.platformtools;

/* loaded from: classes10.dex */
public class z9 {

    /* renamed from: a, reason: collision with root package name */
    public final org.xmlpull.v1.XmlPullParser f193139a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.StringBuilder f193140b = new java.lang.StringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f193141c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f193142d;

    public z9(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.ThreadLocal threadLocal = com.tencent.mm.sdk.platformtools.aa.f192465b;
        org.xmlpull.v1.XmlPullParser xmlPullParser = (org.xmlpull.v1.XmlPullParser) threadLocal.get();
        this.f193139a = xmlPullParser;
        if (xmlPullParser == null) {
            org.xmlpull.v1.XmlPullParser newPullParser = org.xmlpull.v1.XmlPullParserFactory.newInstance().newPullParser();
            this.f193139a = newPullParser;
            threadLocal.set(newPullParser);
        }
        this.f193139a.setInput(new java.io.StringReader(str));
        this.f193142d = new java.util.HashMap();
        this.f193141c = new java.util.HashMap();
    }

    public java.util.Map a() {
        java.util.Map map;
        org.xmlpull.v1.XmlPullParser xmlPullParser = this.f193139a;
        int eventType = xmlPullParser.getEventType();
        while (true) {
            map = this.f193141c;
            if (eventType == 1) {
                break;
            }
            eventType = xmlPullParser.next();
            if (eventType == 2) {
                java.lang.StringBuilder sb6 = this.f193140b;
                sb6.append('.');
                sb6.append(xmlPullParser.getName());
                java.lang.String sb7 = this.f193140b.toString();
                int hashCode = sb7.hashCode();
                java.util.HashMap hashMap = (java.util.HashMap) this.f193142d;
                java.lang.Integer num = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(hashCode));
                if (num != null) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(num.intValue() + 1);
                    this.f193140b.append(valueOf);
                    hashMap.put(java.lang.Integer.valueOf(hashCode), valueOf);
                    sb7 = sb7 + valueOf;
                } else {
                    hashMap.put(java.lang.Integer.valueOf(hashCode), 0);
                }
                java.util.HashMap hashMap2 = (java.util.HashMap) map;
                hashMap2.put(sb7, "");
                for (int i17 = 0; i17 < xmlPullParser.getAttributeCount(); i17++) {
                    hashMap2.put(sb7 + ".$" + xmlPullParser.getAttributeName(i17), xmlPullParser.getAttributeValue(i17));
                }
            } else if (eventType == 4) {
                java.lang.String text = xmlPullParser.getText();
                if (text != null) {
                    ((java.util.HashMap) map).put(this.f193140b.toString(), text);
                }
            } else if (eventType == 3) {
                java.lang.StringBuilder sb8 = this.f193140b;
                java.lang.StringBuilder delete = sb8.delete(sb8.lastIndexOf("."), this.f193140b.length());
                this.f193140b = delete;
                if (delete.length() == 0) {
                    break;
                }
            } else {
                continue;
            }
        }
        return map;
    }
}
