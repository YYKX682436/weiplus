package d32;

/* loaded from: classes10.dex */
public final class o extends os0.a {
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;

    /* renamed from: J, reason: collision with root package name */
    public final int f226189J;
    public final java.nio.FloatBuffer K;
    public int L;

    public o(int i17, int i18, int i19, int i27, int i28, int i29) {
        super(i17, i18, i19, i27, i28, i29);
        this.L = -1;
        int b17 = d32.c.f226136a.b("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D texture;\n        uniform vec2 size;\n        uniform float radius;\n        uniform int calcRoundCorner;\n\n        void main () {\n            if (calcRoundCorner == 1) {\n                // round corner\n                vec2 bottomLeftCenter = vec2(radius, radius);\n                vec2 bottomRightCenter = vec2(size.x - radius, radius);\n                vec2 topLeftCenter = vec2(radius, size.y - radius);\n                vec2 topRightCenter = vec2(size.x - radius, size.y - radius);\n                if ((gl_FragCoord.x < bottomLeftCenter.x && gl_FragCoord.y < bottomLeftCenter.y && distance(gl_FragCoord.xy, bottomLeftCenter) > radius) ||\n                    (gl_FragCoord.x > bottomRightCenter.x && gl_FragCoord.y < bottomRightCenter.y && distance(gl_FragCoord.xy, bottomRightCenter) > radius) ||\n                    (gl_FragCoord.x < topLeftCenter.x && gl_FragCoord.y > topLeftCenter.y && distance(gl_FragCoord.xy, topLeftCenter) > radius) ||\n                    (gl_FragCoord.x > topRightCenter.x && gl_FragCoord.y > topRightCenter.y && distance(gl_FragCoord.xy, topRightCenter) > radius))  {\n//                   gl_FragColor = vec4(0.95, 0.95, 0.95, 1.0);\n                    discard;\n                } else {\n                   gl_FragColor = texture2D(texture, v_texCoord);\n                }\n            } else {\n                gl_FragColor = texture2D(texture, v_texCoord);\n            }\n        }\n        ");
        this.C = b17;
        this.E = android.opengl.GLES20.glGetAttribLocation(b17, "a_position");
        this.D = android.opengl.GLES20.glGetAttribLocation(b17, "a_texCoord");
        this.H = android.opengl.GLES20.glGetUniformLocation(b17, "size");
        this.I = android.opengl.GLES20.glGetUniformLocation(b17, "radius");
        this.F = android.opengl.GLES20.glGetUniformLocation(b17, "texture");
        this.G = android.opengl.GLES20.glGetUniformLocation(b17, "uMatrix");
        this.f226189J = android.opengl.GLES20.glGetUniformLocation(b17, "calcRoundCorner");
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(16).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        kotlin.jvm.internal.o.f(asFloatBuffer, "asFloatBuffer(...)");
        this.K = asFloatBuffer;
    }

    @Override // os0.a
    public void g() {
        super.g();
        java.nio.FloatBuffer floatBuffer = this.K;
        floatBuffer.position(0);
        floatBuffer.put(this.f347994c);
        floatBuffer.put(this.f347995d);
    }

    @Override // os0.a
    public void p() {
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16640);
        android.opengl.GLES20.glUseProgram(this.C);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, this.L);
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
        android.opengl.GLES20.glUniform1i(this.F, 0);
        android.opengl.GLES20.glUniformMatrix4fv(this.G, 1, false, this.f348003l, 0);
        java.nio.FloatBuffer floatBuffer = this.K;
        floatBuffer.position(0);
        android.opengl.GLES20.glUniform2fv(this.H, 1, floatBuffer);
        android.opengl.GLES20.glUniform1f(this.I, java.lang.Math.max(this.f347994c, this.f347995d) * 0.06666667f);
        android.opengl.GLES20.glUniform1i(this.f226189J, 1);
        this.f347999h.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.E, 2, 5126, false, 0, (java.nio.Buffer) this.f347999h);
        int i17 = this.E;
        android.opengl.GLES20.glEnableVertexAttribArray(i17);
        this.f347998g.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.D, 2, 5126, false, 0, (java.nio.Buffer) this.f347998g);
        int i18 = this.D;
        android.opengl.GLES20.glEnableVertexAttribArray(i18);
        android.opengl.GLES20.glEnable(3042);
        android.opengl.GLES20.glBlendFunc(770, 771);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(i17);
        android.opengl.GLES20.glDisableVertexAttribArray(i18);
        android.opengl.GLES20.glBindTexture(3553, 0);
        android.opengl.GLES20.glFinish();
    }

    @Override // os0.a
    public void r(int i17) {
        this.L = i17;
    }
}
