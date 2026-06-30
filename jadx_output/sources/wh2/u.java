package wh2;

/* loaded from: classes12.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final wh2.u f445962a = new wh2.u();

    static {
        new com.tencent.mm.loader.cache.memory.b();
        new xo0.b();
        yo0.i.f464094o.a();
        new ap0.i();
    }

    public final android.graphics.Bitmap a(java.lang.String filePath, java.lang.String str, int i17, int i18, float f17) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        try {
            org.w3c.dom.Document parse = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new java.io.File(filePath));
            kotlin.jvm.internal.o.f(parse, "parse(...)");
            if (str != null && !kotlin.jvm.internal.o.b(str, "")) {
                b(parse, str);
            }
            javax.xml.transform.Transformer newTransformer = javax.xml.transform.TransformerFactory.newInstance().newTransformer();
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            newTransformer.transform(new javax.xml.transform.dom.DOMSource(parse), new javax.xml.transform.stream.StreamResult(stringWriter));
            java.lang.String stringWriter2 = stringWriter.toString();
            kotlin.jvm.internal.o.f(stringWriter2, "toString(...)");
            if (stringWriter2.length() > 0) {
                s7.t2 g17 = new s7.r3().g(new java.io.ByteArrayInputStream(stringWriter2.getBytes()), true);
                if (f17 > 96.0f) {
                    g17.f403837b = f17;
                }
                int ceil = (i17 <= 0 || i18 <= 0) ? (int) java.lang.Math.ceil(g17.c()) : i17;
                if (i17 <= 0 || i18 <= 0) {
                    i18 = (int) java.lang.Math.ceil(g17.b());
                }
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                arrayList.add(java.lang.Integer.valueOf(ceil));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/loader/FinderLiveSVGLoader", "loadSvgFileIntoBitmap", "(Ljava/lang/String;Ljava/lang/String;IIF)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/live/loader/FinderLiveSVGLoader", "loadSvgFileIntoBitmap", "(Ljava/lang/String;Ljava/lang/String;IIF)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
                android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                canvas.setDrawFilter(new android.graphics.PaintFlagsDrawFilter(0, 3));
                g17.f(canvas);
                return createBitmap;
            }
        } catch (java.lang.Exception unused) {
        }
        return null;
    }

    public final void b(org.w3c.dom.Node node, java.lang.String str) {
        if (node.getNodeType() == 1) {
            org.w3c.dom.NamedNodeMap attributes = ((org.w3c.dom.Element) node).getAttributes();
            int length = attributes.getLength();
            for (int i17 = 0; i17 < length; i17++) {
                org.w3c.dom.Node item = attributes.item(i17);
                org.w3c.dom.Attr attr = item instanceof org.w3c.dom.Attr ? (org.w3c.dom.Attr) item : null;
                if (attr != null && ((kotlin.jvm.internal.o.b(attr.getName(), "fill") || kotlin.jvm.internal.o.b(attr.getName(), "stoke")) && !kotlin.jvm.internal.o.b(attr.getValue(), com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE))) {
                    java.lang.String value = attr.getValue();
                    kotlin.jvm.internal.o.f(value, "getValue(...)");
                    if (value.length() > 0) {
                        attr.setValue(str);
                    }
                }
            }
        }
        org.w3c.dom.NodeList childNodes = node.getChildNodes();
        int length2 = childNodes.getLength();
        for (int i18 = 0; i18 < length2; i18++) {
            org.w3c.dom.Node item2 = childNodes.item(i18);
            kotlin.jvm.internal.o.f(item2, "item(...)");
            b(item2, str);
        }
    }
}
