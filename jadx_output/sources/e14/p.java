package e14;

/* loaded from: classes12.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public e14.s f246436a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f246437b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f246438c;

    /* renamed from: d, reason: collision with root package name */
    public final org.xmlpull.v1.XmlPullParser f246439d;

    /* renamed from: e, reason: collision with root package name */
    public int f246440e;

    public p(java.lang.String xml, e14.s sVar) {
        kotlin.jvm.internal.o.g(xml, "xml");
        this.f246436a = sVar;
        org.xmlpull.v1.XmlPullParser newPullParser = org.xmlpull.v1.XmlPullParserFactory.newInstance().newPullParser();
        kotlin.jvm.internal.o.f(newPullParser, "newPullParser(...)");
        this.f246439d = newPullParser;
        newPullParser.setInput(new java.io.StringReader(xml));
    }

    public final void a() {
        e14.s sVar;
        e14.s sVar2 = this.f246436a;
        org.xmlpull.v1.XmlPullParser xmlPullParser = this.f246439d;
        if (sVar2 != null) {
            java.lang.String name = xmlPullParser.getName();
            kotlin.jvm.internal.o.f(name, "getName(...)");
            sVar = sVar2.enterParent(name);
        } else {
            sVar = null;
        }
        this.f246436a = sVar;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i17 = 0; i17 < attributeCount; i17++) {
            e14.s sVar3 = this.f246436a;
            if (sVar3 != null) {
                java.lang.String attributeName = xmlPullParser.getAttributeName(i17);
                kotlin.jvm.internal.o.f(attributeName, "getAttributeName(...)");
                java.lang.String attributeValue = xmlPullParser.getAttributeValue(i17);
                kotlin.jvm.internal.o.f(attributeValue, "getAttributeValue(...)");
                sVar3.writeAttr(attributeName, attributeValue);
            }
        }
    }

    public final void b() {
        java.lang.String text;
        e14.s sVar;
        org.xmlpull.v1.XmlPullParser xmlPullParser = this.f246439d;
        if (this.f246438c) {
            return;
        }
        try {
            this.f246438c = true;
            this.f246437b = false;
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (this.f246436a == null || this.f246437b) {
                    break;
                }
                eventType = xmlPullParser.next();
                if (eventType == 2) {
                    this.f246440e++;
                    a();
                } else if (eventType == 3) {
                    this.f246440e--;
                    e14.s sVar2 = this.f246436a;
                    this.f246436a = sVar2 != null ? sVar2.exitParent() : null;
                    if (this.f246440e == 0) {
                        break;
                    }
                } else if (eventType == 4 && (text = xmlPullParser.getText()) != null && (sVar = this.f246436a) != null) {
                    sVar.writeText(text);
                }
            }
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            this.f246438c = false;
            throw th6;
        }
        this.f246438c = false;
    }
}
