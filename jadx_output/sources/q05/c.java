package q05;

/* loaded from: classes14.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public q05.b f359450a;

    /* renamed from: b, reason: collision with root package name */
    public q05.d f359451b;

    /* renamed from: c, reason: collision with root package name */
    public q05.a f359452c;

    /* renamed from: d, reason: collision with root package name */
    public final int f359453d;

    public c() {
        this.f359453d = 0;
        this.f359450a = new q05.b();
        this.f359451b = new q05.d();
        this.f359452c = new q05.a();
    }

    public void a() {
        q05.b bVar = this.f359450a;
        if (bVar != null) {
            int[] iArr = bVar.f359438e;
            if (iArr[0] != 0) {
                android.opengl.GLES20.glDeleteFramebuffers(1, iArr, 0);
                iArr[0] = 0;
            }
            int[] iArr2 = bVar.f359439f;
            if (iArr2[0] != 0) {
                android.opengl.GLES20.glDeleteTextures(1, iArr2, 0);
                iArr2[0] = 0;
            }
            int i17 = bVar.f359440g;
            if (i17 != 0) {
                android.opengl.GLES20.glDeleteProgram(i17);
                bVar.f359440g = 0;
            }
            this.f359450a = null;
        }
        q05.d dVar = this.f359451b;
        if (dVar != null) {
            int[] iArr3 = dVar.f359462e;
            if (iArr3[0] != 0) {
                android.opengl.GLES20.glDeleteFramebuffers(1, iArr3, 0);
                iArr3[0] = 0;
            }
            int[] iArr4 = dVar.f359463f;
            if (iArr4[0] != 0) {
                android.opengl.GLES20.glDeleteTextures(1, iArr4, 0);
                iArr4[0] = 0;
            }
            int i18 = dVar.f359464g;
            if (i18 != 0) {
                android.opengl.GLES20.glDeleteProgram(i18);
                dVar.f359464g = 0;
            }
            this.f359451b = null;
        }
        q05.a aVar = this.f359452c;
        if (aVar != null) {
            for (int i19 = 0; i19 < 3; i19++) {
                int[] iArr5 = aVar.f359421e;
                if (iArr5[i19] != 0) {
                    android.opengl.GLES20.glDeleteFramebuffers(1, iArr5, i19);
                    iArr5[i19] = 0;
                }
                int[] iArr6 = aVar.f359422f;
                if (iArr6[i19] != 0) {
                    android.opengl.GLES20.glDeleteTextures(1, iArr6, i19);
                    iArr6[i19] = 0;
                }
            }
            int i27 = aVar.f359423g;
            if (i27 != 0) {
                android.opengl.GLES20.glDeleteProgram(i27);
                aVar.f359423g = 0;
            }
            this.f359452c = null;
        }
    }

    public int b(int i17, int i18, int i19, int i27) {
        if (i27 == 0) {
            return i17;
        }
        int d17 = this.f359450a.d(i17, i18, i19, 1);
        this.f359452c.d(d17, i18, i19, 2);
        q05.d dVar = this.f359451b;
        int[] iArr = this.f359452c.f359422f;
        return dVar.d(d17, iArr[0], iArr[1], iArr[2], i18, i19, i27, 0);
    }

    public int c(int i17, int i18, int i19, int i27, boolean z17) {
        int i28;
        int max = java.lang.Math.max(i18, i19);
        int i29 = ((max <= 1344 || z17) && ((max > 1344 && z17) || max >= 1280)) ? 2 : 0;
        if (i29 == 0 || i19 < 8 || i18 < 8) {
            return i17;
        }
        int i37 = this.f359453d;
        int d17 = (i37 == 2 || i37 == 4) ? this.f359450a.d(i17, i18, i19, 1) : this.f359450a.d(i17, i18, i19, 0);
        this.f359452c.d(d17, i18, i19, i29);
        int[] iArr = this.f359452c.f359422f;
        int i38 = iArr[0];
        int i39 = iArr[1];
        int i47 = iArr[2];
        if ((i37 == 2 || i37 == 3 || i37 == 4) && i29 == 2) {
            i38 = i39;
            i28 = i47;
        } else {
            i28 = i39;
        }
        return this.f359451b.d(d17, i38, i28, i47, i18, i19, i29, i27);
    }

    public c(int i17) {
        this.f359453d = i17;
        this.f359450a = new q05.b(i17);
        this.f359451b = new q05.d(i17);
        this.f359452c = new q05.a(i17);
    }
}
