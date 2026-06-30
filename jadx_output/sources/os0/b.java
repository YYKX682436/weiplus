package os0;

/* loaded from: classes10.dex */
public class b extends os0.a {
    public final java.lang.String C;
    public int D;
    public android.graphics.Bitmap E;
    public final is0.c F;
    public android.graphics.Bitmap G;
    public final is0.c H;
    public final float[] I;

    /* renamed from: J, reason: collision with root package name */
    public final int f348018J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public final java.nio.FloatBuffer X;
    public final java.nio.FloatBuffer Y;
    public int Z;

    public b(int i17, int i18, int i19, int i27, int i28, int i29) {
        super(i17, i18, i19, i27, i28, i29);
        this.C = "MircoMsg.GLTextureRenderProcBlend";
        this.I = new float[4];
        java.nio.ByteBuffer.allocateDirect(8).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        rs0.g gVar = rs0.i.f399296a;
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        kotlin.jvm.internal.o.f(asFloatBuffer, "asFloatBuffer(...)");
        this.X = asFloatBuffer;
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        kotlin.jvm.internal.o.f(asFloatBuffer2, "asFloatBuffer(...)");
        this.Y = asFloatBuffer2;
        this.Z = 36197;
        this.F = is0.b.b(true, 4L);
        this.H = is0.b.b(true, 4L);
        int t17 = rs0.i.f399296a.t("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        attribute vec2 a_texBlurBgCoord;\n        attribute vec2 a_texEmojiCoord;\n        varying vec2 v_texCoord;\n        varying vec2 v_texBlurBgCoord;\n        varying vec2 v_texEmojiCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n            v_texBlurBgCoord = a_texBlurBgCoord;\n            v_texEmojiCoord = a_texEmojiCoord;\n        }\n        ", "\n        #extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        varying vec2 v_texBlurBgCoord;\n        varying vec2 v_texEmojiCoord;\n        uniform samplerExternalOES videoExternalTexture;\n        uniform sampler2D videoNormalTexture;\n        uniform sampler2D emojiTexture;\n        uniform sampler2D blurBgTexture;\n        uniform int hasEmojiTexture;\n        uniform int useNormalVideoTexture;\n        uniform int hasBlurBgTexture;\n        uniform vec4 centerLocation; //按top bottom left right来传\n\n        vec4 blendTexture(vec4 source, vec4 blend) {\n            if (blend.a <= 0.0) {\n                return source;\n            }\n            float sourceAlpha = 1.0 - blend.a;\n            float alpha = max(source.a, blend.a);\n            float r = max(0.0, min(sourceAlpha * source.r + blend.r, 1.0));\n            float g = max(0.0, min(sourceAlpha * source.g + blend.g, 1.0));\n            float b = max(0.0, min(sourceAlpha * source.b + blend.b, 1.0));\n            vec4 result = vec4(r, g, b, alpha);\n            if (alpha != 1.0) {\n                r = r + (1.0 - alpha) * 0.95;\n                g = g + (1.0 - alpha) * 0.95;\n                b = b + (1.0 - alpha) * 0.95;\n                r = max(0.0, min(r, 1.0));\n                g = max(0.0, min(g, 1.0));\n                b = max(0.0, min(b, 1.0));\n                return vec4(r, g, b, 1.0);\n            } else {\n                return vec4(r, g, b, alpha);\n            }\n        }\n\n        void main () {\n            vec4 videoColor;\n            vec4 blendElementsColor;\n\n            if (hasBlurBgTexture == 1) {\n                if (useNormalVideoTexture == 1) {\n                    videoColor = texture2D(videoNormalTexture, v_texBlurBgCoord);\n                } else {\n                    videoColor = texture2D(videoExternalTexture, v_texBlurBgCoord);\n                }\n                if (videoColor.a != 1.0) {\n                    videoColor.a = 0.0;\n                }\n                if (gl_FragCoord.y > centerLocation[0] || gl_FragCoord.y < centerLocation[1] ||\n                    gl_FragCoord.x > centerLocation[3] || gl_FragCoord.x < centerLocation[2]) {\n                    if (hasEmojiTexture == 1) {\n                        gl_FragColor = blendTexture(texture2D(blurBgTexture, v_texCoord), texture2D(emojiTexture, v_texEmojiCoord));\n                    } else {\n                        gl_FragColor = texture2D(blurBgTexture, v_texCoord);\n                    }\n                } else {\n                    if (hasEmojiTexture == 1) {\n                        gl_FragColor = blendTexture(videoColor, texture2D(emojiTexture, v_texEmojiCoord));\n                    } else {\n                        gl_FragColor = videoColor;\n                    }\n                }\n            } else {\n                if (useNormalVideoTexture == 1) {\n                    videoColor = texture2D(videoNormalTexture, v_texCoord);\n                } else {\n                    videoColor = texture2D(videoExternalTexture, v_texCoord);\n                }\n                if (videoColor.a != 1.0) {\n                    videoColor.a = 0.0;\n                }\n                if (hasEmojiTexture == 1) {\n                    gl_FragColor = blendTexture(videoColor, texture2D(emojiTexture, v_texEmojiCoord));\n                } else {\n                    gl_FragColor = videoColor;\n                }\n            }\n        }\n        ");
        this.f348018J = t17;
        this.K = android.opengl.GLES20.glGetAttribLocation(t17, "a_position");
        this.L = android.opengl.GLES20.glGetAttribLocation(t17, "a_texCoord");
        this.M = android.opengl.GLES20.glGetAttribLocation(t17, "a_texEmojiCoord");
        this.W = android.opengl.GLES20.glGetAttribLocation(t17, "a_texBlurBgCoord");
        this.N = android.opengl.GLES20.glGetUniformLocation(t17, "videoExternalTexture");
        this.O = android.opengl.GLES20.glGetUniformLocation(t17, "videoNormalTexture");
        this.P = android.opengl.GLES20.glGetUniformLocation(t17, "emojiTexture");
        this.Q = android.opengl.GLES20.glGetUniformLocation(t17, "hasEmojiTexture");
        this.S = android.opengl.GLES20.glGetUniformLocation(t17, "uMatrix");
        this.R = android.opengl.GLES20.glGetUniformLocation(t17, "useNormalVideoTexture");
        this.U = android.opengl.GLES20.glGetUniformLocation(t17, "blurBgTexture");
        this.T = android.opengl.GLES20.glGetUniformLocation(t17, "hasBlurBgTexture");
        this.V = android.opengl.GLES20.glGetUniformLocation(t17, "centerLocation");
        asFloatBuffer.position(0);
        asFloatBuffer.put(rs0.i.f399300e);
        asFloatBuffer.position(0);
    }

