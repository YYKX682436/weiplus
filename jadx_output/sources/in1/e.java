package in1;

/* loaded from: classes11.dex */
public final class e extends android.graphics.drawable.BitmapDrawable implements com.tencent.mm.pluginsdk.ui.a0, hn1.z {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.sdk.coroutines.LifecycleScope f292778d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f292779e;

    /* renamed from: f, reason: collision with root package name */
    public float f292780f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f292781g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f292782h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f292783i;

    /* renamed from: m, reason: collision with root package name */
    public final kv.b0 f292784m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Bitmap f292785n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Bitmap f292786o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f292787p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Runnable f292788q;

    public e(com.tencent.mm.sdk.coroutines.LifecycleScope workerScope, java.lang.String username, float f17, boolean z17, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        f17 = (i17 & 4) != 0 ? 0.1f : f17;
        z17 = (i17 & 8) != 0 ? false : z17;
        str = (i17 & 16) != 0 ? null : str;
        kotlin.jvm.internal.o.g(workerScope, "workerScope");
        kotlin.jvm.internal.o.g(username, "username");
        this.f292778d = workerScope;
        this.f292779e = username;
        this.f292780f = f17;
        this.f292781g = z17;
        this.f292782h = str;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f292783i = paint;
        i95.m c17 = i95.n0.c(kv.b0.class);
        kotlin.jvm.internal.o.d(c17);
        kv.b0 b0Var = (kv.b0) c17;
        this.f292784m = b0Var;
        this.f292785n = ((hn1.s) b0Var).Ri(this.f292780f);
        this.f292787p = jz5.h.b(in1.c.f292776d);
        this.f292788q = new in1.d(this);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
    }

    public static void c(in1.e eVar, com.tencent.mm.sdk.coroutines.LifecycleScope workerScope, java.lang.String username, float f17, boolean z17, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            f17 = 0.1f;
        }
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        if ((i17 & 16) != 0) {
            str = null;
        }
        eVar.getClass();
        kotlin.jvm.internal.o.g(workerScope, "workerScope");
        kotlin.jvm.internal.o.g(username, "username");
        eVar.f292778d = workerScope;
        eVar.f292779e = username;
        eVar.f292780f = f17;
        eVar.f292781g = z17;
        eVar.f292782h = str;
    }

    @Override // hn1.z
    public void a(java.lang.String imageKey, android.graphics.Bitmap bitmap, java.lang.String username) {
        kotlin.jvm.internal.o.g(imageKey, "imageKey");
        kotlin.jvm.internal.o.g(username, "username");
        java.lang.String Zi = ((hn1.s) this.f292784m).Zi(this.f292779e, this.f292780f);
        if (kotlin.jvm.internal.o.b(this.f292786o, bitmap) || !kotlin.jvm.internal.o.b(Zi, imageKey)) {
            return;
        }
        jz5.g gVar = this.f292787p;
        com.tencent.mm.sdk.platformtools.o3 o3Var = (com.tencent.mm.sdk.platformtools.o3) ((jz5.n) gVar).getValue();
        java.lang.Runnable runnable = this.f292788q;
        o3Var.removeCallbacks(runnable);
        ((com.tencent.mm.sdk.platformtools.o3) ((jz5.n) gVar).getValue()).e(runnable, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (r1 == null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef A[Catch: Exception -> 0x00fa, TRY_LEAVE, TryCatch #0 {Exception -> 0x00fa, blocks: (B:14:0x004a, B:16:0x004f, B:18:0x005f, B:20:0x0068, B:22:0x007c, B:24:0x007f, B:27:0x0084, B:29:0x008b, B:31:0x0095, B:34:0x00be, B:36:0x00ef, B:37:0x00a0, B:38:0x00a7, B:41:0x00b8, B:45:0x00e6, B:46:0x00eb, B:48:0x0082), top: B:13:0x004a }] */
    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r12) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in1.e.draw(android.graphics.Canvas):void");
    }

    @Override // com.tencent.mm.pluginsdk.ui.a0
    public void onScrollStateChanged(boolean z17) {
    }
}
