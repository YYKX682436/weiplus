package cr4;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f221992a;

    /* renamed from: b, reason: collision with root package name */
    public int f221993b;

    /* renamed from: c, reason: collision with root package name */
    public int f221994c;

    /* renamed from: d, reason: collision with root package name */
    public is0.c f221995d;

    /* renamed from: e, reason: collision with root package name */
    public is0.c f221996e;

    /* renamed from: f, reason: collision with root package name */
    public is0.c f221997f;

    /* renamed from: g, reason: collision with root package name */
    public int f221998g;

    /* renamed from: h, reason: collision with root package name */
    public int f221999h;

    /* renamed from: i, reason: collision with root package name */
    public int f222000i;

    /* renamed from: j, reason: collision with root package name */
    public int f222001j;

    /* renamed from: k, reason: collision with root package name */
    public java.nio.ByteBuffer f222002k;

    /* renamed from: l, reason: collision with root package name */
    public java.nio.ByteBuffer f222003l;

    /* renamed from: m, reason: collision with root package name */
    public java.nio.ByteBuffer f222004m;

    /* renamed from: n, reason: collision with root package name */
    public int f222005n;

    public d() {
        int t17 = rs0.i.f399296a.t("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n                precision highp float;\n                uniform sampler2D samplerY;\n                uniform sampler2D samplerU;\n                uniform sampler2D samplerV;\n                varying vec2 v_texCoord;\n                void main() {\n                  vec4 c = vec4((texture2D(samplerY, v_texCoord).r - 16./255.) * 1.164);\n                  vec4 U; vec4 V;\n                  U = vec4(texture2D(samplerU, v_texCoord).r - 128./255.);\n                  V = vec4(texture2D(samplerV, v_texCoord).r - 128./255.);\n                  c += V * vec4(1.596, -0.813, 0, 0);\n                  c += U * vec4(0, -0.392, 2.017, 0);\n                  c.a = 1.0;\n                  gl_FragColor = c;\n                }\n            ");
        this.f221992a = t17;
        this.f221993b = android.opengl.GLES20.glGetAttribLocation(t17, "a_position");
        this.f221994c = android.opengl.GLES20.glGetAttribLocation(this.f221992a, "a_texCoord");
        this.f221998g = android.opengl.GLES20.glGetUniformLocation(this.f221992a, "samplerY");
        this.f221999h = android.opengl.GLES20.glGetUniformLocation(this.f221992a, "samplerU");
        this.f222000i = android.opengl.GLES20.glGetUniformLocation(this.f221992a, "samplerV");
        this.f222001j = android.opengl.GLES20.glGetUniformLocation(this.f221992a, "uMatrix");
        this.f221995d = is0.b.b(true, 14L);
        this.f221996e = is0.b.b(true, 14L);
        this.f221997f = is0.b.b(true, 14L);
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
    }
}
