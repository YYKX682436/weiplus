package cr4;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final q05.c f221971a;

    /* renamed from: b, reason: collision with root package name */
    public int f221972b;

    /* renamed from: c, reason: collision with root package name */
    public int f221973c;

    /* renamed from: d, reason: collision with root package name */
    public int f221974d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f221975e;

    /* renamed from: f, reason: collision with root package name */
    public final int f221976f;

    /* renamed from: g, reason: collision with root package name */
    public final int f221977g;

    /* renamed from: h, reason: collision with root package name */
    public final int f221978h;

    /* renamed from: i, reason: collision with root package name */
    public final int f221979i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f221980j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f221981k;

    /* renamed from: l, reason: collision with root package name */
    public java.nio.FloatBuffer f221982l;

    /* renamed from: m, reason: collision with root package name */
    public java.nio.FloatBuffer f221983m;

    public a() {
        int t17 = rs0.i.f399296a.t("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        void main() {\n            gl_Position = a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
        this.f221976f = t17;
        this.f221977g = android.opengl.GLES20.glGetAttribLocation(t17, "a_position");
        this.f221978h = android.opengl.GLES20.glGetAttribLocation(t17, "a_texCoord");
        this.f221979i = android.opengl.GLES20.glGetUniformLocation(t17, "texture");
        android.opengl.GLES20.glGetUniformLocation(t17, "uMatrix");
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10242, 10497.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10243, 10497.0f);
        try {
            this.f221971a = new q05.c(4);
            com.tencent.mars.xlog.Log.i("MicroMsg.VoipSharperRendererProgram", "sifeng sharpen shader create success");
        } catch (java.lang.Exception unused) {
            this.f221971a = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.VoipSharperRendererProgram", "sifeng sharpen shader create failed");
        }
        this.f221980j = new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        this.f221981k = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    }
}
