package pw1;

/* loaded from: classes14.dex */
public final class a extends os0.a {
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;

    /* renamed from: J, reason: collision with root package name */
    public pw1.e f358666J;

    public a(int i17, int i18, int i19, int i27, int i28, int i29, int i37, kotlin.jvm.internal.i iVar) {
        super(i17, i18, (i37 & 4) != 0 ? i17 : i19, (i37 & 8) != 0 ? i18 : i27, (i37 & 16) != 0 ? 1 : i28, (i37 & 32) != 0 ? 1 : i29);
        int t17 = rs0.i.f399296a.t("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D y_texture;\n        uniform sampler2D u_texture;\n        uniform sampler2D v_texture;\n\n        void main () {\n           float r, g, b, y, u, v;\n\n        //We had put the Y values of each pixel to the R,G,B components by GL_LUMINANCE,\n        //that's why we're pulling it from the R component, we could also use G or B\n           y = texture2D(y_texture, v_texCoord).r;\n\n        //We had put the U and V values of each pixel to the A and R,G,B components of the\n        //texture respectively using GL_LUMINANCE_ALPHA. Since U,V bytes are interspread\n        //in the texture, this is probably the fastest way to use them in the shader\n        //GL_LUMINANCE_ALPHA is a luminance/alpha pair, so r correspond to v, and\n        //a correspond to u\n        //NV21 is a VUVU pair\n           v = texture2D(v_texture, v_texCoord).r;\n           u = texture2D(u_texture, v_texCoord).r;\n           u = u - 0.5;\n           v = v - 0.5;\n\n        //The numbers are just YUV to RGB conversion constants\n        //https://en.wikipedia.org/wiki/YUV#Y.E2.80.B2UV420sp_.28NV21.29_to_RGB_conversion_.28Android.29\n           r = y + 1.370705 * v;\n           g = y - 0.337633 * u - 0.698001 * v;\n           b = y + 1.732446 * u;\n\n        //We finally set the RGB color of our pixel\n           gl_FragColor = vec4(r, g, b, 1.0);\n        }\n        ");
        this.C = t17;
        if (t17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MTR.GLRenderProcI420ToRgb", "checkInit, load program failed!");
        }
        this.E = android.opengl.GLES20.glGetAttribLocation(t17, "a_position");
        this.D = android.opengl.GLES20.glGetAttribLocation(t17, "a_texCoord");
        this.F = android.opengl.GLES20.glGetUniformLocation(t17, "y_texture");
        this.G = android.opengl.GLES20.glGetUniformLocation(t17, "u_texture");
        this.H = android.opengl.GLES20.glGetUniformLocation(t17, "v_texture");
        this.I = android.opengl.GLES20.glGetUniformLocation(t17, "uMatrix");
    }

    @Override // os0.a
    public void f() {
        super.f();
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override // os0.a
    public void n() {
        super.n();
        android.opengl.GLES20.glDeleteProgram(this.C);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    @Override // os0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p() {
        /*
            r10 = this;
            r0 = 16640(0x4100, float:2.3318E-41)
            android.opengl.GLES20.glClear(r0)
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            android.opengl.GLES20.glClearColor(r0, r0, r0, r1)
            int r0 = r10.C
            r1 = 0
            if (r0 == 0) goto Lbc
            int r2 = r10.f347994c
            if (r2 <= 0) goto Lbc
            int r2 = r10.f347995d
            if (r2 <= 0) goto Lbc
            android.opengl.GLES20.glUseProgram(r0)
            pw1.e r0 = r10.f358666J
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L7e
            r4 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r4)
            qw1.e r0 = r0.f358675c
            boolean r4 = r0.f367086d
            if (r4 == 0) goto L36
            qw1.d r4 = r0.f367083a
            boolean r5 = r4.f367081b
            if (r5 == 0) goto L36
            is0.c r4 = r4.f367080a
            goto L37
        L36:
            r4 = r1
        L37:
            if (r4 == 0) goto L3c
            r4.f()
        L3c:
            int r4 = r10.F
            android.opengl.GLES20.glUniform1i(r4, r3)
            r4 = 33985(0x84c1, float:4.7623E-41)
            android.opengl.GLES20.glActiveTexture(r4)
            boolean r4 = r0.f367086d
            if (r4 == 0) goto L54
            qw1.d r4 = r0.f367084b
            boolean r5 = r4.f367081b
            if (r5 == 0) goto L54
            is0.c r4 = r4.f367080a
            goto L55
        L54:
            r4 = r1
        L55:
            if (r4 == 0) goto L5a
            r4.f()
        L5a:
            int r4 = r10.G
            android.opengl.GLES20.glUniform1i(r4, r2)
            r4 = 33986(0x84c2, float:4.7625E-41)
            android.opengl.GLES20.glActiveTexture(r4)
            boolean r4 = r0.f367086d
            if (r4 == 0) goto L72
            qw1.d r0 = r0.f367085c
            boolean r4 = r0.f367081b
            if (r4 == 0) goto L72
            is0.c r0 = r0.f367080a
            goto L73
        L72:
            r0 = r1
        L73:
            if (r0 == 0) goto L78
            r0.f()
        L78:
            int r0 = r10.H
            r4 = 2
            android.opengl.GLES20.glUniform1i(r0, r4)
        L7e:
            int r0 = r10.I
            float[] r4 = r10.f348003l
            android.opengl.GLES20.glUniformMatrix4fv(r0, r2, r3, r4, r3)
            java.nio.FloatBuffer r0 = r10.f347999h
            r0.position(r3)
            int r4 = r10.E
            r5 = 2
            r6 = 5126(0x1406, float:7.183E-42)
            r7 = 0
            r8 = 0
            java.nio.FloatBuffer r9 = r10.f347999h
            android.opengl.GLES20.glVertexAttribPointer(r4, r5, r6, r7, r8, r9)
            int r0 = r10.E
            android.opengl.GLES20.glEnableVertexAttribArray(r0)
            java.nio.FloatBuffer r2 = r10.f347998g
            r2.position(r3)
            int r4 = r10.D
            java.nio.FloatBuffer r9 = r10.f347998g
            android.opengl.GLES20.glVertexAttribPointer(r4, r5, r6, r7, r8, r9)
            int r2 = r10.D
            android.opengl.GLES20.glEnableVertexAttribArray(r2)
            r4 = 5
            r5 = 4
            android.opengl.GLES20.glDrawArrays(r4, r3, r5)
            android.opengl.GLES20.glDisableVertexAttribArray(r0)
            android.opengl.GLES20.glDisableVertexAttribArray(r2)
            r0 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r0, r3)
        Lbc:
            r10.f358666J = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pw1.a.p():void");
    }
}
