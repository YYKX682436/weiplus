package r35;

/* loaded from: classes15.dex */
public class m0 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final int f369180a;

    /* renamed from: b, reason: collision with root package name */
    public final int f369181b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f369182c;

    /* renamed from: d, reason: collision with root package name */
    public r35.q3 f369183d;

    /* renamed from: e, reason: collision with root package name */
    public final int f369184e;

    /* renamed from: f, reason: collision with root package name */
    public int f369185f;

    /* renamed from: g, reason: collision with root package name */
    public long f369186g;

    /* renamed from: h, reason: collision with root package name */
    public long f369187h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f369188i;

    public m0(int i17, int i18, float[] fArr, r35.q3 q3Var) {
        this.f369184e = 0;
        this.f369185f = 0;
        this.f369186g = 0L;
        this.f369187h = 0L;
        this.f369184e = 0;
        this.f369180a = i17;
        this.f369181b = i18;
        this.f369183d = q3Var;
        this.f369182c = fArr;
    }

    @Override // p11.h
    public void a(java.lang.String url, android.view.View view) {
        r35.q3 q3Var = this.f369183d;
        if (q3Var != null) {
            q3Var.onStart();
        }
        r35.y yVar = r35.y.f369326a;
        kotlin.jvm.internal.o.g(url, "url");
        if (qk.c.f() && qk.c.g(url)) {
            this.f369185f = 1;
        } else {
            if (m11.n1.g() && qk.c.h(url)) {
                this.f369185f = 2;
            } else {
                this.f369185f = 0;
            }
        }
        this.f369186g = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(86L, 0L, 1L, false);
    }

    @Override // p11.h
    public void b(java.lang.String url, android.view.View view, q11.b bVar) {
        java.lang.String str = bVar.f359535e;
        android.graphics.Bitmap bitmap = bVar.f359534d;
        boolean z17 = false;
        if (bitmap == null || bitmap.isRecycled()) {
            this.f369183d = null;
            android.graphics.Bitmap bitmap2 = bVar.f359534d;
            if (bitmap2 == null || bitmap2.isRecycled()) {
                this.f369187h = java.lang.System.currentTimeMillis();
                if (r35.y.f369326a.a(this.f369184e) && bVar.f359532b == 2) {
                    r35.x xVar = r35.x.f369320a;
                    xVar.d(this.f369185f, false, this.f369187h - this.f369186g);
                    xVar.c(this.f369185f, false);
                }
            }
        } else {
            r35.k0 k0Var = new r35.k0(this, bVar);
            if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
                k0Var.run();
            } else {
                com.tencent.mm.sdk.platformtools.n3 n3Var = this.f369188i;
                if (n3Var != null) {
                    n3Var.post(k0Var);
                } else {
                    com.tencent.mm.sdk.platformtools.u3.h(k0Var);
                }
            }
        }
        if (bVar.f359532b != 2) {
            return;
        }
        r35.y yVar = r35.y.f369326a;
        kotlin.jvm.internal.o.g(url, "url");
        if (m11.n1.g()) {
            java.lang.String str2 = bVar.f359535e;
            if ((!(str2 == null || str2.length() == 0) && kotlin.jvm.internal.o.b(str2, "image/webp")) && qk.c.h(url)) {
                z17 = true;
            }
        }
        int i17 = bVar.f359531a;
        if (i17 == 0) {
            if (z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(86L, 13L, 1L, false);
            }
        } else {
            if (i17 != 1) {
                if (i17 == 3 && z17) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(86L, 14L, 1L, false);
                    return;
                }
                return;
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(86L, 2L, 1L, false);
            if (z17) {
                g0Var.idkeyStat(86L, 15L, 1L, false);
            }
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap;
        int i17 = this.f369181b;
        int i18 = this.f369180a;
        float[] fArr = this.f369182c;
        if (fArr == null) {
            return null;
        }
        if (bVar == null || (bitmap = bVar.f359534d) == null || bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingBizImageDownloadListener", "onProcessBitmap bitmap is null");
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingBizImageDownloadListener", "onProcessBitmap url is null");
            return null;
        }
        try {
            android.graphics.Bitmap k07 = com.tencent.mm.sdk.platformtools.x.k0(bVar.f359534d, i18, i17, true);
            android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(k07, i18, i17, true);
            if (createScaledBitmap != k07 && k07 != null && !k07.isRecycled()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingBizImageDownloadListener", "bitmap recycle %s", k07.toString());
                k07.recycle();
            }
            android.graphics.Bitmap u07 = com.tencent.mm.sdk.platformtools.x.u0(createScaledBitmap, true, fArr, true);
            if (createScaledBitmap != null && !createScaledBitmap.isRecycled()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingBizImageDownloadListener", "bitmap recycle %s", createScaledBitmap.toString());
                createScaledBitmap.recycle();
            }
            r35.q3 q3Var = this.f369183d;
            if (q3Var instanceof r35.r3) {
                ((com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x0) ((r35.r3) q3Var)).a(u07);
            }
            return u07;
        } catch (java.lang.OutOfMemoryError e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingBizImageDownloadListener", "onProcessBitmap OutOfMemoryError %s", e17.getMessage());
            return null;
        }
    }

    public m0(int i17, int i18, int i19, float[] fArr, r35.q3 q3Var) {
        this.f369184e = 0;
        this.f369185f = 0;
        this.f369186g = 0L;
        this.f369187h = 0L;
        this.f369184e = i17;
        this.f369180a = i18;
        this.f369181b = i19;
        this.f369183d = q3Var;
        this.f369182c = fArr;
    }

    public m0(int i17, int i18, int i19, boolean z17, boolean z18, float f17, r35.q3 q3Var) {
        this(i17, i18, i19, z17, z18, f17, q3Var, null, false, false);
    }

    public m0(int i17, int i18, int i19, boolean z17, boolean z18, float f17, r35.q3 q3Var, com.tencent.mm.sdk.platformtools.n3 n3Var, boolean z19, boolean z27) {
        this.f369184e = 0;
        this.f369185f = 0;
        this.f369186g = 0L;
        this.f369187h = 0L;
        this.f369184e = i17;
        this.f369180a = i18;
        this.f369181b = i19;
        this.f369183d = q3Var;
        this.f369188i = n3Var;
        if (z17 || z18) {
            if (this.f369182c == null) {
                this.f369182c = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
            }
            if (z17) {
                float[] fArr = this.f369182c;
                fArr[1] = f17;
                fArr[0] = f17;
            }
            if (z18) {
                float[] fArr2 = this.f369182c;
                fArr2[3] = f17;
                fArr2[2] = f17;
            }
        }
        if (z19 || z27) {
            if (this.f369182c == null) {
                this.f369182c = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
            }
            float[] fArr3 = this.f369182c;
            fArr3[3] = 0.0f;
            fArr3[2] = 0.0f;
            fArr3[1] = 0.0f;
            fArr3[0] = 0.0f;
            if (z19) {
                fArr3[0] = f17;
            }
            if (z27) {
                fArr3[1] = f17;
            }
        }
        if (z17 || z18 || z19 || z27) {
            return;
        }
        this.f369182c = null;
    }
}
