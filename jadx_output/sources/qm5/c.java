package qm5;

/* loaded from: classes14.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f364792a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f364793b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f364794c;

    /* renamed from: d, reason: collision with root package name */
    public int f364795d;

    /* renamed from: e, reason: collision with root package name */
    public int f364796e;

    /* renamed from: f, reason: collision with root package name */
    public int f364797f;

    /* renamed from: g, reason: collision with root package name */
    public int f364798g;

    /* renamed from: h, reason: collision with root package name */
    public int f364799h;

    /* renamed from: i, reason: collision with root package name */
    public int f364800i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f364801j;

    public c() {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }

    public void a() {
    }

    public void b(int i17, int i18, int i19, java.nio.FloatBuffer floatBuffer, java.nio.FloatBuffer floatBuffer2) {
        android.opengl.GLES20.glUseProgram(this.f364795d);
        h();
        if (this.f364801j) {
            floatBuffer.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.f364796e, 2, 5126, false, 8, (java.nio.Buffer) floatBuffer);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f364796e);
            floatBuffer2.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.f364798g, 2, 5126, false, 8, (java.nio.Buffer) floatBuffer2);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f364798g);
            if (i17 != -1) {
                android.opengl.GLES20.glActiveTexture(33984);
                android.opengl.GLES20.glBindTexture(3553, i17);
                android.opengl.GLES20.glUniform1i(this.f364797f, 0);
            }
            c(i18, floatBuffer, floatBuffer2);
            d(i19, floatBuffer, floatBuffer2);
            android.opengl.GLES20.glViewport(0, 0, this.f364799h, this.f364800i);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f364796e);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f364798g);
            android.opengl.GLES20.glBindTexture(3553, 0);
        }
    }

    public void c(int i17, java.nio.FloatBuffer floatBuffer, java.nio.FloatBuffer floatBuffer2) {
    }

    public void d(int i17, java.nio.FloatBuffer floatBuffer, java.nio.FloatBuffer floatBuffer2) {
    }

    public void e() {
        int a17;
        int[] iArr = new int[1];
        int a18 = qm5.k.a(this.f364793b, 35633);
        int i17 = 0;
        if (a18 != 0 && (a17 = qm5.k.a(this.f364794c, 35632)) != 0) {
            int glCreateProgram = android.opengl.GLES20.glCreateProgram();
            android.opengl.GLES20.glAttachShader(glCreateProgram, a18);
            android.opengl.GLES20.glAttachShader(glCreateProgram, a17);
            android.opengl.GLES20.glLinkProgram(glCreateProgram);
            android.opengl.GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] > 0) {
                android.opengl.GLES20.glDeleteShader(a18);
                android.opengl.GLES20.glDeleteShader(a17);
                i17 = glCreateProgram;
            }
        }
        this.f364795d = i17;
        this.f364796e = android.opengl.GLES20.glGetAttribLocation(i17, "position");
        this.f364797f = android.opengl.GLES20.glGetUniformLocation(this.f364795d, "inputImageTexture");
        this.f364798g = android.opengl.GLES20.glGetAttribLocation(this.f364795d, "inputTextureCoordinate");
        this.f364801j = true;
    }

    public void f(int i17, int i18) {
        this.f364799h = i17;
        this.f364800i = i18;
    }

    public void g(java.lang.Runnable runnable) {
        synchronized (this.f364792a) {
            this.f364792a.addLast(runnable);
        }
    }

    public void h() {
        while (true) {
            java.util.LinkedList linkedList = this.f364792a;
            if (linkedList.isEmpty()) {
                return;
            } else {
                ((java.lang.Runnable) linkedList.removeFirst()).run();
            }
        }
    }

    public c(java.lang.String str, java.lang.String str2) {
        this.f364792a = new java.util.LinkedList();
        this.f364793b = str;
        this.f364794c = str2;
    }
}
