package d32;

/* loaded from: classes10.dex */
public final class s extends os0.a {
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;

    /* renamed from: J, reason: collision with root package name */
    public final int f226191J;
    public int K;
    public boolean L;
    public float M;
    public final java.nio.FloatBuffer N;
    public final android.graphics.Rect O;

    public s(int i17, int i18, int i19, int i27, int i28, int i29, int i37, kotlin.jvm.internal.i iVar) {
        super(i17, i18, (i37 & 4) != 0 ? i17 : i19, (i37 & 8) != 0 ? i17 : i27, i28, (i37 & 32) != 0 ? 1 : i29);
        this.K = -1;
        this.O = new android.graphics.Rect();
        int t17 = rs0.i.f399296a.t("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D texture;\n        uniform vec4 rect;\n        uniform float radius;\n        uniform int calcRoundCorner;\n\n        void main () {\n            if (calcRoundCorner == 1) {\n                // round corner\n                vec2 bottomLeftCenter = vec2(rect.x + radius, rect.y + radius);\n                vec2 bottomRightCenter = vec2(rect.z - radius, rect.y + radius);\n                vec2 topLeftCenter = vec2(rect.x + radius, rect.w - radius);\n                vec2 topRightCenter = vec2(rect.z - radius, rect.w - radius);\n                if ((gl_FragCoord.x < bottomLeftCenter.x && gl_FragCoord.y < bottomLeftCenter.y && distance(gl_FragCoord.xy, bottomLeftCenter) > radius) ||\n                    (gl_FragCoord.x > bottomRightCenter.x && gl_FragCoord.y < bottomRightCenter.y && distance(gl_FragCoord.xy, bottomRightCenter) > radius) ||\n                    (gl_FragCoord.x < topLeftCenter.x && gl_FragCoord.y > topLeftCenter.y && distance(gl_FragCoord.xy, topLeftCenter) > radius) ||\n                    (gl_FragCoord.x > topRightCenter.x && gl_FragCoord.y > topRightCenter.y && distance(gl_FragCoord.xy, topRightCenter) > radius))  {\n//                   gl_FragColor = vec4(0.95, 0.95, 0.95, 1.0);\n                    discard;\n                } else {\n                   gl_FragColor = vec4(texture2D(texture, v_texCoord).rgb, 1.0);\n                }\n            } else {\n                gl_FragColor = texture2D(texture, v_texCoord);\n            }\n        }\n        ");
        this.C = t17;
        this.D = android.opengl.GLES20.glGetAttribLocation(t17, "a_position");
        this.E = android.opengl.GLES20.glGetAttribLocation(t17, "a_texCoord");
        this.F = android.opengl.GLES20.glGetUniformLocation(t17, "uMatrix");
        this.G = android.opengl.GLES20.glGetUniformLocation(t17, "texture");
        this.H = android.opengl.GLES20.glGetUniformLocation(t17, "rect");
        this.I = android.opengl.GLES20.glGetUniformLocation(t17, "radius");
        this.f226191J = android.opengl.GLES20.glGetUniformLocation(t17, "calcRoundCorner");
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(16).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        kotlin.jvm.internal.o.f(asFloatBuffer, "asFloatBuffer(...)");
        this.N = asFloatBuffer;
    }

    @Override // os0.a
    public void g() {
        super.g();
        java.nio.FloatBuffer floatBuffer = this.N;
        floatBuffer.position(0);
        android.graphics.Rect rect = this.O;
        floatBuffer.put(rect.left);
        floatBuffer.put(this.f347995d - rect.bottom);
        floatBuffer.put(rect.right);
        floatBuffer.put(this.f347995d - rect.top);
    }

    @Override // os0.a
    public void p() {
        if (this.K == -1) {
            return;
        }
        android.graphics.Rect rect = this.O;
        android.opengl.GLES20.glViewport(rect.left, this.f347995d - rect.bottom, rect.width(), rect.height());
        android.opengl.GLES20.glUseProgram(this.C);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, this.K);
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
        android.opengl.GLES20.glUniform1i(this.G, 0);
        android.opengl.GLES20.glUniformMatrix4fv(this.F, 1, false, this.f348003l, 0);
        this.f347999h.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.D, 2, 5126, false, 0, (java.nio.Buffer) this.f347999h);
        int i17 = this.D;
        android.opengl.GLES20.glEnableVertexAttribArray(i17);
        this.f347998g.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.E, 2, 5126, false, 0, (java.nio.Buffer) this.f347998g);
        int i18 = this.E;
        android.opengl.GLES20.glEnableVertexAttribArray(i18);
        java.nio.FloatBuffer floatBuffer = this.N;
        floatBuffer.position(0);
        android.opengl.GLES20.glUniform4fv(this.H, 1, floatBuffer);
        android.opengl.GLES20.glUniform1f(this.I, this.M);
        android.opengl.GLES20.glUniform1i(this.f226191J, this.L ? 1 : 0);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(i17);
        android.opengl.GLES20.glDisableVertexAttribArray(i18);
        android.opengl.GLES20.glBindTexture(3553, 0);
        android.opengl.GLES20.glFinish();
    }

    @Override // os0.a
    public void r(int i17) {
        this.K = i17;
    }
}
