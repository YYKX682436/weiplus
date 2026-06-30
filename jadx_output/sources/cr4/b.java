package cr4;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f221984a;

    /* renamed from: b, reason: collision with root package name */
    public int f221985b;

    /* renamed from: c, reason: collision with root package name */
    public int f221986c;

    /* renamed from: d, reason: collision with root package name */
    public int f221987d;

    /* renamed from: e, reason: collision with root package name */
    public int f221988e;

    /* renamed from: f, reason: collision with root package name */
    public int f221989f;

    public b(boolean z17) {
        this.f221984a = z17;
        if (z17) {
            int t17 = rs0.i.f399296a.t("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "#extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform samplerExternalOES texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
            this.f221985b = t17;
            this.f221986c = android.opengl.GLES20.glGetAttribLocation(t17, "a_position");
            this.f221987d = android.opengl.GLES20.glGetAttribLocation(this.f221985b, "a_texCoord");
            this.f221988e = android.opengl.GLES20.glGetUniformLocation(this.f221985b, "texture");
            this.f221989f = android.opengl.GLES20.glGetUniformLocation(this.f221985b, "uMatrix");
            android.opengl.GLES20.glTexParameterf(36197, 10241, 9729.0f);
            android.opengl.GLES20.glTexParameterf(36197, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            android.opengl.GLES20.glTexParameterf(36197, 10242, 33071.0f);
            android.opengl.GLES20.glTexParameterf(36197, 10243, 33071.0f);
            return;
        }
        int t18 = rs0.i.f399296a.t("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
        this.f221985b = t18;
        this.f221986c = android.opengl.GLES20.glGetAttribLocation(t18, "a_position");
        this.f221987d = android.opengl.GLES20.glGetAttribLocation(this.f221985b, "a_texCoord");
        this.f221988e = android.opengl.GLES20.glGetUniformLocation(this.f221985b, "texture");
        this.f221989f = android.opengl.GLES20.glGetUniformLocation(this.f221985b, "uMatrix");
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10242, 10497.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10243, 10497.0f);
    }

    public final void a(java.nio.FloatBuffer cubeBuffer, java.nio.FloatBuffer textureCoordBuff, int i17, float[] transformMatrix) {
        kotlin.jvm.internal.o.g(cubeBuffer, "cubeBuffer");
        kotlin.jvm.internal.o.g(textureCoordBuff, "textureCoordBuff");
        kotlin.jvm.internal.o.g(transformMatrix, "transformMatrix");
        if (this.f221984a) {
            if (i17 != -1) {
                android.opengl.GLES20.glUseProgram(this.f221985b);
                android.opengl.GLES20.glActiveTexture(33984);
                android.opengl.GLES20.glBindTexture(36197, i17);
                android.opengl.GLES20.glUniform1i(this.f221988e, 0);
                android.opengl.GLES20.glUniformMatrix4fv(this.f221989f, 1, false, transformMatrix, 0);
                cubeBuffer.position(0);
                android.opengl.GLES20.glVertexAttribPointer(this.f221986c, 2, 5126, false, 8, (java.nio.Buffer) cubeBuffer);
                android.opengl.GLES20.glEnableVertexAttribArray(this.f221986c);
                textureCoordBuff.position(0);
                android.opengl.GLES20.glVertexAttribPointer(this.f221987d, 2, 5126, false, 8, (java.nio.Buffer) textureCoordBuff);
                android.opengl.GLES20.glEnableVertexAttribArray(this.f221987d);
                android.opengl.GLES20.glDrawArrays(5, 0, 4);
                android.opengl.GLES20.glDisableVertexAttribArray(this.f221986c);
                android.opengl.GLES20.glDisableVertexAttribArray(this.f221987d);
                return;
            }
            return;
        }
        if (i17 == -1 || !android.opengl.GLES20.glIsTexture(i17)) {
            return;
        }
        android.opengl.GLES20.glUseProgram(this.f221985b);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, i17);
        android.opengl.GLES20.glUniform1i(this.f221988e, 0);
        android.opengl.GLES20.glUniformMatrix4fv(this.f221989f, 1, false, transformMatrix, 0);
        android.opengl.GLES20.glVertexAttribPointer(this.f221986c, 2, 5126, false, 0, (java.nio.Buffer) cubeBuffer);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f221986c);
        android.opengl.GLES20.glVertexAttribPointer(this.f221987d, 2, 5126, false, 0, (java.nio.Buffer) textureCoordBuff);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f221987d);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f221986c);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f221987d);
        android.opengl.GLES20.glBindTexture(3553, 0);
        android.opengl.GLES20.glBindTexture(36197, 0);
    }
}
