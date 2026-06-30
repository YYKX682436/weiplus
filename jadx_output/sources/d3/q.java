package d3;

/* loaded from: classes13.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f226108a = new java.lang.ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.WeakHashMap f226109b = new java.util.WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f226110c = new java.lang.Object();

    public static void a(android.content.Context context, int i17, d3.p pVar, android.os.Handler handler) {
        pVar.getClass();
        if (context.isRestricted()) {
            pVar.a(-4, handler);
        } else {
            b(context, i17, new android.util.TypedValue(), 0, pVar, handler, false, false);
        }
    }

    public static android.graphics.Typeface b(android.content.Context context, int i17, android.util.TypedValue typedValue, int i18, d3.p pVar, android.os.Handler handler, boolean z17, boolean z18) {
        android.graphics.Typeface typeface;
        android.content.res.Resources resources = context.getResources();
        resources.getValue(i17, typedValue, true);
        java.lang.CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new android.content.res.Resources.NotFoundException("Resource \"" + resources.getResourceName(i17) + "\" (" + java.lang.Integer.toHexString(i17) + ") is not a Font: " + typedValue);
        }
        java.lang.String charSequence2 = charSequence.toString();
        if (charSequence2.startsWith("res/")) {
            int i19 = typedValue.assetCookie;
            x.g gVar = e3.h.f247052b;
            typeface = (android.graphics.Typeface) gVar.get(e3.h.b(resources, i17, charSequence2, i19, i18));
            if (typeface != null) {
                if (pVar != null) {
                    pVar.b(typeface, handler);
                }
            } else if (!z18) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        d3.f a17 = d3.j.a(resources.getXml(i17), resources);
                        if (a17 != null) {
                            typeface = e3.h.a(context, a17, resources, i17, charSequence2, typedValue.assetCookie, i18, pVar, handler, z17);
                        } else if (pVar != null) {
                            pVar.a(-3, handler);
                        }
                    } else {
                        int i27 = typedValue.assetCookie;
                        typeface = e3.h.f247051a.d(context, resources, i17, charSequence2, i18);
                        if (typeface != null) {
                            gVar.put(e3.h.b(resources, i17, charSequence2, i27, i18), typeface);
                        }
                        if (pVar != null) {
                            if (typeface != null) {
                                pVar.b(typeface, handler);
                            } else {
                                pVar.a(-3, handler);
                            }
                        }
                    }
                } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
                    if (pVar != null) {
                        pVar.a(-3, handler);
                    }
                }
            }
            if (typeface == null || pVar != null || z18) {
                return typeface;
            }
            throw new android.content.res.Resources.NotFoundException("Font resource ID #0x" + java.lang.Integer.toHexString(i17) + " could not be retrieved.");
        }
        if (pVar != null) {
            pVar.a(-3, handler);
        }
        typeface = null;
        if (typeface == null) {
        }
        return typeface;
    }
}
