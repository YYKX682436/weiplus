package um5;

/* loaded from: classes10.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.FloatBuffer f429222a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.FloatBuffer f429223b;

    /* renamed from: c, reason: collision with root package name */
    public int f429224c;

    /* renamed from: d, reason: collision with root package name */
    public int f429225d;

    /* renamed from: e, reason: collision with root package name */
    public int f429226e;

    /* renamed from: f, reason: collision with root package name */
    public int f429227f;

    public y() {
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.f429222a = asFloatBuffer;
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer2.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        this.f429223b = asFloatBuffer2;
        int createProgram = com.tencent.tav.decoder.Program.createProgram("\n            attribute vec4 aPosition;\n            attribute vec2 aTextureCoord;\n            varying vec2 vTextureCoord;\n            void main() {\n              gl_Position = aPosition;\n              vTextureCoord = aTextureCoord;\n            }\n        ", "\n            precision mediump float;\n            varying vec2 vTextureCoord;\n            uniform sampler2D sTexture;\n            void main() {\n              gl_FragColor = texture2D(sTexture, vTextureCoord);\n            }\n        ");
        this.f429224c = createProgram;
        if (createProgram == 0) {
            new java.lang.RuntimeException("failed creating program");
        } else {
            this.f429225d = android.opengl.GLES20.glGetAttribLocation(createProgram, "aPosition");
            com.tencent.tav.decoder.RenderContext.checkEglError("glGetAttribLocation aPosition");
            if (this.f429225d == -1) {
                new java.lang.RuntimeException("Could not get attribute location for aPosition");
            } else {
                this.f429226e = android.opengl.GLES20.glGetAttribLocation(this.f429224c, "aTextureCoord");
                com.tencent.tav.decoder.RenderContext.checkEglError("glGetAttribLocation aTextureCoord");
                if (this.f429226e == -1) {
                    new java.lang.RuntimeException("Could not get attribute location for aTextureCoord");
                } else {
                    this.f429227f = android.opengl.GLES20.glGetUniformLocation(this.f429224c, androidx.camera.core.processing.util.GLUtils.VAR_TEXTURE);
                    com.tencent.tav.decoder.RenderContext.checkEglError("glGetUniformLocation sTexture");
                    if (this.f429227f == -1) {
                        new java.lang.RuntimeException("Could not get uniform location for sTexture");
                    }
                }
            }
        }
        android.opengl.GLES20.glDisable(3042);
    }
}
