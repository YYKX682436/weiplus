package go0;

/* loaded from: classes14.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f273854a;

    /* renamed from: b, reason: collision with root package name */
    public is0.c f273855b;

    /* renamed from: c, reason: collision with root package name */
    public volatile go0.a f273856c;

    /* renamed from: d, reason: collision with root package name */
    public final os0.e f273857d;

    /* renamed from: e, reason: collision with root package name */
    public final int f273858e;

    /* renamed from: f, reason: collision with root package name */
    public int f273859f;

    /* renamed from: g, reason: collision with root package name */
    public int f273860g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f273861h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.xeffect.IWeJsonMessageCallback f273862i;

    /* renamed from: j, reason: collision with root package name */
    public p05.v0 f273863j;

    /* renamed from: k, reason: collision with root package name */
    public p05.t0 f273864k;

    /* renamed from: l, reason: collision with root package name */
    public p05.u0 f273865l;

    /* renamed from: m, reason: collision with root package name */
    public p05.p0 f273866m;

    /* renamed from: n, reason: collision with root package name */
    public p05.q0 f273867n;

    public t1(boolean z17) {
        this.f273854a = z17;
        int t17 = rs0.i.f399296a.t("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        void main() {\n            gl_Position = a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "#extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform samplerExternalOES texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
        this.f273858e = t17;
        android.opengl.GLES20.glGetAttribLocation(t17, "a_position");
        android.opengl.GLES20.glGetAttribLocation(t17, "a_texCoord");
        android.opengl.GLES20.glGetUniformLocation(t17, "texture");
        android.opengl.GLES20.glTexParameterf(36197, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(36197, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        android.opengl.GLES20.glTexParameterf(36197, 10242, 33071.0f);
        android.opengl.GLES20.glTexParameterf(36197, 10243, 33071.0f);
        if (this.f273857d == null) {
            this.f273857d = new os0.e(0, 0, 0, 0, 2, 0, 32, null);
        }
    }
}
