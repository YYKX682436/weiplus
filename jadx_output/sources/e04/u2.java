package e04;

/* loaded from: classes12.dex */
public class u2 extends com.tencent.mm.pluginsdk.model.j3 {

    /* renamed from: c, reason: collision with root package name */
    public final int f246120c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Canvas f246121d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f246122e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Bitmap f246123f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Matrix f246124g;

    /* renamed from: h, reason: collision with root package name */
    public final float f246125h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Matrix f246126i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f246127j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Set f246128k = new java.util.HashSet();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.Map f246129l = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e04.w2 f246130m;

    public u2(e04.w2 w2Var, int i17, java.util.List list, float f17, android.graphics.Bitmap bitmap) {
        int i18;
        int i19;
        int i27;
        this.f246130m = w2Var;
        this.f246120c = i17;
        this.f246127j = list;
        this.f246125h = f17;
        this.f246123f = bitmap;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.eq6 eq6Var = (r45.eq6) it.next();
            int i28 = eq6Var.f373680f;
            boolean z17 = true;
            if (i28 <= 1 || (i18 = eq6Var.f373681g) <= 1 || i28 == Integer.MAX_VALUE || i18 == Integer.MAX_VALUE || (i19 = eq6Var.f373678d) < 0 || (i27 = eq6Var.f373679e) < 0 || i19 == Integer.MAX_VALUE || i27 == Integer.MAX_VALUE) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "invalid translation info (%d,%d) %d %d", java.lang.Integer.valueOf(eq6Var.f373678d), java.lang.Integer.valueOf(eq6Var.f373679e), java.lang.Integer.valueOf(eq6Var.f373680f), java.lang.Integer.valueOf(eq6Var.f373681g));
                z17 = false;
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "remove invalid translation info");
                it.remove();
            }
        }
        for (r45.eq6 eq6Var2 : this.f246127j) {
            int i29 = eq6Var2.f373685n;
            if (i29 > 0) {
                if (!this.f246129l.containsKey(java.lang.Integer.valueOf(i29))) {
                    this.f246129l.put(java.lang.Integer.valueOf(eq6Var2.f373685n), new java.util.ArrayList());
                }
                ((java.util.List) this.f246129l.get(java.lang.Integer.valueOf(eq6Var2.f373685n))).add(eq6Var2);
            } else {
                this.f246128k.add(eq6Var2);
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.model.j3
    public java.lang.Object a(java.lang.Object[] objArr) {
        e04.w2 w2Var;
        int[] iArr;
        int width;
        int height;
        android.graphics.Bitmap m17;
        float f17 = this.f246125h;
        android.graphics.Bitmap bitmap = this.f246123f;
        try {
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            arrayList.add(bool);
            arrayList.add(config);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(bitmap, arrayList.toArray(), "com/tencent/mm/plugin/scanner/util/ScanTranslationRender$RenderTranslationInfoTask", "doInBackground", "([Ljava/lang/Void;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap copy = bitmap.copy((android.graphics.Bitmap.Config) arrayList.get(0), ((java.lang.Boolean) arrayList.get(1)).booleanValue());
            char c17 = 1;
            yj0.a.e(bitmap, copy, "com/tencent/mm/plugin/scanner/util/ScanTranslationRender$RenderTranslationInfoTask", "doInBackground", "([Ljava/lang/Void;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
            this.f246124g = new android.graphics.Matrix();
            float[] fArr = {0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()};
            double d17 = f17;
            float[] fArr2 = {0.0f, (float) (bitmap.getWidth() * java.lang.Math.abs(java.lang.Math.sin(d17))), (float) ((bitmap.getWidth() * java.lang.Math.abs(java.lang.Math.cos(d17))) + (bitmap.getHeight() * java.lang.Math.abs(java.lang.Math.sin(d17)))), (float) (bitmap.getHeight() * java.lang.Math.abs(java.lang.Math.cos(d17)))};
            char c18 = 3;
            int i17 = 2;
            this.f246124g.setPolyToPoly(fArr, 0, fArr2, 0, 2);
            this.f246124g.setRotate(-f17);
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            this.f246126i = matrix;
            matrix.setPolyToPoly(fArr2, 0, fArr, 0, 2);
            this.f246126i.setRotate(f17);
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "angle %s", java.lang.Float.valueOf(f17));
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            android.graphics.Matrix matrix2 = this.f246124g;
            zj0.a aVar = new zj0.a();
            aVar.c(bool);
            aVar.c(matrix2);
            aVar.c(java.lang.Integer.valueOf(height2));
            aVar.c(java.lang.Integer.valueOf(width2));
            aVar.c(0);
            aVar.c(0);
            aVar.c(copy);
            java.lang.Object obj = new java.lang.Object();
            yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/scanner/util/ScanTranslationRender$RenderTranslationInfoTask", "doInBackground", "([Ljava/lang/Void;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            int i18 = 5;
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/scanner/util/ScanTranslationRender$RenderTranslationInfoTask", "doInBackground", "([Ljava/lang/Void;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            this.f246122e = createBitmap;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "originalBitmap %d, %d  rotatedBitmap %d %d", java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()), java.lang.Integer.valueOf(this.f246122e.getWidth()), java.lang.Integer.valueOf(this.f246122e.getHeight()));
            this.f246121d = new android.graphics.Canvas(this.f246122e);
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "create rotated bitmap cost %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            java.util.Iterator it = this.f246127j.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                w2Var = this.f246130m;
                if (!hasNext) {
                    break;
                }
                r45.eq6 eq6Var = (r45.eq6) it.next();
                java.lang.Object[] objArr2 = new java.lang.Object[i18];
                objArr2[0] = java.lang.Integer.valueOf(eq6Var.f373678d);
                objArr2[c17] = java.lang.Integer.valueOf(eq6Var.f373679e);
                objArr2[i17] = java.lang.Integer.valueOf(eq6Var.f373680f);
                objArr2[c18] = java.lang.Integer.valueOf(eq6Var.f373681g);
                objArr2[4] = java.lang.Integer.valueOf(eq6Var.f373683i.length());
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "x %s, y %s, width %s, height %s, text.length %s", objArr2);
                android.graphics.Bitmap bitmap2 = this.f246122e;
                w2Var.getClass();
                if (eq6Var.f373678d + eq6Var.f373680f > bitmap2.getWidth()) {
                    eq6Var.f373680f = bitmap2.getWidth() - eq6Var.f373678d;
                }
                if (eq6Var.f373679e + eq6Var.f373681g > bitmap2.getHeight()) {
                    eq6Var.f373681g = bitmap2.getHeight() - eq6Var.f373679e;
                }
                android.graphics.Bitmap bitmap3 = this.f246122e;
                int i19 = eq6Var.f373678d;
                int i27 = eq6Var.f373679e;
                android.graphics.Bitmap a17 = e04.w2.a(w2Var, bitmap3, new android.graphics.Rect(i19, i27, eq6Var.f373680f + i19, eq6Var.f373681g + i27));
                java.lang.Object[] objArr3 = new java.lang.Object[i17];
                objArr3[0] = java.lang.Integer.valueOf(a17.getWidth());
                objArr3[1] = java.lang.Integer.valueOf(a17.getHeight());
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "area bitmap %d, %d", objArr3);
                int[] b17 = e04.w2.b(w2Var, a17);
                int i28 = b17[0];
                android.graphics.Canvas canvas = this.f246121d;
                android.graphics.Paint paint = new android.graphics.Paint();
                int i29 = eq6Var.f373678d;
                int i37 = eq6Var.f373679e;
                java.util.Iterator it6 = it;
                android.graphics.Rect rect = new android.graphics.Rect(i29, i37, eq6Var.f373680f + i29, eq6Var.f373681g + i37);
                paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
                paint.setColor(i28);
                paint.setAntiAlias(true);
                canvas.drawRect(rect, paint);
                if (((java.util.HashSet) this.f246128k).contains(eq6Var)) {
                    e04.w2.d(w2Var, e04.w2.c(w2Var, eq6Var), b17[1], eq6Var, this.f246121d);
                }
                it = it6;
                c18 = 3;
                i18 = 5;
                c17 = 1;
                i17 = 2;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "draw all translation bg cost %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
            long currentTimeMillis3 = java.lang.System.currentTimeMillis();
            java.util.Map map = this.f246129l;
            java.util.Iterator it7 = ((java.util.HashMap) map).keySet().iterator();
            while (it7.hasNext()) {
                int intValue = ((java.lang.Integer) it7.next()).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it8 = ((java.util.List) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(intValue))).iterator();
                while (it8.hasNext()) {
                    arrayList2.add(java.lang.Float.valueOf(e04.w2.c(w2Var, (r45.eq6) it8.next())));
                }
                float floatValue = ((java.lang.Float) java.util.Collections.min(arrayList2)).floatValue();
                int i38 = 0;
                for (java.util.List list = (java.util.List) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(intValue)); i38 < list.size(); list = list) {
                    r45.eq6 eq6Var2 = (r45.eq6) list.get(i38);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "x %s, y %s, width %s, height %s", java.lang.Integer.valueOf(eq6Var2.f373678d), java.lang.Integer.valueOf(eq6Var2.f373679e), java.lang.Integer.valueOf(eq6Var2.f373680f), java.lang.Integer.valueOf(eq6Var2.f373681g));
                    android.graphics.Bitmap bitmap4 = this.f246122e;
                    int i39 = eq6Var2.f373678d;
                    java.util.Map map2 = map;
                    int i47 = eq6Var2.f373679e;
                    android.graphics.Bitmap a18 = e04.w2.a(w2Var, bitmap4, new android.graphics.Rect(i39, i47, eq6Var2.f373680f + i39, eq6Var2.f373681g + i47));
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "area bitmap %d, %d", java.lang.Integer.valueOf(a18.getWidth()), java.lang.Integer.valueOf(a18.getHeight()));
                    e04.w2.d(w2Var, floatValue, e04.w2.b(w2Var, a18)[1], eq6Var2, this.f246121d);
                    i38++;
                    map = map2;
                    it7 = it7;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "draw all translation text cost %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis3));
            android.graphics.Bitmap bitmap5 = this.f246122e;
            int width3 = bitmap5.getWidth();
            int height3 = this.f246122e.getHeight();
            android.graphics.Matrix matrix3 = this.f246126i;
            zj0.a aVar2 = new zj0.a();
            aVar2.c(java.lang.Boolean.TRUE);
            aVar2.c(matrix3);
            aVar2.c(java.lang.Integer.valueOf(height3));
            aVar2.c(java.lang.Integer.valueOf(width3));
            aVar2.c(0);
            aVar2.c(0);
            aVar2.c(bitmap5);
            java.lang.Object obj2 = new java.lang.Object();
            yj0.a.d(obj2, aVar2.b(), "com/tencent/mm/plugin/scanner/util/ScanTranslationRender$RenderTranslationInfoTask", "doInBackground", "([Ljava/lang/Void;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar2.a(0), ((java.lang.Integer) aVar2.a(1)).intValue(), ((java.lang.Integer) aVar2.a(2)).intValue(), ((java.lang.Integer) aVar2.a(3)).intValue(), ((java.lang.Integer) aVar2.a(4)).intValue(), (android.graphics.Matrix) aVar2.a(5), ((java.lang.Boolean) aVar2.a(6)).booleanValue());
            yj0.a.e(obj2, createBitmap2, "com/tencent/mm/plugin/scanner/util/ScanTranslationRender$RenderTranslationInfoTask", "doInBackground", "([Ljava/lang/Void;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "resultBitmap width %d, height %d", java.lang.Integer.valueOf(createBitmap2.getWidth()), java.lang.Integer.valueOf(createBitmap2.getHeight()));
            iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
            createBitmap2.getPixels(iArr, 0, bitmap.getWidth(), (createBitmap2.getWidth() - bitmap.getWidth()) / 2, (createBitmap2.getHeight() - bitmap.getHeight()) / 2, bitmap.getWidth(), bitmap.getHeight());
            width = bitmap.getWidth();
            height = bitmap.getHeight();
            m17 = com.tencent.mm.sdk.platformtools.x.m(width, height, android.graphics.Bitmap.Config.ARGB_8888, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", e17, "render translation info error", new java.lang.Object[0]);
        }
        if (m17 != null) {
            if (width == m17.getWidth() && height == m17.getHeight()) {
                m17.setPixels(iArr, 0, width, 0, 0, width, height);
            }
            return null;
        }
        com.tencent.mm.sdk.platformtools.x.H0(m17);
        java.util.WeakHashMap weakHashMap = com.tencent.mm.sdk.platformtools.t.f192977a;
        return m17;
    }

    @Override // com.tencent.mm.pluginsdk.model.j3
    public java.util.concurrent.ExecutorService b() {
        return e04.w2.f246148c;
    }

    @Override // com.tencent.mm.pluginsdk.model.j3
    public void c(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "task session %d, curSession %d", java.lang.Integer.valueOf(this.f246120c), java.lang.Integer.valueOf(this.f246130m.f246149a));
        if (this.f246120c != this.f246130m.f246149a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "ignore this translation result");
        } else if (this.f246130m.f246150b != null) {
            this.f246130m.f246150b.v5(this.f246120c, bitmap);
        }
    }
}
