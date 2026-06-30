package r35;

/* loaded from: classes15.dex */
public final class w implements p11.a {

    /* renamed from: a, reason: collision with root package name */
    public long f369312a;

    /* renamed from: b, reason: collision with root package name */
    public long f369313b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f369314c;

    /* renamed from: e, reason: collision with root package name */
    public final int f369316e;

    /* renamed from: d, reason: collision with root package name */
    public int f369315d = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f369317f = "";

    public w(int i17) {
        this.f369316e = i17;
        java.lang.String.valueOf(hashCode());
    }

    public void a(android.graphics.Bitmap bitmap) {
        this.f369313b = java.lang.System.currentTimeMillis();
        r35.y yVar = r35.y.f369326a;
        int i17 = this.f369316e;
        if (i17 == 1) {
            com.tencent.mm.pluginsdk.model.i0.a(com.tencent.mm.pluginsdk.model.i0.f189340a, 6, this.f369317f, 0L, 4, null);
        }
        if (this.f369315d == 2 && yVar.a(i17)) {
            if (bitmap != null) {
                bitmap.isRecycled();
            }
            boolean z17 = (bitmap == null || bitmap.isRecycled()) ? false : true;
            r35.x.f369320a.b(this.f369314c, z17);
            java.lang.String str = this.f369314c;
            long j17 = this.f369313b - this.f369312a;
            if (j17 >= 0) {
                int c17 = yVar.c(str);
                if (c17 == 0) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1111L, 50L, j17);
                } else if (c17 == 1) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1111L, 21L, j17);
                } else if (c17 == 2) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1111L, 46L, j17);
                }
            }
            if (!yVar.d(this.f369314c) || z17) {
                return;
            }
            java.lang.String str2 = this.f369317f;
            if (str2 == null || str2.length() == 0) {
                return;
            }
            if (i17 == 1 || i17 == 2 || i17 == 3) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17492, str2, 2, 2, java.lang.Integer.valueOf(i17));
            }
        }
    }

    public void b(java.lang.String str, q11.b bVar) {
        this.f369314c = bVar != null ? bVar.f359535e : null;
        this.f369315d = bVar != null ? bVar.f359532b : -1;
        this.f369312a = java.lang.System.currentTimeMillis();
        r35.y yVar = r35.y.f369326a;
        boolean z17 = false;
        int i17 = this.f369316e;
        if (i17 == 1) {
            java.lang.System.currentTimeMillis();
            com.tencent.mm.pluginsdk.model.i0.c(com.tencent.mm.pluginsdk.model.i0.f189340a, 6, str, 0L, 4, null);
        }
        if (this.f369315d == 2 && yVar.a(i17)) {
            z17 = true;
        }
        if (z17) {
            int c17 = yVar.c(this.f369314c);
            if (c17 == 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1111L, 47L, 1L);
            } else if (c17 == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1111L, 11L, 1L);
            } else {
                if (c17 != 2) {
                    return;
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1111L, 43L, 1L);
            }
        }
    }

    public void c(java.io.InputStream inputStream) {
        java.lang.System.currentTimeMillis();
        if (r35.y.f369326a.b(this.f369316e)) {
            java.lang.System.currentTimeMillis();
            com.tencent.mm.pluginsdk.model.i0.a(com.tencent.mm.pluginsdk.model.i0.f189340a, 5, this.f369317f, 0L, 4, null);
        }
    }

    public void d(java.lang.String str) {
        this.f369317f = str;
        java.lang.System.currentTimeMillis();
        if (r35.y.f369326a.b(this.f369316e)) {
            java.lang.System.currentTimeMillis();
            com.tencent.mm.pluginsdk.model.i0.c(com.tencent.mm.pluginsdk.model.i0.f189340a, 5, str, 0L, 4, null);
        }
    }
}
