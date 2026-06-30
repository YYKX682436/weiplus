package go0;

/* loaded from: classes14.dex */
public final class b1 extends os0.a {
    public final java.lang.String C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;

    /* renamed from: J, reason: collision with root package name */
    public final int f273740J;
    public final int K;
    public final int L;
    public final int M;
    public final jz5.g N;
    public final jz5.g O;
    public int P;
    public int Q;
    public int R;
    public final jz5.g S;
    public final jz5.g T;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b1(int r8, int r9, int r10, int r11, int r12, int r13, int r14, kotlin.jvm.internal.i r15) {
        /*
            r7 = this;
            r15 = r14 & 4
            if (r15 == 0) goto L5
            r10 = r8
        L5:
            r15 = r14 & 8
            if (r15 == 0) goto La
            r11 = r9
        La:
            r15 = r14 & 16
            if (r15 == 0) goto Lf
            r12 = 2
        Lf:
            r5 = r12
            r12 = r14 & 32
            if (r12 == 0) goto L15
            r13 = 6
        L15:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r12 = "LiveScreenShareRenderProc"
            r7.C = r12
            go0.a1 r12 = go0.a1.f273736d
            jz5.g r12 = jz5.h.b(r12)
            r7.N = r12
            go0.y0 r12 = go0.y0.f273910d
            jz5.g r12 = jz5.h.b(r12)
            r7.O = r12
            rs0.g r12 = rs0.i.f399296a
            java.lang.String r13 = "\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        "
            java.lang.String r14 = "#extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform samplerExternalOES texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        "
            int r14 = r12.t(r13, r14)
            r7.D = r14
            java.lang.String r15 = "a_position"
            int r0 = android.opengl.GLES20.glGetAttribLocation(r14, r15)
            r7.E = r0
            java.lang.String r0 = "a_texCoord"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r14, r0)
            r7.F = r1
            java.lang.String r1 = "texture"
            int r2 = android.opengl.GLES20.glGetUniformLocation(r14, r1)
            r7.G = r2
            java.lang.String r2 = "uMatrix"
            int r14 = android.opengl.GLES20.glGetUniformLocation(r14, r2)
            r7.H = r14
            java.lang.String r14 = "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        "
            int r12 = r12.t(r13, r14)
            r7.I = r12
            int r13 = android.opengl.GLES20.glGetAttribLocation(r12, r15)
            r7.f273740J = r13
            int r13 = android.opengl.GLES20.glGetAttribLocation(r12, r0)
            r7.K = r13
            int r13 = android.opengl.GLES20.glGetUniformLocation(r12, r1)
            r7.L = r13
            int r12 = android.opengl.GLES20.glGetUniformLocation(r12, r2)
            r7.M = r12
            r12 = -1
            r7.Q = r12
            r7.R = r12
            go0.x0 r12 = new go0.x0
            r12.<init>(r10, r11, r8, r9)
            jz5.g r12 = jz5.h.b(r12)
            r7.S = r12
            go0.z0 r12 = new go0.z0
            r12.<init>(r10, r11, r8, r9)
            jz5.g r8 = jz5.h.b(r12)
            r7.T = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: go0.b1.<init>(int, int, int, int, int, int, int, kotlin.jvm.internal.i):void");
    }

    public final java.nio.FloatBuffer A() {
        return (java.nio.FloatBuffer) ((jz5.n) this.O).getValue();
    }

    public final go0.w0 B() {
        return (go0.w0) ((jz5.n) this.T).getValue();
    }

    public final java.lang.String C() {
        return "drawSize:(" + k() + "),textureSize:(" + l() + "),inputTextureBg:" + this.Q + ",bgViewPortMeta:" + z() + ",inputTextureFg:" + this.R + ",fgViewPortMeta:" + B();
    }

    public final java.nio.FloatBuffer D() {
        return (java.nio.FloatBuffer) ((jz5.n) this.N).getValue();
    }

    @Override // os0.a
    public void g() {
        super.g();
        int i17 = this.P;
        if (i17 > 0) {
            this.P = i17 - 1;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cubeBufferOes:[");
            java.nio.FloatBuffer floatBuffer = this.f347999h;
            sb6.append(floatBuffer.get(0));
            sb6.append(", ");
            sb6.append(floatBuffer.get(1));
            sb6.append(" \n ");
            sb6.append(floatBuffer.get(2));
            sb6.append(", ");
            sb6.append(floatBuffer.get(3));
            sb6.append(" \n ");
            sb6.append(floatBuffer.get(4));
            sb6.append(", ");
            sb6.append(floatBuffer.get(5));
            sb6.append(" \n ");
            sb6.append(floatBuffer.get(6));
            sb6.append(", ");
            sb6.append(floatBuffer.get(7));
            sb6.append("]\ntextureCoordBuffOes:[");
            java.nio.FloatBuffer floatBuffer2 = this.f347998g;
            sb6.append(floatBuffer2.get(0));
            sb6.append(", ");
            sb6.append(floatBuffer2.get(1));
            sb6.append(" \n ");
            sb6.append(floatBuffer2.get(2));
            sb6.append(", ");
            sb6.append(floatBuffer2.get(3));
            sb6.append(" \n ");
            sb6.append(floatBuffer2.get(4));
            sb6.append(", ");
            sb6.append(floatBuffer2.get(5));
            sb6.append(" \n ");
            sb6.append(floatBuffer2.get(6));
            sb6.append(", ");
            sb6.append(floatBuffer2.get(7));
            sb6.append("]\ncubeBuffer2D:[");
            sb6.append(A().get(0));
            sb6.append(", ");
            sb6.append(A().get(1));
            sb6.append(" \n ");
            sb6.append(A().get(2));
            sb6.append(", ");
            sb6.append(A().get(3));
            sb6.append(" \n ");
            sb6.append(A().get(4));
            sb6.append(", ");
            sb6.append(A().get(5));
            sb6.append(" \n ");
            sb6.append(A().get(6));
            sb6.append(", ");
            sb6.append(A().get(7));
            sb6.append("]\ntextureCoordBuff2D:[");
            sb6.append(D().get(0));
            sb6.append(", ");
            sb6.append(D().get(1));
            sb6.append(" \n ");
            sb6.append(D().get(2));
            sb6.append(", ");
            sb6.append(D().get(3));
            sb6.append(" \n ");
            sb6.append(D().get(4));
            sb6.append(", ");
            sb6.append(D().get(5));
            sb6.append(" \n ");
            sb6.append(D().get(6));
            sb6.append(", ");
            sb6.append(D().get(7));
            sb6.append("]\nmirror:");
            sb6.append(this.f348007p);
            sb6.append(",transformMatrix:");
            sb6.append(this.f348003l);
            sb6.append(" \n");
            com.tencent.mars.xlog.Log.i(this.C, sb6.toString());
        }
    }

    @Override // os0.a
    public void m() {
        boolean z17 = this.f348006o;
        java.nio.FloatBuffer floatBuffer = this.f347998g;
        if (z17) {
            floatBuffer.position(0);
            floatBuffer.put(rs0.i.f399300e);
            floatBuffer.position(0);
        } else {
            floatBuffer.position(0);
            floatBuffer.put(rs0.i.f399299d);
            floatBuffer.position(0);
        }
        java.nio.FloatBuffer floatBuffer2 = this.f347999h;
        floatBuffer2.position(0);
        float[] fArr = rs0.i.f399298c;
        floatBuffer2.put(fArr);
        floatBuffer2.position(0);
        D().position(0);
        D().put(qs0.b.f366208a.a(2, B().f273894e, B().f273895f, this.A, this.B, this.f348005n, B().f273892c, B().f273893d, null));
        D().position(0);
        A().position(0);
        A().put(fArr);
        A().position(0);
    }

    @Override // os0.a
    public void p() {
        int i17 = this.Q;
        if (i17 == -1 || this.R == -1) {
            if (i17 != -1) {
                y(i17);
                return;
            }
            int i18 = this.R;
            if (i18 != -1) {
                x(i18);
                return;
            }
            return;
        }
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        android.opengl.GLES20.glClear(16384);
        android.opengl.GLES20.glEnable(3042);
        android.opengl.GLES20.glBlendFunc(770, 771);
        y(this.Q);
        x(this.R);
        android.opengl.GLES20.glDisable(3042);
    }

    @Override // os0.a
    public void s(int i17) {
        this.f348005n = i17;
    }

    public final void x(int i17) {
        android.opengl.GLES20.glViewport(B().f273890a, B().f273891b, B().f273892c, B().f273893d);
        android.opengl.GLES20.glUseProgram(this.I);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, i17);
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
        android.opengl.GLES20.glUniform1i(this.L, 0);
        android.opengl.GLES20.glUniformMatrix4fv(this.M, 1, false, this.f348003l, 0);
        A().position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f273740J, 2, 5126, false, 0, (java.nio.Buffer) A());
        int i18 = this.f273740J;
        android.opengl.GLES20.glEnableVertexAttribArray(i18);
        D().position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.K, 2, 5126, false, 0, (java.nio.Buffer) D());
        int i19 = this.K;
        android.opengl.GLES20.glEnableVertexAttribArray(i19);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(i18);
        android.opengl.GLES20.glDisableVertexAttribArray(i19);
        android.opengl.GLES20.glBindTexture(3553, 0);
    }

    public final void y(int i17) {
        android.opengl.GLES20.glViewport(z().f273890a, z().f273891b, z().f273892c, z().f273893d);
        android.opengl.GLES20.glUseProgram(this.D);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(36197, i17);
        android.opengl.GLES20.glTexParameterf(36197, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(36197, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        android.opengl.GLES20.glTexParameterf(36197, 10242, 33071.0f);
        android.opengl.GLES20.glTexParameterf(36197, 10243, 33071.0f);
        android.opengl.GLES20.glUniform1i(this.G, 0);
        android.opengl.GLES20.glUniformMatrix4fv(this.H, 1, false, this.f348003l, 0);
        this.f347999h.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.E, 2, 5126, false, 0, (java.nio.Buffer) this.f347999h);
        int i18 = this.E;
        android.opengl.GLES20.glEnableVertexAttribArray(i18);
        this.f347998g.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.F, 2, 5126, false, 0, (java.nio.Buffer) this.f347998g);
        int i19 = this.F;
        android.opengl.GLES20.glEnableVertexAttribArray(i19);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(i18);
        android.opengl.GLES20.glDisableVertexAttribArray(i19);
        android.opengl.GLES20.glBindTexture(36197, 0);
    }

    public final go0.w0 z() {
        return (go0.w0) ((jz5.n) this.S).getValue();
    }
}
