package e14;

/* loaded from: classes10.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final org.xmlpull.v1.XmlPullParser f246441a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.StringBuilder f246442b = new java.lang.StringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f246443c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f246444d;

    public q(java.lang.String str) {
        java.lang.ThreadLocal threadLocal = e14.r.f246445a;
        org.xmlpull.v1.XmlPullParser xmlPullParser = (org.xmlpull.v1.XmlPullParser) threadLocal.get();
        this.f246441a = xmlPullParser;
        if (xmlPullParser == null) {
            org.xmlpull.v1.XmlPullParser newPullParser = org.xmlpull.v1.XmlPullParserFactory.newInstance().newPullParser();
            this.f246441a = newPullParser;
            threadLocal.set(newPullParser);
        }
        this.f246441a.setInput(new java.io.StringReader(str));
        this.f246444d = new java.util.HashMap();
        this.f246443c = new java.util.HashMap();
    }

    public java.util.Map a() {
        java.util.Map map;
        org.xmlpull.v1.XmlPullParser xmlPullParser = this.f246441a;
        int eventType = xmlPullParser.getEventType();
        while (true) {
            map = this.f246443c;
            if (eventType == 1) {
                break;
            }
            eventType = xmlPullParser.next();
            if (eventType == 2) {
                java.lang.StringBuilder sb6 = this.f246442b;
                sb6.append('.');
                sb6.append(xmlPullParser.getName());
                java.lang.String sb7 = this.f246442b.toString();
                int hashCode = sb7.hashCode();
                java.util.HashMap hashMap = (java.util.HashMap) this.f246444d;
                java.lang.Integer num = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(hashCode));
                if (num != null) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(num.intValue() + 1);
                    this.f246442b.append(valueOf);
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
                    ((java.util.HashMap) map).put(this.f246442b.toString(), text);
                }
            } else if (eventType == 3) {
                java.lang.StringBuilder sb8 = this.f246442b;
                java.lang.StringBuilder delete = sb8.delete(sb8.lastIndexOf("."), this.f246442b.length());
                this.f246442b = delete;
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
