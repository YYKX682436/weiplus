package n;

/* loaded from: classes15.dex */
public class j extends android.view.MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Class[] f333408e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Class[] f333409f;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object[] f333410a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object[] f333411b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f333412c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f333413d;

    static {
        java.lang.Class[] clsArr = {android.content.Context.class};
        f333408e = clsArr;
        f333409f = clsArr;
    }

    public j(android.content.Context context) {
        super(context);
        this.f333412c = context;
        java.lang.Object[] objArr = {context};
        this.f333410a = objArr;
        this.f333411b = objArr;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        return (!(obj instanceof android.app.Activity) && (obj instanceof android.content.ContextWrapper)) ? a(((android.content.ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.view.Menu menu) {
        int i17;
        android.content.res.ColorStateList colorStateList;
        java.lang.Object obj;
        n.i iVar = new n.i(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i17 = 2;
            if (eventType == 2) {
                java.lang.String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new java.lang.RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z17 = false;
        boolean z18 = false;
        java.lang.String str = null;
        while (!z17) {
            if (eventType == 1) {
                throw new java.lang.RuntimeException("Unexpected end of document");
            }
            android.view.Menu menu2 = iVar.f333382a;
            z17 = z17;
            z17 = z17;
            if (eventType != i17) {
                if (eventType == 3) {
                    java.lang.String name2 = xmlPullParser.getName();
                    if (z18 && name2.equals(str)) {
                        z18 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        iVar.f333383b = 0;
                        iVar.f333384c = 0;
                        iVar.f333385d = 0;
                        iVar.f333386e = 0;
                        iVar.f333387f = true;
                        iVar.f333388g = true;
                        z17 = z17;
                    } else if (name2.equals("item")) {
                        z17 = z17;
                        if (!iVar.f333389h) {
                            n3.f fVar = iVar.f333407z;
                            if (fVar == null || !((o.v) fVar).f341824b.hasSubMenu()) {
                                iVar.f333389h = true;
                                iVar.a(menu2.add(iVar.f333383b, iVar.f333390i, iVar.f333391j, iVar.f333392k));
                                z17 = z17;
                            } else {
                                iVar.f333389h = true;
                                iVar.a(menu2.addSubMenu(iVar.f333383b, iVar.f333390i, iVar.f333391j, iVar.f333392k).getItem());
                                z17 = z17;
                            }
                        }
                    } else {
                        z17 = z17;
                        if (name2.equals("menu")) {
                            z17 = true;
                        }
                    }
                }
            } else if (!z18) {
                java.lang.String name3 = xmlPullParser.getName();
                boolean equals = name3.equals("group");
                n.j jVar = iVar.E;
                if (equals) {
                    android.content.res.TypedArray obtainStyledAttributes = jVar.f333412c.obtainStyledAttributes(attributeSet, j.a.f296189q);
                    iVar.f333383b = obtainStyledAttributes.getResourceId(1, 0);
                    iVar.f333384c = obtainStyledAttributes.getInt(3, 0);
                    iVar.f333385d = obtainStyledAttributes.getInt(4, 0);
                    iVar.f333386e = obtainStyledAttributes.getInt(5, 0);
                    iVar.f333387f = obtainStyledAttributes.getBoolean(2, true);
                    iVar.f333388g = obtainStyledAttributes.getBoolean(0, true);
                    obtainStyledAttributes.recycle();
                    z17 = z17;
                } else if (name3.equals("item")) {
                    android.content.res.TypedArray obtainStyledAttributes2 = jVar.f333412c.obtainStyledAttributes(attributeSet, j.a.f296190r);
                    iVar.f333390i = obtainStyledAttributes2.getResourceId(2, 0);
                    iVar.f333391j = (obtainStyledAttributes2.getInt(5, iVar.f333384c) & (-65536)) | (obtainStyledAttributes2.getInt(6, iVar.f333385d) & 65535);
                    iVar.f333392k = obtainStyledAttributes2.getText(7);
                    iVar.f333393l = obtainStyledAttributes2.getText(8);
                    iVar.f333394m = obtainStyledAttributes2.getResourceId(0, 0);
                    java.lang.String string = obtainStyledAttributes2.getString(9);
                    iVar.f333395n = string == null ? (char) 0 : string.charAt(0);
                    iVar.f333396o = obtainStyledAttributes2.getInt(16, 4096);
                    java.lang.String string2 = obtainStyledAttributes2.getString(10);
                    iVar.f333397p = string2 == null ? (char) 0 : string2.charAt(0);
                    iVar.f333398q = obtainStyledAttributes2.getInt(20, 4096);
                    if (obtainStyledAttributes2.hasValue(11)) {
                        iVar.f333399r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                    } else {
                        iVar.f333399r = iVar.f333386e;
                    }
                    iVar.f333400s = obtainStyledAttributes2.getBoolean(3, false);
                    iVar.f333401t = obtainStyledAttributes2.getBoolean(4, iVar.f333387f);
                    iVar.f333402u = obtainStyledAttributes2.getBoolean(1, iVar.f333388g);
                    iVar.f333403v = obtainStyledAttributes2.getInt(21, -1);
                    iVar.f333406y = obtainStyledAttributes2.getString(12);
                    iVar.f333404w = obtainStyledAttributes2.getResourceId(13, 0);
                    iVar.f333405x = obtainStyledAttributes2.getString(15);
                    java.lang.String string3 = obtainStyledAttributes2.getString(14);
                    if ((string3 != null) && iVar.f333404w == 0 && iVar.f333405x == null) {
                        java.lang.Class<?>[] clsArr = f333409f;
                        java.lang.Object[] objArr = jVar.f333411b;
                        try {
                            java.lang.reflect.Constructor<?> constructor = jVar.f333412c.getClassLoader().loadClass(string3).getConstructor(clsArr);
                            constructor.setAccessible(true);
                            obj = constructor.newInstance(objArr);
                        } catch (java.lang.Exception unused) {
                            obj = null;
                        }
                        iVar.f333407z = (n3.f) obj;
                    } else {
                        iVar.f333407z = null;
                    }
                    iVar.A = obtainStyledAttributes2.getText(17);
                    iVar.B = obtainStyledAttributes2.getText(22);
                    if (obtainStyledAttributes2.hasValue(19)) {
                        iVar.D = androidx.appcompat.widget.y0.c(obtainStyledAttributes2.getInt(19, -1), iVar.D);
                        colorStateList = null;
                    } else {
                        colorStateList = null;
                        iVar.D = null;
                    }
                    if (obtainStyledAttributes2.hasValue(18)) {
                        iVar.C = obtainStyledAttributes2.getColorStateList(18);
                    } else {
                        iVar.C = colorStateList;
                    }
                    obtainStyledAttributes2.recycle();
                    iVar.f333389h = false;
                } else if (name3.equals("menu")) {
                    iVar.f333389h = true;
                    android.view.SubMenu addSubMenu = menu2.addSubMenu(iVar.f333383b, iVar.f333390i, iVar.f333391j, iVar.f333392k);
                    iVar.a(addSubMenu.getItem());
                    b(xmlPullParser, attributeSet, addSubMenu);
                } else {
                    str = name3;
                    z18 = true;
                }
            }
            eventType = xmlPullParser.next();
            i17 = 2;
            z17 = z17;
            z18 = z18;
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i17, android.view.Menu menu) {
        if (!(menu instanceof g3.a)) {
            super.inflate(i17, menu);
            return;
        }
        android.content.res.XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f333412c.getResources().getLayout(i17);
                    b(xmlResourceParser, android.util.Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (org.xmlpull.v1.XmlPullParserException e17) {
                    throw new android.view.InflateException("Error inflating menu XML", e17);
                }
            } catch (java.io.IOException e18) {
                throw new android.view.InflateException("Error inflating menu XML", e18);
            }
        } catch (java.lang.Throwable th6) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th6;
        }
    }
}
