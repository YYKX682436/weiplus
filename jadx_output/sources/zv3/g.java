package zv3;

/* loaded from: classes10.dex */
public final class g implements zv3.b {

    /* renamed from: a, reason: collision with root package name */
    public final zv3.d f476445a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f476446b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Bitmap f476447c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Canvas f476448d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Bitmap f476449e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Canvas f476450f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Matrix f476451g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Bitmap f476452h;

    /* renamed from: i, reason: collision with root package name */
    public final wu3.o0 f476453i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Matrix f476454j;

    /* renamed from: k, reason: collision with root package name */
    public final zv3.e f476455k;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
    
        if ((r6[3] == 0.0f) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x033e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(zv3.d r35) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zv3.g.<init>(zv3.d):void");
    }

    @Override // zv3.b
    public zv3.a a() {
        long j17;
        android.graphics.Bitmap bitmap;
        if (this.f476445a.f476431c.size() == 0) {
            return null;
        }
        android.graphics.Canvas canvas = this.f476448d;
        int save = canvas.save();
        canvas.drawColor(0, android.graphics.PorterDuff.Mode.MULTIPLY);
        canvas.concat(this.f476454j);
        zv3.e eVar = this.f476455k;
        eVar.getClass();
        kotlin.jvm.internal.o.g(canvas, "canvas");
        eVar.f476439a = canvas.save();
        canvas.concat(eVar.f476440b);
        try {
            j17 = this.f476453i.a(canvas, this.f476446b);
        } catch (java.lang.Exception unused) {
            j17 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        }
        eVar.getClass();
        kotlin.jvm.internal.o.g(canvas, "canvas");
        int i17 = eVar.f476439a;
        if (i17 < 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RetrieverTransform", "canvas restore saveCount: " + eVar.f476439a);
        } else {
            canvas.restoreToCount(i17);
        }
        if (save < 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.StoryFrameRetriever", "canvas restore saveCount: " + save);
        } else {
            canvas.restoreToCount(save);
        }
        android.graphics.Canvas canvas2 = this.f476450f;
        android.graphics.Bitmap bitmap2 = this.f476447c;
        if (canvas2 == null || (bitmap = this.f476449e) == null) {
            return new zv3.a(bitmap2, j17);
        }
        if (canvas2 != null) {
            canvas2.drawColor(0, android.graphics.PorterDuff.Mode.MULTIPLY);
        }
        if (canvas2 != null) {
            canvas2.save();
        }
        kotlin.jvm.internal.o.d(canvas2);
        canvas2.drawBitmap(bitmap2, this.f476451g, null);
        if (canvas2 != null) {
            canvas2.restore();
        }
        kotlin.jvm.internal.o.d(bitmap);
        return new zv3.a(bitmap, j17);
    }

    public final float b(int i17, int i18, float f17, float f18) {
        float f19 = i17 / f17;
        float f27 = i18 / f18;
        if ((f19 == f27) || i17 > i18) {
            return f19;
        }
        if (f19 < f27) {
            return f27;
        }
        if (f19 > f27) {
            return f19;
        }
        return 1.0f;
    }

    public final void c() {
        try {
            java.util.Iterator it = this.f476445a.f476431c.iterator();
            while (it.hasNext()) {
                ((av3.a) it.next()).b();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.StoryFrameRetriever", e17, "destroy error", new java.lang.Object[0]);
        }
    }

    public final void d() {
        try {
            java.util.Iterator it = this.f476445a.f476431c.iterator();
            while (it.hasNext()) {
                ((av3.a) it.next()).d();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.StoryFrameRetriever", e17, "start error", new java.lang.Object[0]);
        }
    }
}
