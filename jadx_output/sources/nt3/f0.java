package nt3;

/* loaded from: classes10.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public int f339781a;

    /* renamed from: b, reason: collision with root package name */
    public int f339782b;

    /* renamed from: c, reason: collision with root package name */
    public long f339783c;

    /* renamed from: d, reason: collision with root package name */
    public long f339784d = 33;

    /* renamed from: e, reason: collision with root package name */
    public final nt3.e0 f339785e = new nt3.e0();

    /* renamed from: f, reason: collision with root package name */
    public final nt3.b0 f339786f = new nt3.b0();

    /* renamed from: g, reason: collision with root package name */
    public int f339787g;

    public final void a(java.util.List imageList) {
        kotlin.jvm.internal.o.g(imageList, "imageList");
        ib5.j jVar = new ib5.j(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.util.Iterator it = imageList.iterator();
        while (it.hasNext()) {
            java.lang.String path = (java.lang.String) it.next();
            nt3.e0 e0Var = this.f339785e;
            e0Var.getClass();
            kotlin.jvm.internal.o.g(path, "path");
            com.tencent.mars.xlog.Log.i("MicroMsg.Story.StoryImagePlayer", "addImage");
            nt3.d0 d0Var = new nt3.d0(e0Var);
            d0Var.f339765g = path;
            e0Var.f339771a.add(d0Var);
        }
        jVar.destroy();
    }

    public final void b() {
        int i17;
        int i18;
        int i19;
        nt3.d0 d0Var;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.opengl.GLES20.glViewport(0, 0, this.f339781a, this.f339782b);
        android.opengl.GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        android.opengl.GLES20.glClear(16384);
        nt3.e0 e0Var = this.f339785e;
        long j17 = this.f339783c;
        int i27 = this.f339781a;
        int i28 = this.f339782b;
        synchronized (e0Var) {
            nt3.c0 a17 = e0Var.a(j17);
            if (a17 != null && a17.f339753a >= 0) {
                android.opengl.GLES20.glUseProgram(e0Var.f339772b.f339708a);
                if (a17.f339754b > 0.0f) {
                    int i29 = a17.f339753a;
                    if (i29 - 1 >= 0) {
                        java.lang.Object obj = e0Var.f339771a.get(i29 - 1);
                        kotlin.jvm.internal.o.f(obj, "get(...)");
                        d0Var = (nt3.d0) obj;
                    } else {
                        d0Var = (nt3.d0) kz5.n0.i0(e0Var.f339771a);
                    }
                    e0Var.b(d0Var);
                    i17 = 3553;
                    e0Var.f339772b.c(i27, i28, d0Var.f339761c, d0Var.f339762d, a17.f339756d[0]);
                    android.opengl.GLES20.glUniform1f(e0Var.f339772b.f339743i, a17.f339754b);
                    android.opengl.GLES20.glActiveTexture(33984);
                    nt3.b bVar = e0Var.f339772b;
                    android.graphics.Bitmap bitmap = d0Var.f339759a;
                    int i37 = d0Var.f339763e;
                    if (i37 > 0) {
                        bVar.getClass();
                    } else {
                        i37 = bVar.b(bitmap, i37, false);
                    }
                    d0Var.f339763e = i37;
                    nt3.b bVar2 = e0Var.f339772b;
                    bVar2.getClass();
                    android.opengl.GLES20.glBindTexture(3553, i37);
                    android.opengl.GLES20.glUniform1i(bVar2.f339740f, 0);
                    android.opengl.GLES20.glActiveTexture(33985);
                    nt3.b bVar3 = e0Var.f339772b;
                    android.graphics.Bitmap bitmap2 = d0Var.f339760b;
                    int i38 = d0Var.f339764f;
                    if (i38 > 0) {
                        bVar3.getClass();
                    } else {
                        i38 = bVar3.b(bitmap2, i38, false);
                    }
                    d0Var.f339764f = i38;
                    nt3.b bVar4 = e0Var.f339772b;
                    bVar4.getClass();
                    android.opengl.GLES20.glBindTexture(3553, i38);
                    android.opengl.GLES20.glUniform1i(bVar4.f339741g, 1);
                    android.opengl.GLES20.glUniformMatrix4fv(e0Var.f339772b.f339742h, 1, false, a17.f339756d, 0);
                    e0Var.f339772b.getClass();
                    i18 = 5;
                    android.opengl.GLES20.glDrawArrays(5, 0, 4);
                    i19 = 2;
                } else {
                    i17 = 3553;
                    i18 = 5;
                    i19 = 0;
                }
                if (a17.f339755c > 0.0f) {
                    java.lang.Object obj2 = e0Var.f339771a.get(a17.f339753a);
                    kotlin.jvm.internal.o.f(obj2, "get(...)");
                    nt3.d0 d0Var2 = (nt3.d0) obj2;
                    e0Var.b(d0Var2);
                    int i39 = i19;
                    e0Var.f339772b.c(i27, i28, d0Var2.f339761c, d0Var2.f339762d, a17.f339757e[0]);
                    android.opengl.GLES20.glUniform1f(e0Var.f339772b.f339743i, a17.f339755c);
                    android.opengl.GLES20.glActiveTexture(i39 + 33984);
                    nt3.b bVar5 = e0Var.f339772b;
                    android.graphics.Bitmap bitmap3 = d0Var2.f339759a;
                    int i47 = d0Var2.f339763e;
                    if (i47 > 0) {
                        bVar5.getClass();
                    } else {
                        i47 = bVar5.b(bitmap3, i47, false);
                    }
                    d0Var2.f339763e = i47;
                    nt3.b bVar6 = e0Var.f339772b;
                    int i48 = i39 + 1;
                    bVar6.getClass();
                    android.opengl.GLES20.glBindTexture(i17, i47);
                    android.opengl.GLES20.glUniform1i(bVar6.f339740f, i39);
                    android.opengl.GLES20.glActiveTexture(33984 + i48);
                    nt3.b bVar7 = e0Var.f339772b;
                    android.graphics.Bitmap bitmap4 = d0Var2.f339760b;
                    int i49 = d0Var2.f339764f;
                    if (i49 > 0) {
                        bVar7.getClass();
                    } else {
                        i49 = bVar7.b(bitmap4, i49, false);
                    }
                    d0Var2.f339764f = i49;
                    nt3.b bVar8 = e0Var.f339772b;
                    bVar8.getClass();
                    android.opengl.GLES20.glBindTexture(i17, i49);
                    android.opengl.GLES20.glUniform1i(bVar8.f339741g, i48);
                    android.opengl.GLES20.glUniformMatrix4fv(e0Var.f339772b.f339742h, 1, false, a17.f339757e, 0);
                    e0Var.f339772b.getClass();
                    android.opengl.GLES20.glDrawArrays(i18, 0, 4);
                }
            }
        }
        this.f339783c += this.f339784d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Story.StoryImageVideoRender", "draw cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public final void c() {
        nt3.e0 e0Var = this.f339785e;
        synchronized (e0Var) {
            java.util.ArrayList arrayList = e0Var.f339771a;
            if (arrayList != null) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    nt3.d0 d0Var = (nt3.d0) it.next();
                    d0Var.f339763e = 0;
                    d0Var.f339764f = 0;
                }
            }
        }
        nt3.e0 e0Var2 = this.f339785e;
        e0Var2.getClass();
        try {
            ib5.j jVar = e0Var2.f339773c;
            if (jVar != null) {
                jVar.destroy();
            }
            e0Var2.f339773c = null;
        } catch (java.lang.Exception unused) {
            e0Var2.f339773c = null;
        }
        this.f339787g = 0;
    }
}