    public static void x(os0.b bVar, android.graphics.Bitmap bitmap, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBlendBitmap");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        bVar.getClass();
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        bVar.E = bitmap;
        java.nio.FloatBuffer floatBuffer = bVar.X;
        if (z17) {
            floatBuffer.position(0);
            floatBuffer.put(rs0.i.f399300e);
            floatBuffer.position(0);
        } else {
            floatBuffer.position(0);
            floatBuffer.put(rs0.i.f399299d);
            floatBuffer.position(0);
        }
    }

    @Override // os0.a
    public void n() {
        super.n();
        this.F.close();
        this.H.close();
    }

    @Override // os0.a
    public void p() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        android.opengl.GLES20.glUseProgram(this.f348018J);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(this.Z, this.D);
        android.opengl.GLES20.glTexParameterf(this.Z, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(this.Z, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        android.opengl.GLES20.glTexParameterf(this.Z, 10242, 10497.0f);
        android.opengl.GLES20.glTexParameterf(this.Z, 10243, 10497.0f);
        int i17 = this.Z;
        int i18 = this.N;
        int i19 = this.O;
        int i27 = this.R;
        if (i17 == 3553) {
            android.opengl.GLES20.glUniform1i(i27, 1);
            android.opengl.GLES20.glUniform1i(i19, 0);
            android.opengl.GLES20.glUniform1i(i18, 3);
        } else {
            android.opengl.GLES20.glUniform1i(i27, 0);
            android.opengl.GLES20.glUniform1i(i19, 3);
            android.opengl.GLES20.glUniform1i(i18, 0);
        }
        android.graphics.Bitmap bitmap = this.E;
        int i28 = this.Q;
        int i29 = this.P;
        if (bitmap != null) {
            android.opengl.GLES20.glActiveTexture(33985);
            android.graphics.Bitmap bitmap2 = this.E;
            if (bitmap2 != null) {
                is0.c.c(this.F, bitmap2, 0, 0, 6, null);
            }
            android.opengl.GLES20.glUniform1i(i29, 1);
            android.opengl.GLES20.glUniform1i(i28, 1);
        } else {
            android.opengl.GLES20.glUniform1i(i29, 1);
            android.opengl.GLES20.glUniform1i(i28, 0);
        }
        android.graphics.Bitmap bitmap3 = this.G;
        int i37 = this.U;
        int i38 = this.T;
        if (bitmap3 != null) {
            android.opengl.GLES20.glActiveTexture(33986);
            android.graphics.Bitmap bitmap4 = this.G;
            if (bitmap4 != null) {
                is0.c.c(this.H, bitmap4, 0, 0, 6, null);
            }
            android.opengl.GLES20.glUniform1i(i37, 2);
            android.opengl.GLES20.glUniform1i(i38, 1);
            float[] fArr = this.I;
            java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(fArr.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
            asFloatBuffer.put(fArr).position(0);
            android.opengl.GLES20.glUniform4fv(this.V, 1, asFloatBuffer);
            this.Y.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.W, 2, 5126, false, 0, (java.nio.Buffer) this.Y);
            android.opengl.GLES20.glEnableVertexAttribArray(this.W);
        } else {
            android.opengl.GLES20.glUniform1i(i38, 0);
            android.opengl.GLES20.glUniform1i(i37, 2);
        }
        this.f347999h.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.K, 2, 5126, false, 0, (java.nio.Buffer) this.f347999h);
        int i39 = this.K;
        android.opengl.GLES20.glEnableVertexAttribArray(i39);
        this.f347998g.position(0);
        this.X.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.M, 2, 5126, false, 0, (java.nio.Buffer) this.X);
        int i47 = this.M;
        android.opengl.GLES20.glEnableVertexAttribArray(i47);
        android.opengl.GLES20.glVertexAttribPointer(this.L, 2, 5126, false, 0, (java.nio.Buffer) this.f347998g);
        int i48 = this.L;
        android.opengl.GLES20.glEnableVertexAttribArray(i48);
        android.opengl.GLES20.glUniformMatrix4fv(this.S, 1, false, this.f348003l, 0);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(i39);
        android.opengl.GLES20.glDisableVertexAttribArray(i48);
        android.opengl.GLES20.glDisableVertexAttribArray(i47);
        android.opengl.GLES20.glBindTexture(3553, 0);
        android.opengl.GLES20.glBindTexture(36197, 0);
        android.opengl.GLES20.glFinish();
        android.opengl.GLES20.glUseProgram(0);
        this.E = null;
        this.G = null;
        com.tencent.mars.xlog.Log.i(this.C, "draw frame used " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
    }

    @Override // os0.a
    public void r(int i17) {
        this.D = i17;
    }
}
