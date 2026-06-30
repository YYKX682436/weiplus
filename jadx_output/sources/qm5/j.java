package qm5;

/* loaded from: classes14.dex */
public abstract class j extends qm5.c {

    /* renamed from: k, reason: collision with root package name */
    public int f364835k;

    /* renamed from: l, reason: collision with root package name */
    public int f364836l;

    /* renamed from: m, reason: collision with root package name */
    public int f364837m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Bitmap f364838n;

    public j(java.lang.String str, java.lang.String str2) {
        super(str, str2);
        this.f364837m = -1;
        j(qm5.l.NORMAL, false, false);
    }

    @Override // qm5.c
    public void a() {
        android.opengl.GLES20.glDeleteTextures(1, new int[]{this.f364837m}, 0);
        this.f364837m = -1;
    }

    @Override // qm5.c
    public void b(int i17, int i18, int i19, java.nio.FloatBuffer floatBuffer, java.nio.FloatBuffer floatBuffer2) {
        android.opengl.GLES20.glUseProgram(this.f364795d);
        h();
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16384);
        floatBuffer.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f364796e, 2, 5126, false, 0, (java.nio.Buffer) floatBuffer);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f364796e);
        floatBuffer2.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f364798g, 2, 5126, false, 0, (java.nio.Buffer) floatBuffer2);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f364798g);
        if (i17 != -1) {
            android.opengl.GLES20.glActiveTexture(33984);
            android.opengl.GLES20.glBindTexture(3553, i17);
            android.opengl.GLES20.glUniform1i(this.f364797f, 0);
        }
        floatBuffer2.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f364835k, 2, 5126, false, 0, (java.nio.Buffer) floatBuffer2);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f364835k);
        if (i18 != -1) {
            android.opengl.GLES20.glActiveTexture(33987);
            android.opengl.GLES20.glBindTexture(3553, i18);
            android.opengl.GLES20.glUniform1i(this.f364836l, 3);
        }
        android.opengl.GLES20.glViewport(0, 0, this.f364799h, this.f364800i);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f364796e);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f364798g);
        android.opengl.GLES20.glDisableVertexAttribArray(0);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f364835k);
        android.opengl.GLES20.glBindTexture(3553, 0);
    }

    @Override // qm5.c
    public void c(int i17, java.nio.FloatBuffer floatBuffer, java.nio.FloatBuffer floatBuffer2) {
        android.opengl.GLES20.glEnableVertexAttribArray(this.f364835k);
        android.opengl.GLES20.glActiveTexture(33986);
        android.opengl.GLES20.glBindTexture(3553, this.f364837m);
        android.opengl.GLES20.glUniform1i(this.f364836l, 2);
        floatBuffer2.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f364835k, 2, 5126, false, 0, (java.nio.Buffer) floatBuffer2);
    }

    @Override // qm5.c
    public void d(int i17, java.nio.FloatBuffer floatBuffer, java.nio.FloatBuffer floatBuffer2) {
    }

    @Override // qm5.c
    public void e() {
        super.e();
        this.f364835k = android.opengl.GLES20.glGetAttribLocation(this.f364795d, "inputTextureCoordinate2");
        this.f364836l = android.opengl.GLES20.glGetUniformLocation(this.f364795d, "inputImageTexture2");
        android.opengl.GLES20.glEnableVertexAttribArray(this.f364835k);
        android.graphics.Bitmap bitmap = this.f364838n;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        i(this.f364838n);
    }

    public void i(android.graphics.Bitmap bitmap) {
        if (bitmap == null || !bitmap.isRecycled()) {
            this.f364838n = bitmap;
            if (bitmap == null) {
                return;
            }
            g(new qm5.i(this, bitmap));
        }
    }

    public void j(qm5.l lVar, boolean z17, boolean z18) {
        float[] b17 = qm5.o.b(lVar, z17, z18);
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(b17);
        asFloatBuffer.flip();
    }
}
